package com.example.myfirstproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btResult.setOnClickListener {

            val resultValue = binding.edValue.text.toString()
            binding.imPhoto.visibility = View.VISIBLE

            when (resultValue) {

                Constance.STREET_CLEANER -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Ваша зарплата: ${Constance.STREET_CLEANER_SALARY}"
                    if (binding.edPin.text.toString() == Constance.STREET_CLEANER_PIN) {
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.andrey)
                    } else {
                        binding.tvResult.text = "Неверный PIN Code"
                        binding.imPhoto.setImageResource(R.drawable.ops)
                    }
                }

                Constance.ENGINEER -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Ваша зарплата: ${Constance.ENGINEER_SALARY}"
                    if (binding.edPin.text.toString() == Constance.ENGINEER_PIN) {
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.sergey)
                    } else {
                        binding.tvResult.text = "Неверный PIN Code"
                        binding.imPhoto.setImageResource(R.drawable.ops)
                    }
                }

                Constance.DIRECTOR -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Ваша зарплата: ${Constance.DIRECTOR_SALARY}"
                    if (binding.edPin.text.toString() == Constance.DIRECTOR_PIN) {
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.egor)
                    } else {
                        binding.tvResult.text = "Неверный PIN Code"
                        binding.imPhoto.setImageResource(R.drawable.ops)
                    }
                }

                else -> {
                    binding.tvResult.visibility = View.VISIBLE
                    binding.tvResult.text = "Нет такого работника"
                    binding.imPhoto.setImageResource(R.drawable.ops)
                }
            }
        }
    }

}