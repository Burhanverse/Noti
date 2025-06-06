package com.gustavoas.noti.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProgressBarApp(
    val packageName: String,
    var showProgressBar: Boolean,
    var color: Int = 1
) : Parcelable