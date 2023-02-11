package com.sg.posti10.posts

import com.sg.posti10.*

class Posts4Lines {
    val util=Utility()
    val tool=Tools()
     val demi=DemiPost()
    var margin=0
    var selector=0

    private fun extractPostNumFromFunctionName(): Int {
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("loadPost") }
        val postNum = func.methodName.substringAfter("loadPost").toInt()
        return postNum
    }
/*
    fun loadPost4980() {
        val post = Post()
        with(post) {
            postNum = 4980
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/11/11/10/05/law-4617873_1280.jpg"
            postText = arrayListOf(
                "חוסר צדק כמו הקורונה",
                "מסוכן רק לאנשים עם מחלות רקע ",
                " כמו אלה שמאמינים ",
                " בצדק או בהגינות בסיסית. "
            )
            postId = 86
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4981() {
        val post = Post()
        with(post) {
            postNum = 4981
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/07/18/17/34/lace-2516496_1280.jpg"
            postText = arrayListOf(
                "כולנו רקמה אנושית אחת",
                "אמר המשורר, ",
                " התקשורת היא חלק ממנה ",
                " כמו שאתה חלק ממנה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4982() {
        val post = Post()
        with(post) {
            postNum = 4982
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/05/03/09/06/auto-3370743_1280.jpg"
            postText = arrayListOf(
                "אתה אומנם",
                "חושב כמו כולם, ",
                " אבל בסוף הסופים ",
                " מת כמו שאתה. "
            )
            postId = 85
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4983() {
        val post = Post()
        with(post) {
            postNum = 4983
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/05/14/10/boat-3292934_1280.jpg"
            postText = arrayListOf(
                "בדרך כלל",
                "בני אדם מבינים ",
                " את הקונספט של החיים ",
                " רק שהם נוגעים במוות. "
            )
            postId = 85
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4984() {
        val post = Post()
        with(post) {
            postNum = 4984
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/21/08/42/rain-2085065_1280.jpg"
            postText = arrayListOf(
                "האדם הוא יצור בעייתי,",
                " או שיש לו בעיות ",
                " או שאין לו בעיות ",
                " וזה בעיה בפני עצמה. "
            )
            postId = 87
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4985() {
        val post = Post()
        with(post) {
            postNum = 4985
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/17/19/gorilla-845119_1280.jpg"
            postText = arrayListOf(
                "אל תתייחס לעצמך",
                " כל כך ברצינות,  ",
                " תשאיר את זה לאחרים ",
                " שממש לא יודעים מי אתה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4986() {
        val post = Post()
        with(post) {
            postNum = 4986
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/33/the-sun-3057622_1280.jpg"
            postText = arrayListOf(
                "תהיה מה שאתה,",
                " ואם אתה לא יודע  ",
                " מה שאתה עכשיו, ",
                " תהיה אי הידיעה. "
            )
            postId = 90
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4987() {
        val post = Post()
        with(post) {
            postNum = 4987
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/28/16/01/sad-2182545_1280.jpg"
            postText = arrayListOf(
                "שיהיה בך דו שיח פנימי",
                " תרבותי ופורה, ",
                " ולא סתם ויכוחי סרק ",
                " וחלופי האשמות עקרים. "
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4988() {
        val post = Post()
        with(post) {
            postNum = 4988
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/03/23/23/10/brush-96240_1280.jpg"
            postText = arrayListOf(
                "השאלה אינה ",
                " מה אתה ומי אתה, ",
                " אלא ",
                " מה אתה יוצר עם כל זה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4989() {
        val post = Post()
        with(post) {
            postNum = 4989
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/03/15/40/landscape-3127859_1280.jpg"
            postText = arrayListOf(
                " תהנה מהדרך, ",
                " כי כשתגיע בסוף לקצה ",
                " לא תהיה לך אופציה שכזאת, ",
                " תהנה מהדרך. "
            )
            postId = 87
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4990() {
        val post = Post()
        with(post) {
            postNum = 4990
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/07/05/12/20/rubbish-143465_1280.jpg"
            postText = arrayListOf(
                " התקשורת מייצרת מציאות ",
                " מערכת המשפט מייצרת צדק ",
                " אתה מייצר תפיסת חיים, ",
                " וככה כל זה באמת נראה. "
            )
            postId = 83
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4991() {
        val post = Post()
        with(post) {
            postNum = 4991
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/15/18/47/work-3322460_1280.jpg"
            postText = arrayListOf(
                " יש מה שאתה חושב שצריך ",
                " ויש מה שקיים כרגע ",
                " האושר שלך נמדד  ",
                " לפי הפער שביניהם. "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4992() {
        val post = Post()
        with(post) {
            postNum = 4992
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/29/22/01/alcoholic-1939418_1280.jpg"
            postText = arrayListOf(
                " חופש הבחירה היחידי הקיים ",
                " הוא באיזה צורה ",
                " אתה בוחר  ",
                " לדפוק את החיים שלך. "
            )
            postId = 87
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4993() {
        val post = Post()
        with(post) {
            postNum = 4993
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/10/14/00/08/old-man-1739154_960_720.jpg"
            postText = arrayListOf(
                " מה שאתה כרגע ",
                " זה בדיוק מה שיועדת להיות, ",
                " ומי שאומר לך אחרת ",
                " גם הוא יועד להיות כזה. "
            )
            postId = 85
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4994() {
        val post = Post()
        with(post) {
            postNum = 4994
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/09/18/47/lake-7443622_960_720.jpg"
            postText = arrayListOf(
                " השתדל",
                " להטריד את עצמך ",
                " כמה שפחות ",
                " במה שאתה. "
            )
            postId = 88
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#6A7BA2"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4995() {
        val post = Post()
        with(post) {
            postNum = 4995
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/21/17/54/jokers-5074032_960_720.jpg"
            postText = arrayListOf(
                " חוסר הטעם שלך ",
                " זו סוג של מחלה, ",
                " שפוגעת יותר בסובבים אותך ",
                " ופחות בך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4996() {
        val post = Post()
        with(post) {
            postNum = 4996
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/11/18/53/cold-1972619_960_720.jpg"
            postText = arrayListOf(
                " במלחמות פוליטיות ",
                " אתה נלחם על טובת הציבור כולו  ",
                " אבל בסופו של יום ",
                " זה משפיע רק על הבריאות שלך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4997() {
        val post = Post()
        with(post) {
            postNum = 4997
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/08/27/11/50/flower-7414318_960_720.jpg"
            postText = arrayListOf(
                " הדברים שאתה צריך כרגע ",
                " כבר נמצאים אצלך,  ",
                " חוץ מאותה תודעה מבורכת ",
                " שיודעת את זה. "
            )
            postId = 89
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4998() {
        val post = Post()
        with(post) {
            postNum = 4998
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2017/06/04/23/17/lighthouse-2372461_960_720.jpg"
            postText = arrayListOf(
                " מה אתה רוצה להביא לעולם ",
                " אור או צדק ?  ",
                " תחליט, כי בדרך כלל ",
                " זה לא בא ביחד. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

           */

