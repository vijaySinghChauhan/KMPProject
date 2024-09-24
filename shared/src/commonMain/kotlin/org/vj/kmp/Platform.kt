package org.vj.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform