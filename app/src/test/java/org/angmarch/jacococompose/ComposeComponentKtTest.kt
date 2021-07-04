package org.angmarch.jacococompose

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ComposeComponentKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            ComposeComponent(text = TEXT)
        }
    }

    @Test
    fun `should display text as expected`() {
        with(composeTestRule) {
            onNodeWithText(TEXT).assertIsDisplayed()
        }
    }

    companion object {
        private const val TEXT = "A text"
    }
}