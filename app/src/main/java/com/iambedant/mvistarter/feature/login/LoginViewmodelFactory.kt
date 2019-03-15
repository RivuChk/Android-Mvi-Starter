package com.iambedant.mvistarter.feature.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by @iamBedant on 16/05/18.
 */
data class LoginViewmodelFactory @Inject constructor(private val loginActionProcessorHolder: LoginActionProcessorHolder)
    : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(loginActionProcessorHolder) as T
    }
}