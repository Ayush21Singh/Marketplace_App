package com.example.shopkart.ui.activities.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shopkart.util.Resource

/**
 * Created By Ayush
 */
open class BaseViewModel : ViewModel() {
    var _status = MutableLiveData<Resource<String>>()
    val status: LiveData<Resource<String>> = _status
}