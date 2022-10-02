// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         NameRequest.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        Activity that requests the name of the user to be displayed on the app screens
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NameRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_request)
    }
}