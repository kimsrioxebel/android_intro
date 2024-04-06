package com.example.safari

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.safari.ui.theme.SafariTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafariTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                  //  Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun  Home (){
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top, modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))

            {
        Text(text = "Clara's app",
              color = Color.Red,
            fontSize = 48.sp,
            fontFamily = FontFamily.Monospace,

        )
//                Text(text = "Welcome To Andriod",
//       color = Color.Blue,
//            fontSize = 23.sp,
//            fontFamily = FontFamily.Cursive)
                Image(painter = painterResource(id =R.drawable.pic1 ),contentDescription = null,
                    modifier = Modifier.padding(16.dp))
                Spacer(modifier = Modifier.height(30.dp))


        Text(text = "Welcome To Andriod",
       color = Color.Blue,
            fontSize = 23.sp,
            fontFamily = FontFamily.Cursive
        )
                Image(painter = painterResource(id =R.drawable.pic2 ),contentDescription ="Makeup", modifier = Modifier.fillMaxSize())





    }
}
@Suppress("VisualLintAccessibilityTestFramework")
@Preview
@Composable
private fun homepreview(){

    Home()
}
//@Composable
//fun SimpleRow(){
//    Row {
//        Text(text = "Row Text 1",Modifier.background(Color.Red))
//        Text(text = "Row Text 2",Modifier.background(Color.White))
//        Text(text = "Row Text 3",Modifier.background(Color.Green))
//    }
//}



