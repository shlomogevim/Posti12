package com.sg.posti10.posts

import com.sg.posti10.*
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts7Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0



    fun loadPost718(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/10/05/people-2564217_960_720.jpg"
            postText = arrayListOf(
                " בלכתו בשבילי החיים ",
                " לאדם יש נטיה מובהקת ",
                " להביט על האדמה,  ",
                "זה טוב",
                " כי ככה הוא לא נופל לבורות בדרך, ",
                " זה פחות טוב  ",
                " כי ככה הוא לא רואה את השמים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)

        }
        return post
    }
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
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)

        }
        return post
    }

 }