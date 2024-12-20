package dev.jessica.jessicaordoezp1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Box_Layout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Cuadro magenta (arriba izquierda)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Magenta)
                .align(Alignment.TopStart)
                .padding(16.dp)
        )

        // Cuadro negro (arriba derecha)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Black)
                .align(Alignment.TopEnd)
                .padding(16.dp)
        )

        // Cuadro azul (centro)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .align(Alignment.Center)
        )

        // Cuadro verde (abajo izquierda)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .align(Alignment.BottomStart)
                .padding(16.dp)
        )

        // Cuadro amarillo (abajo derecha)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        )
    }
}
