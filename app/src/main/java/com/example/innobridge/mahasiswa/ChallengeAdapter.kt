package com.example.innobridge.mahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.innobridge.R

class ChallengeAdapter(
    private val listChallenge: List<Challenge>,
    private val onClick: (Challenge) -> Unit
) : RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder>() {

    class ChallengeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvJudul: TextView = itemView.findViewById(R.id.tvJudul)
        val tvPerusahaan: TextView = itemView.findViewById(R.id.tvPerusahaan)
        val tvKategori: TextView = itemView.findViewById(R.id.tvKategori)
        val btnDetail: Button = itemView.findViewById(R.id.btnDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_challenge, parent, false)
        return ChallengeViewHolder(view)
    }

    override fun getItemCount(): Int = listChallenge.size

    override fun onBindViewHolder(holder: ChallengeViewHolder, position: Int) {
        val challenge = listChallenge[position]

        holder.tvJudul.text = challenge.judul
        holder.tvPerusahaan.text = challenge.perusahaan
        holder.tvKategori.text = challenge.kategori

        holder.btnDetail.setOnClickListener {
            onClick(challenge)
        }
    }
}