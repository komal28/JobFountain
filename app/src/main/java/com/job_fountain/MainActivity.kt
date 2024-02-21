package com.job_fountain

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.job_fountain.ui.theme.ActivityLifeCycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityLifeCycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Activity Lifecycle")
                }
            }
        }
        Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
    }


    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello Welcome to $name!",
        modifier = modifier
    )
    Button(onClick = { Log.e("Button","onClick")}) {
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivityLifeCycleTheme {
        Greeting("Android")
    }
}