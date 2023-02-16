package com.example.aboutmeapplication

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.hydeKeyBoard() {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}
