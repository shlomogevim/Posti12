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
*  fun loadPost4999000() {
        val post = Post()
        with(post) {
            postNum = 4999000
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/19/39/beach-1836597_960_720.jpg"
            postText = arrayListOf(
                " יש לאדם שני בעיות עיקריות ",
                " ראשית ומשנית,  ",
                " הבעיה המשנית היא ",
                " שהוא לא יודע מה הבעיה הראשית שלו. "
            )
            postId = 88
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "n_3NjDOiC9w"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999001() {
        val post = Post()
        with(post) {
            postNum = 4999001
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2016/11/03/18/19/social-media-1795578_960_720.jpg"
            postText = arrayListOf(
                " טמטום חושים ",
                " הוא הלך רוח אנושי טיפוסי  ",
                " שבו האדם צורך כל אינפורמציה ",
                " שתחזק בו את הטמטום חושים. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 5, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "FqjJkLPcY3I"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999002() {
        val post = Post()
        with(post) {
            postNum = 4999002
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_960_720.jpg"
            postText = arrayListOf(
                " תלמד להקשיב לעולם ",
                " אחרי הכל יש לו קצת ניסיון בחיים,  ",
                " אומנם הוא לא נחשב במקומותינו ",
                " אבל לפעמים יש לו מה לומר. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "DCtouot15cA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999003() {
        val post = Post()
        with(post) {
            postNum = 4999003
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/10/03/47/guy-2617866_960_720.jpg"
            postText = arrayListOf(
                " המילים אינם תחליף למציאות, ",
                " במקרה הטוב  ",
                " הם מספקים רק חצי נחמה ",
                " למוכים והחבולים ממנה. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "BREMqjC5w04"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999004() {
        val post = Post()
        with(post) {
            postNum = 4999004
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/17/19/52/old-man-1145469_960_720.jpg"
            postText = arrayListOf(
                " האדם בפני אחרים נתפס לפי ",
                " מה שהוא מעורר בהם,  ",
                " האדם בפני עצמו נתפס לפי ",
                " מה שהוא העורר בעצמו. "
            )
            postId = 83
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "gXTHdj3Vw3s"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999005() {   //I
        val post = Post()
        with(post) {
            postNum = 4999005
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/07/22/15/03/field-5429112_960_720.jpg"
            postText = arrayListOf(
                " שאלות פתוחות נותנות מרחב, ",
                " אל תמהר לתת להן תשובות  ",
                " כדי שלא להקטין ",
                " את המרחב הזה . "
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#FFDFDE"
            val textColor = "#3B1877"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "F4FbISbQGHs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999006() {
        val post = Post()
        with(post) {
            postNum = 4999006
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/05/03/23/10/suicide-5127103_960_720.jpg"
            postText = arrayListOf(
                " מעניין, ",
                " העולם לא מושלם  ",
                " בדיוק באותם מקומות ",
                " בהם אתה לא מושלם. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "YUaxVQPohlU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999007() {
        val post = Post()
        with(post) {
            postNum = 4999007
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2020/06/13/17/51/milky-way-5295160_960_720.jpg"
            postText = arrayListOf(
                " למרות כל מה שאתה חושב ",
                " אתה לא מרכז היקום,  ",
                " כדאי שתמקם שוב את מפת עולמך  ",
                " אולי אז תצליח למצא את עצמך. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "6T7cyHwlfFQ"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999008() {
        val post = Post()
        with(post) {
            postNum = 4999008
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/07/05/12/20/rubbish-143465_960_720.jpg"
            postText = arrayListOf(
                " לעולם הפנימי שבו אתה חי ",
                " יש יכולת קיבול מוגבלת ,  ",
                " אם תמלא את כל כולו בהבל  ",
                " לא יישאר מקום לאמת. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CBCE91"
            val textColor = "#76528B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "AWXoZCTZgGM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999009() { //I
        val post = Post()
        with(post) {
            postNum = 4999009
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617_960_720.jpg"
            postText = arrayListOf(
                " האדם שאתה ",
                " זה לא מה שאתה חושב,  ",
                " אבל מה שאתה חושב  ",
                " משפיע רבות על האדם שאתה. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "QK-Z1K67uaA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999010() { //I
        val post = Post()
        with(post) {
            postNum = 4999010
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/18/04/56/book-3755514_960_720.jpg"
            postText = arrayListOf(
                " יש אנשים שכאלה ",
                " שלא יעזור לך  ",
                " גם אם תתרחק מהם אל מעבר לאופק  ",
                " החוויה איתם נשארת איתך קרוב. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "DDWKuo3gXMQ"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999011() { //I
        val post = Post()
        with(post) {
            postNum = 4999011
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2019/12/22/17/13/barbed-wire-4713012_960_720.jpg"
            postText = arrayListOf(
                " אתה מספיק אידיוט ",
                " להתעצבן על כל זה,  ",
                " ואתה מספיק אידיוט  ",
                " לחשוב שאתה לא כזה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "lAa0e7apG20"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999012() { //I
        val post = Post()
        with(post) {
            postNum = 4999012
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/03/06/14/33/man-4907204_960_720.jpg"
            postText = arrayListOf(
                " אני מבסוט ",
                " גם שלא להיות מבסוט,  ",
                " כי ככה  ",
                " אני מוכר יותר לעצמי. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 320, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
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

    fun loadPost4999013() { //I
        val post = Post()
        with(post) {
            postNum = 4999013
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/19/15/23/teddy-1338895_960_720.jpg"
            postText = arrayListOf(
                " אתה לא צריך להרגיש כל כך רע עם עצמך, ",
                " זה לא אתה שיצרת את האדם  ",
                " אתה רק מתפעל אותו לזמן קצר,  ",
                " אז תרגיע. "
            )
            postId = 87
            textLocation = arrayListOf(10, 20, 25, -1, 1, 25, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 13)
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

    fun loadPost4999014() { //I
        val post = Post()
        with(post) {
            postNum = 4999014
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2020/05/31/19/37/iranian-architecture-5243948_960_720.jpg"
            postText = arrayListOf(
                " ישנם שלשה גילאים בחי אנוש: ",
                " עלומים – כשרק העתיד שלך נכנס בעתיד,  ",
                " בגרות – שגם ההווה שלך נכנס בעתיד  ",
                " וזקנה – שגם העבר שלך נכנס בעתיד. "
            )
            postId = 87
            textLocation = arrayListOf(10, 170, 25, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 13)
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

    fun loadPost4999015() { //I
        val post = Post()
        with(post) {
            postNum = 4999015
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/12/15/23/26/glass-3877768_960_720.jpg"
            postText = arrayListOf(
                " זה שכולם מדברים כל הזמן ",
                " רק על החצי כוס הריקה,  ",
                " זה לא עושה את האין  ",
                " ליותר מחצי כוס. "
            )
            postId = 87
            textLocation = arrayListOf(10, 170, 25, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 13)
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

    fun loadPost4999016() { //I
        val post = Post()
        with(post) {
            postNum = 4999016
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/10/21/07/51/boot-998966_960_720.jpg"
            postText = arrayListOf(
                " מוטב לך ",
                " שלא לעסוק בכפיתיות  ",
                " בבעיות שימשיכו להיות כאן ",
                " שנים אחרי שאתה כבר לא תהיה. "
            )
            postId = 87
            textLocation = arrayListOf(10, 440, 25, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#F9EBDE"
            val textColor = "#815854"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999017() {
        val post = Post()
        with(post) {
            postNum = 4999017
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/16/17/07/city-7459162_960_720.jpg"
            postText = arrayListOf(
                " בסך הכל ",
                " החיים זו הפקה לא רעה,  ",
                " הבעיה שמעט אנשים ממש מבינים ",
                " את הקונספציה של ההפקה הזו. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#F9EBDE"
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

    fun loadPost4999018() {  //I
        val post = Post()
        with(post) {
            postNum = 4999018
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2016/06/29/22/02/parking-space-1487891_960_720.jpg"
            postText = arrayListOf(
                " תאורטית בעולם הזה ",
                " אתה יכול לעשות מה שאתה רוצה,  ",
                " מעשית ",
                " אתה מוגבל במה שאתה ברגע זה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 280, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
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

    fun loadPost4999019() {  //I
        val post = Post()
        with(post) {
            postNum = 4999019
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/08/02/24/chess-2727443_960_720.jpg"
            postText = arrayListOf(
                " שהמלך מתאים לאג'נדה הפוליטית שלך ",
                " גם שהוא ערום  ",
                " בשבילך  ",
                " הוא יהיה לבוש לתפארת. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 350, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
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

    fun loadPost4999020() {  //I
        val post = Post()
        with(post) {
            postNum = 4999020
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/18/34/life-862985_960_720.jpg"
            postText = arrayListOf(
                " מטען ההצלחות והכישלונות בחיים שלך ",
                " אינו תלוי במה שקורה לך,  ",
                " אלא במה נחשב אצלך כהצלחה  ",
                " ומה נחשב ככישלון. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 350, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
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

    fun loadPost4999021() {  //I  בני ברמן חי אדם
        val post = Post()
        with(post) {
            postNum = 4999021
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/12/10/37/sunset-5033708_960_720.jpg"
            postText = arrayListOf(
                "כדי להבין את האדם  ",
                " לך למרחבי הרווח וההפסד,  ",
                " כדי להבין את העולם  ",
                " לך למרחבי החיים והמוות. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "Vb-Lo8FvHtQ"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999022() {  //I bogi wonderland
        val post = Post()
        with(post) {
            postNum = 4999022
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712_960_720.jpg"
            postText = arrayListOf(
                " האומנות המוטבעת באדם היא ",
                " לקחת ארבעה חומרים פשוטים,  ",
                " אדמה, רוח, אש, ומים  ",
                " וליצור מהם חווית חיים. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "god7hAPv8f0"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999023() {  //nv
        val post = Post()
        with(post) {
            postNum = 4999023
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/04/03/09/45/flower-7108507_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה מה שאתה חושב שזה החיים שלך,  ",
                " המוות שלך  ",
                " זה מה שקורה באמת. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "j1zBEWyBJb0"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999024() {  //I
        val post = Post()
        with(post) {
            postNum = 4999024
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/02/24/18/37/windsurf-1220492_960_720.jpg"
            postText = arrayListOf(
                " על עסקי גלישה. ",
                " מי שלא יכול להודות על ימים ללא רוח,  ",
                " לא יכול להודות על ימים עם רוח,  ",
                " כי היכולת להודות לא קשורה למצב הרוח. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 5, 2, 20, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            lineSpacing = 1.1f
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "cIrGQD84F1g"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999025() {  //I  אמסטרונג  //nv
        val post = Post()
        with(post) {
            postNum = 4999025
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2022/09/02/13/35/mountains-7427623_960_720.jpg"
            postText = arrayListOf(
                " כמו שהכותבים רוצים התייחסות בפייסבוק ",
                " כך האלוהים רוצה התייחסות על החיים,  ",
                " ולפי מצב הלייקים שהוא מקבל כל יום  ",
                " מפליא אותי שהוא ממשיך בזה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 20, 1, 0, 0, 30)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "VqhCQZaH4Vs"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999026() {  //I  //vn.
        val post = Post()
        with(post) {
            postNum = 4999026
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/28/10/43/sea-7484743_960_720.jpg"
            postText = arrayListOf(
                " כמה יותר דברים ",
                " שאין לך דעה עליהם,  ",
                " ככה יותר חופש  ",
                " יש לך בעולם. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 50, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "CBk5MtMxbaA"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999027() {  //I
        val post = Post()
        with(post) {
            postNum = 4999027
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2019/07/25/10/43/ballerina-4362282_960_720.jpg"
            postText = arrayListOf(
                " את החיים האלה צריך להבין, ",
                " וכמו בבלט או בציור  ",
                " אם אתה לא מבין בזה  ",
                " בשבילך זה סתם קשקוש. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 24, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "ucmwor8Po70"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999028() {   //nv
        val post = Post()
        with(post) {
            postNum = 4999028
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/03/12/23/18/man-1253004_960_720.jpg"
            postText = arrayListOf(
                " באדם יש צדדים חיוביים ופחות חיוביים, ",
                " יש שמתמקדים בצדדים החיוביים שלהם  ",
                " יש שמתמקדים בצדדים הפחות חיוביים שלהם,  ",
                " ויש שמתמקדים בלעשות את המירב עם מה שהם. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 10, 1, 23, 2, 23)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#0A174E"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "4bSU_VtPgBo"
            videoText = util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999029() {   //v
        val post = Post()
        with(post) {
            postNum = 4999029
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/10/31/04/55/woman-7558886_960_720.jpg"
            postText = arrayListOf(
                " החיים ",
                " זה מה שקורה עכשיו,  ",
                " סיפורים על החיים  ",
                " זה מה שקורה אחר כך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "yW-n0DJFalY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999030() {   //v
        val post = Post()
        with(post) {
            postNum = 4999030
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2016/09/01/15/19/industrial-1636393_960_720.jpg"
            postText = arrayListOf(
                " רוב האנשים ",
                " מיוצרים על ידי התפיסות שלהם,  ",
                " מעטים מרשים לעצמם  ",
                " לייצר את התפיסות האלה."
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "ZUWbG2l3c8c"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999031() {   //v
        val post = Post()
        with(post) {
            postNum = 4999031
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/09/19/12/30/pencils-452238_960_720.jpg"
            postText = arrayListOf(
                " לגעת בחיים ",
                " זו אומנות לא שימושית,  ",
                " אבל היא הכרחית  ",
                " אם אתה רוצה לחיות בטוב."
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "rMuTXcf3-6A"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999032() {   //v
        val post = Post()
        with(post) {
            postNum = 4999032
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/10/16/20/00/woman-491623_960_720.jpg"
            postText = arrayListOf(
                " לעולם ",
                " לא תשיג מה שאתה רוצה,  ",
                " כי ברגע שתשיג  ",
                " כבר לא תרצה בזה."
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "4fndeDfaWCg"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999033() {   //v
        val post = Post()
        with(post) {
            postNum = 4999033
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/08/29/22/33/sunset-7419911_960_720.jpg"
            postText = arrayListOf(
                " העולם מתחלק לשניים ",
                " לאושר ולצער,  ",
                " האדם מודע יותר לצער שבחיים ",
                " האושר חולף על פניו מבלי שירגיש. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "VqhCQZaH4Vs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999034() {   //v
        val post = Post()
        with(post) {
            postNum = 4999034
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_960_720.jpg"
            postText = arrayListOf(
                " ההבדל  הקטן שבין ",
                " ליצור משהו ללא ליצור דבר  ",
                " הוא ההבדל הגדול ",
                " בין פריחה וחדלון. "
            )
            postId = 87
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            postRadiuas = 5
            videoUrl = "QTPjPsZ7bBI"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999035() {   //v
        val post = Post()
        with(post) {
            postNum = 4999035
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2022/10/09/11/37/common-heron-7508950_960_720.jpg"
            postText = arrayListOf(
                " אם היית יותר מוכשר ",
                " היית יכול להפיק הרבה יותר מהחיים האלה,  ",
                " לא שזה היה משנה משהו ",
                " אבל זה היה מסדר לך חיים טובים יותר. "
            )
            postId = 87
            textLocation = arrayListOf(10, 30, 32, -1, 2, 27, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            postRadiuas = 5
            videoUrl = "dtd7xWvzErs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999036() {   //v
        val post = Post()
        with(post) {
            postNum = 4999036
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/03/27/19/54/golf-1284011_960_720.jpg"
            postText = arrayListOf(
                " כמו בכל תחום ",
                " מאומנות עד משחקי כדור,  ",
                " החיים משעממים ",
                " למי שלא מבין את התחום הזה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 32, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            postRadiuas = 5
            videoUrl = "2O89uI38T14"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999037() {   //v
        val post = Post()
        with(post) {
            postNum = 4999037
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/05/12/17/41/forest-3394066_960_720.jpg"
            postText = arrayListOf(
                " בעולם יש צדדים חשוכים, ",
                " רק הבחירה שלך  ",
                " להיות שם ",
                " מביאה בך את החושך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 32, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            postRadiuas = 5
            videoUrl = "uLZcX4gZLyY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999038() {   //v
        val post = Post()
        with(post) {
            postNum = 4999038
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/11/08/20/20/building-7579247_960_720.jpg"
            postText = arrayListOf(
                " תפיסת העולם שלך ",
                " לא אומרת דבר על העולם  ",
                " היא רק מצביעה ",
                " על המקום שאתה נמצא בו ברגע זה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            postRadiuas = 15
            videoUrl = "rg02Jj91NWM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999039() {   //v
        val post = Post()
        with(post) {
            postNum = 4999039
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/11/13/06/12/boy-529067_960_720.jpg"
            postText = arrayListOf(
                " ישנם שני סוגי אנשים: ",
                " כאלה שקצת יותר חכמים  ",
                " מהשדים שלהם ",
                " וכאלה שפחות. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "KAg7Bc28oOA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999040() {   //v
        val post = Post()
        with(post) {
            postNum = 4999040
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/07/10/17/49/man-2490785_960_720.jpg"
            postText = arrayListOf(
                " רק שאתה משועמם ",
                " אתה ממש חי, ",
                " בשאר הזמנים ",
                " אתה עסוק מידי בדברים אחרים. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#9CC3D5"
            val textColor = "#0063B2"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "YSGHER4BWME"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999041() {   //v
        val post = Post()
        with(post) {
            postNum = 4999041
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/06/21/19/01/coast-7276345_960_720.jpg"
            postText = arrayListOf(
                " לא יודע כבר מה יותר ממשי ",
                " זיכרונות העבר המוצקים  ",
                " או ",
                " המציאות החמקמקה של היום יום. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "16snf9lfJhA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999042() {   //v
        val post = Post()
        with(post) {
            postNum = 4999042
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/28/07/15/man-3959784_960_720.jpg"
            postText = arrayListOf(
                " השאלה איננה ",
                " מה הבעיה  ",
                " אלא ",
                " למה אתה חושב שזו בעיה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "yW-n0DJFalY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999043() {   //v
        val post = Post()
        with(post) {
            postNum = 4999043
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/10/13/12/33/forest-6706559_960_720.jpg"
            postText = arrayListOf(
                " בסוף הדרך הוא לא יאשים אותך ",
                " שטעית פה ושם בחיים שלך  ",
                " אלא רק  ",
                " שלא חיית אותם במלואם. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "zrkG37NQ6GY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999044() {   //v
        val post = Post()
        with(post) {
            postNum = 4999044
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/03/27/00/10/puzzle-693873_960_720.jpg"
            postText = arrayListOf(
                " הרעיון בקיום האנושי ",
                " הוא לא להיות מושלם  ",
                " אלא לעשות את המירב  ",
                " עם אותה חוסר השלמות. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 0, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "WD8jbNHRujU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999045() {   //v
        val post = Post()
        with(post) {
            postNum = 4999045
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/12/31/04/42/water-3051555_960_720.jpg"
            postText = arrayListOf(
                " יש מערכות יחסים ",
                " שמוציאות שם רע לאהבה  ",
                " ויש יחסים ללא מערכות  ",
                " שמוציאות לה שם טוב, "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 0, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "qu1fyVsNGbU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999046() {   //v
        val post = Post()
        with(post) {
            postNum = 4999046
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_960_720.jpg"
            postText = arrayListOf(
                " בוא ונעמיד דברים על דיוקם, ",
                " אתה לא אחראי על מה שאתה  ",
                " אתה אחראי רק להקטין  ",
                " עד כמה שאפשר את הנזק שאתה גורם. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 0, 2, 25, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "bgAeGbRw-70"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999047() {   //v //E
        val post = Post()
        with(post) {
            postNum = 4999047
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/07/09/14/35/train-388253_960_720.jpg"
            postText = arrayListOf(
                " אם כלום לא נשתנה לך מסביב ",
                " בחמש דקות האחרונות  ",
                "אתה כנראה לא מספיק ערני לעולם",
                " או שאתה מת. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 33, 0, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "SVOuYquXuuc"
            videoText = util1.getPostExplanation(postNum, postText)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999048() {   //v //E
        val post = Post()
        with(post) {
            postNum = 4999048
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/18/08/00/people-850097_960_720.jpg"
            postText = arrayListOf(
                " יש לך מזל, ",
                "אתה לא פוגש את עצמך לעיתים קרובות, ",
                "אחרת היית די מתבאס",
                " מהטיפוסים שמסתובבים ככה ביננו. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 0,0, 23, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "VTbqsoJYAZA"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost4999049() {   //v
        val post = Post()
        with(post) {
            postNum = 4999049
            lineNum = 4
              imageUri = "https://cdn.pixabay.com/photo/2015/07/18/08/00/people-850097_960_720.jpg"
            postText = arrayListOf(
                " יש לך מזל, ",
                " שאתה לא פוגש את עצמך לעיתים קרובות, ",
                " אחרת היית די מתבאס ",
                " מהטיפוסים שמסתובבים ככה ביננו. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 25, 0,0, 23, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "tWN7c6cn3WA"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999050() {   //v //E
        val post = Post()
        with(post) {
            postNum = 4999050
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/02/25/22/59/grimace-4880273_960_720.jpg"
            postText = arrayListOf(
                " ישנם הרבה סיבות להתעצבן בעולם, ",
                " ולא שהעולם מייצר את הסיבות הללו ",
                " כמו שאתה מייצר אותם ",
                " מחומרים שמספק לך העולם. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28, 0,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 5)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "Kky808rre2Q"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999051() {   //v
        val post = Post()
        with(post) {
            postNum = 4999051
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/10/19/38/pencil-1037609_960_720.jpg"
            postText = arrayListOf(
                " שלא לעשות טעויות ",
                " זה עניין של מזל, ",
                " לתקן טעויות ",
                " זה ענין של כשרון. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 33, 20,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "UXwR4Y1mBGw"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999052() {   //v
        val post = Post()
        with(post) {
            postNum = 4999052
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/02/19/52/girl-2573111_960_720.jpg"
            postText = arrayListOf(
                " אם הסרט הזה לא נראה לך ",
                " תחליף ערוץ, ",
                " אם העולם הזה לא נראה לך ",
                " תחליף את עצמך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 33, 20,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFB9"
            val textColor = "#A4193D"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "fOVECbr-vsc"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999053() {   //v
        val post = Post()
        with(post) {
            postNum = 4999053
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/11/27/15/13/clay-3841610_960_720.jpg"
            postText = arrayListOf(
                " הדברים שאחרים יוצרים ",
                " יוצרים את המציאות שלך, ",
                " הדברים שאתה יוצר ",
                " יוצרים אותך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 33, 20,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFB9"
            val textColor = "#A4193D"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "eWupm_cePX8"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999054() {   //v
        val post = Post()
        with(post) {
            postNum = 4999054
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/05/01/19/15/audit-4171740_960_720.jpg"
            postText = arrayListOf(
                " אין טעות בעולם הזה ",
                " הכל נכון, ",
                " גם הלא נכון ",
                " בחוסר הנכונות שלו. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 33, 20,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "o9Wpr3J2PUM"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999055() {   //v
        val post = Post()
        with(post) {
            postNum = 4999055
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_960_720.jpg"
            postText = arrayListOf(
                " לשאלה: ",
                " אז מה בעצם הבעיה שלך ?  ",
                " התשובה האמיתית היא בדרך כלל: ",
                " אותה מחשבה שיש לך בכלל בעיה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28,0,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "v5hV3j6ywD4"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999056() {   //v
        val post = Post()
        with(post) {
            postNum = 4999056
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/09/23/11/29/antelope-canyon-457495_960_720.jpg"
            postText = arrayListOf(
                " מכל הסלעים כבדי המשקל שביקום ",
                " דווקא תפיסות עולם שלך  ",
                " חסרי המשקל ",
                " הם שמוחצים אותך. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28,10,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.2f
            videoUrl = "UcdYF5Z7TZM"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


*/
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
}