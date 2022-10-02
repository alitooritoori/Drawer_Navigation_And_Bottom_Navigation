package com.example.drawernavigationandbottomnavigation.ui.logout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogoutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Logout Screen"
    }
    val text: LiveData<String> = _text
}