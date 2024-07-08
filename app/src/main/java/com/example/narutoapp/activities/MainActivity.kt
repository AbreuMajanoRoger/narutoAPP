package com.example.narutoapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import com.example.narutoapp.ApiServiceNaruto
import com.example.narutoapp.Narutocharacters
import com.example.narutoapp.adapters.NarutoAdapter
import com.example.narutoapp.databinding.ActivityMainBinding
import com.google.android.material.search.SearchBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var adapter : NarutoAdapter
    lateinit var charactersListNaruto: List<Narutocharacters>








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        charactersListNaruto = emptyList()

        adapter = NarutoAdapter(charactersListNaruto){}



        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)


        binding.apply {



           searchView.editText.setOnEditorActionListener( object:TextView.OnEditorActionListener{
                override fun onEditorAction(
                    v: TextView?,
                    actionId: Int,
                    event: KeyEvent?
                ): Boolean {
                    val text = v?.text.toString()
                    searchView.hide()
                    searchBar.setText(text)
                   // searchByName(text) llamar funcion searchByName
                    return true
                }
            })
        }
















}








