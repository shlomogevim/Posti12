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
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }


 }