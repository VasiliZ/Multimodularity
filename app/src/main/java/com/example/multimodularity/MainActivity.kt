package com.example.multimodularity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core.common.di.LocalCommonProvider
import com.example.core_network.di.LocalNetworkProvider
import com.example.multimodularity.di.components.LocalAppProvider
import com.example.multimodularity.ui.theme.MultimodularityTheme
import com.example.multymodularity.data.impl.LocalDataProvider

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MultimodularityTheme {

                CompositionLocalProvider(
                    LocalAppProvider provides application.applicationProvider,
                    LocalCommonProvider provides application.applicationProvider,
                    LocalDataProvider provides application.applicationProvider,
                    LocalNetworkProvider provides application.applicationProvider
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MultimodularityTheme {
        Greeting("Android")
    }
}