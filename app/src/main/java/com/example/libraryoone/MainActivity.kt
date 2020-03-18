package com.example.libraryoone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlibrary.ToastMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage.s(this, "sdff")
    }
}
