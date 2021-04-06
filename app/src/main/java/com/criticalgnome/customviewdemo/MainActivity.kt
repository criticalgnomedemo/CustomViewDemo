package com.criticalgnome.customviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AddressView>(R.id.address2).apply {
            zipCode = "39531"
            country = "USA"
            city = "New York"
            line1 = "40, Sit Rd."
            line2 = "Ap #867-859"
        }
    }
}