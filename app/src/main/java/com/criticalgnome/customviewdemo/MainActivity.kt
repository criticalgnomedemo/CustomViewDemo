package com.criticalgnome.customviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AddressView>(R.id.address2).apply {
            zipCode = "220045"
            country = "Belarus"
            city = "Minsk"
            line1 = "2, Giedroyc st"
            line2 = "Apartment 111"
        }
    }
}