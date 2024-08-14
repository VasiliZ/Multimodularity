package com.example.multymodularity.data.impl.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import coil.network.HttpException
import com.example.multymodularity.data.impl.api.CatApi
import com.example.multymodularity.data.impl.domain.Cat
import com.example.multymodularity.data.impl.mapping.DataMapper
import java.io.IOException
import javax.inject.Inject

private const val START_PAGE = 1

class PaginationSource
@Inject constructor(
    private val remoteSource: CatApi,
    private val mapper: DataMapper
) : PagingSource<Int, Cat>() {

    override fun getRefreshKey(state: PagingState<Int, Cat>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Cat> {
        return try {
            val currentPage = params.key ?: START_PAGE
            val cats = remoteSource.getCatList(page = currentPage)

            LoadResult.Page(
                data = cats.map { response ->
                    mapper.responseToDomain(response).copy(
                        image = if (response.imageId != null) {
                            loadImage(imageId = response.imageId)
                        } else {
                            null
                        }
                    )
                },
                prevKey = if (currentPage == START_PAGE) null else currentPage.dec(),
                nextKey = if (cats.isEmpty()) null else currentPage.inc()
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (httpException: HttpException) {
            return LoadResult.Error(httpException)
        }
    }

    private suspend fun loadImage(imageId: String): String {
        return remoteSource.getImage(imageId = imageId).url
    }
}