package org.giusniyyel.currencyapp.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetaData(
    @SerialName("last_updated_at")
    val lastUpdatedAt: String
)
