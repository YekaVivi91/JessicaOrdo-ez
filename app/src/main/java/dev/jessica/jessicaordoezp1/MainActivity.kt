package dev.jessica.jessicaordoezp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.jessica.jessicaordoezp1.layout.Box_Layout
import dev.jessica.jessicaordoezp1.layout.Columnas
import dev.jessica.jessicaordoezp1.layout.SaludoRow1
import dev.jessica.jessicaordoezp1.layout.ScaffoldLayout
import dev.jessica.jessicaordoezp1.ui.theme.JessicaOrdoñezP1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Box_Layout()

        }
    }
}

