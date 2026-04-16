package com.example.innobridge.mahasiswa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.innobridge.R

class DetailFragment : Fragment(R.layout.fragment_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Data dummy untuk detail (bisa dikirim lewat bundle dari Beranda)
        val tvJudul = view.findViewById<TextView>(R.id.tvJudul)
        val tvPerusahaan = view.findViewById<TextView>(R.id.tvPerusahaan)
        val tvDeskripsi = view.findViewById<TextView>(R.id.tvDeskripsi)
        val btnKirim = view.findViewById<Button>(R.id.btnKirimProposal)

        tvJudul.text = "Smart Waste Management"
        tvPerusahaan.text = "PT EcoTech"
        tvDeskripsi.text = "Tantangan ini mencari solusi inovatif untuk pengelolaan sampah di area perkotaan menggunakan teknologi IoT dan integrasi aplikasi mobile untuk masyarakat."

        btnKirim.setOnClickListener {
            findNavController().navigate(R.id.action_detailFragment_to_submissionFragment)
        }
    }
}