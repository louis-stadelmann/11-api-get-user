package com.example.apirestcall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.apirestcall.`interface`.UserApi
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usersApi = RetrofitHelper.getInstance().create(UserApi::class.java)

        GlobalScope.launch {
            val result = usersApi.getUser()
            if (result != null)
            // Checking the results
                Log.d("TEST: ", result.body().toString())
        }

    }
}