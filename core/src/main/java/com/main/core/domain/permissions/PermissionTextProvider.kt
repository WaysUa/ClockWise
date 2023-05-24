package com.main.core.domain.permissions

interface PermissionTextProvider {
    fun getDescription(isPermanentlyDeclined: Boolean): String
}