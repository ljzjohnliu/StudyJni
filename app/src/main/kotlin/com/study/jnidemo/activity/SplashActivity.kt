package com.study.jnidemo.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat
import com.study.jni.TestJni
import com.study.jnidemo.R
import com.study.jnidemo.utils.ViewUtil

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    private val REQUEST_READ_STORAGE = 1

    private var normalBtn: Button? = null
    private var jniBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initViews()
        requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 123)
        requestStoragePermission()

        Log.d("debug_sr", "onCreate: 300dp is : " + ViewUtil.dp2px(this, 300f) + ", 400dp is : " + ViewUtil.dp2px(this, 400f))
//        Log.d("TAG", "onCreate: " + LogUtils.readFile("/sdcard/frescolog/image.json"))
    }

    private fun initViews() {
        normalBtn = findViewById(R.id.nomalTest)
        jniBtn = findViewById(R.id.jniTest)

        normalBtn!!.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
            TestJni.test();
        }
        jniBtn!!.setOnClickListener{
            startActivity(Intent(this, JniTestActivity::class.java))
        }
    }

    private fun requestStoragePermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
            REQUEST_READ_STORAGE
        )
    }
}
