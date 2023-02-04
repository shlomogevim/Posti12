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
    /*fun loadPost4999060() {   //v
    val post = Post()
    with(post) {
        postNum = 4999060
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2020/08/15/08/24/aircraft-5489944_960_720.jpg"
        postText = arrayListOf(
            " אף אחד לא יוכל להאשים אותך ",
            " שלא הצלחת להמריא בחיים האלה,  ",
            " אפשר יהיה רק להאשים אותך ",
            " שלא העזת להגיע לקצה המסלול. "
        )
        postId = 87
        textLocation = arrayListOf(10,-1, 33,10,0, 0, 0, 0)
        postPadding = arrayListOf(5, 0, 5, 0)
        postTransparency =10
        postTextSize = arrayListOf(0, 16)
        val backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        lineSpacing = 1.3f
        videoUrl = "OctwWuivve8"
        videoText = util1.getPostExplanation(postNum, postText)
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost4999061() {
        val post = Post()
        with(post) {
            postNum = 4999061
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/17/16/10/fantasy-2861107_960_720.jpg"
            postText = arrayListOf(
                " מה שגיליתי עם הגיל ",
                " שכנראה בעתיד הקרוב  ",
                " אני לא אצליח להיות ",
                " משהו שיותר מבן אדם. "
            )
            postId = 87
            textLocation = arrayListOf(10,10, 33,-1,0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "WD8jbNHRujU"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999062() {
        val post = Post()
        with(post) {
            postNum = 4999062
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/04/17/26/there-is-no-1-1952547_960_720.jpg"
            postText = arrayListOf(
                " אני חושב ",
                " משמע אני תופס את עצמי קיים,  ",
                " אני לא חושב ",
                " אני קיים ללא שום תפיסה. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 33,10,0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "dGw3w_njQ4g"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999063() {
        val post = Post()
        with(post) {
            postNum = 4999063
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334_960_720.jpg"
            postText = arrayListOf(
                " לסבול בחיים ",
                " זו ברירת מחדל, ",
                " להינות ",
                " זו בחירה מודעת. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 33,10,0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "YYOKMUTTDdA"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999064() {
        val post = Post()
        with(post) {
            postNum = 4999064
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/06/29/22/45/wheat-3506758_960_720.jpg"
            postText = arrayListOf(
                " אתה יכול למדוד עכשיו ",
                " כמה השתנת מפעם, ",
                "  לפי כמה אתה מובך עכשיו ",
                " ממה שהיית פעם. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 33,10,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing = 1.3f
            videoUrl = "KLVq0IAzh1A"
//            videoText = util1.getPostExplanation(postNum, postText)
            val postText1= arrayListOf("0.9")
            videoText = util1.getPostExplanation(postNum, postText1)
      }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999065() {
        val post = Post()
        with(post) {
            postNum = 4999065
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/11/19/09/35/forest-7601671_960_720.jpg"
            postText = arrayListOf(
                " התודעה צריכה התחדשות ",
                " הנשמה יצירה ",
                "  הגוף יציבות ",
                " והאדם צריך כושר להודות בטוב. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "fPGimPUUiTs"
              videoText = util1.getPostExplanation(postNum, postText)
         }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999066() {
        val post = Post()
        with(post) {
            postNum = 4999066
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/12/07/16/07/palm-7641522_960_720.jpg"
            postText = arrayListOf(
                " יש אזורי חיים נרחבים ",
                "מעבר לתחום המחשבות שלך על החיים",
                "  אין לך כל כך קשר עם האזורים האלה ",
                " סתם בגלל שהם לא בסיבוב היומי שלך. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#DCE2F0"
            val textColor = "#50586C"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl = "RM-rr0L7luE"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

}*/
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