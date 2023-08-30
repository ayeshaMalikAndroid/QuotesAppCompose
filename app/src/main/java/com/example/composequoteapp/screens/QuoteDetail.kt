package com.example.composequoteapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composequoteapp.DataManager
import com.example.composequoteapp.R
import com.example.composequoteapp.models.Quote

@Composable
fun QuoteDetail(quote: Quote) {
    BackHandler() {
        DataManager.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
        ) {
            Row(modifier = Modifier.padding(16.dp)) {
                Image(

                    painter = painterResource(R.drawable.ic_quote),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(40.dp)
                        .rotate(180F)
                        .background(Color.Black)
                )
                Spacer(modifier = Modifier.padding(4.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = quote.text,
                        style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFEEEEEEE))
                            .fillMaxWidth(.4f)
                            .height(1.dp)
                    )
                    Text(
                        text = quote.author,
                        style = MaterialTheme.typography.body2,
                        fontWeight = FontWeight.Thin,
                        modifier = Modifier.padding(top = 4.dp)
                    )

                }


            }

        }
    }
}