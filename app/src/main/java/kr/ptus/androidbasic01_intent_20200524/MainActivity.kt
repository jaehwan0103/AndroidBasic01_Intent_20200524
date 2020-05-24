package kr.ptus.androidbasic01_intent_20200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goTOFirstBtn.setOnClickListener {
        val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }


        goToSecondBtn.setOnClickListener {
            val myIntent2 = Intent(this, SecondActivity::class.java)

            startActivity(myIntent2)
        }


    }
}
