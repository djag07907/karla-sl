// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         NameRequest.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        Activity that requests the name of the user to be displayed on the app screens
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import solutions.alva.of.son.karlasl.databinding.ActivityNameRequestBinding


// Variables initialization
@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityNameRequestBinding


class NameRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_request)

        binding = ActivityNameRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveNameButton.setOnClickListener {
            saveNameCont()
        }
    }

    private fun saveNameCont() {
        val userName = binding.editTextUserName.text.toString()

        val sharedPreferences = getSharedPreferences("userName",Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply{
            putString("UserNameKey", userName)
        }.apply()

        Toast.makeText(this, "¡Bienvenido(a) a KARLA SL, $userName!", Toast.LENGTH_SHORT).show()
        
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun loadUserData() {
        val sharedPreferences = getSharedPreferences("userName",Context.MODE_PRIVATE)
        val savedString = sharedPreferences.getString("UserNameKey", null)
    }
}
