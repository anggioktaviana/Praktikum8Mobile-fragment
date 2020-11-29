package com.example.praktikum8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>() //mengumpulkan input dari fragment pertama dan menampilkan di fragment lainnya
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}
