package com.example.wazitoecommerce.ui.theme.screens.Trucks1

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.CLIK_URL
import com.example.wazitoecommerce.navigation.ONCLICK_URL
import com.example.wazitoecommerce.navigation.PROCEED_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun Trucks1Screen(navController:NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .padding(start = 5.dp, end = 5.dp),

        horizontalAlignment = Alignment.CenterHorizontally)
    {
        val mContext= LocalContext.current

        Text(text = "Choose a Preferred Transport Vehicle",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { })

        {
            Text(text = "How do I order?")
        }

        Button(onClick = { })

        {
            Text(text = "Estimate Distance Using Google Maps")
        }
        Button(onClick = {  val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        })

        {
            Text(text = "Proceed to Payment")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.mitsubishivan),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {   navController.navigate(CLIK_URL) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Mitsubishi van",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 250 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.60",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent)})

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.toyotavan),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {    navController.navigate(CLIK_URL)  }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Toyota van",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 270 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.70",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent) })

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }


            Spacer(modifier = Modifier.height(20.dp))

        }


        Row (modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.mercedesvan),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {    navController.navigate(CLIK_URL) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Mercedes van",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 290 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.75",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent)})

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.openminitoyota),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {    navController.navigate(CLIK_URL) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Open MiniIsuzu",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 320 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.80",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent) })

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }




        }


        Spacer(modifier = Modifier.height(20.dp))


        Row (modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.openminitoyota),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {     navController.navigate(CLIK_URL) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Open MiniToyota",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 330 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.80",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent)})

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.closedminiisuzu),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {   navController.navigate(CLIK_URL)   }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Closed MiniIsuzu",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 320 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.90",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent) })

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }




        }


        Spacer(modifier = Modifier.height(20.dp))


        Row (modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.closedmitsubishimini),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {   navController.navigate(CLIK_URL) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Mitsubishi van",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 330 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.95",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent)})

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)

                    .padding(start = 8.dp)) {


                    Image(
                        painter = painterResource(id = R.drawable.toyotavan),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable {    navController.navigate(CLIK_URL)  }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Toyota van",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 270 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.70",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)})

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) on (date).")
                            mContext.startActivity(smsIntent) })

                        {
                            Text(text = "SMS")
                        }
                    }

                }
            }




        }








    }
}
@Composable
@Preview(showBackground = true)
fun Trucks1ScreenPreview(){

        Trucks1Screen(navController = rememberNavController())

}