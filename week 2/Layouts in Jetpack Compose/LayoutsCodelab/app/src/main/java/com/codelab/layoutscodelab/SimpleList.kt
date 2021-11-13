package com.codelab.layoutscodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.layoutscodelab.ui.theme.LayoutsCodelabTheme

@Composable
fun SimpleList() {
    // We save the scrolling position with this state that can also
    // be used to programmatically scroll the list
    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState) {
        items(100) {
            Text("Item #$it")
        }
    }
}

@Preview
@Composable
fun SimpleListPreview() {
    LayoutsCodelabTheme {
        SimpleList()
    }
}