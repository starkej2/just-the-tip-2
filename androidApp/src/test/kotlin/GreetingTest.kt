package com.binaryblacksheep.justthetip

import com.binaryblacksheep.justthetip.Greeting
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class GreetingTest {

    @Test
    fun `should print hello android from android mpp`() {
        assertEquals(Greeting().greeting(), "Hello, Android")
    }
}

// Note that common tests for calculator (i.e. `CalculatorTest`) can be run from `greeting`
// with `test` Gradle task.