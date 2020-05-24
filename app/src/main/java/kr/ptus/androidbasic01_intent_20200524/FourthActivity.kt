package kr.ptus.androidbasic01_intent_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_main.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)


        val myPhoneNumber = intent.getStringExtra("phone")

        phoneTxt.text = phone



    }
}
