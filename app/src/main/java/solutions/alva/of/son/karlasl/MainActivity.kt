// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         MainActivity.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        MainScreenActivity after initialization and splash screen activity
// @details
// ------------------------------------------------------------------

package solutions.alva.of.son.karlasl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}