package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_2.*

class MainActivity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameText.text = "Employee Name : ${newEmployee?.name}"
        radiobtn.text = "Gender : ${newEmployee?.gender}"
        emailText.text = "Email : ${newEmployee?.email}"
        salaryText.text = "Salary : ${newEmployee?.salary}"
    }

    fun onClickClose(view: View){
        finish()
    }
}