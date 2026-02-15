package com.example.ultimatefebruarycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}






@Composable
fun TextStylingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Default text
        Text("Default Text")

        // Using MaterialTheme typography
        Text("Headline Large", style = MaterialTheme.typography.headlineLarge)
        Text("Title Medium", style = MaterialTheme.typography.titleMedium)
        Text("Body Large", style = MaterialTheme.typography.bodyLarge)
        Text("Label Small", style = MaterialTheme.typography.labelSmall)

        // Custom styles
        Text("Colored Text", style = TextStyle(color = Color.Red))

        Text(
            text = "Large Bold Text",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )

        Text(
            text = "Italic Serif Font",
            style = TextStyle(fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif)
        )

        Text("Letter Spacing Example", style = TextStyle(letterSpacing = 2.sp))

        Text("Underlined Text", style = TextStyle(textDecoration = TextDecoration.Underline))

        Text(
            text = "Centered Text",
            style = TextStyle(textAlign = TextAlign.Center),
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Text with Shadow",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                ),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Text(
            text = "Background Modifier",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(4.dp),
            style = TextStyle(color = Color.Black)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "Text Styling Preview")
@Composable
fun TextStylingScreenPreview() {
    TextStylingScreen()
}
