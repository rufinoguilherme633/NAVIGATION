package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
import com.example.navigation.Screen.LoginScreen

import com.example.navigation.ui.theme.NavigationTheme
//import androidx.navigation.compose.composable
import com.example.navigation.menu.Menu
import com.example.navigation.pedidos.Pedidos
import com.example.navigation.perfil.Perfil
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                   // LoginScreen()
//                    val navController = rememberNavController()
                    val navController = rememberAnimatedNavController()
//                NavHost(navController =navController  , startDestination = " Login" ) {
                    AnimatedNavHost(
                        navController =navController  ,
                        startDestination = "login",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentScope.SlideDirection.End,
                                animationSpec = tween(2000)
                            ) + fadeIn(tween(2000))
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                AnimatedContentScope.SlideDirection.End,
                                animationSpec = tween(2000)

                            )
                        }
                        ) {
                    composable(route = "login") { LoginScreen(navController) }
                    composable(route = "menu") { Menu(navController) }
                    composable(route = "perfil/{nomeUsuario}/{idade}") {
                        var nome = it.arguments!!.getString("nomeUsuario")
                        var idade = it.arguments!!.getString("idade")
                        Perfil(navController,nome!!, idade!!)
                    }
                    composable(route = "pedidos") { Pedidos(navController) }

                }


                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    NavigationTheme {
//        Greeting("Android")
//    }
//}