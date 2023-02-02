package com.sg.posti10.posts

import com.sg.posti10.*

class Posts8Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost814(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/04/23/32/book-3199610_960_720.jpg"
            postText = arrayListOf(
                " המחשבה היא כלי הישרדותי, ",
                " היא נועדה לנתח מצבים  ",
                " כדי לגבש דרכי תגובה בעולם עוין,  ",
                " שירה היא כלי אומנותי ",
                " שבאה לתאר את החיים סביב ",
                " כדי לתת לעצמך קצת הבנה על העולם, ",
                " ולאדם ככלל מומלץ  ",
                " עשה יותר שירה ופחות מחשבה. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
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