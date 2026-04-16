package com.example.innobridge.mahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.innobridge.R

class PortfolioAdapter(private val list: List<Proposal>) :
    RecyclerView.Adapter<PortfolioAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudul: TextView = view.findViewById(R.id.tvJudul)
        val tvDeskripsi: TextView = view.findViewById(R.id.tvDeskripsi)
        val tvStatus: TextView = view.findViewById(R.id.tvStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_portfolio, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvJudul.text = item.judul
        holder.tvDeskripsi.text = item.deskripsi
        holder.tvStatus.text = item.status

        // Warna status dinamis
        when (item.status) {
            "Accepted" -> holder.tvStatus.setBackgroundColor(0xFF004EE0.toInt())
            "Under Review" -> holder.tvStatus.setBackgroundColor(0xFF99CAFF.toInt())
            "Rejected" -> holder.tvStatus.setBackgroundColor(0xFFB0BEC5.toInt())
        }
    }
}