package com.example.sports_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // 1 - RecyclerView
        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // 2- Data source: List of SportModel Objects
        var sportsList: ArrayList<Sports_Model> = ArrayList()

        val sport1 = Sports_Model(R.drawable.football, "Football")
        val sport2 = Sports_Model(R.drawable.baseball, "Baseball")
        val sport3 = Sports_Model(R.drawable.golf, "Golf")
        val sport4 = Sports_Model(R.drawable.swimming, "Swimming")
        val sport5 = Sports_Model(R.drawable.tennis, "Tennis")

        sportsList.add(sport1)
        sportsList.add(sport2)
        sportsList.add(sport3)
        sportsList.add(sport4)
        sportsList.add(sport5)

        // 3 - Adapter
        val adapter = SportsAdapter(sportsList)
        recyclerView.adapter = adapter
        }
}