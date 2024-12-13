package com.haitrvn.kamreproducing

import kotlinx.cinterop.ExperimentalForeignApi
import cocoapods.Google_Mobile_Ads_SDK.GADAppOpenAd

@OptIn(ExperimentalForeignApi::class)
actual class AppOpen(
    private val ios: GADAppOpenAd
)