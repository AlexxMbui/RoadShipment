package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.INSTRUCTIONS_URL
import com.example.wazitoecommerce.navigation.ONCLICK_URL
import com.example.wazitoecommerce.navigation.PROCEED_URL
import com.example.wazitoecommerce.navigation.QUANTITY_URL
import com.example.wazitoecommerce.navigation.TRUCKS1_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.DBlue
import com.example.wazitoecommerce.ui.theme.DGreen
import com.example.wazitoecommerce.ui.theme.Orangec
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Orangec)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Get your goods moving",
            fontSize = 17.sp)



        Spacer(modifier = Modifier.height(20.dp))




        Text(text = "We transport goods based on their size and weight",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.height(20.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.truckagain),
                contentDescription = "mitsubishivan",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(140.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Take a look",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {navController.navigate(TRUCKS1_URL)}
           , colors = ButtonDefaults.buttonColors(DBlue))

        {
            Text(text = "Make an Order")
        }

        Spacer(modifier = Modifier.height(30.dp))





        Spacer(modifier = Modifier.height(30.dp))


Card (modifier = Modifier
    .width(400.dp)
    .height(800.dp)
    .padding(start = 30.dp, end = 30.dp)){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = DGreen),
        horizontalAlignment = Alignment.CenterHorizontally){

        Column(horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Welcome to Your Profile",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                color = Color.White)


            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.truck),
                contentDescription = "mitsubishivan",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(140.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Profile",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,

            color = Color.Black)


        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Manage your goods as desired for future transportation",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

            color = Color.White,
            modifier = Modifier.padding(start=10.dp,end=10.dp))


        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ADD_PRODUCTS_URL)}
            , colors = ButtonDefaults.buttonColors(DBlue))

        {
            Text(text = "Add to My Goods")
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(VIEW_PRODUCTS_URL)}
            , colors = ButtonDefaults.buttonColors(DBlue))

        {
            Text(text = "View  My Goods")
        }


    }
}
        Spacer(modifier = Modifier.height(20.dp))




    }
}
@Composable
@Preview(showBackground = false)
fun HomeScreenPreview(){

        HomeScreen(navController = rememberNavController())

}