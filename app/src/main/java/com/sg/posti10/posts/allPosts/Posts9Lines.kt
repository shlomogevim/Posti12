package com.sg.posti10.posts.allPosts

import com.sg.posti10.model.Post
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts9Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost902(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/04/07/21/29/hotel-hall-101634_1280.jpg"
            postText = arrayListOf(
                "  לפעמים החיים מרגישים לך כמו מסדרון  ",
                " של מחשבות תחושות וחוסר משמעות,  ",
                " אתה יודע שאם לא תהיה בתנועה ",
                " תהיה תקוע במסדרון הזה כל היום, ",
                " הכוזבים מכחישים שיש בכלל מסדרון ",
                " הדיכאוניים מכחישים שאפשר לנוע בו ",
                " הפסימיים לא מאמינים שיש סוף לזה ",
                "ורודפי הנחמה  גוררים רגלים, ",
                "  אבל תמיד בסוף המסדרון יש חדר גדול.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost903(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/02/17/58/service-1303313_1280.jpg"
            postText = arrayListOf(
                " שאתה הולך למסעדה ",
                " מה שמעניין אותך יותר ",
                " שהאוכל יהיה טעים ",
                " פחות מה קורה במטבח, ",
                "ובדומה לזה",
                " מה שאתה יוצר ",
                " זה מה שמעניין, ",
                "התחשבנויות האישיות שלך עם עצמך",
                " זה מה שקורה במטבח."
            )

            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost904(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/25/06/29/frog-1539992_960_720.jpg"
            postText = arrayListOf(
                " על הבוקר ",
                " קל להיכנס לביצה היומיומית, ",
                " יש רצון אמיתי לחזור לשם ",
                "הדרכים לשם רחבות מרופדות ומוארות",
                " בשלל גוונים והצדקות. ",
                " רק אותו חוסר נחת שולי להיות שם ",
                "עם כל הסחי הצפרדעים והנרקיסים",
                " מונע ממך לרוץ חופשי לביצה הזו."
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

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
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=78
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost906(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2013/11/12/16/37/sun-209495_960_720.jpg"
        postText = arrayListOf(
            " יש בך את האש, המים, האדמה, והאוויר ",
            " תן לאש להיות אש ",
            " תן למים להיות מים ",
            " תן לאדמה להיות אדמה ",
            " תן לאוויר להיות אוויר, ",
            " יבואו גם ימים אחרים בהם המים יתחילו לכבות את האש ",
            " האדמה תכסה את האוויר, ",
            "ואתה תגעגע לזמנים בהם האש היתה אש",
            " והאוויר היה אוויר. "
        )
        postTransparency =3
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=78
        val selector=2
        val grade=82
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
    }
    return post
}



 }