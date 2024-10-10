package com.emrehayat.bestmovies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.emrehayat.bestmovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val esaretinBedeli = BestMovies("Esaretin Bedeli", "IMDB: 9.3", R.drawable.esaretinbedeli)
        val baba = BestMovies("Baba", "IMDB: 9.2", R.drawable.baba)
        val karaSovalye = BestMovies("Kara Şövalye", "IMDB: 9.0", R.drawable.karasovalye)
        val baba2 = BestMovies("Baba 2", "IMDB: 9.0", R.drawable.baba2)
        val onIkiOfkeliAdam = BestMovies("12 Öfkeli Adam", "IMDB: 9.0", R.drawable.onikiofkeliadam)
        val yuzuklerinEfendisiKralinDonusu = BestMovies("Yüzüklerin Efendisi: Kralın Dönüşü", "IMDB: 9.0", R.drawable.yuzuklerinefendisikralindonusu)
        val schindlerinListesi = BestMovies("Schindler'in Listesi", "IMDB: 9.0", R.drawable.schindlerinlistesi)
        val ucuzRoman = BestMovies("Ucuz Roman", "IMDB: 8.9", R.drawable.ucuzroman)
        val yuzuklerinEfendisiYuzukKardesligi = BestMovies("Yüzüklerin Efendisi: Yüzük Kardeşliği", "IMDB: 8.9", R.drawable.yuzuklerinefendisiyuzukkardesligi)
        val iyiKotuVeCirkin = BestMovies("İyi, Kötü ve Çirkin", "IMDB: 8.8", R.drawable.iyikotuvecirkin)
        val forrestGump = BestMovies("Forrest Gump", "IMDB: 8.8", R.drawable.forrestgump)
        val yuzuklerinEfendisiIkiKule = BestMovies("Yüzüklerin Efendisi: İki Kule", "IMDB: 8.8", R.drawable.yuzuklerinefendisiikikule)
        val dovusKulubu = BestMovies("Dövüş Kulübü", "IMDB: 8.8", R.drawable.dovuskulubu)
        val baslangic = BestMovies("Başlangıç", "IMDB: 8.8", R.drawable.baslangic)
        val yildizSavaslariImparator = BestMovies("Yıldız Savaşları: İmparator", "IMDB: 8.7", R.drawable.yildizsavaslariimparator)

        val bestMoviesList = arrayListOf(esaretinBedeli, baba, karaSovalye, baba2, onIkiOfkeliAdam, yuzuklerinEfendisiKralinDonusu, schindlerinListesi, ucuzRoman, yuzuklerinEfendisiYuzukKardesligi, iyiKotuVeCirkin,
            forrestGump, yuzuklerinEfendisiIkiKule, dovusKulubu, baslangic, yildizSavaslariImparator)

        val adapter = BestMoviesAdapter(bestMoviesList)
        binding.bestMoviesRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.bestMoviesRecyclerView.adapter = adapter
    }
}