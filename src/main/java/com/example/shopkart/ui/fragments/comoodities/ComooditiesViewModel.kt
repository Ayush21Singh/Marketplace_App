package com.example.shopkart.ui.fragments.comoodities

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shopkart.data.firebase.FirebaseUtil
import com.example.shopkart.ui.activities.base.BaseViewModel
import com.example.shopkart.util.Resource
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ComooditiesViewModel @Inject constructor(
    private val firebaseUtil: FirebaseUtil,
    @ApplicationContext private val application: Context
) : BaseViewModel() {

    private var _response = MutableLiveData<Resource<Any>>()
    val response: LiveData<Resource<Any>> = _response

    /**
     * Gets the products from the Firestore db.
     */
    fun getProducts() {
        firebaseUtil.getProductsFromFireStore {
            _response.postValue(it)
        }
    }

}