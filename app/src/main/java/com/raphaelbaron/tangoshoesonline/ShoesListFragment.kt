package com.raphaelbaron.tangoshoesonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil

class ShoesListFragment : Fragment() {

    private lateinit var viewModel: InventoryViewModel

    private lateinit var binding: ShoesListFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoes_list,container,false)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoes_list, container, false)
    }
}