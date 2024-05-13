package com.example.wazitoecommerce.ui.theme.screens.quantity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.PROCEED_URL
import com.example.wazitoecommerce.navigation.TRUCKS1_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme


@Composable
fun QuantityScreen(navController: NavHostController){
    val mContext= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {


        Text(text = "Select Approximated Size of",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive)


        Text(text = "Shipment",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {navController.navigate(TRUCKS1_URL)})

        {
            Text(text = "less than 1000 kg")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(TRUCKS1_URL) })

        {
            Text(text = "1000-5000 kg")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navController.navigate(TRUCKS1_URL) })

        {
            Text(text = "0ver 5000 kg")
        }




    }

}

@Preview(showBackground = true)
@Composable
fun QuantityScreenPreview(){
    WazitoECommerceTheme {
        QuantityScreen(navController = rememberNavController())
    }
    }
