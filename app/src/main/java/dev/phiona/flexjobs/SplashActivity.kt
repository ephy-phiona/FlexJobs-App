package dev.phiona.flexjobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.flexjobs.databinding.ActivityMainBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(this,TeaserActivity::class.java)
        startActivity(intent)
        finish()
    }
}