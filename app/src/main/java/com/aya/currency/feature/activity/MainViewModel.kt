package com.aya.currency.feature.activity

import android.app.Application
import com.aya.currency.base.Action
import com.aya.currency.base.AndroidBaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

sealed class MainAction : Action {

}

@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application
) : AndroidBaseViewModel<MainAction>(app) {




}
