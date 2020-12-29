package com.fullpagedeveloper.mypreloaddata.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MahasiswaModel(
    var id: Int = 0,
    var name: String? = null,
    var nim: String? = null
): Parcelable
