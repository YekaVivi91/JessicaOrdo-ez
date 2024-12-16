package dev.jessica.jessicaordoezp1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Columnas() {
    Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp)
        .background(color = androidx.compose.ui.graphics.Color.Red)
        .fillMaxWidth()
    )
        {
            Text(
                text = "COMPUTACION MOVIL",
            )
            Text(
                text = "PAO 6",
                )
            Text(
                text = "Jessica Ordoñez",
            )

    }
}