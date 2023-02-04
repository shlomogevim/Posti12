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
            margin=0
            val colorIndex=42
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29912(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/11/19/20/03/tranquility-base-7602925_960_720.jpg"
            postText = arrayListOf(
                " ככל שהחיים נעשים יותר שבירים ",
                " כך הם יותר מובנים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost29913(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2019/01/28/07/15/man-3959784_960_720.jpg"
        postText = arrayListOf(
            " אל תתייאש ",
            " החיים זה מצב זמני. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,18)
        margin=5
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

 }