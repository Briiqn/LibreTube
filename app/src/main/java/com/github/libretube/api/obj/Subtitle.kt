package com.github.libretube.api.obj

import android.content.Context
import android.os.Parcelable
import com.github.libretube.R
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Subtitle(
    val url: String? = null,
    val mimeType: String? = null,
    val name: String? = null,
    val code: String? = null,
    val autoGenerated: Boolean? = null
): Parcelable {
    fun getDisplayName(context: Context) = if (autoGenerated != true) {
        name!!
    } else {
        "$name (${context.getString(R.string.auto_generated)})"
    }
}
