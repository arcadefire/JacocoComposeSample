package org.angmarch.jacococompose

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ComposeComponentPreview() {
    ComposeComponent("A text")
}

@Composable
fun ComposeComponent(text: String) {
    Surface {
        Text(text = text)
    }
}