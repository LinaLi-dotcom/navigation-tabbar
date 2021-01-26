package com.example.navigationv4monday

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class OtherFragment : Fragment() {

    val args: OtherFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val goOtherBtn = view.findViewById<Button>(R.id.goThirdButton)

        Log.d("Debug", args.sometext)
        goOtherBtn.setOnClickListener {
           findNavController().navigate(R.id.action_otherFragment_to_thirdFragment)

        }
    }
}