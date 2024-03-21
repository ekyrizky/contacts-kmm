package com.ekyrizky.contacts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform