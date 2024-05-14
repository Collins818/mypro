package net.ezra.ui.about

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.provider.MediaStore
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ELDORET
import net.ezra.navigation.ROUTE_EMBU
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_KISUMU
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MACHAKOS
import net.ezra.navigation.ROUTE_MALINDI
import net.ezra.navigation.ROUTE_MOMBASA
import net.ezra.navigation.ROUTE_MURANGA
import net.ezra.navigation.ROUTE_NAKURU
import net.ezra.navigation.ROUTE_Nyeri
import net.ezra.navigation.ROUTE_PRODUCTSCREEN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.home.AnimatedDrawer
import net.ezra.ui.home.BottomBar
import net.ezra.ui.theme.AppTheme



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }



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
                        if (!isDrawerOpen) {
                            IconButton(onClick = { isDrawerOpen = true }) {
                                Icon(
                                    Icons.Default.Menu,
                                    contentDescription = "Menu",
                                    tint = Color.White
                                )
                            }
                        }
                    },

                    actions = {
                        IconButton(onClick = {
                            navController.navigate(ROUTE_LOGIN) {
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
                Box(modifier = Modifier
//
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Black)
                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }
                ){

                    LazyColumn {

                        item {
                            Column (modifier = Modifier
                                .padding(20.dp)){

//

                                Spacer(modifier = Modifier
                                    .height(45.dp))


                                Row {
                                    Text(text = "cities",color= Color.Yellow, fontSize = 25.sp)
                                    Spacer(modifier = Modifier
                                        .width(10.dp))


//                                    var searchText by remember { mutableStateOf(TextFieldValue()) }
//
//                                    TextField(
//                                        value = searchText,
//                                        onValueChange = { searchText = it },
//                                        shape = RoundedCornerShape(25.dp),
//                                        placeholder = { Text("Search your place",Modifier.size(160.dp)) },
//                                        modifier = Modifier
//                                            .width(600.dp)
//                                            .height(50.dp),
//                                        trailingIcon = {
//                                            Icon(imageVector = Icons.Default.Search,
//                                                contentDescription = "emailIcon"
//                                            ) },
//
//                                        )
                                }





                                Spacer(modifier = Modifier
                                    .height(10.dp))

                                Row {
                                    Column {
                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0XffFB3207)),
                                            elevation = CardDefaults.cardElevation(0.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
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
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )











                                            }


                                        }

                                        Row {
                                            Text(
                                                modifier = Modifier

                                                    .clickable {
                                                        navController.navigate(ROUTE_EVENING) {
                                                            popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                        }
                                                    },


                                                text = "NAIROBI",
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Cursive,
                                                textAlign = TextAlign.Center,
                                                color = Color(  0xff1f6d80)
                                            )
                                        }
//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }



                                    }


                                    Spacer(modifier = Modifier
                                        .width(20.dp))



                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.mo),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_MOMBASA) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "MoMBASA",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color(0xff68d1eb )
                                        )


//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }







                                    }













                                    Spacer(modifier = Modifier
                                        .height(10.dp))







                                }

                                Row {
                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.kis),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_KISUMU) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "KISUMU",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }
//



                                    }
                                    Spacer(modifier = Modifier
                                        .width(20.dp))



                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb)),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.el),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_ELDORET) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "ELDORET",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )


//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }


                                    }





                                }

                                Row {
                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.mal),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_MALINDI) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "MALINDI",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }




                                    }
                                    Spacer(modifier = Modifier
                                        .width(20.dp))



                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.nak),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_NAKURU) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "NAKURU",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//


                                    }










                                }

                                Row {



                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.nye),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_Nyeri) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "NYERI",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//


                                    }
                                    Spacer(modifier = Modifier
                                        .width(20.dp))

                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.emb),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_EMBU) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "EMBU",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//


                                    }






                                }


                                Row {

                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.mach),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_MACHAKOS) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "MACHAKOS",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//


                                    }
                                    Spacer(modifier = Modifier
                                        .width(20.dp))



                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.mg),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = "favorite",
                                                    tint = Color.Red,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                        }


                                        Text(
                                            modifier = Modifier

                                                .clickable {
                                                    navController.navigate(ROUTE_MURANGA) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                                    }
                                                },


                                            text = "MURANGA",
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Cursive,
                                            textAlign = TextAlign.Center,
                                            color = Color( 0xff68d1eb)
                                        )

//


                                    }




                                }
                                Row {


                                    Column {


                                        Card (modifier = Modifier
                                            .height(110.dp)
                                            .width(150.dp)
                                            .padding(10.dp),
                                            colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                            elevation = CardDefaults.cardElevation(10.dp)


                                        ){
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.`in`),
                                                    contentDescription = "germany",
                                                    modifier = Modifier.fillMaxSize(),
                                                    contentScale = ContentScale.Crop
                                                )

                                                Icon(
                                                    imageVector = Icons.Default.Add,
                                                    contentDescription = "favorite",
                                                    tint = Color.Blue,
                                                    modifier = Modifier
                                                        .align(Alignment.TopEnd)
                                                        .padding(10.dp)
                                                )




                                            }
                                            Text(
                                                modifier = Modifier

                                                    .clickable {
                                                        navController.navigate(ROUTE_ABOUT) {
                                                            popUpTo(ROUTE_PRODUCTSCREEN) { inclusive = true }

                                                        }
                                                    },


                                                text = "MURANGA",
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Cursive,
                                                textAlign = TextAlign.Center,
                                                color = Color( 0xff68d1eb)
                                            )

                                        }




//


                                    }

                                }
















                            }


                        }


                    }


                }








            }, bottomBar = { net.ezra.ui.about.BottomBar(navController = navController)})

    net.ezra.ui.about.AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen = false })







}


@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    @Composable
    fun SocialMediaIcon() {

    }
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
        ,
        color=Color.White,
        // color = Color.LightGray,
//        elevation = 16.dp
    ) {






        val mContext = LocalContext.current
        val  navController: NavHostController
        Column {
//            Text(
//                text = "Drawer Item 1"
//
//            )
//            Text(
//                text = "Drawer Item 2"
//            )
//            Text(
//                text = "Drawer Item 3",
//                modifier = Modifier.clickable {  }
//            )




            Spacer(modifier = Modifier.height(16.dp))






            OutlinedButton(
                onClick = {

                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {
                Icon(imageVector = Icons.Default.Send,"",tint = Color.White)
                Text(text = "Mpesa", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }


                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {
                Icon(imageVector = Icons.Default.AddCircle,"",tint = Color.White)
                Text(text = "Camera", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0769184414".toUri()
                    smsIntent.putExtra("sms_body","Hello Madul,how was your day?")
                    mContext.startActivity(smsIntent)


                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {

                Icon(imageVector = Icons.Default.MailOutline,"",tint = Color.Black)
                //Text(text = "Sms", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0769184414".toUri()
                    mContext.startActivity(callIntent)

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {

                Icon(imageVector = Icons.Default.Call,"",tint = Color.Black)
                //Text(text = "Call", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("maxkuol38@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Welcome to the Business email address")
                    mContext.startActivity(shareIntent)



                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {

                Icon(imageVector = Icons.Default.Email,"",tint = Color.Black)
                //Text(text = "email", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {

                Icon(imageVector = Icons.Default.Share,"dd",tint = Color.Black)
                //Text(text = "Share", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = stringResource(id = androidx.compose.ui.R.string.range_end))

        }

    }
}



@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp, backgroundColor = Color.Black) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"",)
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}






















@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

