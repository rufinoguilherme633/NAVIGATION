package com.example.navigation.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.navigation.menu.Menu
import com.example.navigation.pedidos.Pedidos
import com.example.navigation.perfil.Perfil


@Composable
fun LoginScreen(navController: NavController) {
    Column {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)

        ) {
//       Login()
            Button(onClick = { navController.navigate("menu") }) {
                Text(text = "menu",
                fontSize = 15.sp, color = Color.White, fontWeight = FontWeight(1000)

                )
            }


        }

    }
}

//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginPreview() {
//    LoginScreen()
//}