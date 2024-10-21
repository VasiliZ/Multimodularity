package com.example.benchmark4

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

/**
 * Benchmark, which will execute on an Android device.
 *
 * The body of [BenchmarkRule.measureRepeated] is measured in a loop, and Studio will
 * output the result. Modify your code to see how it affects performance.
 */

private const val IMAGE_PATH = "/images/jetpack.png"

@RunWith(AndroidJUnit4::class)
class ExampleBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val context = InstrumentationRegistry.getInstrumentation().targetContext

    // Retrieve the bitmap from assets
   /* private val bitmap: Bitmap = BitmapFactory.decodeFile(

    )*/

    @Test
    fun bitmapGetPixelsBenchmark() {
        val pixels = IntArray(100) { it }
        Log.d("TAG1", "bitmapGetPixelsBenchmark:${  context.ex} ")
        benchmarkRule.measureRepeated {
          //  bitmap.getPixels(pixels, 0, 100, 0, 0, 100, 1)
        }
    }
}