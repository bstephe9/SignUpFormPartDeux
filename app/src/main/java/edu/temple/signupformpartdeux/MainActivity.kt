package edu.temple.signupformpartdeux

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import edu.temple.signupformpartdeux.ui.theme.SignUpFormPartDeuxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpFormPartDeuxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SignUpForm("Android")
                }
            }
        }
    }
}

@Composable
fun SignUpForm(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Sign Up Form",
        modifier = modifier,
        fontSize = 28.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SignUpFormPartDeuxTheme {
        SignUpForm("Android")
    }
}