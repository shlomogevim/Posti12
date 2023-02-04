package com.sg.posti10.posts

import com.sg.posti10.*

class Posts1Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

    fun loadPost100(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"
            postText = arrayListOf(
                " כל אחד מדבר את מה שהוא. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost101(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
            postText = arrayListOf(
                " אתה הוא האור שבו אתה חי. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost102(): Post {
        var post = Post()
        with(post) {
            imageUri =
                "https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
            postText = arrayListOf(
                "גם מחיים שלווים לגמרי מתים בסוף."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=80
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

        fun loadPost103(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/15/07/13/homeless-845752_960_720.jpg"
            postText = arrayListOf(
                " אתה הקורבן למה שאתה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

 }