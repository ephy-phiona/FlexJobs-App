package dev.phiona.flexjobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TeseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tese)
        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}