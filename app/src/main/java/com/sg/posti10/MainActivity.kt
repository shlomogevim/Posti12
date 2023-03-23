package com.sg.posti10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import com.sg.posti10.articles.AddArticleActivity
import com.sg.posti10.databinding.ActivityMainBinding
import com.sg.posti10.posts.DrawPostHelper
import com.sg.posti10.posts.FindPost
import com.sg.posti10.util.Tools

class MainActivity : AppCompatActivity() {
 private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        supportActionBar?.hide()

        createPost()

//        createArticle()

    }

    private fun createArticle() {
        startActivity(Intent(this, AddArticleActivity::class.java))
    }

    private fun createPost() {
        val drawPostHelper = DrawPostHelper()
        val tool= Tools()
        val constraintLayout = binding.constraintLayout
        val currentPost = FindPost().individualPost ()
//        logi("MainActivity 38  postNum=${currentPost.postNum}    postId=${currentPost.postId}")
        drawPostHelper.drawPost( constraintLayout, currentPost)
        tool.sendPostToStringFirestore(currentPost)
    }


    fun logi(message: String) {
        Log.i("gg", message)
    }
}