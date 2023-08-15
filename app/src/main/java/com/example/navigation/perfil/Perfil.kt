package com.example.navigation.perfil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Perfil(navController: NavController, perfil: String, idade: String) {
    Card(
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)

        ) {
            Text(
                text = "nome - $perfil $idade" ,
                fontSize = 18.sp, // Tamanho da fonte
                color = Color.White // Cor do texto
            )
        }
    }

}


//@Preview
//@Composable
//
//fun LoginPreview() {
//    Perfil()
//}