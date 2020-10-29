package com.raphaelbaron.tangoshoesonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import  androidx.navigation.fragment.findNavController
import com.raphaelbaron.tangoshoesonline.R
import com.raphaelbaron.tangoshoesonline.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: WelcomeFragment = DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome, container, false
        )

        return binding.root
    }
}