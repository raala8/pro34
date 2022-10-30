package com.example.pro34

interface list<T> {
    abstract fun get(position: Int): T

    abstract val size: Int
}
