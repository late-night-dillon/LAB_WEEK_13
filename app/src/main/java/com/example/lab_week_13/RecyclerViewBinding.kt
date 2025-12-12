package com.example.lab_week_13

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lab_week_13.model.Movie

@BindingAdapter("list")
fun bindRecyclerViewList(recyclerView: RecyclerView, items: List<Movie>?) {
    val adapter = recyclerView.adapter
    if (adapter is MovieAdapter) {
        // kosongkan dulu biar tidak numpuk
        adapter.setMovies(items ?: emptyList())
    }
}