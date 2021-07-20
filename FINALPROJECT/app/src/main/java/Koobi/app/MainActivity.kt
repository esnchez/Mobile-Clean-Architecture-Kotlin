package Koobi.app

import Koobi.app.Navigation.CustomNavigator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.*
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
/*
    var bottomNavigationView: BottomNavigationView? = null
*/
    override fun onCreate(savedInstanceState:  Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpCustomNavigation();
        //setUpNavigation();
    }

   private fun setUpCustomNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // setup custom navigator
        val navigator = CustomNavigator(this, navHostFragment.childFragmentManager, R.id.nav_host_fragment)
        navController.navigatorProvider.addNavigator(navigator);

        // set navigation graph
        navController.setGraph(R.navigation.nav_graph);

       val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation_menu)

       NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    private fun setUpNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation_menu)

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}


