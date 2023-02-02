package com.sg.posti10.posts

import com.sg.posti10.*

class Posts6Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0


      fun loadPost653(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/29/16/42/smartphone-2354157_960_720.jpg"
            postText = arrayListOf(
                " אם אתה מצלם חוויה ",
                " החיים שלך משתנים באותו רגע, ",
                " מהחוויה - לצילום החוויה, ",
                " מהשחקן הראשי - לפועל במה  ",
                " ולא תמיד זה שווה. ",
                " (אלא אם הקהל בהצגת חייך הוא המרכז) "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,13)
            margin=0
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost11(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }
 }