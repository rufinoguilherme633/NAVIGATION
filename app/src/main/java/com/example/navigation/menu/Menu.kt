package com.example.navigation.menu

import android.view.Menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Menu(navController: NavController) {
    Card(
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)

        ) {
            Button(onClick = { navController.navigate("login") }) {
                Text(text = "login",
                    fontSize = 15.sp, color = Color.White, fontWeight = FontWeight(1000)

                )
            }

            Button(onClick = { navController.navigate("pedidos") }) {
                Text(text = "pedidos",
                    fontSize = 15.sp, color = Color.White, fontWeight = FontWeight(1000)

                )
            }
            Button(onClick = { navController.navigate("perfil/Maria da Silva/5") }) {
                Text(text = "perfil",
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
//    Menu()
//}
