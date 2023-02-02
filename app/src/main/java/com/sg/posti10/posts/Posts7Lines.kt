package com.sg.posti10.posts

import com.sg.posti10.*

class Posts7Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost719(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/11/17/21/18/landscape-7598904_960_720.jpg"
            postText = arrayListOf(
                " בשם הצדק, הדיוק והאמת ",
                " אתה צריך להביא את הצדדים ",
                " הפחות נחמדים שלך,  ",
                "  בשם הבריאות הנפשית של הציבור ",
                " וניקיון כדור הארץ, ",
                " תשמור אותם לעצמך,   ",
                " יש מספיק מהחומרים האלה מסביב. "
            )
            postTransparency =2
            postTextSize = arrayListOf(0,14)
            margin=0
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost13(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }

 }