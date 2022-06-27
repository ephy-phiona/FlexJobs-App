package dev.phiona.flexjobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.phiona.flexjobs.databinding.ActivityHomeBinding
import fragments.uploadFragment


class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()
        setupBottom()
    }
    fun castView(){
//        bnvHome=findViewById(R.id.bottom_navigation)
//        fvcHome=findViewById(R.id.fcvHome)
    }
    fun setupBottom(){
        binding.bottomNavigation.setOnItemReselectedListener { item->
            when(item.itemId){             // Plan
                R.id.Home->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,Homefragments()).commit()
                    true
                }
                R.id.Jobs ->{             //Track
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,JobsFragment()).commit()
                    true
                }
                R.id.Upload ->{                //Profile
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,uploadFragment()).commit()
                    true
                }

                R.id.Profile->{                //Profile
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,uploadFragment()).commit()
                    true
                }
                else -> false

            }



        }
    }

}

