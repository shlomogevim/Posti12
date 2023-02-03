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

        val currentPost = FindPost().individualPost ()
//
        drawPostHelper.drawPost( constraintLayout, currentPost)
        tool.sendPostToStringFirestore(currentPost)

    }


    fun logi(message: String) {
        Log.i("gg", message)
    }
}