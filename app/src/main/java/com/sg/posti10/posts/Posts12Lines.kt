package com.sg.posti10.posts

import com.sg.posti10.*

class Posts12Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost1200(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/31/beach-1850218_960_720.jpg"
            postText = arrayListOf(
                " מה שאתה ברגע הזה  ",
                " זה מה שאתה. ",
                " זה כל כך פשוט  ",
                " עד שאי אפשר לתפוס את זה,  ",
                " זה כל כך זמין ",
                " עד שאי אפשר לחפש את זה, ",
                " זה כל כך מוכר ",
                " עד שאי אפשר לזהות את זה, ",
                "  זה כל כך קרוב  ",
                " עד שאי אפשר לגעת בזה, ",
                " זה כל כך קיים ",
                " שאי אפשר לשלול את זה. "
            )
             postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=0
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost12(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }
    /*
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"

    }*/





 }