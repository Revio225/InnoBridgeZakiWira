package com.example.innobridge.mahasiswa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.innobridge.R

class SubmissionFragment : Fragment(R.layout.fragment_submission) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etJudul = view.findViewById<EditText>(R.id.etJudul)
        val etDeskripsi = view.findViewById<EditText>(R.id.etDeskripsi)
        val etLink = view.findViewById<EditText>(R.id.etLink)
        val btnSubmit = view.findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val judul = etJudul.text.toString()
            val deskripsi = etDeskripsi.text.toString()
            val link = etLink.text.toString()

            if (judul.isNotEmpty() && deskripsi.isNotEmpty()) {
                val bundle = bundleOf(
                    "judul" to judul,
                    "deskripsi" to deskripsi,
                    "link" to link
                )
                findNavController().navigate(R.id.action_submissionFragment_to_resultSubmissionFragment, bundle)
            } else {
                Toast.makeText(requireContext(), "Harap isi semua kolom", Toast.LENGTH_SHORT).show()
            }
        }
    }
}