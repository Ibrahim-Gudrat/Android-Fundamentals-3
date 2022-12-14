package com.abrahamgudratli.androidfundamentals3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            prepareOrder()
        }

    }

    private fun prepareOrder() {
        val radioButtonMeatId = rgMeat.checkedRadioButtonId
        val meat = findViewById<RadioButton>(radioButtonMeatId)
        val onion = checkOnion.isChecked
        val tomato = checkTomato.isChecked
        val garlic = checkGarlic.isChecked

        val orderString = "Your order is ${meat.text} with ${if (onion) "\nonion" else ""} ${if (tomato) "\ntomato" else ""} ${if (garlic) "\ngarlic" else ""}"
        tvShowOrder.text = orderString

    }
}