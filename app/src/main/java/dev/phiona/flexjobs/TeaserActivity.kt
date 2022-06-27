package dev.phiona.flexjobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TeaserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaser)
        val intent= Intent(this,TeseActivity::class.java)
        startActivity(intent)
        finish()
    }
}