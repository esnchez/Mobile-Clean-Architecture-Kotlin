package Koobi.presenter.view

import Koobi.presenter.R
import Koobi.presenter.navigation.CustomNavigator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class HostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState:  Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpCustomNavigation()
        //setUpNavigation()
    }

    private fun setUpCustomNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // setup custom navigator
        val navigator = CustomNavigator(this, navHostFragment.childFragmentManager, R.id.nav_host_fragment)
        navController.navigatorProvider.addNavigator(navigator)

        // set navigation graph
        navController.setGraph(R.navigation.nav_graph)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation_menu)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

    private fun setUpNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation_menu)

        val navigator = CustomNavigator(this, navHostFragment.childFragmentManager, R.id.nav_host_fragment)
        navController.navigatorProvider.addNavigator(navigator)
        navController.setGraph(R.navigation.nav_graph)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)


        /*setupActionBarWithNavController(navController)
        val naveController = Navigation.findNavController(this, R.id.nav_host_fragment)
        bottomNavigationView.setupWithNavController(naveController);*/

    }
}