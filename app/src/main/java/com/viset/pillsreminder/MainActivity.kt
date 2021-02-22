package com.viset.pillsreminder

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.Boolean as Boolean

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> {
                Toast.makeText(this, "Add item", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.settings_item -> {
                Toast.makeText(this, "Settings item", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                Toast.makeText(this, "unk item", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }
        }
    }

}
