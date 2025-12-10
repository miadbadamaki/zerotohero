package com.example.myapplication

import TaskAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class SecondActivity : AppCompatActivity() {
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val recyclerView = findViewById<RecyclerView>(R.id.rvTask)
        val editText = findViewById<EditText>(R.id.etTask)
        val addButton = findViewById<Button>(R.id.btnAddTask)

        taskAdapter = TaskAdapter(mutableListOf())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = taskAdapter

        addButton.setOnClickListener {
                println("BUTTON WORKS")

            val taskText = editText.text.toString().trim()

            if (taskText.isNotEmpty()) {
                val newTask = Task(taskText)
                taskAdapter.addTask(newTask)
                editText.text.clear()
            }
        }
    }
}
