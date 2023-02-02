package com.sg.posti10.posts

import com.sg.posti10.*

class Posts2Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0


      fun loadPost29911(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/17/20/23/create-4857731_960_720.jpg"
            postText = arrayListOf(
                " אתה יוצר את החיים ",
                " שיוצרים אותך. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=5
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost10(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }


 }