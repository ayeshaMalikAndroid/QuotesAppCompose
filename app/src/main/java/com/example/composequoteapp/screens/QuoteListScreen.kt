package com.example.composequoteapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequoteapp.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    Column() {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 30.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.h5,
        )
        QuoteList(data = data, onClick)
    }
}