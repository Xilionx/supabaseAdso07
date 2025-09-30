package com.dap.supabase001.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CajeroViewModel : ViewModel() {
    // Create a LiveData with a String
    val currentName: MutableLiveData<MutableList<ModelCajero>> by lazy {
        MutableLiveData<MutableList<ModelCajero>>()
    }

    fun addAllCajero( result: List<ModelCajero>){
        val list = currentName.value?:mutableListOf()
        list.clear()
        list.addAll(result)
        currentName.value = list
    }

    fun addCajero( result: ModelCajero){
        val list = currentName.value?:mutableListOf()
        list.add(result)
        currentName.value = list
    }
}