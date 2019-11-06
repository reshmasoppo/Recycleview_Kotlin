package com.example.recycleview_kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

 //   val animals: ArrayList<String> = ArrayList()

     @SuppressLint("WrongConstant")
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val recyclerview=findViewById<RecyclerView>(R.id.recyclerview)

         recyclerview.layoutManager=LinearLayoutManager(this, HORIZONTAL,true)
         val users=ArrayList<User>()
         users.add(User(R.drawable.img1,"Reshma","Mumbai"))
         users.add(User(R.drawable.img1,"Veena","Kerala"))
         users.add(User(R.drawable.img1,"Vardha","Tamilnadu"))
         users.add(User(R.drawable.img1,"Shyam","Calcutta"))
         val adapter =RecyclerViewAdapter(users)
         recyclerview.setHasFixedSize(true)
         recyclerview.adapter=adapter

//https://www.youtube.com/watch?v=67hthq6Y2J8

    }
}
