package ua.lutsenko.vladyslav.androidnavigationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val config = AppBarConfiguration(findNavController(R.id.mainHost).graph)
        setupActionBarWithNavController(findNavController(R.id.mainHost), config)
        findNavController(R.id.mainHost).setGraph(R.navigation.navigation_main)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> findNavController(R.id.mainHost).navigateUp()
        else -> super.onOptionsItemSelected(item)
    }
}
