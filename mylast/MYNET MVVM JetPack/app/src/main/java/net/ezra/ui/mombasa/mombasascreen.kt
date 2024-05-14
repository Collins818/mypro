package net.ezra.ui.mombasa


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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
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
import net.ezra.navigation.ROUTE_MOMBASA
import net.ezra.navigation.ROUTE_PRODUCTSCREEN
import net.ezra.navigation.ROUTE_SIGNUP
import androidx.compose.ui.tooling.preview.Preview as Preview1

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun mombasascreen(navController: NavHostController) {

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
                            popUpTo(ROUTE_MOMBASA) { inclusive = true }
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
                        navController.navigate(ROUTE_SIGNUP) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
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
        )
            {
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
                                        painter = painterResource(id = R.drawable.mo),
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
                                        Text(text = "Mombasa", color = Color.Yellow, fontSize = 50.sp,)
                                        Spacer(modifier = Modifier
                                            .width(110.dp))
                                        Text(text = "4.5", color = Color.Yellow, fontSize = 40.sp,)
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
                                                painter = painterResource(id = R.drawable.ree),
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
                                        text = "reef hotel",
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
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/ke/royal-orchid-azure-nairobi.en-gb.html?aid=357028&label=bin859jc-1FCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAfgBDIgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgbgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&all_sr_blocks=113550013_269689122_2_42_0;checkin=2024-06-23;checkout=2024-06-24;dest_id=-2258072;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=113550013_269689122_2_42_0;hpos=1;matching_block_id=113550013_269689122_2_42_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=113550013_269689122_2_42_0__14742;srepoch=1715662395;srpvid=87ad2256a26a04a0;type=total;ucfs=1&#hotelTmpl"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://www.booking.com/hotel/ke/reef-mombasa.html")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),

                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.bet),
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
                                        text = "Beach Hotel",
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
                                                painter = painterResource(id = R.drawable.nep),
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
                                        text = "Neptune Hotel",
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
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/ke/royal-orchid-azure-nairobi.en-gb.html?aid=357028&label=bin859jc-1FCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAfgBDIgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgbgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&all_sr_blocks=113550013_269689122_2_42_0;checkin=2024-06-23;checkout=2024-06-24;dest_id=-2258072;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=113550013_269689122_2_42_0;hpos=1;matching_block_id=113550013_269689122_2_42_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=113550013_269689122_2_42_0__14742;srepoch=1715662395;srpvid=87ad2256a26a04a0;type=total;ucfs=1&#hotelTmpl"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {


                                            Text(

                                                text = "book"
                                            )

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
                                                painter = painterResource(id = R.drawable.pri),
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
                                        text = "Prideinn",
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
                                            val intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/ke/royal-orchid-azure-nairobi.en-gb.html?aid=357028&label=bin859jc-1FCAModkIHbmFpcm9iaUgzWANodogBAZgBCbgBF8gBDNgBAegBAfgBDIgCAagCA7gC7tuLsgbAAgHSAiRlMDQ3OGZjYS0wZDEyLTQ2MTEtYjQ4Ni1mMWJlZjc3ZGJiMDTYAgbgAgE&sid=74d61dbdf768e4df5b66037d8b8064d9&all_sr_blocks=113550013_269689122_2_42_0;checkin=2024-06-23;checkout=2024-06-24;dest_id=-2258072;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=113550013_269689122_2_42_0;hpos=1;matching_block_id=113550013_269689122_2_42_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=113550013_269689122_2_42_0__14742;srepoch=1715662395;srpvid=87ad2256a26a04a0;type=total;ucfs=1&#hotelTmpl"))
                                            mContext.startActivity(intent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {

                                            Text(

                                                text = "book"
                                            )

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
                                                painter = painterResource(id = R.drawable.mar),
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
                                        text = "Marine National park",
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

                                        text = "ksh 1000",
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
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Sarova@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Nairobi National park")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://www.memphistours.com/African-Safari/africa-travel-guide/best-of-kenya/wiki/mombasa-marine-park-guide")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.bi),
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
                                        text = "intosafari Hotel",
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
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("HiltonHOTEL@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Hilton Hotel How can we help you")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://intosafaris.com/attractions-mombasa/")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.wat),
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
                                        text = "Waterpark",
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

                                        text = "US$900",
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
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://www.tripadvisor.com/Attractions-g294210-Activities-c52-t118-Mombasa_Coast_Province.html")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.hal),
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
                                        text = " haller park",
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

                                        text = "US$104",
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
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://www.tripadvisor.it/Attraction_Review-g294210-d646958-Reviews-Haller_Park-Mombasa_Coast_Province.html")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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

                            Text(text = "Museums ",color= Color(0xff68d1eb), fontSize = 45.sp)

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
                                                painter = painterResource(id = R.drawable.fot),
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
                                        text = "fot hotel",
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
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Sarova@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Sarova Email box how can we help you")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "More"
                                                val startIndex = str.indexOf("https://en.wikipedia.org/wiki/Fort_Jesus")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.but),
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
                                        text = "butterfly house",
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
                                        text = "1,093 reviews",
                                        color = Color(0xff68d1eb),
                                        fontSize = 12.sp,
                                        fontFamily = FontFamily.Serif
                                    )

                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(

                                        text = "100ksh",
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
                                            val shareIntent = Intent(Intent.ACTION_SEND)
                                            shareIntent.type = "text/plain"
                                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("HiltonHOTEL@gmail.com"))
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Hilton Hotel How can we help you")
                                            mContext.startActivity(shareIntent)
                                        },border = BorderStroke(2.dp, color = Color(0xff68d1eb)) )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "more"
                                                val startIndex = str.indexOf("https://www.sarovahotels.com/")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.rab),
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
                                        text = "rabai museum",
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

                                        text = "free",
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
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "more"
                                                val startIndex = str.indexOf("https://media-cdn.tripadvisor.com/media/photo-s/04/1b/d8/8c/rabai-museum.jpg")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
                                                painter = painterResource(id = R.drawable.afri),
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

                                        text = "ksh1000",
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

                                        OutlinedButton(
                                            onClick = {


                                            },
                                            border = BorderStroke(2.dp, color = Color(0xff68d1eb)),

                                        )
                                        {
                                            val annotatedLinkString = buildAnnotatedString {
                                                val str = "Book"
                                                val startIndex = str.indexOf("https://www.sarovahotels.com/")
                                                val endIndex = startIndex + 4
                                                append(str)
                                                addStyle(
                                                    style = SpanStyle(
                                                        color = Color(0xff64B5F6),
//
                                                    ), start = startIndex, end = endIndex
                                                )
                                            }

                                            Text(

                                                text = annotatedLinkString
                                            )

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
@Composable
fun WebButton() {
    val context = LocalContext.current
    val webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))

    // Use either Button or OutlinedButton based on your design preference
    OutlinedButton(onClick = { context.startActivity(webIntent) }) {
        Text(text = "Open Web")
    }
}




























@Preview1(showBackground = true)
@Composable
fun PreviewLight() {
   mombasascreen(rememberNavController())
}

