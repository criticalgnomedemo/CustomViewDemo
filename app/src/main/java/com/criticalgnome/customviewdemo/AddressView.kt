package com.criticalgnome.customviewdemo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

@Suppress("MemberVisibilityCanBePrivate")
class AddressView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): FrameLayout(context, attrs, defStyleAttr) {

    private val addressViewZipCode: TextView
    private val addressViewCountry: TextView
    private val addressViewCity: TextView
    private val addressViewLine1: TextView
    private val addressViewLine2: TextView

    var zipCode: String? = null
        set(value) {
            field = value
            addressViewZipCode.text = value
            addressViewZipCode.visibility = if (value.isNullOrEmpty()) View.GONE else View.VISIBLE
        }

    var country: String = ""
        set(value) {
            field = value
            addressViewCountry.text = value
        }

    var city: String = ""
        set(value) {
            field = value
            addressViewCity.text = value
        }

    var line1: String = ""
        set(value) {
            field = value
            addressViewLine1.text = value
        }

    var line2: String? = null
        set(value) {
            field = value
            addressViewLine2.text = value
            addressViewLine2.visibility = if (value.isNullOrEmpty()) View.GONE else View.VISIBLE
        }

    init {
        LayoutInflater.from(context).inflate(R.layout.view_address, this)
        addressViewZipCode = findViewById(R.id.addressViewZipCode)
        addressViewCountry = findViewById(R.id.addressViewCountry)
        addressViewCity = findViewById(R.id.addressViewCity)
        addressViewLine1 = findViewById(R.id.addressViewLine1)
        addressViewLine2 = findViewById(R.id.addressViewLine2)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.AddressView, defStyleAttr, 0)
        attributes.getString(R.styleable.AddressView_zip_code).let { zipCode = it }
        attributes.getString(R.styleable.AddressView_country).let { country = it ?: "" }
        attributes.getString(R.styleable.AddressView_city).let { city = it ?: "" }
        attributes.getString(R.styleable.AddressView_line1).let { line1 = it ?: "" }
        attributes.getString(R.styleable.AddressView_line2).let { line2 = it }
        attributes.recycle()
    }
}