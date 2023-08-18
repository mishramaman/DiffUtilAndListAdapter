package com.example.diffutilrev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerViewRev)

        val adapter=MyAdapter()

        val p1=ProgrammningData(1,"J","Java")
        val p2=ProgrammningData(2,"K","Kotlin")
        val p3=ProgrammningData(3,"A","Android")
        val p4=ProgrammningData(4,"P","Python")

        adapter.submitList(listOf(p1,p2,p3,p4))
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=adapter


        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val p1=ProgrammningData(1,"J","Java")
            val p2=ProgrammningData(2,"K","Kotlin")
            val p3=ProgrammningData(3,"A","Android")
            val p4=ProgrammningData(4,"P","Python")
            val p5=ProgrammningData(5,"R","Rust")
            val p6=ProgrammningData(6,"G","Golang")
            val p7=ProgrammningData(7,"R","Ruby")

            adapter.submitList(listOf(p1,p2,p3,p4,p5,p6,p7))
        },5000)




    }
}