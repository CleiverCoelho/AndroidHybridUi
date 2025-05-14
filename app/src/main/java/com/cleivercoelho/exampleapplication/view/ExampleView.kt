package com.cleivercoelho.exampleapplication.view

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.cleivercoelho.exampleapplication.R
import com.cleivercoelho.exampleapplication.ui.theme.ExampleApplicationTheme

// Custom CardView that inflates an XML layout and embeds Jetpack Compose content
class ExampleXMLCardView @JvmOverloads constructor(
    context: Context,
    sampleDataText: List<String>,
    attrs: AttributeSet? = null
) : CardView(context, attrs) {

    init {
        // Inflate the XML layout
        inflate(context, R.layout.main_xml_recycler_view, this)

        // Set up the ComposeView within the layout
        findViewById<ComposeView>(R.id.exampleComposeView).setContent {
            // Your Jetpack Compose UI goes here
            ComposableFunction(
                viewModel = ExampleViewModel(),
            )
        }
    }
}

// Example composable function
@Composable
fun ComposableFunction(viewModel: ViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Greeting("From XML layout inflater")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExampleApplicationTheme {
        Greeting("Android")
    }
}

// Example ViewModel
class ExampleViewModel : ViewModel()
