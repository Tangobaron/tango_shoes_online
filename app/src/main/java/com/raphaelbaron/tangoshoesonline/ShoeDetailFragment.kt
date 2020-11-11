package com.raphaelbaron.tangoshoesonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.raphaelbaron.tangoshoesonline.databinding.FragmentShoeDetailBinding
import kotlinx.android.synthetic.main.fragment_shoe_detail.*
import kotlinx.android.synthetic.main.fragment_shoes_list.*

class ShoeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_detail, container, false
        )

//        val layout: LinearLayout = shoeListDetailLayout
////        val textView = TextView(this)

        binding.saveShoeButton.setOnClickListener {


            shoeListDetailLayout.text=shoeDetailsNameInput.editableText.toString()

            findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailToShoesList())
        }

        binding.cancelShoeButton.setOnClickListener {
            findNavController().navigate(
                ShoeDetailFragmentDirections.actionShoeDetailToShoesList()
            )
        }
        return binding.root
    }
}