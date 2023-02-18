package com.example.kt_pro_with_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kt_pro_with_mvvm.databinding.ActivityBuntyBinding

class BuntyActivity : AppCompatActivity() {
    private lateinit var buntyBinding: ActivityBuntyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buntyBinding = DataBindingUtil.setContentView(this, R.layout.activity_bunty)
      //  mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        buntyBinding.lifecycleOwner = this
        val post = Post("Title: Sharma","Description: Bunty","https://source.unsplash.com/user/c_v_r")
        buntyBinding.post = post
    }
}