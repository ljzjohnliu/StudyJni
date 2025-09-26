package com.study.jnidemo.activity

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.study.jnidemo.R

class JniTestActivity : ComponentActivity() {

    private var normalBtn: Button? = null
    private var jniBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jni)
        initViews()
    }

    private fun initViews() {
        normalBtn = findViewById(R.id.nomalTest)
        jniBtn = findViewById(R.id.jniTest)

//        normalBtn!!.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
//        }
//        jniBtn!!.setOnClickListener{
//            startActivity(Intent(this, SpecialTestActivity::class.java))
//        }
    }
}
