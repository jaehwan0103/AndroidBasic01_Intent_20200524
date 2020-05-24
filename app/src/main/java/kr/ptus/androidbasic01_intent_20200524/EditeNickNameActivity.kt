package kr.ptus.androidbasic01_intent_20200524

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edite_nick_name.*

class EditeNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edite_nick_name)

        okBtn.setOnClickListener {

            val inputNickName = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick",inputNickName)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}
