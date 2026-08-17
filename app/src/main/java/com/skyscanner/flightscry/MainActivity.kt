package com.skyscanner.flightscry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skyscanner.flightscry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindRows()
    }

    private fun bindRows() {
        with(binding) {
            rowName.detailKey.text = getString(R.string.label_name)
            rowName.detailValue.text = "Jamie Thornton"

            rowPassport.detailKey.text = getString(R.string.label_passport)
            rowPassport.detailValue.text = "GB ·· 7842"

            rowCheckin.detailKey.text = getString(R.string.label_checkin)
            rowCheckin.detailValue.text = getString(R.string.value_checkin)

            rowTerminal.detailKey.text = getString(R.string.label_terminal)
            rowTerminal.detailValue.text = "T5"

            rowGate.detailKey.text = getString(R.string.label_gate)
            rowGate.detailValue.text = "B22"

            rowBoarding.detailKey.text = getString(R.string.label_boarding)
            rowBoarding.detailValue.text = "08:55"

            rowCabin.detailKey.text = getString(R.string.label_cabin)
            rowCabin.detailValue.text = "1 × 10 kg"

            rowChecked.detailKey.text = getString(R.string.label_checked)
            rowChecked.detailValue.text = "1 × 23 kg"
        }
    }
}
