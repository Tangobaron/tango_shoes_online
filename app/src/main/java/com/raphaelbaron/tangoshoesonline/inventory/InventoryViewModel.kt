package com.raphaelbaron.tangoshoesonline.inventory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InventoryViewModel : ViewModel() {

    private val _shoeName = MutableLiveData<String>()
    val shoeName: LiveData<String>
        get() = _shoeName

    private val _company = MutableLiveData<String>()
    val company: LiveData<String>
        get() = _company

    private val _shoeSize = MutableLiveData<Int>()
    val shoeSize: LiveData<Int>
        get() = _shoeSize

    private val _description = MutableLiveData<String>()
    val description: LiveData<String>
        get() = _description

}