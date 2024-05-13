package net.ezra.ui.home

import android.annotation.SuppressLint
import android.app.Instrumentation
import android.content.Intent
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import net.ezra.navigation.ROUTE_SIGNUP



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {


    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {

                    Text(text = "DIscoverNiche",
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

            Box(

                modifier = Modifier

                    .fillMaxSize()
                    .background(color = Color.Black)

                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }
            )

            {

                Column(



                    modifier = Modifier
//                .fillMaxSize()
////                .fillMaxWidth()
////                .wrapContentHeight()
//                .padding(50.dp)
               .padding(top = 70.dp)

                ){

                    Image(
                        painter = painterResource(id = R.drawable.cit),
                        contentDescription ="High 2",
                        modifier = Modifier
                            .size(310.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier
                        .height(50.dp))




//            Text(text = stringResource(id = R.string.mit))

                    Text(text = "Discover Kenya With DIscoverNiche", color = Color(0xff209fbe ), fontSize = 30.sp)
                    Row {
                        Text(text = "Realible Explorer App", color = Color(0xff209fbe ), fontSize = 10.sp)
                    }
                    Spacer(modifier = Modifier
                        .height(30.dp))
                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.cit),
                            contentDescription ="High 2",
                            modifier = Modifier

                                .size(90.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )
                        Spacer(modifier = Modifier
                            .width(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ui),
                            contentDescription ="High 2",
                            modifier = Modifier

                                .size(90.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )
                        Spacer(modifier = Modifier
                            .width(5.dp))

                        Image(
                            painter = painterResource(id = R.drawable.iu),
                            contentDescription ="High 2",
                            modifier = Modifier

                                .size(90.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )




                    }



                    Spacer(modifier = Modifier
                        .height(20.dp))
                    Button(onClick = {
                        navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                        colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
                    )


                    {

                        Text(text = "Get started",color= Color.Black)

                        Image(
                            painter = painterResource(id = R.drawable.aro),
                            contentDescription = "",
                            modifier = Modifier
                                .background(color = Color(0xff209fbe))
                                .size(20.dp)
                                .clip(shape = CircleShape)


                        )

                        Text(
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = ""
                        )


                    }














                }


















            }











        }, bottomBar = { BottomBar(navController = navController) })

    AnimatedDrawer(
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
        color=Color.Black,
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
                border = BorderStroke(2.dp, Color(0xff68d1eb))
            ) {
                Icon(imageVector = Icons.Default.Send,"",tint = Color(0xff68d1eb))
                Text(text = "Mpesa", color = Color(0xff68d1eb))

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
                border = BorderStroke(2.dp, Color(0xff68d1eb))
            ) {
                Icon(imageVector = Icons.Default.AddCircle,"",tint = Color(0xff68d1eb))
                Text(text = "Camera", color = Color(0xff68d1eb))

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0769184414".toUri()
                    smsIntent.putExtra("sms_body","Hello Mynet,how was your day?")
                    mContext.startActivity(smsIntent)


                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {

                Icon(imageVector = Icons.Default.MailOutline,"",tint = Color(0xff68d1eb))
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

                Icon(imageVector = Icons.Default.Call,"",tint = Color(0xff68d1eb))
                //Text(text = "Call", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("collins38@gmail.com"))
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

                Icon(imageVector = Icons.Default.Email,"",tint = Color(0xff68d1eb))
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

                Icon(imageVector = Icons.Default.Share,"dd",tint = Color(0xff68d1eb))
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







@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

