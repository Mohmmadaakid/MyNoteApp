package com.example.aakidnoteapp.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.aakidnoteapp.R
import com.example.aakidnoteapp.databinding.ActivityMainBinding
import com.example.aakidnoteapp.db.NoteDatabase
import com.example.aakidnoteapp.repository.NoteRepository
import com.example.aakidnoteapp.viewModel.NoteActivityViewModel
import com.example.aakidnoteapp.viewModel.NoteActivityViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var noteActivityViewModel: NoteActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=ActivityMainBinding.inflate(layoutInflater)

        try {
            setContentView(binding.root)
            val noteRepository= NoteRepository(NoteDatabase(this))
            val noteActivityViewModelFactory= NoteActivityViewModelFactory(noteRepository)
            noteActivityViewModel= ViewModelProvider(this,noteActivityViewModelFactory)[NoteActivityViewModel::class.java]


        }catch (e:Exception)
        {
            Log.d("Tag","Error")
        }


    }
}