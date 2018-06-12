package com.example.susha.listview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note.*

class MainActivity : AppCompatActivity() {

    private var listNotes = ArrayList<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listNotes.add(Note(1, "France", "Paris"))
        listNotes.add(Note(2, "Germany", "Berlin"))
        listNotes.add(Note(3, "England", "London"))
        listNotes.add(Note(4, "Spain", "Madrid"))
        listNotes.add(Note(5, "India", "Delhi"))


        country_list.emptyView = activity_main_txt_emptylist

        var notesAdapter = NotesAdapter(this, listNotes)
        country_list.adapter = notesAdapter
        country_list.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->

            val intent: Intent = Intent(applicationContext, SecondActivity:: class.java)
            startActivity(intent)

            Toast.makeText(this, "Click on " + listNotes[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}