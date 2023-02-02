package com.sg.posti10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.posti10.posts.Posts3Lines
import com.sg.posti10.posts.Posts4Lines

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        supportActionBar?.hide()
        val drawPostHelper = DrawPostHelper()
        val tool=Tools()
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)

//        val currentPost = FindPost().individualPost()

//        val currentPost = FindPost().individualPost1 (103)
//        val currentPost = FindPost().individualPost1 (29911)
//        val currentPost = FindPost().individualPost1 (3999017)
//        val currentPost = FindPost().individualPost1 (4999072)
//        val currentPost = FindPost().individualPost1 (4999072)
//        val currentPost = FindPost().individualPost1 (5999005)
//        val currentPost = FindPost().individualPost1 (653)
//        val currentPost = FindPost().individualPost1 (719)
//        val currentPost = FindPost().individualPost1 (814)
//        val currentPost = FindPost().individualPost1 (905)
//        val currentPost = FindPost().individualPost1 (1006)
//        val currentPost = FindPost().individualPost1 (1100)
        val currentPost = FindPost().individualPost1 (1200)
        drawPostHelper.drawPost( constraintLayout, currentPost)
        tool.sendPostToStringFirestore(currentPost)

        // logi("${currentPost.postNum}   ")

    }


    // start new style in 3999010
    // start new style in 4999060


    fun logi(message: String) {
        Log.i("gg", message)
    }
}