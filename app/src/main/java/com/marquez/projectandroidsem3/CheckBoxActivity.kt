package com.marquez.projectandroidsem3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.view.*

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
    }

    fun androidCheckBoxClicked(view: android.view.View) {
        when(view.id){
            R.id.checkBox->Toast.makeText(this,"${view.checkBox.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox2->Toast.makeText(this,"${view.checkBox2.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox3->Toast.makeText(this,"${view.checkBox3.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox4->Toast.makeText(this,"${view.checkBox4.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox5->Toast.makeText(this,"${view.checkBox5.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox6->Toast.makeText(this,"${view.checkBox6.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox7->Toast.makeText(this,"${view.checkBox7.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox8->Toast.makeText(this,"${view.checkBox8.text} selecccionado",Toast.LENGTH_SHORT).show()
            R.id.checkBox9->Toast.makeText(this,"${view.checkBox9.text} selecccionado",Toast.LENGTH_SHORT).show()
        }
    }
}