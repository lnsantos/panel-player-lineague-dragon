package com.powernepo.lineaguedragon.dataBinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.powernepo.lineaguedragon.BR

data class ComponentNamesDataObservable(
    private var _title: String?,
    private var _subTitle: String?)
    : BaseObservable(){

    @Bindable var title: String? = _title
        set(value) {
            _title = value ?: "Error 404"
            notifyPropertyChanged(BR.title)
        }

    @Bindable var subTitle: String? = _subTitle
        set(value) {
            _subTitle = value ?: "Error 404"
            notifyPropertyChanged(BR.subTitle)
        }

}



