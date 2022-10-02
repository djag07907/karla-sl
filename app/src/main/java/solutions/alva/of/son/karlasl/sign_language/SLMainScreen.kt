// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         SLMainScreen.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        MainActivity for the Sign Language tools and modules.
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl.sign_language

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import solutions.alva.of.son.karlasl.R

class SLMainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slmain_screen)
    }
}