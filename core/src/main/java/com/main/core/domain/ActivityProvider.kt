package com.main.core.domain

import androidx.activity.ComponentActivity

interface ActivityProvider {
    fun getActivity(): ComponentActivity
}