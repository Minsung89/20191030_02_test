package com.tjoeum.a20191030_02_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        loginBtn.setOnLongClickListener {
            Toast.makeText(this, String.format("", "id = " + loginId.toString() + ", pw = " + loginPw.toString()), Toast.LENGTH_SHORT).show()
            if(loginId.toString().equals("admin") && loginPw.toString().equals("1234")){
                Toast.makeText(this, "관리자로 로그인합니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "아이디 혹은 비번이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
        */

        loginBtn.setOnClickListener {
            var inputId = loginId.text.toString()
            var inputPw = loginPw.text.toString()

            Toast.makeText(this, String.format("ID : %s, PW : %s", inputId, inputPw), Toast.LENGTH_SHORT).show()

            if(loginId.toString().equals("admin") && loginPw.toString().equals("1234")){
                Toast.makeText(this, "관리자로 로그인합니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "아이디 혹은 비번이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
