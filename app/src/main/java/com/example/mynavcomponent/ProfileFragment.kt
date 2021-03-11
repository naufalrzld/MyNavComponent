package com.example.mynavcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class ProfileFragment : Fragment() {

    val args: ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.profile)

        val tvFullName = view.findViewById<TextView>(R.id.tv_full_name)
        val tvUsername = view.findViewById<TextView>(R.id.tv_username)

        val fullName = "Nama Lengkap: ${args.fullName}"
        val username = "Username: ${args.username}"

        tvFullName.text = fullName
        tvUsername.text = username
    }
}