// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         QCMainScreen.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        MainActivity for the Quick Communication tools and modules
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl.quick_communication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import solutions.alva.of.son.karlasl.R

class QCMainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qcmain_screen)
    }
}