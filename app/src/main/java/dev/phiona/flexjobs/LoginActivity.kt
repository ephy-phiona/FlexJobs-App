package dev.phiona.flexjobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.flexjobs.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvAccount.setOnClickListener{
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val  intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            validate()
        }
    }
    fun validate(){
        var Email=binding.etEmail.text.toString()
        var Password=binding.etPassword.text.toString()
        if (Email.isBlank()){
            binding.tilEmail.error="Email is required?"
        }
        if (Password.isBlank()){
            if (Password.isBlank()){
            binding.tilPassword.error="Password is required?"
        }

        }
    }
}


