package com.example.innobridge.mahasiswa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.innobridge.R

class ResultSubmissionFragment : Fragment(R.layout.fragment_result_submission) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val judul = arguments?.getString("judul") ?: "-"
        val deskripsi = arguments?.getString("deskripsi") ?: "-"
        val link = arguments?.getString("link") ?: "-"

        view.findViewById<TextView>(R.id.tvResultJudul).text = judul
        view.findViewById<TextView>(R.id.tvResultDeskripsi).text = deskripsi
        view.findViewById<TextView>(R.id.tvResultLink).text = link

        view.findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            findNavController().popBackStack(R.id.berandaFragment, false)
        }
    }
}