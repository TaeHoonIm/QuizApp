package com.example.quizapp

//안드로이드는 Integer 속성으로 리소스 안에 있는 이미지를 불러옴.
//정답은 index로 처리
data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
