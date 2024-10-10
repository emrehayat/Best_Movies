package com.emrehayat.bestmovies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emrehayat.bestmovies.databinding.RecyclerRowBinding

class BestMoviesAdapter(val bestMoviesList: ArrayList<BestMovies>) : RecyclerView.Adapter<BestMoviesAdapter.BestMoviesViewHolder>() {

    class BestMoviesViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestMoviesAdapter.BestMoviesViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BestMoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BestMoviesAdapter.BestMoviesViewHolder, position: Int) {
        holder.binding.textViewRecyclerView.text = bestMoviesList[position].isim

        holder.binding.rankTextView.text = (position + 1).toString()

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,IntroductionActivity::class.java)
            intent.putExtra("secilenFilm", bestMoviesList[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return bestMoviesList.size
    }

}