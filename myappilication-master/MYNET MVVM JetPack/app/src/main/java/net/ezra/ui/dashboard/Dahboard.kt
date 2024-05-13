package net.ezra.ui.dashboard



import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme
import net.ezra.ui.theme.AppTypography


@SuppressLint("InvalidColorHexValue")
@Composable
fun DashboardScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .background(color = Color(0Xfff3c666))){
        LazyColumn (modifier = Modifier
            .fillMaxSize()){
            item { 
                Row (
                    modifier = Modifier
                        .padding(top = 10.dp)

                ){
                    Text(text = "DASHBOARD", fontFamily = FontFamily.SansSerif)
                    Spacer(modifier = Modifier
                        .width(300.dp))

                    Image(
                        painter = painterResource(id = R.drawable.not),
                        contentDescription = "",
                        modifier = Modifier

                            .background(color = Color(0Xff0f3571))
                            .size(19.dp)

                    )
                }
                Spacer(modifier = Modifier
                    .height(20.dp))
                
                
               Column (modifier = Modifier
                   .fillMaxSize()
                   .background(color = Color.White)){
                   Row {
                       Card(modifier = Modifier
                           .padding(10.dp),
                           colors = CardDefaults.cardColors(Color(0Xff6d8cf2)),
                           elevation = CardDefaults.cardElevation(10.dp)
                       )

                       {
                           Image(
                               painter = painterResource(id = R.drawable.whil),
                               contentDescription = "",
                               modifier = Modifier
                                   .padding(10.dp)
                                   .background(color = Color.White)
                                   .size(19.dp)

                           )

                           Text(text = "786", color = Color.White,)
                           Text(text = "Total Stock unit", color = Color.White)

                       }

                       Spacer(modifier = Modifier
                           .width(50.dp))

                       Card(modifier = Modifier
                           .padding(10.dp),
                           colors = CardDefaults.cardColors(Color(0Xfff8e5bf)),
                           elevation = CardDefaults.cardElevation(10.dp)
                       )

                       {
                           Image(
                               painter = painterResource(id = R.drawable.dola),
                               contentDescription = "",
                               modifier = Modifier
                                   .padding(10.dp)
                                   .background(color = Color.White)
                                   .size(19.dp)

                           )

                           Text(text = "$565,430.00", color = Color.Black,)
                           Text(text = "Total Inventory value", color = Color.Black)

                       }



                   }
                   Spacer(modifier = Modifier
                       .height(10.dp))

                   Row (modifier = Modifier
                       .padding(10.dp)) {
                       Text(text = "Inventory")
                   }
                   Spacer(modifier = Modifier
                       .height(0.dp))
                   Row (modifier = Modifier
                       .padding(10.dp)) {

                       Card(modifier = Modifier
                           .padding(10.dp),
                           colors = CardDefaults.cardColors(Color(0Xffc6e5ee)),
                           elevation = CardDefaults.cardElevation(10.dp)
                       )

                       {

                           Text(text = "No.of Tire", color = Color.Black,)
                           Text(text = "486", color = Color.Black)

                           val image = LocalContext.current
                           Button(
                               onClick = {
                                   image.startActivity(Intent(image, AppTypography::class.java))
                               },
                               colors = ButtonDefaults.buttonColors(Color.White)

                               )


                           {
                               Text("view stock", color = Color.Black, fontSize = 10.sp)
                               Image(
                                   painter = painterResource(id = R.drawable.aro),
                                   contentDescription = "",
                                   modifier = Modifier
                                       .background(color = Color.White)
                                       .size(20.dp)


                               )


                           }

                           






                       }






                   }














               }
                
                
                
                
                
                
                
            }
            
            
            
            
        }
        
        
        
        
        
        
    }




    

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    DashboardScreen(rememberNavController())
}

