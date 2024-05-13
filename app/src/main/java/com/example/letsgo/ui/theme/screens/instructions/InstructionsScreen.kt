package com.example.wazitoecommerce.ui.theme.screens.instructions

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.example.wazitoecommerce.navigation.ONCLICK_URL
import com.example.wazitoecommerce.navigation.PROCEED_URL
import com.example.wazitoecommerce.navigation.QUANTITY_URL
import com.example.wazitoecommerce.navigation.TRUCKS1_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun InstructionsScreen(navController:NavHostController) {
    val mContext= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 20.dp, end = 20.dp),

        ) {

        Text(text = "Make Your Order Simply As Follows",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier =Modifier.height(20.dp) )



        Column(horizontalAlignment = Alignment.CenterHorizontally
            , modifier = Modifier.padding(start=110.dp)) {
            Image(
                painter = painterResource(id = R.drawable.toyotavan),
                contentDescription = "mitsubishivan",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(100.dp))

        }
        Spacer(modifier =Modifier.height(20.dp) )



        Text(text = "1.  View and select vehicle of choice",
            fontFamily = FontFamily.Serif)
        Spacer(modifier =Modifier.height(5.dp) )

        Text(text = "2.  Use automated text to request for the vehicle and wait for response." +
                "  " +
                "Total cost is sent back to client.",
            fontFamily = FontFamily.Serif)
        Spacer(modifier =Modifier.height(5.dp) )

        Text(text = "3.  Proceed to paying.Leave the rest to our reliable team.",
            fontFamily = FontFamily.Serif)
        Spacer(modifier =Modifier.height(5.dp) )

        Text(text = "4.  Call in case of special needs of goods",
            fontFamily = FontFamily.Serif)
        Spacer(modifier =Modifier.height(20.dp) )

        Text(text = "Your goods are good to go!",
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier =Modifier.height(5.dp) )

        Column(horizontalAlignment = Alignment.CenterHorizontally
            , modifier = Modifier.padding(start=110.dp)) {
            Image(
                painter = painterResource(id = R.drawable.mitsubishivan),
                contentDescription = "mitsubishivan",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(QUANTITY_URL)},

            modifier = Modifier.padding(start=110.dp))

        {
            Text(text = "Start Order")
        }

    }
}
@Composable
@Preview(showBackground = true)
fun InstructionsScreenPreview() {
        InstructionsScreen(navController = rememberNavController())

}
