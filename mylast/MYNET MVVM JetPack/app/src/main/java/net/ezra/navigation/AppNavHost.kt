package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.eldoret.Eldoretscreen
import net.ezra.ui.embu.Embuscreen
import net.ezra.ui.evening.EveningScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.kisumu.kisumuscreen
import net.ezra.ui.machakos.Machakosscreen
import net.ezra.ui.malindi.Malindicreen
import net.ezra.ui.mombasa.mombasascreen
import net.ezra.ui.muranga.Murangascreen
import net.ezra.ui.nakuru.NakuruScreen
import net.ezra.ui.nyeri.Nyeriscreen
import net.ezra.ui.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_PRODUCTSCREEN) {
            AboutScreen(navController)
        }

        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }

        composable(ROUTE_SPLAsH) {
            SplashScreen(navController)
        }

        composable(ROUTE_MOMBASA) {
            mombasascreen(navController)
        }

        composable(ROUTE_KISUMU) {
            kisumuscreen(navController)
        }

        composable(ROUTE_ELDORET) {
            Eldoretscreen(navController)
        }
        composable(ROUTE_MALINDI) {
            Malindicreen(navController)
        }

        composable(ROUTE_NAKURU) {
            NakuruScreen(navController)
        }

        composable(ROUTE_Nyeri) {
            Nyeriscreen(navController)
        }
        composable(ROUTE_EMBU) {
            Embuscreen(navController)
        }
        composable(ROUTE_MACHAKOS) {
            Machakosscreen(navController)
        }
        composable(ROUTE_MURANGA) {
            Murangascreen(navController )
        }






























    }
}