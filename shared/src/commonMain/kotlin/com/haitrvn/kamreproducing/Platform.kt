package com.haitrvn.kamreproducing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform