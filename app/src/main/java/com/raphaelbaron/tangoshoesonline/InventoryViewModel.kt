package com.raphaelbaron.tangoshoesonline

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InventoryViewModel : ViewModel() {

    private val _shoeList = MutableLiveData<List<String>>()
    val shoelist: LiveData<List<String>>
        get() = _shoeList

    private val _details = MutableLiveData<String>()
    val details: LiveData<String>
        get() = _details

    private lateinit var shoesList: MutableList<String>

    init {
        initializeList()
    }

    private fun initializeList() {
        shoesList = mutableListOf(
            "Tangolera",
            "Bandolera",
            "D'Raso",
            "Comme Il Faut",
            "Sur",
        )
    }
}