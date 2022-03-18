package com.encoders.livedatainkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var usernames = MutableLiveData<MutableList<String>>()
    var mutableList: MutableList<String> = mutableListOf()

    fun Update_Name() {
        mutableList.add("Sadeeq Rahman")
        mutableList.add("Waqas Rahman")
        mutableList.add("Arham Khan")
        usernames.value = mutableList

    }
}