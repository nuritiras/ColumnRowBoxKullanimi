package tr.com.nuritiras.columnrowboxkullanimi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tr.com.nuritiras.columnrowboxkullanimi.ui.theme.ColumnRowBoxKullanimiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnRowBoxKullanimiTheme {
                    Sayfa()
            }
        }
    }
}

@Composable
fun Sayfa() {
Row {
    Column {
        Text(text = "Bismillah")

        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
        )
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Green)
        )
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue)
        )
    }

}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ColumnRowBoxKullanimiTheme {
        Sayfa()
    }
}