package dev.phiona.flexjobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import dev.phiona.flexjobs.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        binding.tvLogin.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            validateSignUp()
        }
    }
    fun validateSignUp() {
        var email = binding.etEmail1.text.toString()
        var password1 = binding.etPassword1.text.toString()
        var password2 = binding.etConfirm.text.toString()
        var firstname = binding.etFirst.text.toString()
        var secondname = binding.etSecond.text.toString()
        if (email.isBlank()) {
            binding.tilEmail1.error = "Email is required?"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email). matches()){
            binding.tilEmail1.error="Invalid email"
        }
        if (password1.isBlank()) {
            binding.tilPassword1.error = "Password is required?"
        }
//            if (password2.isBlank()) {
//                tilPassword2.error = "Password is required"
//            }
        if (password2 !=password1){
            binding.tilConfirm.error="Unmatched password!"
        }
        else{
            Toast.makeText(applicationContext, "Confirmed password", Toast.LENGTH_SHORT).show()
        }

        if (firstname.isBlank()) {
            binding.tilFirstName.error = "First name is required"
        }
        if (secondname.isBlank()) {
            binding.tilSecond.error = "Second name is required"
        }
    }

}


