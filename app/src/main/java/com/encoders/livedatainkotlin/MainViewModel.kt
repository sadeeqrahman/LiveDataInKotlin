package com.encoders.livedatainkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var usernames = MutableLiveData<String>("WAQAS RAHMAN")

    fun Update_Name(name: String) {
        usernames.value = name
    }
}