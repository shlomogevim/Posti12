package com.sg.posti10.posts

import com.sg.posti10.*

class Posts3Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0


    fun loadPost3999014(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/09/28/12/44/woman-3709223_960_720.jpg"
            postText = arrayListOf(
                " המאבק שלך עם עצמך ",
                " זה להיות כמה שפחות עצמך ",
                " ויותר אתה. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3999015(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/13/22/43/get-well-soon-2310866_960_720.jpg"
            postText = arrayListOf(
                " יש הרבה עוולות בעולם הזה ",
                "  להתמקד בהן  ",
                " זה להוסיף עוד עוולה למאזן. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

     fun loadPost3999016(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/03/06/11/48/tv-1240159_960_720.jpg"
            postText = arrayListOf(
                " טמטום חושים שיגרתי ",
                " הוא בעיה ",
                " רק בארץ היצירה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=45
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
      fun loadPost3999017(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/08/06/05/27/people-2589091_960_720.jpg"
            postText = arrayListOf(
                " החיים זו מסיבה שכזאת, ",
                " שרק שאתה יוצא ממנה ",
                "אתה מבין כמה היא הייתה פצצית."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3999018(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/07/21/10/07/man-3552247_960_720.jpg"
            postText = arrayListOf(
                " הגוף והאגו  ",
                " מזדקנים עם השנים ",
                " אתה נשאר כמו שהיית. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3999019(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2019/09/25/07/49/soft-spots-4502861_960_720.jpg"
            postText = arrayListOf(
                " שתחייה חיים שלווים,  ",
                " כאלה שבהם יש לקחת ",
                " בעיקר החלטות קטנות. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=40
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
 }