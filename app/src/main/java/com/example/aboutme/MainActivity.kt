package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


//        val doneBtn : Button = findViewById(R.id.done_button)
//
//        doneBtn.setOnClickListener{
//            addNickName(it)
//        }
        binding.myName = myName



        binding.doneButton.setOnClickListener{
            addNickName(it)
        }

        binding.nicknameText.setOnClickListener{
            editNickName(it)
        }

    }

    private fun editNickName(view: View){
//        binding.apply {
//            myName?.nickname = nicknameEdit.text.toString()
//            invalidateAll()
//        }
        binding.nicknameEdit.visibility = View.VISIBLE
        binding.doneButton.visibility = View.VISIBLE
        binding.nicknameText.visibility = View.GONE

//        binding.nicknameText.visibility =
    }

    private fun addNickName(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
//
//        nicknameTextView.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        nicknameTextView.visibility = View.VISIBLE

        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            binding.nicknameEdit.visibility = View.GONE
            view.visibility = View.GONE
//            binding.doneButton.visibility = View.GONE
            binding.nicknameText.visibility = View.VISIBLE
        }




    }
}