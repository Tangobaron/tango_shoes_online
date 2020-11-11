package com.raphaelbaron.tangoshoesonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.raphaelbaron.tangoshoesonline.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginButton.setOnClickListener {
            findNavController().navigate(
                LoginFragmentDirections.actionLoginToWelcome()
            )
        }
        return binding.root
    }
}

