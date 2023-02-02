package com.sg.posti10.posts

import com.sg.posti10.*

class Posts9Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost905(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/03/01/01/45/baby-20374_1280.jpg"
            postText = arrayListOf(
                "   לדעתי בזמן הלידה ",
                " יש ברדק גדול בשמי מרום, ",
                " והרבה תינוקות לא מקבלים ",
                " את החיים שלהם בצורה מסודרת, ",
                " התינוקות האלה גדלים ",
                " ונעשים לאנשים בוגרים ",
                " שאומנם מתפקדים בסדר גמור, ",
                " אבל נראה שהחיים שלהם נשארו ",
                " אי שם במחסני מרום. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=11
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }





 }