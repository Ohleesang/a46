package com.example.a46

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(s: String): Int {
                var answer: Int = 0
                var temp_s = s+""
                temp_s = temp_s.replace("zero","0")
                temp_s = temp_s.replace("one","1")
                temp_s = temp_s.replace("two","2")
                temp_s = temp_s.replace("three","3")
                temp_s = temp_s.replace("four","4")
                temp_s = temp_s.replace("five","5")
                temp_s = temp_s.replace("six","6")
                temp_s = temp_s.replace("seven","7")
                temp_s = temp_s.replace("eight","8")
                temp_s = temp_s.replace("nine","9")
                answer = temp_s.toInt()
                return answer
            }
        }
        val a = Solution()
        a.solution("one4seveneight")
        a.solution("23four5six7")
        a.solution("2three45sixseven")
        a.solution("123")
    }
}