// -----------------------------------------------------------------
// @copyright    (C) 2022 SoAS
// @file         QCMainScreen.kt
// @author       Daniel Alvarez <josamogax@gmail.com>
// @brief        MainActivity for the Quick Communication tools and modules
// @details
// ------------------------------------------------------------------
package solutions.alva.of.son.karlasl.quick_communication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import solutions.alva.of.son.karlasl.R
import solutions.alva.of.son.karlasl.databinding.ActivityQcmainScreenBinding

private lateinit var binding: ActivityQcmainScreenBinding

class QCMainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qcmain_screen)

        binding = ActivityQcmainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ttsBtn.setOnClickListener {
            val intent = Intent(this, TTSScreen::class.java)
            startActivity(intent)
        }

        binding.sttBtn.setOnClickListener {
            val intent = Intent(this, STTScreen::class.java)
            startActivity(intent)
        }
    }
}