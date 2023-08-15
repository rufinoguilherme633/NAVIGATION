package com.example.navigation.pedidos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Pedidos(navController: NavController) {
    Card(
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)

        ) {
            Button(onClick = { navController.navigate("login") }) {
                Text(text = "login",
                    fontSize = 15.sp, color = Color.White, fontWeight = FontWeight(1000)

                )
            }

        }
    }

}


//@Preview
//@Composable
//
//fun LoginPreview() {
//    Pedidos()
//}