fun loadPost4998(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2017/06/04/23/17/lighthouse-2372461_960_720.jpg"
        postText = arrayListOf(
            " מה אתה רוצה להביא לעולם ",
            " אור או צדק?  ",
            " תחליט, כי בדרך כלל ",
            " זה לא בא ביחד. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/09/16/20/24/forest-7459565_960_720.jpg"
        postText = arrayListOf(
            " האור בכול, ",
            " הצללים שאתה רואה ",
            " אלה המקומות שאתה מטיל עליהם ",
            " את הצל שלך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=14
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_000(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/18/19/39/beach-1836597_960_720.jpg"
        postText = arrayListOf(
            " יש לאדם שני בעיות עיקריות ",
            " ראשית ומשנית,  ",
            " הבעיה המשנית היא ",
            " שהוא לא יודע מה הבעיה הראשית שלו. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=11
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_001(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2016/11/03/18/19/social-media-1795578_960_720.jpg"
        postText = arrayListOf(
            " טמטום חושים ",
            " הוא הלך רוח אנושי טיפוסי  ",
            " שבו האדם צורך כל אינפורמציה ",
            " שתחזק בו את הטמטום חושים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=11
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_002(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_960_720.jpg"
        postText = arrayListOf(
            " תלמד להקשיב לעולם ",
            " אחרי הכל יש לו קצת ניסיון בחיים,  ",
            " אומנם הוא לא נחשב במקומותינו ",
            " אבל לפעמים יש לו מה לומר. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=14
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_003(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/08/10/03/47/guy-2617866_960_720.jpg"
        postText = arrayListOf(
            " המילים אינם תחליף למציאות, ",
            " במקרה הטוב  ",
            " הם מספקים רק חצי נחמה ",
            " למוכים ולחבולים ממנה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_004(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/01/17/19/52/old-man-1145469_960_720.jpg"
        postText = arrayListOf(
            " האדם בפני אחרים נתפס לפי ",
            " מה שהוא מעורר בהם,  ",
            " האדם בפני עצמו נתפס לפי ",
            " מה שהוא מעורר בעצמו. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_005(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/07/22/15/03/field-5429112_960_720.jpg"
        postText = arrayListOf(
            " שאלות פתוחות נותנות מרחב, ",
            " אל תמהר לתת להן תשובות  ",
            " כדי שלא להקטין ",
            " את המרחב הזה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_006(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/05/03/23/10/suicide-5127103_960_720.jpg"
        postText = arrayListOf(
            " מעניין, ",
            " העולם לא מושלם  ",
            " בדיוק באותם מקומות ",
            " בהם אתה לא מושלם. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_007(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2020/06/13/17/51/milky-way-5295160_960_720.jpg"
        postText = arrayListOf(
            "  למרות כל מה שאתה חושב ",
            " אתה לא מרכז היקום,  ",
            " כדאי שתמקם שוב את מפת עולמך  ",
            " אולי אז תצליח למצא את עצמך. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=56
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_008(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2013/07/05/12/20/rubbish-143465_960_720.jpg"
        postText = arrayListOf(
            " לעולם הפנימי שבו אתה חי ",
            " יש יכולת קיבול מוגבלת ,  ",
            " אם תמלא את כל כולו בהבל  ",
            " לא יישאר מקום לאמת. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=53
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_009(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617_960_720.jpg"
        postText = arrayListOf(
            " האדם שאתה ",
            " זה לא מה שאתה חושב,  ",
            " אבל מה שאתה חושב  ",
            " משפיע רבות על האדם שאתה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=46
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_010(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/09/19/23/03/sunset-3689760_960_720.jpg"
        postText = arrayListOf(
            " יש אנשים שכאלה ",
            " שלא יעזור לך  ",
            " גם אם תתרחק מהם אל מעבר לאופק  ",
            " החוויה איתם נשארת איתך קרוב. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=69
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_011(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2019/12/22/17/13/barbed-wire-4713012_960_720.jpg"
        postText = arrayListOf(
            " אתה מספיק אידיוט ",
            "   להתעצבן על כל זה,   ",
            " ואתה מספיק אידיוט  ",
            "   לחשוב שאתה לא כזה. "
        )
        postTransparency =10
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

    fun loadPost4_999_012(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/03/06/14/33/man-4907204_960_720.jpg"
            postText = arrayListOf(
                " אני מבסוט ",
                " גם שלא להיות מבסוט,  ",
                " כי ככה  ",
                " אני מוכר יותר לעצמי. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=32
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost4_999_013(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/04/19/15/23/teddy-1338895_960_720.jpg"
        postText = arrayListOf(
            " אתה לא צריך להרגיש כל כך רע עם עצמך, ",
            " זה לא אתה שיצרת את האדם  ",
            " אתה רק מתפעל אותו לזמן קצר,  ",
            " אז תרגיע. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_014(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2020/05/31/19/37/iranian-architecture-5243948_960_720.jpg"
        postText = arrayListOf(
            " ישנם שלשה גילאים בחי אנוש: ",
            " עלומים – כשרק העתיד שלך נכנס בעתיד,  ",
            " בגרות – שגם ההווה שלך נכנס בעתיד  ",
            " וזקנה – שגם העבר שלך נכנס בעתיד. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_015(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/12/15/23/26/glass-3877768_960_720.jpg"
        postText = arrayListOf(
            " זה שכולם מדברים כל הזמן ",
            " רק על החצי כוס הריקה,  ",
            " זה לא עושה את האין  ",
            "  ליותר מחצי כוס. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_016(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/10/21/07/51/boot-998966_960_720.jpg"
        postText = arrayListOf(
            " מוטב לך ",
            " שלא לעסוק בכפיתיות ",
            " בבעיות שימשיכו להיות כאן ",
            " שנים אחרי שאתה כבר לא תהיה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=13
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_017(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/09/16/17/07/city-7459162_960_720.jpg"
        postText = arrayListOf(
            " בסך הכל ",
            " החיים זו הפקה לא רעה,  ",
            " הבעיה שמעט אנשים ממש מבינים ",
            " את הקונספציה של ההפקה הזו. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_018(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2016/06/29/22/02/parking-space-1487891_960_720.jpg"
        postText = arrayListOf(
            " תאורטית בעולם הזה ",
            " אתה יכול לעשות מה שאתה רוצה,  ",
            " מעשית ",
            " אתה מוגבל במה שאתה ברגע זה. "
        )
        postTransparency =10
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
fun loadPost4_999_019(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/09/08/02/24/chess-2727443_960_720.jpg"
        postText = arrayListOf(
            " שהמלך מתאים לאג'נדה הפוליטית שלך, ",
            " גם שהוא ערום  ",
            " בשבילך  ",
            " הוא יהיה לבוש לתפארת. "
        )
        postTransparency =10
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
fun loadPost4_999_020(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/07/27/18/34/life-862985_960_720.jpg"
        postText = arrayListOf(
            " מטען ההצלחות והכישלונות בחיים שלך ",
            " אינו תלוי במה שקורה לך,  ",
            " אלא במה נחשב אצלך כהצלחה  ",
            " ומה ככישלון. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=48
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_021(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/04/12/10/37/sunset-5033708_960_720.jpg"
        postText = arrayListOf(
            "כדי להבין את האדם  ",
            " לך למרחבי הרווח וההפסד,  ",
            " כדי להבין את העולם  ",
            " לך למרחבי החיים והמוות. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=35
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_022(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712_960_720.jpg"
            postText = arrayListOf(
                " האומנות המוטבעת באדם היא ",
                " לקחת ארבעה חומרים פשוטים:  ",
                " אדמה, רוח, אש ומים  ",
                " וליצור מהם חווית חיים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4_999_023(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/04/03/09/45/flower-7108507_960_720.jpg"
        postText = arrayListOf(
            " החיים שלך ",
            " זה מה שאתה חושב שזה החיים שלך, ",
            " המוות שלך  ",
            " זה מה שקורה באמת. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=35
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_024(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/02/24/18/37/windsurf-1220492_960_720.jpg"
        postText = arrayListOf(
            " על עסקי גלישה. ",
            " מי שלא יכול להודות על ימים ללא רוח,  ",
            " לא יכול להודות על ימים עם רוח,  ",
            " כי היכולת להודות לא קשורה למצב הרוח. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_025(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2022/09/02/13/35/mountains-7427623_960_720.jpg"
        postText = arrayListOf(
            " כמו שהכותבים רוצים התייחסות בפייסבוק ",
            " כך האלוהים רוצה התייחסות על החיים,  ",
            " ולפי מצב הלייקים שהוא מקבל כל יום  ",
            " מפליא אותי שהוא ממשיך בזה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_026(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/09/28/10/43/sea-7484743_960_720.jpg"
        postText = arrayListOf(
            " כמה יותר דברים ",
            " שאין לך דעה עליהם,  ",
            " ככה יותר חופש  ",
            " יש לך בעולם. "
        )
        postTransparency =2
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4_999_027(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri ="https://cdn.pixabay.com/photo/2019/07/25/10/43/ballerina-4362282_960_720.jpg"
            postText = arrayListOf(
                " את החיים האלה צריך להבין, ",
                " וכמו בבלט או בציור  ",
                " אם אתה לא מבין בזה  ",
                " בשבילך זה סתם קשקוש. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost4_999_028(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/03/12/23/18/man-1253004_960_720.jpg"
        postText = arrayListOf(
            " באדם יש צדדים חיוביים ופחות חיוביים, ",
            " יש שמתמקדים בצדדים החיוביים שלהם  ",
            " יש שמתמקדים בצדדים הפחות חיוביים שלהם,  ",
            " ויש שמתמקדים בלעשות את המירב עם מה שהם. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=53
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_029(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/10/31/04/55/woman-7558886_960_720.jpg"
        postText = arrayListOf(
            " החיים ",
            " זה מה שקורה עכשיו, ",
            " סיפורים על החיים  ",
            " זה מה שקורה אחר כך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=53
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_030(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri =
                "https://cdn.pixabay.com/photo/2016/09/01/15/19/industrial-1636393_960_720.jpg"
            postText = arrayListOf(
                " רוב האנשים ",
                " מיוצרים על ידי התפיסות שלהם,  ",
                " מעטים מרשים לעצמם  ",
                "  לייצר את התפיסות האלה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=52
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4_999_031(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/09/19/12/30/pencils-452238_960_720.jpg"
        postText = arrayListOf(
            "   לגעת בחיים ",
            " זו אומנות לא שימושית,  ",
            " אבל היא הכרחית  ",
            " אם אתה רוצה לחיות בטוב."
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=44
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_032(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/10/16/20/00/woman-491623_960_720.jpg"
        postText = arrayListOf(
            " לעולם ",
            " לא תשיג מה שאתה רוצה,  ",
            " כי ברגע שתשיג  ",
            " כבר לא תרצה בזה."
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=45
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_033(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2022/08/29/22/33/sunset-7419911_960_720.jpg"
            postText = arrayListOf(
                " העולם מתחלק לשניים ",
                " לאושר ולצער,  ",
                " האדם מודע יותר לצער שבחיים ",
                " האושר חולף על פניו מבלי שירגיש. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4_999_034(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_960_720.jpg"
        postText = arrayListOf(
            " ההבדל  הקטן שבין ",
            " ליצור משהו ללא ליצור דבר  ",
            " הוא ההבדל הגדול ",
            " בין פריחה וחדלון. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=45
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4_999_035(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri =
                "https://cdn.pixabay.com/photo/2022/10/09/11/37/common-heron-7508950_960_720.jpg"
            postText = arrayListOf(
                " אם היית יותר מוכשר ",
                "היית יכול להפיק הרבה יותר מהחיים האלה,",
                " לא שזה היה משנה משהו ",
                " אבל זה היה מסדר לך חיים נוחים יותר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=15
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost4_999_036(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/03/27/19/54/golf-1284011_960_720.jpg"
        postText = arrayListOf(
            " כמו בכל תחום ",
            " מאומנות עד משחקי כדור,  ",
            " החיים משעממים ",
            " למי שלא מבין את התחום הזה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=15
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_037(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/05/12/17/41/forest-3394066_960_720.jpg"
        postText = arrayListOf(
            " בעולם יש צדדים חשוכים, ",
            " רק הבחירה שלך  ",
            " להיות שם ",
            " מביאה בך את החושך. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=15
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_038(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/11/08/20/20/building-7579247_960_720.jpg"
        postText = arrayListOf(
            " תפיסת העולם שלך ",
            " לא אומרת דבר על העולם הזה, ",
            " היא רק מצביעה ",
            " על המקום שאתה נמצא בו ברגע זה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=22
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4_999_039(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2014/11/13/06/12/boy-529067_960_720.jpg"
            postText = arrayListOf(
                " ישנם שני סוגי אנשים: ",
                " כאלה שקצת יותר חכמים  ",
                " מהשדים שלהם ",
                " וכאלה שפחות. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4_999_040(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/07/10/17/49/man-2490785_960_720.jpg"
        postText = arrayListOf(
            " רק שאתה משועמם ",
            " אתה ממש חי, ",
            " בשאר הזמנים ",
            " אתה עסוק מידי בדברים אחרים. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=27
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_041(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/06/21/19/01/coast-7276345_960_720.jpg"
        postText = arrayListOf(
            " לא יודע כבר מה יותר ממשי ",
            " זיכרונות העבר המוצקים  ",
            " או ",
            " המציאות החמקמקה של היום יום. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=20
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_042(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/01/28/07/15/man-3959784_960_720.jpg"
        postText = arrayListOf(
            " ההצלחה שלך בחיים ",
            " אינה תלויה במה שקורה לך,  ",
            " אלא רק בהכרה ",
            " שיש לך חיים מוצלחים. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=20
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_043(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2021/10/13/12/33/forest-6706559_960_720.jpg"
        postText = arrayListOf(
            " בסוף הדרך הוא לא יאשים אותך ",
            " שטעית פה ושם בחיים שלך,  ",
            " אלא רק  ",
            " שלא חיית אותם במלואם. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=19
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_044(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/03/27/00/10/puzzle-693873_960_720.jpg"
        postText = arrayListOf(
            " הרעיון בקיום האנושי ",
            " הוא לא להיות מושלם,  ",
            " אלא לעשות את המירב  ",
            " עם אותה חוסר השלמות. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=10
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_045(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/12/31/04/42/water-3051555_960_720.jpg"
        postText = arrayListOf(
            " יש מערכות יחסים ",
            " שמוציאות שם רע לאהבה  ",
            " ויש יחסים ללא מערכות  ",
            " שמוציאות לה שם טוב, "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=11
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_999_046(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_960_720.jpg"
        postText = arrayListOf(
            " בוא ונעמיד דברים על דיוקם, ",
            " אתה לא אחראי על מה שאתה  ",
            " אתה אחראי רק להקטין  ",
            " עד כמה שאפשר את הנזק שאתה גורם. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=12
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost4_999_047(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2014/07/09/14/35/train-388253_960_720.jpg"
            postText = arrayListOf(
                " אם כלום לא נשתנה לך מסביב ",
                " בחמש דקות האחרונות  ",
                " אתה כנראה לא מספיק ערני לעולם  ",
                " או שאתה מת. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost4_999_048(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/09/28/22/20/old-1701640_960_720.jpg"
        postText = arrayListOf(
            "  מה שאתה אומר  ",
            " זה מה שנשמע בעולם, ",
            "   מה שאתה חושב   ",
            " נשמע רק בראש שלך. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

fun loadPost4_999_049(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/09/28/22/20/old-1701640_960_720.jpg"
        postText = arrayListOf(
            "  מה שאתה אומר  ",
            " זה מה שנשמע בעולם, ",
            "   מה שאתה חושב   ",
            " נשמע רק בראש שלך. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999050(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/07/18/08/00/people-850097_960_720.jpg"
        postText = arrayListOf(
            " יש לך מזל, ",
            " שאתה לא פוגש את עצמך לעיתים קרובות, ",
            " אחרת היית די מתבאס ",
            " מהטיפוסים שמסתובבים ככה ביננו. "
        )
        postTransparency =10
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
fun loadPost4999051(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/02/25/22/59/grimace-4880273_960_720.jpg"
        postText = arrayListOf(
            " ישנם הרבה סיבות להתעצבן בעולם, ",
            "  ולא שהעולם מייצר את הסיבות הללו ",
            " כמו שאתה מייצר אותם ",
            " מחומרים שמספק לך העולם. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=14
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999052(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/11/10/19/38/pencil-1037609_960_720.jpg"
        postText = arrayListOf(
            " שלא לעשות טעויות ",
            " זה עניין של מזל, ",
            "  לתקן טעויות ",
            " זה ענין של כישרון. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=20
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999053(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/11/27/15/13/clay-3841610_960_720.jpg"
        postText = arrayListOf(
            " הדברים שאחרים יוצרים ",
            " יוצרים את המציאות שלך, ",
            " הדברים שאתה יוצר ",
            " יוצרים אותך. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=17
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999054(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/05/01/19/15/audit-4171740_960_720.jpg"
        postText = arrayListOf(
            " אין טעות בעולם הזה ",
            " הכל נכון, ",
            " גם הלא נכון ",
            " בחוסר הנכונות שלו. "
        )
        postTransparency =4
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

    fun loadPost4999055(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_960_720.jpg"
            postText = arrayListOf(
                "  לשאלה: ",
                " אז מה בעצם הבעיה שלך ?  ",
                " התשובה האמיתית היא בדרך כלל: ",
                " אותה מחשבה שיש לך בכלל בעיה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=15
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost4999056(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/09/23/11/29/antelope-canyon-457495_960_720.jpg"
        postText = arrayListOf(
            " מכל הסלעים כבדי המשקל שביקום, ",
            " דווקא תפיסות עולם שלך  ",
            " חסרות המשקל ",
            " הן שמוחצות אותך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=52
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4999057(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/05/03/07/43/green-5124174_960_720.jpg"
            postText = arrayListOf(
                " כולם מכירים ",
                " את המחוזות היותר חשוכים של החיים,  ",
                " אבל חלק מבקרים שם יותר ",
                " וחלק פחות. "
            )
            postTransparency =10
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
fun loadPost4999058(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/05/06/21/13/dandelion-4184288_960_720.jpg"
        postText = arrayListOf(
            " החיים האלה כבדים ",
            " כי אתה מעמיס עליהם  ",
            " את כל הבעיות שלך, ",
            " בלעדיהם הם היו ללא משקל. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=31
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999059(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/03/22/16/34/human-3251000_960_720.jpg"
        postText = arrayListOf(
            "האדם נמצא איפה שהמחשבה שלו נמצאת",
            " ולהיות בארץ גזרה מרצון  ",
            " זה עונש לא קטן ",
            " שתחילתו בסתם מחשבה שגרתית. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4999060(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/08/15/08/24/aircraft-5489944_960_720.jpg"
            postText = arrayListOf(
                " אף אחד לא יוכל להאשים אותך ",
                " שלא הצלחת להמריא בחיים האלה,  ",
                " אפשר יהיה רק להאשים אותך ",
                " שלא העזת להגיע לקצה המסלול. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999061(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2017/10/17/16/10/fantasy-2861107_960_720.jpg"
            postText = arrayListOf(
                " מה שגיליתי עם הגיל ",
                " שכנראה בעתיד הקרוב  ",
                " אני לא אצליח להיות ",
                " משהו שיותר מבן אדם. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999062(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2017/01/04/17/26/there-is-no-1-1952547_960_720.jpg"
            postText = arrayListOf(
                " אני חושב ",
                " משמע אני תופס את עצמי קיים,  ",
                " אני לא חושב ",
                " אני קיים ללא שום תפיסה. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999063(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334_960_720.jpg"
            postText = arrayListOf(
                "   לסבול בחיים   ",
                " זו ברירת מחדל, ",
                "  להינות  ",
                " זו בחירה מודעת. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999064(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2018/06/29/22/45/wheat-3506758_960_720.jpg"
            postText = arrayListOf(
                " אתה יכול למדוד ",
                " כמה השתנת מפעם, ",
                "  לפי כמה אתה מובך עכשיו ",
                " ממה שהיית פעם. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=48
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999065(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2022/11/19/09/35/forest-7601671_960_720.jpg"
            postText = arrayListOf(
                " התודעה צריכה התחדשות, ",
                " הנשמה יצירה, ",
                "  הגוף יציבות ",
                " והאדם ככלל צריך כושר להודות בטוב. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=12
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999066(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2022/12/07/16/07/palm-7641522_960_720.jpg"
            postText = arrayListOf(
                " מעניין, אבל יש אזורי מודעות נרחבים ",
                " שלא בתחום המחשבות שלך על החיים, ",
                "  אין לך כל כך קשר עם האזורים האלה ",
                " סתם בגלל שהם לא בשגרה היומית שלך. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=10
            val colorIndex=12
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999067(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2021/10/20/12/32/kid-6725904_960_720.jpg"
            postText = arrayListOf(
                " אם היית יודע ",
                "מה שאתה באמת",
                "  היית מפסיק להציק לעצמך ",
                " שאתה כזה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=67
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost4999068(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2019/04/16/23/59/sad-4133121_960_720.jpg"
            postText = arrayListOf(
                " כדאי שלא תצטער ",
                " אחר כך ",
                "  שפספסת את ההזדמנות  ",
                " להיות אחר עכשיו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=87
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost4999069(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/04/18/12/29/landscape-5059082_960_720.jpg"
            postText = arrayListOf(
                " החיים כולם זו תחרות מתמשכת ",
                " של להיות יותר מקובל, יפה וצודק, ",
                "  מה שמוזר בתחרות המעייפת הזו  ",
                " שכולם מגיעים בסופו של דבר לאותו מקום. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=86
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4999070(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/06/06/19/50/demonstration-5267933_960_720.jpg"
            postText = arrayListOf(
                " דמוקרטיה זו צורת משטר שבה ",
                " לכל אחד יש את הזכות השווה ",
                "  להיות מטומטם  ",
                " בצורה שונה. "
            )
            postTransparency =6
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

    fun loadPost4999071(): Post {
       var post = Post()
       with(post) {
       postNum= tool.extractPostNumFromFunctionName()
       imageUri ="https://cdn.pixabay.com/photo/2023/01/10/00/17/italy-7708552_960_720.jpg"
       postText = arrayListOf(
           " זכרון העבר  ",
           " זה מה שקרה לך בעבר,  ",
           "  טעות אישית שלך  ",
           " להכפיף את ההווה שלך לזה. "
       )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=49
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost4999072(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2021/07/27/11/22/mountains-6496638_960_720.jpg"
            postText = arrayListOf(
                " הבחירה החופשית שלך מתמקדת  ",
                "  במה אתה חושב שאתה,  ",
                "  סתם דמות מסיפור אנושי כלשהו  ",
                " או משהו שמעבר. "
            )
            postTransparency =4
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

    fun loadPost4999073(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/15/01/44/animals-2313502_960_720.jpg"
            postText = arrayListOf(
                " בחיים האלה  ",
                "  אתה יכול להכיר את כל המילים,  ",
                "  אבל בלי המנגינה הנכונה  ",
                " זה לא זה. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=87
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4999074(): Post {
    var post = Post()
    with(post) {
        imageUri ="https://cdn.pixabay.com/photo/2017/09/21/23/03/hand-2773840_960_720.jpg"
        postText = arrayListOf(
            " כמה שאתה מכיר  ",
            "  ביותר הבלים ביום יום שלך,  ",
            "  ככה אתה פנוי  ",
            " לראות את הדברים החשובים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=46
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

fun loadPost4999075(): Post {
    var post = Post()
    with(post) {
        imageUri ="https://cdn.pixabay.com/photo/2017/06/11/11/09/the-road-to-the-sea-2392024_960_720.jpg"
        postText = arrayListOf(
            " כבסוף הדרך  ",
            " מתחשבנים אתך על דבר אחד בלבד, ",
            "  על כמה אור וכמה חושך  ",
            " הבאת לעולם הזה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=5
        val colorIndex=46
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4999076(): Post {
    var post = Post()
    with(post) {
        imageUri ="https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_960_720.jpg"
        postText = arrayListOf(
            " קצה העולם שלך  ",
            " איננו אי שם בסוף האופק, ",
            "  הוא בקיר המחשבה  ",
            " שעולה בך ברגע זה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=24
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    /*
  מתי אתה יודע שהתבגרת+
  מתי שהחיבה שלך לנשים מבוגרות
  מפסיקה להיות בגדר סטייה
  ויותר מציאות מובנת.

  */

    fun loadPost4_999_077(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712_960_720.jpg"
            postText = arrayListOf(
                " מתי אתה יודע שהתבגרת ?  ",
                " מתי שהחיבה שלך לנשים מבוגרות ",
                "  מפסיקה להיות בגדר סטייה  ",
                " ויותר מציאות מובנת. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }



}