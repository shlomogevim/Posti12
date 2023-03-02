package com.sg.posti10.posts

import com.sg.posti10.*
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts10Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost1000(): Post {
        var post = Post()
        with(post) {
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpghttps://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpg"
            postText = arrayListOf(
                " יש לך טעות בסיסית, ",
                " כדי שהכל יסתדר ",
                " לא צריך שכל העולם יהיה בסדר ",
                " שיהיה שלום עולמי ",
                " ויגמרו כל הרשע הצער והכאב ",
                " ממש לא, ",
                " כדי שהכל יסתדר ",
                "  מספיק שאתה אישית  ",
                " תרגיש בסדר עם עצמך לרגע, ",
                " זה הכול. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,13)
            margin=0
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost1001(): Post {
        var post = Post()
        with(post) {
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpghttps://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpg"
            postText = arrayListOf(
                " יש לך טעות בסיסית, ",
                " כדי שהכל יסתדר ",
                " לא צריך שכל העולם יהיה בסדר ",
                " שיהיה שלום עולמי ",
                " ויגמרו כל הרשע הצער והכאב ",
                " ממש לא, ",
                " כדי שהכל יסתדר ",
                "  מספיק שאתה אישית  ",
                " תרגיש בסדר עם עצמך לרגע, ",
                " זה הכול. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,13)
            margin=0
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost1002(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/04/23/09/39/costume-106595_1280.jpg"
            postText = arrayListOf(
                " אישה יפה הולכת בחוף, ",
                " הגוף התנועה החצי מבט ",
                " עושים לך את זה, אתה כבר במקום אחר. ",
                " קח את אותה אישה ",
                " שים אותה על שולחן הניתוחים לאופרציה שיגרתית של הוצאת איבר חולה, ",
                " מחריד, היית מתעלף תוך שניה מהמראות. ",
                " מסקנה: ",
                " האדם לא בנוי להתמודד ביומיום שלו עם האמת  זה גדול עליו,  ",
                " הוא מעדיף ווריאציה נוחה של האמת ",
                " ורצוי עם בגד ים מינימלי. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,13)
            margin=0
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost1003(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/11/16/32/bridge-1385938_960_720.jpg"
            postText = arrayListOf(
                " הרבי אמר: ",
                " \"כל העולם כולו גשר צר מאוד והעיקר לא לפחד כלל\" ",
                " ולבריאותך הנפשית אפשר להוסיף: ",
                "יש בעולם גשרים צרים מאוד, ",
                " אבל רצוי לך לדעת ",
                " מתי הגשר מתחיל ",
                " וטוב לך לנהוג שם באומץ וזהירות, ",
                " ומתי הגשר נגמר  ",
                " ואפשר לך לנשום לרווחה ",
                " ולהרפות. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost1004(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/04/17/51/brick-1236403_960_720.jpg"
            postText = arrayListOf(
                " אני לא חושב שכבישים ללא מוצא ",
                "  צריכים להרגיש אשמים ",
                "  שאין להם מוצא ",
                " בגלל שככה הם נוצרו. ",
                " ------- ",
                " אני לא חושב שאנשים ",
                " צרכים להרגיש אשמים ",
                " שהם בני אדם ",
                " בגלל שככה הם נוצרו. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=80
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost1005(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/31/17/51/cube-1293954_960_720.png"
            postText = arrayListOf(
                " בחיים האלה ",
                " כל סוף הוא התחלה ",
                " וכל התחלה היא סוף, ",
                " בכל אור יש צל ",
                " ובכל צל יש אור, ",
                " בכל אמת יש כזב ",
                " ובכל כזב יש אמת, ",
                " אין בעיה עם כל זה ",
                " רק שזה יכול לבלבל ",
                " אנשים שמחפשים סדר בחיים. "
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
      fun loadPost1006(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/20/22/21/palace-4781577_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה איך שאתה תופס אותם, ",
                " אתה תופס אותם כטוב ",
                " אתה חי בטוב, ",
                " אתה תופס אותם כרע  ",
                " אתה חי ברע, ",
                " כך שאם אתה שואל: ",
                " מי זה האלוהים הזה ",
                " שקובע לי איך החיים שלי יהיו ? ",
                " זהו, שזה אתה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)

        }
        return post
    }





 }