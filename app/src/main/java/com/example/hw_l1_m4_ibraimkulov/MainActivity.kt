package com.example.hw_l1_m4_ibraimkulov

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.hw_l1_m4_ibraimkulov.R
import com.example.hw_l1_m4_ibraimkulov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=
            supportFragmentManager.findFragmentById(R.id.nav_Host_Fragment)as NavHostFragment
        navController=navHostFragment.navController
        initBottomNav()

    }
    private fun initBottomNav() {
        binding.bottomNav.apply {
            setupWithNavController(navController)
            itemIconTintList = null
        }
    }
}
