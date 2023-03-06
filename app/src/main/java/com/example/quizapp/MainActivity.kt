package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        //이름을 입력한 뒤 다음으로 넘어가도록 조건 설정
        btnStart.setOnClickListener {
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }
            else{
                //뒤로가기를 하면 앱을 종료하도록 설정
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                //액티비티를 시작시키는 동시에 추가로 정보값을 보내고 다른 액티비티로
                //옮기고 난 뒤에 다른 액티비티로 정보값을 회수할 수 있음
                intent.putExtra(Constatns.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}