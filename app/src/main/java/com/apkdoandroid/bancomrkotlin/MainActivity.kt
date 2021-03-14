package com.apkdoandroid.bancomrkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apkdoandroid.bancomrkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewSaldo.setOnClickListener {
            val intent = Intent(this,SaldoActivity::class.java)
            startActivity(intent)
        }
        binding.imageViewFaturas.setOnClickListener {
            startActivity(Intent(this,FaturasActivity::class.java))
        }
        binding.imageView4Poupanca.setOnClickListener {
            val intent = Intent(this,PoupancaActivity::class.java)
            startActivity(intent)
        }
        binding.imageViewtransferencias.setOnClickListener {
            startActivity(Intent(this,TransferenciaActivity::class.java))
        }
    }
}