package kr.ptus.androidbasic01_intent_20200524

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1000

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

        goTOThirdBtn.setOnClickListener {

            val inputContent = contentEdt.text.toString()


            val myIntent = Intent(this, thirdActivity::class.java)
            myIntent.putExtra("content", inputContent)
            myIntent.putExtra("number", 10);
            startActivity(myIntent)
        }

        goTOFourthBtn.setOnClickListener {

            val inputPhoneNumber = inputPhoneEdt.text.toString()


            val phoneIntent = Intent(this, FourthActivity::class.java)

            phoneIntent.putExtra("phone", inputPhoneNumber)

            startActivity(phoneIntent)
        }

        editNickNameBtn.setOnClickListener {
            val myIntent = Intent(this, EditeNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {
                val newNickName = data?.getStringExtra("nick")
                nickNameTxt.text = newNickName
            }
        }

    }

}
