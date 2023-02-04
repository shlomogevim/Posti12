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
       var post = Post()
       with(post) {
       postNum= tool.extractPostNumFromFunctionName()
       imageUri ="https://cdn.pixabay.com/photo/2023/01/10/00/17/italy-7708552_960_720.jpg"
       postText = arrayListOf(
           " זכרון העבר  ",
           " זה מה שקרה לך בעבר,  ",
           "  טעות אישית שלך  ",
           " להכפיף את ההווה שלך לזה. "
       )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=49
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
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
            postTransparency =4
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

    fun loadPost4999073(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/15/01/44/animals-2313502_960_720.jpg"
            postText = arrayListOf(
                " בחיים האלה  ",
                "  אתה יכול להכיר את כל המילים,  ",
                "  אבל בלי המנגינה הנכונה  ",
                " זה לא זה. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=87
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
}