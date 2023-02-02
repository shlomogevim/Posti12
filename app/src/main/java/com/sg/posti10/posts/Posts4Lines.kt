package com.sg.posti10.posts

import com.sg.posti10.*

class Posts4Lines {
    val util=Utility()
    val tool=Tools()
     val demi=DemiPost()
    var margin=0
    var selector=0

    private fun extractPostNumFromFunctionName(): Int {
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("loadPost") }
        val postNum = func.methodName.substringAfter("loadPost").toInt()
        return postNum
    }

    fun loadPost4999071(): Post {
        val post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
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
            postBackground =  "#0A174E"
            postTextColor = arrayListOf(CONSTANT, "#F5D042")
            postFontFamily = 103
            videoUrl = "9UVjjcOUJLE"
        }
        return post
    }


    fun loadPost4999072(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2021/07/27/11/22/mountains-6496638_960_720.jpg"
            postText = arrayListOf(
                " הבחירה החופשית שלך מתמקדת  ",
                "  במה אתה חושב שאתה,  ",
                "  סתם דמות מסיפור אנושי כלשהו  ",
                " או משהו שמעבר. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

}