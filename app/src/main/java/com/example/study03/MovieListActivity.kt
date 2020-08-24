package com.example.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    //array list
    val movieList : ArrayList<Movie> = arrayListOf(
        Movie("테넷",22.345,"어쩌구..저쩌구..","2020-08-26",R.drawable.m2),
        Movie("소년 시절의 너",233.345,"어쩌구..소년..","2025-08-26",R.drawable.m4),
        Movie("덩케르크",44.345,"어쩌구..덩케르크..","2030-08-26",R.drawable.m3),
        Movie("짱구",55.345,"어쩌구..짱구..","2040-08-26",R.drawable.m1)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val adapter = MovieAdapter(this,movieList)
        movieRecycler.adapter = adapter

        val lm = LinearLayoutManager(this)
        movieRecycler.layoutManager = lm
    }
}