package com.route.todoappgsun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.base.BaseActivity
import com.route.todoappgsun.database.TasksDataBase
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        add_btn.setOnClickListener{
            openAddTaskActivity()
        }
        
    }

    private fun openAddTaskActivity() {
        val intent = Intent(this,AddTaskActivity::class.java)
        startActivity(intent)
    }
}