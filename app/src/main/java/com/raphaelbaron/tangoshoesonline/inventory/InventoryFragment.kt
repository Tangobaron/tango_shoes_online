package com.raphaelbaron.tangoshoesonline.inventory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.raphaelbaron.tangoshoesonline.R
import com.raphaelbaron.tangoshoesonline.databinding.FragmentShoesListBinding
import kotlinx.android.synthetic.main.fragment_shoe_detail.*

class InventoryFragment : Fragment() {

    private lateinit var viewModel: InventoryViewModel
    private lateinit var binding: FragmentShoesListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoes_list, container, false)

        viewModel = ViewModelProvider(this).get(InventoryViewModel::class.java)

        binding.storeViewModel = viewModel

        binding.lifecycleOwner = this

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(InventoryFragmentDirections.actionShoesListToShoeDetail())
        }
        return binding.root
    }
}