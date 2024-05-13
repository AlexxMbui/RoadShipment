package com.example.wazitoecommerce.ui.theme.screens.clik

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.ColorUtils
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.CLIK_URL
import com.example.wazitoecommerce.navigation.ONCLICK_URL
import com.example.wazitoecommerce.navigation.PROCEED_URL
import com.example.wazitoecommerce.navigation.QUANTITY_URL
import com.example.wazitoecommerce.navigation.TRUCKS1_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.DBlue
import com.example.wazitoecommerce.ui.theme.DGreen
import com.example.wazitoecommerce.ui.theme.Orangec
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClikScreen(navController:NavHostController) {val mContext= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .padding(start = 5.dp, end = 5.dp)
        .background(color = Orangec),

        horizontalAlignment = Alignment.CenterHorizontally)
    {
        val mContext= LocalContext.current

        Text(text = "Choose a Preferred Transport",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = " Vehicle",
            fontSize = 29.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Image(
                painter = painterResource(id = R.drawable.truck2),
                contentDescription = "mitsubishivan",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(100.dp)
            )
        }


        Spacer(modifier = Modifier.height(20.dp))
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            placeholder = { Text(text = "Search")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Icon For Person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),


        )


        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = { }, colors = ButtonDefaults.buttonColors(DBlue))

        {
            Text(text = "Estimate Distance Using Google Maps")
        }
        Button(onClick = {  val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        } , colors = ButtonDefaults.buttonColors(DGreen))

        {
            Text(text = "Proceed to Payment")
        }
        Spacer(modifier = Modifier.height(10.dp))


        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Column {
                Card (modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)

                    .padding(20.dp)){
                    Spacer(modifier = Modifier.height(70.dp))
                    Column (verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start=50.dp)){
                        Text(text = "How do I ",
                            fontSize = 29.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "order?",
                            fontSize = 29.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Scroll right",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.Cursive
                        )

                    }
                }
            }

            Spacer(modifier = Modifier.width(30.dp))

            Column {
                Card(modifier = Modifier
                    .width(400.dp)
                    .height(300.dp)) {

                   Column(verticalArrangement = Arrangement.Center,

                       modifier = Modifier.padding(start=50.dp, end = 30.dp)) {

                       Spacer(modifier =Modifier.height(50.dp) )


                       Text(text = "1.  View and select vehicle of choice",
                           fontFamily = FontFamily.Serif)
                       Spacer(modifier =Modifier.height(2.dp) )

                       Text(text = "2.  Call in case of special needs of goods",
                           fontFamily = FontFamily.Serif)
                       Spacer(modifier =Modifier.height(10.dp) )

                       Text(text = "3.  Use automated text to request for the vehicle and wait for response." +
                               "  " +
                               "Total cost is sent back to client.",
                           fontFamily = FontFamily.Serif)
                       Spacer(modifier =Modifier.height(2.dp) )

                       Text(text = "4.  Proceed to paying.Leave the rest to our reliable team.",
                           fontFamily = FontFamily.Serif)
                       Spacer(modifier =Modifier.height(2.dp) )
                       Text(text = "5. Use Google Maps to estimate Distance and your starting point as well as destination ",
                           fontFamily = FontFamily.Serif)


                       Spacer(modifier =Modifier.height(10.dp) )

                       Text(text = "Your goods are good to go!",
                           fontFamily = FontFamily.Serif,

                           fontWeight = FontWeight.Bold)
                       Spacer(modifier =Modifier.height(5.dp) )
                   }

                }
            }


        }

//end of instructions row

        Spacer(modifier =Modifier.height(20.dp) )





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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


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
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


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
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent) }, colors = ButtonDefaults.buttonColors(DBlue))

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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


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
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


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
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent) }, colors = ButtonDefaults.buttonColors(DBlue))

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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent)}


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Fuso Truck",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 350 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.100",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

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
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


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
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent) }, colors = ButtonDefaults.buttonColors(DBlue))

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
                        painter = painterResource(id = R.drawable.realt),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Tipper Truck",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 390 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.125",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = { val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

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
                        painter = painterResource(id = R.drawable.realt2),
                        contentDescription = "mitsubishivan",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .clickable { val smsIntent= Intent(Intent.ACTION_SENDTO)
                                smsIntent.data="smsto:0798942912".toUri()
                                smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                        " " +
                                        "for (estimated distance) from (starting point) to (destination)  on (date).")
                                mContext.startActivity(smsIntent) }


                    )




                }
                Spacer(modifier = Modifier.height(5.dp))

                Column (){
                    Text(text ="Trailer",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Horsepower: 420 hp",

                        fontFamily = FontFamily.Serif,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price per Km : Kshs.150",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif)
                    Row {
                        Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0798942912".toUri()
                            mContext.startActivity(callIntent)}, colors = ButtonDefaults.buttonColors(DBlue))

                        {
                            Text(text = "Call")
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Button(onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0798942912".toUri()
                            smsIntent.putExtra("sms_body","I would like to request for the (vehicle name) " +
                                    " " +
                                    "for (estimated distance) from (starting point) to (destination)  on (date).")
                            mContext.startActivity(smsIntent) }, colors = ButtonDefaults.buttonColors(
                            DBlue
                        ))

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
fun ClikScreenPreview(){

       ClikScreen(navController = rememberNavController())

}