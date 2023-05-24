package com.main.core.domain.event

interface EventHandler<T> {
    fun obtainEvent(event: T)
}