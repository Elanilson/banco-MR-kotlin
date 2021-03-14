package com.apkdoandroid.bancomrkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apkdoandroid.bancomrkotlin.databinding.ActivityFaturasBinding

class FaturasActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFaturasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        val toolbar = binding.toolbarFaturas
        toolbar.setTitle("Faturas")
        toolbar.setTitleMargin(400,0,400,0)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_24))
        }
        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}