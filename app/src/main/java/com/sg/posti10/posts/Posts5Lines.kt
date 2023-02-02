package com.sg.posti10.posts

import com.sg.posti10.*

class Posts5Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost5999005(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/12/09/22/55/trees-7646226_960_720.jpg"
            postText = arrayListOf(
                " מודה שאני ",
                " לא מספיק טוב בשביל ",
                " לחיות חיים טובים,  ",
                " ולא מספיק רע בשביל ",
                " להינות מחיים רעים. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,18)
            margin=5
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost12(postNum,imageUri,postText,postTransparency,postTextSize,margin)
            imageUri = "https://cdn.pixabay.com/photo/2022/12/09/22/55/trees-7646226_960_720.jpg"

        }
        return post
    }


 }