package fi.oamk.bodymassindexusingviewmodel


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.PaddingValues
import fi.oamk.bodymassindexusingviewmodel.ui.theme.BodyMassIndexUsingViewModelTheme
import fi.oamk.bodymassindexusingviewmodel.ui.theme.screen.BmiCalculatorScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BodyMassIndexUsingViewModelTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding: PaddingValues ->
                    BmiCalculatorScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun Preview() {
    BodyMassIndexUsingViewModelTheme {

        BmiCalculatorScreen(modifier = Modifier.padding(16.dp))
    }
}}
