package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    fun emptyPass() {
        if (binding.etPass.text.isEmpty()) {
            Toast.makeText(this, "Password vacia", Toast.LENGTH_LONG).show()
        } else if (binding.etPass.text.matches("hola".toRegex())) {
            val intent = Intent(this,ToDo::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btGo.setOnClickListener { emptyPass() }

    }
}