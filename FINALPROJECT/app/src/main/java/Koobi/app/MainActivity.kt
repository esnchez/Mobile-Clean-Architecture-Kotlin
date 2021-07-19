package Koobi.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
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
        setUpNavigation()


    }

    private fun setUpNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        setupActionBarWithNavController(navController)
        val naveController = Navigation.findNavController(this, R.id.nav_host_fragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation_menu)
        bottomNavigationView.setupWithNavController(naveController)

    }
}


