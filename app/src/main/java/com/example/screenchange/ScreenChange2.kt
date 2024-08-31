package com.example.screenchange

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.screenchange.databinding.ActivityMainBinding
import com.example.screenchange.databinding.ActivityScreenChange2Binding

class ScreenChange2 : AppCompatActivity() {
    private lateinit var binding: ActivityScreenChange2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_screen_change2)
        with(binding){
           btnSs.setOnClickListener {
               intent= Intent(this@ScreenChange2,MainActivity::class.java)
               startActivity(intent)
           }
        }
    }
}