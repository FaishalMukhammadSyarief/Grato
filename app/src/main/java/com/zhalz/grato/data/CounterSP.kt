package com.zhalz.grato.data

import android.content.Context

class CounterSP(context: Context) {
    private val pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var counter: Int
        set(value) {
            pref.edit().apply {
                putInt(KEY_COUNTER, value)
                apply()
            }
        }
        get() = pref.getInt(KEY_COUNTER, 0)

    companion object{
        const val PREF_NAME = "counter_data"
        const val KEY_COUNTER = "counter"
    }
}