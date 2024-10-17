package com.example.benchmark

import android.graphics.Point
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.ExperimentalMetricApi
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.TraceSectionMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * This is an example startup benchmark.
 *
 * It navigates to the device's home screen, and launches the default activity.
 *
 * Before running this benchmark:
 * 1) switch your app's active build variant in the Studio (affects Studio runs only)
 * 2) add `<profileable android:shell="true" />` to your app's manifest, within the `<application>` tag
 *
 * Run this benchmark from Studio to see startup measurements, and captured system traces
 * for investigating your app's performance.
 */
@RunWith(AndroidJUnit4::class)
class ExampleMacroBenchmark {

    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    /*  @Test
      fun startup() = benchmarkRule.measureRepeated(
          packageName = "com.example.multimodularity",
          metrics = listOf(
              FrameTimingMetric(),
          ),
          iterations = 5,
          startupMode = StartupMode.WARM
      ) {
          pressHome()
          startActivityAndWait()
      }*/

    @OptIn(ExperimentalMetricApi::class)
    @Test
    fun scrollComposeList() {
        benchmarkRule.measureRepeated(
            metrics = listOf(
                FrameTimingMetric(),
                TraceSectionMetric("CatListFeatureTrace", TraceSectionMetric.Mode.Sum),
            ),
            compilationMode = CompilationMode.None(),
            startupMode = StartupMode.WARM,
            iterations = 1,
            setupBlock = {
                pressHome()
                startActivityAndWait()
            },
            measureBlock = {
                device.wait(Until.findObject(By.res("LazyVerticalCatGrid")), 10000)
                val grid = device.findObject(By.res("LazyVerticalCatGrid"))

                grid.drag(
                    Point(
                        grid.visibleCenter.x,
                        grid.visibleBounds.top
                    )
                )
            },
            packageName = "com.example.multimodularity"
        )
    }

    fun UiDevice.getObject(selector: BySelector): UiObject2 =
        findObject(selector) ?: error("Object not found for: $selector")
}