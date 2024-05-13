package com.example.wazitoecommerce.navigation

import android.content.QuickViewConstants
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.Trucks1.Trucks1Screen
import com.example.wazitoecommerce.ui.theme.screens.clik.ClikScreen

import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.instructions.InstructionsScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen


import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen


import com.example.wazitoecommerce.ui.theme.screens.quantity.QuantityScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }

        composable(QUANTITY_URL){
            QuantityScreen(navController = navController)
        }
        composable(TRUCKS1_URL){
            Trucks1Screen(navController = navController)
        }
        composable(INSTRUCTIONS_URL){
            InstructionsScreen(navController = navController)
        }
        composable(CLIK_URL){
            ClikScreen(navController = navController)
        }




    }
}





