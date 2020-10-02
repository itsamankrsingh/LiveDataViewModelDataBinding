package com.magician.viewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(starting: Int) : ViewModel() {
    private var _number = MutableLiveData<Int>()
    val number: LiveData<Int>
        get() = _number

    init {
        _number.value = starting
    }

    fun updateNumber() {
        _number.value = (_number.value)?.plus(1)
    }


}