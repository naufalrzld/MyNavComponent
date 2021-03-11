package com.example.mynavcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.app_name)

        val tvWelcome = view.findViewById<TextView>(R.id.tv_welcome)
        val btnProfile = view.findViewById<Button>(R.id.btn_profile)

        tvWelcome.text = getString(R.string.welcome, "Mochammad Naufal Rizaldi")
        btnProfile.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(
                "Mochammad Naufal Rizaldi",
                "naufalrzld"
            )
            findNavController().navigate(action)
        }
    }
}