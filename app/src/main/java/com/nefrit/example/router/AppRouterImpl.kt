package com.nefrit.example.router

import android.content.Context
import com.nefrit.second.SecondActivity
import javax.inject.Inject

class AppRouterImpl @Inject constructor() : AppRouter {

    override fun moveToSecond(context: Context) {
        SecondActivity.start(context)
    }
}