package com.sg.posti10.util

import com.sg.posti10.CONSTANT
import com.sg.posti10.model.Post


class CreatePost  {

    private fun extractPostNumFromFunctionName(): Int {
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("createPost") }
        val postNum = func.methodName.substringAfter("createPost").toInt()
        return postNum
    }

    fun createPost4999071(): Post {
        val post = Post()
        with(post) {
            postNum= extractPostNumFromFunctionName()
            imageUri ="https://cdn.pixabay.com/photo/2023/01/10/00/17/italy-7708552_960_720.jpg"
            postText = arrayListOf(
                " זכרון העבר  ",
                " זה מה שקרה לך בעבר,  ",
                "  טעות אישית שלך  ",
                " להכפיף את ההווה שלך לזה. "
            )
            postId = 87
            textLocation = arrayListOf(10,10,0,-1,0,0, 0, 0)  //  Top  o.k.
            postPadding = arrayListOf(0, 0, 10,0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            postTextColor = arrayListOf(CONSTANT, "#F5D042")
            postFontFamily = 103
            postBackground = backgroundColor
            videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

}