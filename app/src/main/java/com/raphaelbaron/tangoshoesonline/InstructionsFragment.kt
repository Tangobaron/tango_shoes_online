package com.raphaelbaron.tangoshoesonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: InstructionsFragment = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instructions, container, false
        )
        return binding.root
    }
}