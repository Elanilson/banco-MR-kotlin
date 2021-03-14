package com.apkdoandroid.bancomrkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apkdoandroid.bancomrkotlin.databinding.ActivityMainBinding
import com.apkdoandroid.bancomrkotlin.databinding.ActivitySaldoBinding

class SaldoActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySaldoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaldo
        toolbar.title = "Saldo"
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            toolbar.setTitleTextColor(getColor(R.color.white))
        }
        toolbar.setTitleMargin(400,0,400,0)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_24))
        }
        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this,MainActivity :: class.java))
            finish()
        }
    }
}