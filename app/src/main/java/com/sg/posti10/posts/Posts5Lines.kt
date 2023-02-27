package com.sg.posti10.posts

import com.sg.posti10.*
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts5Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0




    fun loadPost596(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/12/17/14/33/wave-1913559_960_720.jpg"
            postText = arrayListOf(
                "  סערות מזג האוויר  ",
                " שונות מסערות הלב, ",
                " בגלל שעליהם כולם מדברים חופשי ",
                " ואפשר תמיד להשתמש בם במטריה ",
                " כדי לא להירטב . "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost597(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/08/23/08/28/path-6567149_960_720.jpg"
            postText = arrayListOf(
                "   לא בטוח   ",
                " אם הדרך שלך כתובה מראש ",
                " או לא, ",
                " אבל מה שבטוח ",
                " שהחוויה ממנה תלויה רק בך. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=37
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost598(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/04/04/12/34/mountains-100367_960_720.jpg"
            postText = arrayListOf(
                " אדם המקטר על החיים ",
                " דומה ",
                " לעיוור המקטר שחשוך מידי בחדר, ",
                " לשניהם אין מספיק יכולות ",
                " לראות את האור. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost599(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/01/13/33/doll-1636124_960_720.jpg"
            postText = arrayListOf(
              /*  " (פרודיה זה חיקוי הומוריסטי של מישהו) ",
                "                         -----                       ",
                " אתה בדרך כלל הפרודיה של עצמך  ",
                " אבל את אף אחד זה לא מצחיק  ",
                " כי הם לא מכירים את המקור. "*/

                "  אתה בדרך כלל הפרודיה של עצמך  ",
                "  אבל את אף אחד זה לא מצחיק   ",
                "  כי הם לא מכירים את המקור. ",
                "                        -----                    ",
                " (פרודיה זה חיקוי הומוריסטי של מישהו) "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost5_999_000(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " האי-צדק  ",
                " הוא עניין של פרשנות, ",
                " עוגמת הנפש האישית  ",
                " בגלל האי-צדק הזה ",
                " היא דבר מוחלט. "
            )
            imageUri = "https://cdn.pixabay.com/photo/2020/04/16/18/02/old-couple-5051770_960_720.jpg"
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost5999001(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " חיים ללא סיפור ",
                " זה כמו דף ריק ללא ציור, ",
                " חיים עם סיפור  ",
                " זה כמו דף מקושקש, ",
                " לא יודע מה אני מעדיף. "
            )
            imageUri = "https://cdn.pixabay.com/photo/2017/01/12/10/40/school-1974369_960_720.jpg"
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=50
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost5999002(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " בחיים האלה",
                " אם לא תראה את התחתית ",
                " מדי פעם,  ",
                "  לא תדע באיזה גובה  ",
                " אתה נמצא ברגע זה. "
            )
            imageUri = "https://cdn.pixabay.com/photo/2012/09/01/20/47/homeless-55492_960_720.jpg"
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost5999003(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " בחיים על כל שאלה ",
                " יש אלפי תשובות נכונות, ",
                " רוב האנשים בוחרים  ",
                " בתשובות שנוחות להם ",
                " ולא באלה שמקדמות אותם. "
            )
            imageUri = "https://cdn.pixabay.com/photo/2022/04/29/14/28/woman-7163866_960_720.jpg"
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=34
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost5999004(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " אם אתה רוצה ",
                " למלא את הדלי שלך במים חיים, ",
                " רצוי לך שלא תלך לבאר מעופשת  ",
                " ואפילו שהיא יותר זמינה ",
                " ווכולם הולכים אליה. "
            )
            imageUri = "https://cdn.pixabay.com/photo/2012/03/03/22/59/clean-21479_960_720.jpg"
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=70
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
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

fun loadPost5_999_006(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/08/07/16/39/girl-2605526_960_720.jpg"
        postText = arrayListOf(
            " הדמות שלך, ",
            " אומנם מקלה  ",
            " על אחרים לזהות אותך,  ",
            " אבל מקשה ",
            " עליך לזהות את עצמך. "
        )
        postTransparency =3
        postTextSize = arrayListOf(0,16)
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