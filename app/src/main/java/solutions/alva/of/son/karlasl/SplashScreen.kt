// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         SplashScreen.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        Initial activity that shows splash screen when the app starts
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPreferences = getSharedPreferences("userName", Context.MODE_PRIVATE)

        val userName = sharedPreferences.getString("UserNameKey", null)
        // This is used to hide the status bar and make the splash screen as a full screen activity
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Use of postDelayed(Runnable, time) method to send a message with a delayed time.
        Handler().postDelayed({
            if (userName != null){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
            val intent = Intent(this, NameRequest::class.java)
            startActivity(intent)
            finish() }
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}