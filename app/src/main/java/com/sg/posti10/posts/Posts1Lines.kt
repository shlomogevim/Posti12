package com.sg.posti10.posts

import com.sg.posti10.*

class Posts1Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

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