package com.marquez.projectandroidsem3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)




    }

    fun changeTextButton(){
        Handler(Looper.getMainLooper()).postDelayed({ btnSimpleButton.text = "New Text Button" },4000)


        Handler(Looper.getMainLooper()).postDelayed({ btnButtonIcon.text = "New Text Button" },4000)
    }

    fun declareClickListener() {
        btnSimpleButton.setOnClickListener {
            Toast.makeText(this,"New Text btnSimpleButton", Toast.LENGTH_SHORT).show()
        }
        btnButtonIcon.setOnClickListener {
            Toast.makeText(this,"New Text btnButtonIcon", Toast.LENGTH_SHORT).show()
        }
    }

    fun callRightIconButton(view: android.view.View) {
        showToastShort("callRightIconButton")
    }
    fun callBackgroundImageButton(view: android.view.View) {
        showToastShort("callBackgroundImageButton")
    }
    fun callBorderButton(view: android.view.View) {
        showToastShort("callBorderButton")
    }
    fun callBorderRadiusButton(view: android.view.View) {
        showToastShort("callBorderRadiusButton")
    }
    fun callRoundButton(view: android.view.View) {
        showToastShort("callRoundButton")

    }
    fun callMaterialDesignButton(view: android.view.View) {
        showToastShort("callMaterialDesignButton")
    }

    fun showToastShort(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}