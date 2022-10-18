// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         MainActivity.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        MainScreenActivity after initialization and splash screen activity
// @details
// ------------------------------------------------------------------

package solutions.alva.of.son.karlasl

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import solutions.alva.of.son.karlasl.databinding.ActivityMainBinding
import solutions.alva.of.son.karlasl.databinding.ActivityNameRequestBinding

private lateinit var binding: ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("userName",Context.MODE_PRIVATE)
        val userName = sharedPreferences.getString("UserNameKey", null)
        binding.tvusername.text = userName.toString()
    }
}