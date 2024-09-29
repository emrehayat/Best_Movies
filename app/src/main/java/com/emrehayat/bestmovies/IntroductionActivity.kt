package com.emrehayat.bestmovies

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.emrehayat.bestmovies.databinding.ActivityIntroductionBinding
import com.emrehayat.bestmovies.databinding.ActivityMainBinding

class IntroductionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroductionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroductionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapterdanGelenIntent = intent

        val secilenFilm = adapterdanGelenIntent.getSerializableExtra("secilenFilm") as BestMovies

        binding.imageView.setImageResource(secilenFilm.gorsel)
        binding.filmTextView.text = secilenFilm.isim
        binding.imdbTextView.text = secilenFilm.imdb.toString()

    }
}