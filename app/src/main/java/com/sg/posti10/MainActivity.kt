package com.sg.posti10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        supportActionBar?.hide()
        val drawPostHelper = DrawPostHelper()
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)


      //  val currentPost = CreatePost().createPost4999071()
        val currentPost = FindPost().individualPost()
       // logi("${currentPost.postNum}   ")
        drawPostHelper.drawPost( constraintLayout, currentPost)

    }

    fun logi(message: String) {
        Log.i("gg", message)
    }
}