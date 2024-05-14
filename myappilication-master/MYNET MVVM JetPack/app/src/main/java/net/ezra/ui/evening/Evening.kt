package net.ezra.ui.evening


import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.content.Context
import android.content.Intent
import android.icu.text.CaseMap.Title
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PRODUCTSCREEN
import net.ezra.navigation.ROUTE_SIGNUP
import androidx.compose.ui.tooling.preview.Preview as Preview1

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun EveningScreen(navController: NavHostController) {

    val mContext = LocalContext.current

    Scaffold(

        topBar = {
            CenterAlignedTopAppBar(
                title = {

                    Text(text = "DiscoverNiche",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )



                    // Text(text = stringResource(id = R.string.apen))
                },
                navigationIcon = @Composable {
                    androidx.compose.material3.IconButton(onClick = {
                        navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_EVENING) { inclusive = true }
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }

                },

                actions = {
                    androidx.compose.material3.IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_EVENING) { inclusive = true }
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,


                    )

            )
        },

        content = @Composable {
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
  ) {
                item {

                    Column()

                    {
                        Row {
                            Card(modifier = Modifier
                                .height(300.dp)
                                .width(500.dp)
                                .padding(top = 80.dp),
                                colors = CardDefaults.cardColors(Color(0XffFB3207)),
                                elevation = CardDefaults.cardElevation(0.dp)
                            ) {
                                Box(modifier = Modifier
                                    .fillMaxWidth()){
                                    Image(
                                        painter = painterResource(id = R.drawable.fit),
                                        contentDescription = "germany",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )

                                    Icon(
                                        imageVector = Icons.Default.Favorite,
                                        contentDescription = "fsv",
                                        tint = Color.Red,
                                        modifier = Modifier
                                            .size(90.dp)
                                            .align(Alignment.BottomEnd)
                                            .padding(10.dp)
                                    )

                                    Row {
                                        Text(text = "Nairobi", color = Color.Yellow, fontSize = 50.sp,)
                                        Spacer(modifier = Modifier
                                            .width(110.dp))
                                        Text(text = "4.9", color = Color.Yellow, fontSize = 50.sp,)
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "fsv",

                                            tint = Color.Yellow,
                                            modifier = Modifier
                                                .size(50.dp)
//                                       .align(Alignment.TopEnd)
//                                       .padding(10.dp)
                                        )

                                    }




                                }


                            }
                        }
                        Spacer(modifier = Modifier
                            .height(10.dp))
                        Row {
                            Text(text = "Category", color = Color(0xff1f6d80), fontSize = 60.sp, fontFamily = FontFamily.Cursive)
                        }
                        Spacer(modifier = Modifier
                            .height(10.dp))

                        Row {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.hot),
                                        contentDescription = "germany",
                                        modifier = Modifier.
                                        size(30.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                    Spacer(modifier = Modifier
                                        .width(5.dp))
                                    Text(text = "Hotels ",color= Color(0xff68d1eb), fontSize = 35.sp)

                                }




//                                Row {
//                                    Image(
//                                        painter = painterResource(id = R.drawable.mus),
//                                        contentDescription = "germany",
//                                        modifier = Modifier.
//                                        size(20.dp),
//                                        contentScale = ContentScale.Crop
//                                    )
//                                    Spacer(modifier = Modifier
//                                        .width(5.dp))
//                                    Text(text = "Museums ",color= Color(0xff68d1eb), fontSize = 15.sp)
//
//                                }







                        }
                        Spacer(modifier = Modifier
                            .height(19.dp))




                        LazyRow {
                            item {
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.saro),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Sarova hotel",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "433 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "US$144, @ Night",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0111992361".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }
                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.ema),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Hilton Hotel",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "1,093 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "US$104, @ Night",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0716355527".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/ke/royal-orchid-azure-nairobi.en-gb.html?aid=357028&label=bin859jc-1FCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAfgBDIgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgbgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&all_sr_blocks=113550013_269689122_2_42_0;checkin=2024-06-23;checkout=2024-06-24;dest_id=-2258072;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=113550013_269689122_2_42_0;hpos=1;matching_block_id=113550013_269689122_2_42_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=113550013_269689122_2_42_0__14742;srepoch=1715662395;srpvid=87ad2256a26a04a0;type=total;ucfs=1&#hotelTmpl"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }

                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.swis),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Swiss-Belinn Nairobi",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "230 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "US$900, @ Night",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0799419598".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/searchresults.en-gb.html?label=bin859jc-1BCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAYgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgXgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&aid=357028&highlighted_hotels=1500540&city=-2258072"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Book")

                                        }
                                    }
                                }
                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.boma),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "The Boma Naiorobi hotel",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "1,093 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "US$104, @ Night",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0708930899".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/searchresults.en-gb.html?label=bin859jc-1BCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAYgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgXgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&aid=357028&highlighted_hotels=1500540&city=-2258072"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "book")

                                        }
                                    }
                                }





                            }



                        }
//                        End of hotel
                        Spacer(modifier = Modifier
                            .height(30.dp))
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.pak),
                                contentDescription = "germany",
                                modifier = Modifier.
                                size(45.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Parks ",color= Color(0xff68d1eb), fontSize = 45.sp)

                        }

                        LazyRow {
                            item {
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.nan),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Nairobi National park",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "633 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "ksh 500",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0111992361".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {

                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "More")

                                        }
                                    }
                                }
                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.nuva),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "NV luva Park",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "245 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "300ksh",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0716355527".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Karen_Blixen_Museum,_Kenya"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }

                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.sna),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Snake park",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "230 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "200ksh",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0799419598".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("swiss@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Boma hotel WELCOME")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }
                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.uhu),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Uhuru park",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "1,093 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "Free",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0708930899".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Boma@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Boma hotel WELCOME")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }





                            }



                        }
//                        end of parks
                        Spacer(modifier = Modifier
                            .height(30.dp))
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.mus),
                                contentDescription = "germany",
                                modifier = Modifier.
                                size(45.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Parks ",color= Color(0xff68d1eb), fontSize = 45.sp)

                        }

                        LazyRow {
                            item {
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.an),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "National Museum",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "433 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "1000ksh",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0111992361".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://museums.or.ke/nairobi-national-museum/"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }
                                Spacer(modifier = Modifier
                                    .width(10.dp))
                                Column {
                                    Card(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .width(160.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.ema),
                                                contentDescription = "germany",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )

                                            Icon(
                                                imageVector = Icons.Default.Favorite,
                                                contentDescription = "fav",
                                                tint = Color.Red,
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(10.dp)
                                            )
                                        }
                                    }
                                    //End of column 1
                                    Spacer(modifier = Modifier.height(2.dp))

                                    Text(
                                        text = "Railway Museum",
                                        color = Color(0xff68d1eb),
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "star",
                                            tint = Color.Yellow
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "109 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "free",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(2.dp))

                                    Row {
                                        OutlinedButton(onClick = {
                                            val callIntent = Intent(Intent.ACTION_DIAL)
                                            callIntent.data = "tel:0716355527".toUri()
                                            mContext.startActivity(callIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)))
                                        {
                                            Text(text = "Call")
                                        }
                                        Spacer(modifier = Modifier.width(2.dp))

                                        OutlinedButton(onClick = {
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Karen_Blixen_Museum,_Kenya"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            Text(text = "Email")

                                        }
                                    }
                                }







                            }



                        }







                    }

                }

            }

















        }


    )











}









@Preview1(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

