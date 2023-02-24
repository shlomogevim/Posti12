package com.sg.posti10.posts

import com.sg.posti10.*

class Posts4Lines {
    val util=Utility()
    val tool=Tools()
     val demi=DemiPost()
    var margin=0
    fun loadPost400(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/21/11/39/running-4782722_1280.jpg"
            postText = arrayListOf(
                "  על תהיה הכי טוב  ",
                "  זה לא יצליח לך לאורך זמן,  ",
                " לך על משהו יותר ממשי  ",
                "  תהיה הכי אתה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost401(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/01/09/22/24/guy-playing-billiard-1967834_1280.jpg"
            postText = arrayListOf(
                " הבלים הם דברים אמיתיים, ",
                " מה שהופך אותם להבלים לגביך ",
                " זו היכולת שלהם ",
                " למנוע ממך להתפתח. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost402(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/25/09/28/woman-4792042_1280.jpg"
            postText = arrayListOf(
                " פסימיות ",
                " זה לחשוב שיש מישהו מאושר ממך, ",
                " אופטימיות ",
                " זה להבין שאין אחד כזה. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost403(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/01/09/15/art-1428646_1280.jpg"
            postText = arrayListOf(
                " האויב של הטוב ",
                " הוא הטוב יותר, ",
                " האויב של הרגע ",
                " הוא הרגע הבא. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=60
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost404(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/03/19/06/teddy-2711675_960_720.jpg"
            postText = arrayListOf(
                " האנשים ",
                " חיים כדרכם ",
                " מתוך תא הכלא ",
                "  של מה שהם חושבים שהם.  "
            )
            postTransparency =8
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
    fun loadPost405(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/12/16/21/58/tv-5837826_1280.jpg"
            postText = arrayListOf(
                "  וגם באם תגיע לאור,  ",
                " אחרי חצי שעה תקום לראות טלוויזיה, ",
                "  כי מתחיל האח הגדול  ",
                "  ויש הדחה כפולה.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost406(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/29/20/48/cemetery-2456173_1280.jpg"
            postText = arrayListOf(
                " ישנם אנשים קרובים ",
                "  שבהלוויה שלהם,  ",
                " אתה פחות סופד להם ",
                "  ויותר לעצמך.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost407(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/11/24/17/36/magic-5773359_1280.png"
            val s1 = "\""
            val s2 = "\""
            val s12 = " פוליטיקלי קורקט "
            postText = arrayListOf(
                "$s1$s12$s2",
                "  זה היכולת של האדם  ",
                "  לקרוא ליום לילה וללילה יום  ",
                "  בשם האמונות שלו.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=27
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost408(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/10/10/07/48/beach-2836300_1280.jpg"
            postText = arrayListOf(
                "  שיחות עם הים  ",
                "כמו רוב השיחות עם בני האדם,",
                "  לא יצאת חכם יותר  ",
                "אבל לפחות אמרת את מה שאתה חושב."
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost409(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/11/20/05/15/car-6810885_1280.jpg"
            postText = arrayListOf(
                "  השאלה היא פחות:  ",
                " מה קורה כאן, ",
                "  ויותר, איפה אני בכל  ",
                " מה שקורה כאן. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost410(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/12/11/12/42/river-1899328_1280.jpg"
            postText = arrayListOf(
                "  את האיזורים הרדודים בעולם  ",
                "  אתה לא יכול להאשים ברדידות, ",
                "  אתה יכול להאשים רק את עצמך  ",
                " שאתה נמצא יותר מידי זמן באיזורים האלה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=20
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost411(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/06/10/54/sad-2042536_1280.jpg"
            postText = arrayListOf(
                " החיים שלך זה כמו השיער ",
                " יש ימים שהם מסתדרים לך, ",
                "ואז אתה מרגיש טוב עם עצמך",
                " ויש ימים שלא. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=32
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost412(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/02/24/16/56/beach-16698_1280.jpg"
            postText = arrayListOf(
                " תן לי את הכישרון ",
                "   לראות הבלים כהבלים, ",
                "  עם האמת הפשוטה  ",
                " אני כבר אסתדר. "
            )
            postTransparency =7
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
    fun loadPost413(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/19/old-man-1749360_1280.jpg"
            postText = arrayListOf(
                "  לא השתנת, ",
                "תמיד היית בנוי מאותם חומרים,",
                " רק שעם הגיל ",
                "אתה משתמש בהם קצת אחרת."
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
    fun loadPost414(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/06/08/27/religion-3727463__480.jpg"
            postText = arrayListOf(
                "  גבולות העולם שלך די קבועים,  ",
                "  ככה  ",
                "  שכמה שהאלוהות שבך יותר גדולה,  ",
                "  הבעיות האישיות שלך יותר קטנות.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost415(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/12/13/36/soder-3742220_1280.jpg"
            postText = arrayListOf(
                " להתעצבן בגלל פוליטיקה  ",
                " זה מותרות  ",
                "  שרק למי שיש חיי נצח  ",
                "  יכול להרשות לעצמו.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost416(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/04/26/23/46/morning-2264051_1280.jpg"
            postText = arrayListOf(
                "לא היית יכול",
                "לחיות את חייך אחרת,",
                "פשוט",
                "כי אתה כזה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost417(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/37/the-sun-3057625_1280.jpg"
            postText = arrayListOf(
                "בחיים האלה",
                "אתה יכול לחיות בכאילו,",
                "אבל בכל מקרה",
                "בסוף תמות באמת."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost418(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg"
            postText = arrayListOf(
                "  החיים גדולים עליך בכמה מספרים,  ",
                "  ובגלל זה   ",
                "  אתה מסתפק בסיפורים על החיים  ",
                "   שיש אצלך בראש.   "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost419(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/06/51/people-1560569_1280.jpg"
            postText = arrayListOf(
                "  החיים האלה זה סוג של משחק,  ",
                "  נכון מתים בסוף המשחק הזה   ",
                "  אבל כדי להנות ממנו   ",
                "  אתה צריך להיות קצת ילד.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=26
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost420(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2010/12/13/09/50/jute-1655_1280.jpg"
            postText = arrayListOf(
                "  ישנם בעיות אמיתיות  ",
                "  וישנם בעיות דמי,   ",
                "  העוול הגדול שהאדם עושה לעצמו  ",
                "  הוא לשים את כל הבעיות באותו שק.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=50
            val colorIndex=26
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost421(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/25/11/49/sea-859517_1280.jpg"
            postText = arrayListOf(
                "חבל להתעצבן היום על דברים,",
                "שאתה בלי בעיות ",
                "יכול להתעצבן עליהם",
                " גם מחר. "
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
    fun loadPost422(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/26/02/47/man-2442565_1280.jpg"
            postText = arrayListOf(
                "האושר",
                "הוא תוצר לוואי",
                "  למעשים הנכונים לך  ",
                "שאתה עושה."
            )
            postTransparency =0
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
    fun loadPost423(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/07/08/46/city-2601562_1280.jpg"
            postText = arrayListOf(
                "  חוסר שפיות  ",
                "  זה לחיות את הטירוף שלך,  ",
                "  שפיות  ",
                "  זה לחיות את הטירוף של הכלל.  "
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
    fun loadPost424(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/05/11/01/airport-2373727_1280.jpg"
            postText = arrayListOf(
                "  אנשים נוסעים לפה  ",
                "  אנשים נוסעים לשם,  ",
                "    אבל בסוף    ",
                "  תמיד הם פוגשים בעיקר את עצמם.  "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost425(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/26/05/33/character-1161955_1280.jpg"
            postText = arrayListOf(
                "  אומנם  ",
                "  אתה רואה את החיים כמו שהם  ",
                "  אבל  ",
                "  תופס אותם כמו שאתה.  "
            )
            postTransparency =5
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
    fun loadPost426(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/20/15/55/flame-5068748_1280.jpg"
            postText = arrayListOf(
                "להביא חושך בחשכה",
                "כל אחד יכול,",
                "להביא אור בחשכה",
                "זה קצת יותר ייחודי."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost427(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין שאתה בסדר."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost428(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/15/20/53/man-1394395_960_720.jpg"
            postText = arrayListOf(
                "  כשאתה סימן שאלה  ",
                "  תשובה אמיתית יכולה לעזור לך להתיישר,  ",
                "  אבל לרוב אתה סימן קריאה  ",
                "  והתשובה האמיתית מחליקה עליך ונעלמת.  "
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
    fun loadPost429(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/16/17/41/boy-2756201_1280.jpg"
            postText = arrayListOf(
                "  החיים הם כמו משחק שח,",
                " אתה יכול לדעת את כל הכללים,  ",
                " אבל זה ממש לא עוזר לך ",
                "  לדעת לשחק את המשחק הזה.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=37
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost430(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/10/31/11/42/cup-4591710_1280.jpg"
            postText = arrayListOf(
                "  גם  ",
                " שמדברים כל הזמן על החצי כוס הריקה, ",
                "  זה  ",
                "  לא עושה אותה יותר מחצי כוס.  "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost431(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/04/23/02/candle-2038736_1280.jpg"
            postText = arrayListOf(
                "בכאן ועכשיו",
                "או שאתה אור,",
                "או שאתה חושך,",
                "ככה פשוט."
            )
            postTransparency =0
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
    fun loadPost432(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/27/17/42/man-1283235_1280.jpg"
            postText = arrayListOf(
                " זה שאני חי כל כך הרבה שנים ",
                " זה לא אומר שיש לי כישורים מיוחדים לעשות את זה, ",
                " זה אומר רק שלא נהרגתי אפילו פעם אחת ",
                " ושאני יודע לקום בבוקר. "
            )
            postTransparency =5
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
    fun loadPost433(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/04/12/school-1822566_1280.jpg"
            postText = arrayListOf(
                " תהיה ",
                " יותר עצמך ",
                " כי אין לך משהו אחר ",
                " להיות. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost434(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/06/19/43/african-2722733_1280.jpg"
            postText = arrayListOf(
                " האדם הוא יצור מוזר, ",
                "גם אם היו נותנים לו להיות  בגן העדן",
                "  הוא היה  פותח חדשות  ",
                " כדי לשמוע מה קורה בגיהנום. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost435(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365_1280.jpg"
            postText = arrayListOf(
                "  להצליח בחיים ",
                " זה לא למות ",
                "  ולא מבחוץ  ",
                "  ולא מבפנים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost436(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/27/00/50/male-3775700_1280.jpg"
            postText = arrayListOf(
                " בשבח השתיקה ",
                " בשבח חוסר התגובה, ",
                " שיעבור עלי ",
                " שיעבור. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost437(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/03/19/07/56/tavern-6106835_1280.jpg"
            postText = arrayListOf(
                " הבלים הם חלק מהחיים ",
                " ואין בהם כל בעיה, ",
                " כל זמן ",
                " שאתה תופס אותם כהבלים."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=29
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost438(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/09/17/12/54/landscape-4483412_1280.jpg"
            postText = arrayListOf(
                " שאתה קטן ",
                " כל גרגר מוחץ אותך, ",
                " שאתה גדול  ",
                "  זה סתם אבק ברוח. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost439(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/12/03/15/42/boy-555577_1280.jpg"
            postText = arrayListOf(
                " ביקורת רעה על העולם ",
                " זה הרבה יותר מביקורת, ",
                " זה הופך את החיים שלך ",
                " להצגה כושלת."
            )
            postTransparency =2
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost440(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/30/19/54/beach-1631874_960_720.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                " דברים שאין לך  ",
                " אלו דברים ",
                " שאתה מאמין שאין לך. "
            )
            postTransparency =2
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost441(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/11/13/23/06/tree-6792528_1280.jpg"
            postText = arrayListOf(
                " התסכול שבך ",
                " נגמר בקצה המודעות שלך,  ",
                " העולם ממשיך להיות ",
                " הרבה מעבר לזה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost442(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/04/09/34/crawl-1076324_1280.jpg"
            postText = arrayListOf(
                " האמנות הזו ",
                "  להשתתף רק בוויכוחים  ",
                " שנכונים לך, ",
                "  שמורה למתי מעט.  "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost443(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/11/02/09/15/man-513529_1280.jpg"
            postText = arrayListOf(
                " כל אדם ",
                "  מייצר את הסבל האנושי שלו,  ",
                " העולם סביב ",
                "  רק בורא את החומרים לזה.  "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost444(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/01/23/55/telephone-586266_1280.jpg"
            postText = arrayListOf(
                " האדם הוא יצור די טמבל, ",
                "  המזל שלו  ",
                " שלא צריך להיות חכם גדול ",
                "  כדי לחיות בעולם הזה.  "
            )
            postTransparency =0
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
    fun loadPost445(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/04/06/16/18/passover-4107705_1280.jpg"
            postText = arrayListOf(
                " רוב האנשים יודעים לאמץ מסגרות ",
                " חלקם יודעים אפילו ליצור אותם ",
                " אבל רק מעטים  ",
                " יודעים לתת בהם תוכן. "
            )
            postTransparency =8
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
    fun loadPost446(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/07/01/trouble-4656179_1280.jpg"
            postText = arrayListOf(
                " כל החכמה בחיים האלה ",
                " זה להשתדל ",
                " שלא ליצור בעיות  ",
                " איפה שהן לא קיימות. "
            )
            postTransparency =8
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
    fun loadPost447(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/08/20/29/chess-2730034_1280.jpg"
            postText = arrayListOf(
                " אותה אמת ",
                "שאתה די בטוח בה שהיא אמת",
                " בדרך כלל  ",
                " מונעת ממך לדעת את האמת. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost448(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/18/20/11/old-man-1147288_1280.jpg"
            postText = arrayListOf(
                " המוות לא קיים ",
                "החיים נמשכים לעד,",
                " רק שאתה מרגע מסוים  ",
                " לא תשתתף בהם יותר. "
            )
            postTransparency =5
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
    fun loadPost449(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/02/13/20/49/old-man-7788342_960_720.jpg"
            postText = arrayListOf(
                "  אין חדש תחת השמש ",
                " וטוב שכך ",
                " בגלל שגם עם הישן  ",
                " קשה לי להסתדר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=27
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
   fun loadPost450(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/01/16/48/cube-2908605_1280.jpg"
            postText = arrayListOf(
                "  אל תתייאש, ",
                " לפעמים הפתרון ",
                " עובר דרך איזורים   ",
                " שניראים לך כחסרי פתרון. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=26
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost451(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/27/20/38/girl-1357485_1280.jpg"
            postText = arrayListOf(
                "  אתה יכול לעשות הרבה דברים ",
                " עם החיים שלך, ",
                " והכי טוב  ",
                " זה לחיות אותם.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost452(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/15/17/pokemon-1548194_1280.jpg"
            postText = arrayListOf(
                "  בעידן המודרני ",
                " קומץ קטן של ממציאים גאונים ",
                "  מאפשרים לשאר האנושות  ",
                "  לשקוע בטמטום גמור.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost453(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/09/12/16/apples-1506119_1280.jpg"
            postText = arrayListOf(
                "  אם לא הייתי ",
                " מפריע כל כך לעצמי ",
                " וודאי שהייתי  ",
                "יכול להנות הרבה יותר מהחיים האלה."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost454(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/03/river-219972_1280.jpg"
            postText = arrayListOf(
                "  חוסר המנוחה הבסיסי שיש לאדם ",
                " נובע מהחיים עצמם ",
                " שאינם אגם קפוא  ",
                " אלא נהר זורם. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,15)
            margin=30
            val colorIndex=37
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost455(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/20/15/girl-1562025_1280.jpg"
            postText = arrayListOf(
                "  למודעות שלך יש קיבולת מוגבלת, ",
                " על כל קורטוב הבלים שאתה מאמץ ",
                " קורטוב קדושה חומק ממך  ",
                "  בעיקר בגלל חוסר מקום. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=19
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost456(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/03/09/17/fog-1494431_1280.jpg"
            postText = arrayListOf(
                " האמת ",
                " לא הולכת אף פעם לאיבוד, ",
                " היא רק מתגלית לך  ",
                "  כל פעם מחדש. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost457(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/09/23/45/soldier-1447008_1280.jpg"
            postText = arrayListOf(
                " על דבר אחד בטוח שלא תסלח לעצמך, ",
                " על שבזבת את עצמך ",
                " במלחמות סרק  ",
                "  שהיו קיימות רק בראש שלך. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=27
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost458(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/19/12/14/train-3758523_1280.jpg"
            postText = arrayListOf(
                " החיים לא מתכוונים לפגוע בך אישית ",
                " הם מתנהלים בדרכם, ",
                " רק שאתה לפעמים עומד להם  ",
                "  באמצע אותה דרך. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost459(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/06/10/12/adult-3064693_1280.jpg"
            postText = arrayListOf(
                " גובה  ההר נמדד ",
                " מהמפלס שבו הוא מתחיל להתרומם, ",
                " השמחה שלך נמדדת  ",
                " ממפלס הצער בו היית. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=27
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost460(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/05/05/12/12/coffee-5132832_1280.jpg"
            postText = arrayListOf(
                " בבוקרו של יום חדש ",
                " מעט אנשים מוצאים באמת את עצמם, ",
                " היתר משחקים את הדמות שלהם  ",
                " כמו שהם מכירים אותה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=33
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost461(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646_1280.jpg"
            postText = arrayListOf(
                " העולם גדול ורחב, ",
                " אבל אתה קולט בו רק את אותו חלק ",
                " שאפשרי לך  ",
                " בתור מה שאתה ברגע זה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost462(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/01/18/20/15/rain-3940580_1280.jpg"
            postText = arrayListOf(
                " הוצאתי פטור ",
                " שלא להתעסק בעגמות נפש ",
                " עד יום שלישי הבא,  ",
                " איזה כיף. "
            )
            postTransparency =5
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
    fun loadPost463(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/02/20/19/20/buddha-1212620_1280.jpg"
            postText = arrayListOf(
                "  אם האדם היה ממש מבין ",
                " עד כמה הוא מטבעו טמבל, ",
                " הוא לא היה מתבייש בזה בכלל  ",
                " אלא צוחק על זה בפה מלא. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost464(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/10/21/10/05/saint-198958_1280.jpg"
            postText = arrayListOf(
                "  האלוהים לא שם באופן קבוע ",
                " אתה צריך ליצור אותו כל בוקר, ",
                " ובאם לא תיצור אותו ",
                " הוא לא יברא אותך מחדש. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost465(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://images.unsplash.com/photo-1530071698688-1e4c30e1ea52?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=433&q=80"
            postText = arrayListOf(
                "  הכל יחסי בעולם הזה ",
                " חוץ מאותה המחשבה שיש לך בראש, ",
                " כי היא היחידה ",
                " הקיימת בעולם שלך ברגע זה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost466(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/08/13/03/21/family-3602245_1280.jpg"
            postText = arrayListOf(
                "  יש הרבה אנשים שחיים חיים טובים ",
                " והם בכלל לא יודעים את זה ",
                " אולי בגלל  שלא הודיעו להם רשמית ",
                " שיש להם חיים טובים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost467(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/02/23/52/bag-1565402_1280.jpg"
            postText = arrayListOf(
                "  אתה יודע מה קורה בחיים שלך ",
                " אבל לא ממש מכיר אותם, ",
                " באיזשהו מקום קצת חבל ",
                " כי הם יכולים להיות די נחמדים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost468(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/08/19/05/53/asleep-5500058_1280.jpg"
            postText = arrayListOf(
                "  בסוף היום ",
                " גם מי שעשה המון ",
                " וגם מי שלא עשה דבר ",
                " הולכים לישון עייפים. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost469(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/04/27/20/17/dandelion-2266558_1280.jpg"
            postText = arrayListOf(
                " הרוחות הרעות מנשבות מקצה עולם עד קצהו ",
                " ואין לך סיכוי שהם לא יכו בך מדי פעם על הפנים, ",
                " הרוחות הטובות מנשבות רק במקומות ספורים ",
                " וצריך התכוונות לטוב כדי להרגיש אותם. "
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
    fun loadPost470(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/29/17/50/teddy-1113160_1280.jpg"
            postText = arrayListOf(
                "  להבין ולקבל את החיפוש לנחמה ",
                " זו חצי נחמה, ",
                " החצי השני ",
                " זה לדעת שהיא כבר פה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=86
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost471(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/07/13/02/25/man-4333898_1280.jpg"
            postText = arrayListOf(
                "  להיות אופטימי  ",
                " זה להרגיש טוב יותר ברגע זה ",
                " על חשבון עתיד לא ידוע, ",
                " אז למה לא ... "
            )
            postTransparency =10
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
    fun loadPost472(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/29/12/07/adult-2693054_960_720.jpg"
            postText = arrayListOf(
                "  אל תבלף  ",
                " איפה שממש לא הכרחי, ",
                " ואם כבר הכרחי ",
                " עשה את זה בטעם. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=87
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost473(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/01/29/18/05/burger-3962997_1280.jpg"
            postText = arrayListOf(
                "  טעויות  ",
                " שאתה מוכן לשלם עליהן, ",
                " אינם טעויות ",
                " אלא דרך חיים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=76
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost474(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/12/02/03/08/people-talking-1876726_1280.jpg"
            postText = arrayListOf(
                "אם אתה לא יודע להתלוצץ על עצמך",
                " אז אין לך חוש הומור כלל וכלל, ",
                " כי אנשים עם הומור ",
                "  מבינים בדיחה טובה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost475(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/02/16/02/03/pocket-watch-3156771_1280.jpg"
            postText = arrayListOf(
                " שעון מקולקל ",
                " צודק לפחות פעמיים ביום, ",
                " שעון תקין ",
                " יכול לטעות תמיד. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=83
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost476(): Post {
        var post = Post()
        with(post) {
            imageUri =
                "https://cdn.pixabay.com/photo/2015/12/17/14/40/jewish-cemetery-1097409_1280.jpg"
            postText = arrayListOf(
                " שאתה מת ",
                " בטוח שאתה מת, ",
                " שאתה חי ",
                "   לא תמיד בטוח שאתה חי. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=25
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost477(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/29/11/29/nepal-2184940_1280.jpg"
            postText = arrayListOf(
                " מה הם החיים ? ",
                " זו שאלה פתוחה ",
                " שכל תשובה לה ",
                " מקטינה את החיים. "
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
    fun loadPost478(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/12/29/11/04/girl-3047297_1280.jpg"
            postText = arrayListOf(
                " הכושר הזה להכניס את עצמך לבאסה ",
                " מכל צל צילה של מחשבה עוברת ",
                " הוא צורך הכרחי ",
                " אם אתה רוצה לחיות באיזורי הגיהינום. "
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
    fun loadPost479(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/16/12/53/sad-4207079_1280.jpg"
            postText = arrayListOf(
                " לפעמים  ",
                " הבעיה של האדם ",
                " היא רק אותה המחשבה ",
                " שיש לו בעיה. "
            )
            postTransparency =0
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
    fun loadPost480(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/04/05/11/40/punch-316605_1280.jpg"
            postText = arrayListOf(
                "  אומנם הרבה השתנה  ",
                "  מאז אבותיי הפרה היסטוריים  ",
                "  אבל הכעס שלו והכעס שלי  ",
                " דומים להפליא. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost481(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/12/10/37/sunset-5033708_1280.jpg"
            postText = arrayListOf(
                "  כולם חושבים את אותם הדברים  ",
                "  אבל מעטים יודעים את זה,  ",
                "  אם יותר אנשים היו מודעים לזה  ",
                " הייתה פחות בדידות בעולם. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost482(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/12/11/18/11/storm-4688918_1280.jpg"
            postText = arrayListOf(
                "  למצא פתרון לבעיה שלא קיימת  ",
                "  זה אפשרי אבל ממש לא מעשי,  ",
                "  אחת מהבעיות האלה היא  ",
                " משמעות החיים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=17
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost483(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/07/29/21/27/filming-4371566_1280.jpg"
            postText = arrayListOf(
                "  החיים שלך  ",
                "  זו הפקה די בינונית של חי אדם,  ",
                "  המבוססת על מקרה אמיתי  ",
                " של מה שקרה לך. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=17
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost484(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/12/15/20/17/cleaning-1909978_1280.jpg"
            postText = arrayListOf(
                "  מוטב לעשות  ",
                "  את מה שאתה יכול לעשות,  ",
                " מלהתבכיין ",
                " על מה שאתה לא יכול לעשות. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=25
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost485(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/09/27/23/34/water-3708190_1280.jpg"
            postText = arrayListOf(
                " חצי הכוס הריקה ",
                "  הוא המקום היחידי  ",
                " בו אפשרי לך ",
                " ליצור יש מהאין. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost486(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/32/hands-1850223_1280.jpg"
            postText = arrayListOf(
                " טעות היא לחשוב ",
                "  שהאדם רוצה יחס,  ",
                " היחס הוא חלק מהאדם עצמו ",
                "  וללא יחס הוא מרגיש חסר.  "
            )
            postTransparency =7
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
    fun loadPost487(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/24/05/38/tunisia-4789342_1280.jpg"
            postText = arrayListOf(
                " הקסם בחיים  ",
                "  הוא דבק  ",
                " שמחבר בין הדברים שקורים ",
                "  לידי חוויה אישית. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=40
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost488(): Post {
 var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/10/14/18/19/senior-4549666_1280.jpg"
        postText = arrayListOf(
            " אתה חי עם החיים שלך כבר המון שנים  ",
            " ולא ממש מכיר אותם,  ",
            " זה מרגיש יותר כמו נישואי נוחות ",
            "  מסיפור אהבה. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=53
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost489(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2013/02/05/21/05/running-78192_1280.jpg"
        postText = arrayListOf(
            " המפסידים בחיים ",
            " אלה אינם אלה שהגיעו במקומות האחרונים,  ",
            " אלה אותם ",
            "  שלא משתתפים. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=39
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost490(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/01/27/04/32/books-1163695_960_720.jpg"
        postText = arrayListOf(
            " יש מי שנותן לסיפור החיים שלו   ",
            "  ליצור את החיים שלו,  ",
            " ויש מי שנותן לחיים שלו ",
            "  ליצור את סיפור החיים שלו.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=37
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

fun loadPost4_900(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/07/dog-1854123_1280.jpg"
        postText = arrayListOf(
            " הים הגדול ממשיך עד מעבר לאופק  ",
            " אבל הצעקות של השכנה שמדברת בפלאפון  ",
            " ממלאות לי את כל חלל המודעות ",
            "  כי אני יצור שבנוי ברובו לעיסוק בהבלים.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=30
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_901(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/04/29/01/23/skin-3358873_1280.jpg"
        postText = arrayListOf(
            " החיים שלך  ",
            " זה לא מה שקורה לך, ",
            " אלא ",
            "  מה שאתה מבין מכל מזה.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=30
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

    fun loadPost4_902(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/29/04/17/bonfire-1867275_1280.jpg"
        postText = arrayListOf(
            " הפייסבוק   ",
            " זאת מדורת השבט המודרנית, ",
            " רחוק מידי תתקרר ",
            "  קרוב מידי תישרף.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_903(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/03/07/20/45/cog-wheels-2125169_1280.jpg"
        postText = arrayListOf(
            " האדם מכיר את עצמו  ",
            " ומכיר את העולם ",
            " אבל הוא לא מסוגל להבין ",
            "  איך זה עובד ביחד.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=14
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_904(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/10/27/15/52/jaguar-2894706_1280.jpg"
        postText = arrayListOf(
            " ככול שההישרדות היומיומית של האדם  ",
            " מתנוונת  עם הקדמה הטכנולוגית,  ",
            " הכשרון  לבזבז את החיים שלו ",
            "  מתפתח אצלו לרמה מרשימה.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_905(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2017/10/03/07/23/elephant-calf-2811487_1280.jpg"
        postText = arrayListOf(
            " האדם נמצא בדרך כלל  ",
            "  במקום שבטוח לו להיות שם,  ",
            "  לא תמיד  ",
            "  זה המקום שהכי טוב בשבילו.  "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=16
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_906(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/02/21/18/15/wall-644468_1280.jpg"
        postText = arrayListOf(
            " אתה יכול להבין    ",
            " את המגבלה שלך בתור בן אנוש,  ",
            " אבל ההבנה הזאת בדרך כלל  ",
            "  לא תחלץ אותך מתוך המגבלה הזו.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,15)
        margin=10
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_907(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2016/08/23/15/52/fresh-orange-juice-1614822_1280.jpg"
        postText = arrayListOf(
            " האדם יוצר את הבעיות שלו  ",
            " מתוך העולם שסביבו, ",
            " הוא לא ממציא עובדות חדשות למציאות  ",
            "  אלא פשוט מרכיב אותם שלא בסדר הנכון. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=13
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_908(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2021/08/02/11/03/hallelujah-6516410_1280.jpg"
        postText = arrayListOf(
            " החיים בטבעם חסרי משמעות  ",
            " וטוב שכך,  ",
            " ככה נשאר לאדם מרחב נקי  ",
            "  ליצור את המשמעות שלו בחיים.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=10
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_909(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/11/08/16/57/road-5724397_1280.jpg"
        postText = arrayListOf(
            " הדרך הנכונה בשבילך  ",
            " בנויה מאבנים רגילות,  ",
            " מה שבכל זאת מייחד אותה ",
            "  שהיא הדרך הנכונה בשבילך.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=30
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

    fun loadPost4_910(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/06/05/08/50/train-2373323_1280.jpg"
        postText = arrayListOf(
            " אל תיקח את החיים האלה  ",
            " בצורה כל כך אישית, ",
            " אחרי הכל ",
            "  כולם משתמשים בהם.  "
        )
        postTransparency =6
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=34
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

    fun loadPost4_911(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/08/24/02/05/time-425818_1280.jpg"
        postText = arrayListOf(
            " ההבדל בין  ",
            " רגע בחיים לחיים כולם, ",
            " שהרגע עובר לפעמים ",
            "  הרבה יותר לאט.  "
        )
        postTransparency =4
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=10
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_912(): Post {    //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/07/27/00/41/homeless-861899_1280.jpg"
        postText = arrayListOf(
            " תפיסות ישנות ",
            " טובות בשביל להסתדר בעולם  ",
            " אבל הן פחות טובות ",
            "  בשביל לחוות אותו מחדש.  "
        )
        postTransparency =4
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=10
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

fun loadPost4_913(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/11/06/11/32/girl-1026246_1280.jpg"
        postText = arrayListOf(
            " האדם יכול להיות בטוב ",
            " והוא לא יידע מזה, ",
            " וזאת בגלל שכל תשומת הלב שלו ",
            "  מכוונת להתמודדות עם הרע.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=30
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_914(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/11/29/19/25/morning-1069218_1280.jpg"
        postText = arrayListOf(
            "   לא מתבאס שהעולם הזה קצת עקום  ",
            " שיתבאס מי שיצר אותו כזה,  ",
            "   לא אחראי על כל זה ",
            "  אני באתי הנה רק לביקור קצר.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=24
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_915(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/01/25/11/18/girl-3954232_1280.jpg"
        postText = arrayListOf(
            " אנשים נוסעים למקומות אחרים  ",
            " שלא כל כך כדי להיות שם,  ",
            " כמו שלא להישאר כאן ",
            "  לבד עם עצמם.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_916(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/10/20/11/18/woman-495124_1280.jpg"
        postText = arrayListOf(
            " ואם כבר לכעוס ",
            "  עדיף על דברים מוצדקים,  ",
            " צדק ",
            "  הוא לא אחד מהם.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=41
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}

fun loadPost4_917(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439951_1280.jpg"
        postText = arrayListOf(
            " הנוחות ",
            "  היא תנאי חשוב  ",
            " לעודף משקל ",
            "  לא לשביעות רצון.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_918(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/10/09/00/21/netflix-3733812_1280.jpg"
        postText = arrayListOf(
            " טמטום חושים ",
            "  זו תחנה טובה לרדת בה,  ",
            " וזאת במידה  שאוטובוס המחשבות שלך ",
            "  לוקח אותך למחוזות אבודים.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5

        val colorIndex=25
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_919(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/19/14/39/girl-1839623_1280.jpg"
        postText = arrayListOf(
            "  אחרים כמעט ולא מזיקים לך  ",
            "  פשוט כי הם לא יכולים,  ",
            " ואתה לעומת זאת מזיק לעצמך חופשי ",
            "  כי אתה יכול.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0

        val colorIndex=36
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_920(): Post {  //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/05/09/03/47/deck-2297211_1280.jpg"
        postText = arrayListOf(
            " הכל טוב, ",
            "  הרע שאתה רואה  ",
            " זה רק הצל של המחשבה שלך ",
            "  על הטוב.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        lineSpacing=0.9f
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_921(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/04/10/12/07/monster-5025495_1280.jpg"
        postText = arrayListOf(
            " העולם הזה ",
            "  הוא שגעון אחד גדול,  ",
            " אל תיתן לאנשים יותר מידי שפויים ",
            "  להסביר לך אותו.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_922(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/11/03/18/26/man-2915187_1280.jpg"
        postText = arrayListOf(
            " הקריטריון היחידי לחיים טובים ",
            "  הוא רק  ",
            " אם האדם שחי אותם ",
            "  חושב שהם טובים.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        lineSpacing=0.9f
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,0.9f)
    }
    return post
}
fun loadPost4_923(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/03/27/21/37/sea-1284368_1280.jpg"
        postText = arrayListOf(
            " אם תהיה הרבה צודק ",
            "  זה יעלה לך בהרבה בריאות,  ",
            " אם תהיה קצת צודק  ",
            "  זה יעלה לך בקצת בריאות.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=2
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_924(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/09/10/17/18/book-1659717_1280.jpg"
        postText = arrayListOf(
            " חבל שאין כל כך קשר ",
            "  בין החיים בתאוריה לחיים למעשה  ",
            " כי אז היינו יכולים ללמוד משהו על החיים  ",
            "  במקום לקבל בראש בכל יום מחדש.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=2
        val colorIndex=23
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_925(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/11/20/10/15/person-1052696_1280.jpg"
        postText = arrayListOf(
            " כולנו דפוקים פחות או יותר, ",
            "  רק שיש כמה  ",
            " שמשתפים עם זה יותר פעולה  ",
            " ויש כמה שפחות.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=22
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_926(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/29/12/17/autumn-1869426_1280.jpg"
        postText = arrayListOf(
            " בבוקר של אחרי ההלוויה   ",
            "  קמנו כמו תמיד אבל היינו אחרים,  ",
            "  לא טובים יותר או רעים יותר  ",
            "  רק חסרים יותר.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_927(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/04/05/03/18/prayer-1308663_1280.jpg"
        postText = arrayListOf(
            " אמונה היא מעבר לאלוהים ",
            "  בגלל שאלוהים זו תפיסה מחשבתית כלשהי,  ",
            "  ( אלוהים הוא כזה או כזה )  ",
            "  אמונה זה משהו שמעבר לתפיסה הזו.  "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=45
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_928(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/04/15/11/47/man-4129126_1280.jpg"
        postText = arrayListOf(
            " זו שטות לבזבז את החיים האלה ",
            "  בלהיות בן אדם רציני ,  ",
            "  זה סתם מעיק עליך  ",
            "  ובדרך כלל לא משלמים לך על זה.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=53
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_929(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/04/18/11/30/nature-5058888_1280.jpg"
        postText = arrayListOf(
            " היחידי שיש לו אישור ",
            "  לחיות את החיים שלך לפי הבנתך  ",
            "  זה אתה,  ",
            "  חבל שאתה לא משתמש בו.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=56
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_930(): Post {   //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2012/12/24/08/39/sad-72217_1280.jpg"
        postText = arrayListOf(
            " המציאות הזו ",
            "  מכה אותנו לפעמים פה ושם,  ",
            "  אבל תפיסת המציאות שלנו  ",
            "  מתעללת בנו על בסיס קבוע.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_931(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/10/12/02/53/girl-1733341_1280.jpg"
        postText = arrayListOf(
            "  לחיות כל יום את אותם חיים, ",
            " לחשוב את אותם מחשבות באותה צורה, ",
            "  ולקוות למשהו חדש,  ",
            "  זה ממש לא בכיוון.  "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=47
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4_932(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2018/10/17/20/32/makeup-3754906_1280.jpg"
            postText = arrayListOf(
                "  השגרה שומרת את האדם ",
                "  להיות מי שהוא,  ",
                "  אבל מונעת ממנו  ",
                "  להיות מישהו אחר.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=40
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost4_933(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/11/07/23/17/chess-2928700_1280.jpg"
        postText = arrayListOf(
            "  יש בעיות שאין להן פתרון ",
            "  קוראים להן עובדות חיים,  ",
            "  חוסר היכולת שלך לקבל אותם  ",
            "  זו בעיה.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=38
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_934(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/10/14/14/50/senior-4549099_1280.jpg"
        postText = arrayListOf(
            "  לאדם קשה לחיות עם עצמו ",
            "  בעיקר בגלל פער מנטלי,  ",
            "  דרישות מוגזמות  ",
            "  וזוגיות חונקת.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=46
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_935(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2015/12/17/14/40/jewish-cemetery-1097409_1280.jpg"
        postText = arrayListOf(
            "  איפה הצדק, איפה, ",
            "  בסוף כולם מתים  ",
            "  גם אלה שצודקים  ",
            "  וגם אלה שלא.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=14
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_936(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014_1280.jpg"
        postText = arrayListOf(
            "  הפרח פורח במיטבו ",
            "  לא איפה שיש הכי הרבה מים  ",
            "  אלא  ",
            "  איפה שהכי מתאים לו.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=25
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_937(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/12/26/20/08/grandfather-5862273_1280.jpg"
        postText = arrayListOf(
            "  דפים מלאים ",
            "  טובים למספרי סיפורים  ",
            "  דפים ריקים  ",
            "  טובים ליוצרי מציאות.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=20
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_938(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/03/31/06/31/dog-3277416_1280.jpg"
        postText = arrayListOf(
            "  מי שנובח על כלב  ",
            " הוא כלב, ",
            "  מי שמתווכח עם שוטה ",
            "  הוא שוטה.  "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=26
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_939(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/05/16/10/06/loneliness-2317414_1280.jpg"
        postText = arrayListOf(
            "  כל עוגמות הנפש שלי   ",
            " קורות לי כי אני כזה, ",
            "  אם הייתי אחר  ",
            "  היו לי עוגמות נפש אחרות.  "
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
    fun loadPost4_940(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/07/22/bible-1868070_1280.jpg"
            postText = arrayListOf(
                "  שתהיה דף מלא   ",
                " מיום האתמול, ",
                "  ודף ריק  ",
                "  ליום המחר.  "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4_941(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/07/18/08/00/people-850097_1280.jpg"
        postText = arrayListOf(
            "  במידה והאדם היה רוצה   ",
            " את מה שהוא באמת צריך  ",
            " ולא את מה שאין לו כרגע, ",
            " הרבה מהבעיות שלו היו נעלמות. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=57
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4_942(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_1280.jpg"
            postText = arrayListOf(
                "  אין מתכון בדוק לחיים טובים  ",
                " כי הטוב הולך ובא, ",
                " אבל יש מתכון שכזה לחיים רעים  ",
                " פשוט תישאר ברע. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4_943(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri ="https://cdn.pixabay.com/photo/2018/09/14/22/51/cobblestones-3678292_960_720.jpg"
            postText = arrayListOf(
                " עדיף ללכת בדרך פחות נוחה ",
                " המובילה אותך לעצמך, ",
                " מללכת בדרך נוחה ",
                " המובילה אותך לשום מקום. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost4_944(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2015/06/01/00/20/man-792821_1280.jpg"
            postText = arrayListOf(
                " אתה החיים, ",
                " המודעות שלך ",
                " היא רק נקודת מבט זמנית ",
                " על החיים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=56
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4_945(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/11/01/10/35/street-5703332_1280.jpg"
        postText = arrayListOf(
            " כל כמה ",
            " שאתה מתרחק מעצמך, ",
            " ההמולה הזאת מסביב ",
            " רועשת יותר ויותר. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5

        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_946(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/29/06/18/home-office-1867759_960_720.jpg"
        postText = arrayListOf(
            " כל הקדמה הזאת מסביב ",
            " היא לא תתן לך תשובה אמיתית, ",
            " היא רק תשכיח ממך לרגע  ",
            " את השאלה האמיתית. "
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
fun loadPost4_947(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_960_720.jpg"
        postText = arrayListOf(
            " מה שבאמת קשה לך ",
            "  זה לא האנשים עצמם, ",
            " אלא  ",
            " היחס שלך לאנשים האלה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=12
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_948(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/01/27/09/58/man-613601_1280.jpg"
        postText = arrayListOf(
            " מה שקורה בחיים ",
            " זה מה שאני חושב שקורה בחיים, ",
            " ואם אתה חושב אחרת ",
            " החיים שלך קצת אחרים משלי. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_949(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/07/26/19/05/pokemon-1543556_1280.jpg"
        postText = arrayListOf(
            " המועקה האנושית ",
            " נובעת משתי סיבות: ",
            " מעודף אינפורמציה לא חיונית ",
            " וחוסר אינפורמציה חיונית. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=35
        val selector=2
        val fontFamily=1
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_950(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2011/12/13/14/31/earth-11015_960_720.jpg"
        postText = arrayListOf(
            "             אתה יצרת              ",
            " את כל הרע והטוב בעולם, ",
            " בלעדיך ",
            " זה היה רק עולם. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=10
        val selector=1
        val fontFamily=1
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_951(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285_1280.jpg"
        postText = arrayListOf(
            " שתהיה מספיק קרוב לים ",
            " כך שתוכל לראות אותו, ",
            " ומספיק רחוק ממנו ",
            " שלא תטבע בו. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=22
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_952(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/04/04/14/12/monitor-1307227_1280.jpg"
        postText = arrayListOf(
            " עולם הרייטינג עשוי כולו ",
            " מפולסים חשמליים ומכשירים דיגיטליים , ",
            " קשה להיתמך בהם פיסית ",
            " כשאתה מאבד שווי משקל באמצע הרחוב. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=79
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_953(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/12/16/21/58/tv-5837826_960_720.jpg"
        postText = arrayListOf(
            " אין עולם אחר ",
            " אבל יש תפיסה אחרת של העולם , ",
            " תפיסה שהיא פחות תוכנית ראליטי ",
            " ויותר מציאות. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=79
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_954(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/09/09/20/23/baby-933097_1280.jpg"
        postText = arrayListOf(
            " החיים שלך קורים ",
            " רק ברגע הזה , ",
            " שאר הזמנים ",
            " קורים רק בראש שלך. "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=69
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_955(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/01/28/02/24/japan-2014619_1280.jpg"
        postText = arrayListOf(
            " העולם סביבך נראה עולב רציני ",
            " כולו עשוי הבל ורעות רוח, ",
            " לא שהוא באמת כזה ",
            " אבל אתה כאדם תופס או ככזה.  "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=62
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_956(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/16/woman-1749355_1280.jpg"
        postText = arrayListOf(
            " ביקורת ",
            " זה חוסר השלמות שבחוסר השלמות, ",
            " אומנות ",
            " זה השלמות שבחוסר השלמות.  "
        )
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
fun loadPost4_957(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/29/08/58/hands-1868562_1280.jpg"
        postText = arrayListOf(
            " הכניסה לפרטים ",
            " לפעמים מרחיקה אותך מהדיוק, ",
            " ובמקרה שכזה  ",
            " עדיף לראות את כל הציור מרחוק. "
        )
        postTransparency =10
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

    fun loadPost4_958(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/10/07/17/40/woman-2827304_1280.jpg"
        postText = arrayListOf(
            " בחיים האלה אתה צריך ",
            " כסא שנוח לך לשבת בו ",
            " דרך פתוחה  ללכת בה  ",
            " ופטור גורף מהבלים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=36
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

fun loadPost4_959(): Post {   //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/02/18/21/18/people-3163556_1280.jpg"
        postText = arrayListOf(
            "  למעשה, ",
            " אנו לא רוצים לדעת את האמת ",
            " אלא רק להרגיש טוב עם עצמנו  ",
            " וברוב המקרים זה לא הולך ביחד. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=45
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_960(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2012/02/23/12/21/puzzle-16116_1280.jpg"
        postText = arrayListOf(
            " אמור לי ",
            " מה חסר לך בחיים, ",
            " ואומר לך  ",
            " מה יש לך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=33
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_961(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/08/28/17/17/girl-4437225_1280.jpg"
        postText = arrayListOf(
            " חשיבות האדם בשבילך, ",
            " היא לא לפי מה שהוא ",
            " אלא לפי  ",
            " החלק שהוא תופס בעולמך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=27
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_962(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/09/08/11/15/information-3662301_1280.jpg"
        postText = arrayListOf(
            " בדיחה בלי פואנטה ",
            " זה סתם סיפור, ",
            " חיים בלי טעם  ",
            " זה סתם לוחות זמנים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_963(): Post {  //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/02/08/13/43/woman-2048905_960_720.jpg"
        postText = arrayListOf(
            " שלב הבגרות של האדם מגיע ",
            " שהוא מפסיק  ",
            " להטריד את ההורים שלו  ",
            " ומסתפק בלהטריד את עצמו. "
        )
        postTransparency =10
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
fun loadPost4_964(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2020/07/27/13/03/rope-5442378_1280.jpg"
        postText = arrayListOf(
            " המגבלות של האדם ",
            " ברובם הגדול  ",
            " הם אלה  ",
            " שהאדם מטיל על עצמו. "
        )
        postTransparency =0
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
fun loadPost4_965(): Post {  //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2018/05/24/18/18/hohenstaufen-3427266_1280.jpg"
        postText = arrayListOf(
            " המשיח כבר כאן, ",
            " אבל משום מה ",
            " רוב האנשים  ",
            " רואים רק את החמור. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=36
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_966(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/01/06/16/14/woman-590490_1280.jpg"
        postText = arrayListOf(
            " מי שעושה שיר מהחיים שלך ",
            " זה בדרך כלל אנשים אחרים, ",
            " אתה עסוק יותר מידי  ",
            " בלהפיק אותם. "
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
fun loadPost4_967(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/07/10/11/15/balloons-388973_1280.jpg"
        postText = arrayListOf(
            " השוטה ",
            " הולך תמיד עם תחושת הבטן, ",
            " החכם  ",
            " רק במקרים מיוחדים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_968(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/09/16/01/03/girl-2754233_1280.jpg"
        postText = arrayListOf(
            " כדי לדעת באם האדם חי בטוב  ",
            " ממש לא משנה מה התנאים סביבו, ",
            " אלא  ",
            " איך הוא מתייחס אליהם. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_969(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365_1280.jpg"
        postText = arrayListOf(
            " חפש פחות  ",
            " את הטוב בעולם סביב, ",
            " ויותר את המקום בך ",
            " שממנו רואים את העולם בטוב. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=39
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_970(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/03/27/14/59/man-2179243_1280.jpg"
        postText = arrayListOf(
            " העולם מתנהל על פי דרכו, ",
            " דעתך על הדרך הזו ",
            " לא משנה דבר ",
            " חוץ מאת המצב רוח שלך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=39
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_971(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/09/27/17/35/dandelion-463928_1280.jpg"
        postText = arrayListOf(
            " תחשוב כבד ",
            " תשקע,  ",
            " תחשוב קל  ",
            " תעוף. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=37
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_972(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/11/14/05/29/girl-1822702_1280.jpg"
        postText = arrayListOf(
            " אתה מרגיש אומלל ",
            "  לא בגלל שאתה אומלל,  ",
            " אלא בגלל ",
            " שאתה מרגיש אומלל. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=37
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_973(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        val s1 = "\""
        val s2 = "\""
        val s12 = " אני רק בן אדם... "
        imageUri = "https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617_1280.jpg"
        postText = arrayListOf(
            "$s1$s12$s2",
            " זו סיבה מספיק טובה ",
            " להתנהל בחוסר הגיון ",
            " אם אתה בן אדם. "
        )
        postTransparency =0
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
fun loadPost4_974(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri =
            "https://cdn.pixabay.com/photo/2020/05/04/16/05/mckenzie-river-5129717_1280.jpg"
        postText = arrayListOf(
            " תזרים את עצמך ",
            " אחרת ",
            " תהיה ביצה ",
            " במקום נהר. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=36
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_975(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/06/25/17/36/rain-1479303_1280.jpg"
        postText = arrayListOf(
            " חוסר השלמות ",
            " סובלת מיחסי ציבור גרועים, ",
            " בחי היום יום שלה ",
            " היא השלמות בהתגלמותה. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_976(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/medieval-276019_1280.jpg"
        postText = arrayListOf(
            "  להסתדר בחיים ",
            " זה כשרון וקצת מזל, ",
            " לגעת בחיים ",
            " זו אומנות. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=40
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_977(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg"
        postText = arrayListOf(
            " מה שעושה לך טוב ",
            " זה לא הדברים עצמם, ",
            " אלא היכולת שלך ",
            " ליהנות מהם. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=36
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_978(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/06/14/20/40/frog-2403334_1280.jpg"
        postText = arrayListOf(
            " זה שהרבה חופפים את הראש שלהם ",
            " במי ביוב (המכונים פוליטיקה), ",
            " זה לא עושה את המים האלה ",
            " פחות מסריחים. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=32
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_979(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri ="https://cdn.pixabay.com/photo/2014/09/19/19/55/vernier-caliper-452987_1280.jpg"
        postText = arrayListOf(
            "השאיפה לדיוק",
            " יכולה להוות מכשול ",
            " באם אתה צריך ",
            " לפתור בעיות לא מדויקות. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_980(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2019/11/11/10/05/law-4617873_1280.jpg"
        postText = arrayListOf(
            " חוסר צדק כמו הקורונה ",
            " מסוכן רק לאנשים עם מחלות רקע ",
            " כמו אותם שמאמינים ",
            " בעקרון הצדק או בהגינות בסיסית. "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_981(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/07/18/17/34/lace-2516496_1280.jpg"
        postText = arrayListOf(
            " כולנו רקמה אנושית אחת ",
            " אמר המשורר, ",
            " התקשורת היא חלק ממנה ",
            " כמו שאתה חלק ממנה. "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=51
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_982(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/05/03/09/06/auto-3370743_1280.jpg"
        postText = arrayListOf(
            " אתה אומנם ",
            " חושב כמו כולם, ",
            " אבל בסוף הסופים ",
            " מת כמו שאתה. "
        )
        postTransparency =7
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_983(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/04/05/14/10/boat-3292934_1280.jpg"
        postText = arrayListOf(
            "בדרך כלל",
            "בני אדם מבינים ",
            " את הקונספט של החיים ",
            " רק שהם נוגעים במוות. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=51
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_984(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/02/21/08/42/rain-2085065_1280.jpg"
        postText = arrayListOf(
            " האדם הוא יצור בעייתי, ",
            " או שיש לו בעיות ",
            " או שאין לו בעיות ",
            " וזה בעיה בפני עצמה. "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=51
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_985(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2015/07/14/17/19/gorilla-845119_1280.jpg"
        postText = arrayListOf(
            "אל תתייחס לעצמך",
            " כל כך ברצינות,  ",
            " תשאיר את זה לאחרים ",
            " שממש לא יודעים מי אתה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=10
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_986(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/33/the-sun-3057622_1280.jpg"
        postText = arrayListOf(
            "תהיה מה שאתה,",
            " ואם אתה לא יודע  ",
            " מה שאתה עכשיו, ",
            " תהיה אי הידיעה. "
        )
        postTransparency =0
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
fun loadPost4_987(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/03/28/16/01/sad-2182545_1280.jpg"
        postText = arrayListOf(
            " שיהיה בך דו שיח פנימי ",
            " תרבותי ופורה, ",
            " ולא סתם ויכוחי סרק ",
            " וחלופי האשמות עקרים. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4_988(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2013/03/23/23/10/brush-96240_1280.jpg"
        postText = arrayListOf(
            "השאלה אינה ",
            " מה אתה ומי אתה, ",
            " אלא ",
            " מה אתה יוצר עם כל זה. "
        )
        postTransparency =0
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
fun loadPost4_989(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/02/03/15/40/landscape-3127859_1280.jpg"
        postText = arrayListOf(
            " תהנה מהדרך, ",
            " כי כשתגיע בסוף לקצה ",
            " לא תהיה לך אופציה שכזאת, ",
            " תהנה מהדרך. "
        )
        postTransparency =5
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
fun loadPost4990(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2012/12/19/18/12/scrapyard-70908_960_720.jpg"
        postText = arrayListOf(
            " התקשורת מייצרת מציאות ",
            " מערכת המשפט מייצרת צדק  ",
            " אתה מייצר תפיסת חיים, ",
            " וככה כל זה באמת נראה. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4991(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2018/04/15/18/47/work-3322460_1280.jpg"
        postText = arrayListOf(
            " יש מה שאתה חושב שצריך ",
            " ויש מה שקיים כרגע ",
            " האושר הרגעי שלך נמדד  ",
            " לפי הפער שביניהם. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=32
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4992(): Post {   //f
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/09/04/10/41/man-2713468_960_720.jpg"
        postText = arrayListOf(
            " חופש הבחירה היחידי הקיים ",
            " הוא באיזה צורה ",
            " אתה בוחר  ",
            " לדפוק את החיים שלך. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=32
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4993(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2016/10/14/00/08/old-man-1739154_960_720.jpg"
        postText = arrayListOf(
            " מה שאתה כרגע ",
            " זה בדיוק מה שיועדת להיות, ",
            " ומי שאומר לך אחרת ",
            " גם הוא יועד להיות כזה. "
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost4994(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2022/09/09/18/47/lake-7443622_960_720.jpg"
        postText = arrayListOf(
            " השתדל ",
            "  להטריד את עצמך ",
            " כמה שפחות ",
            " במה שאתה. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=34
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4995(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2020/04/21/17/54/jokers-5074032_960_720.jpg"
            postText = arrayListOf(
                " חוסר הטעם שלך ",
                " זו סוג של מחלה, ",
                " שפוגעת יותר בסובבים אותך ",
                " ופחות בך. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=14
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4996(): Post {
    var post = Post()
    with(post) {
        postNum= tool.extractPostNumFromFunctionName()
        imageUri = "https://cdn.pixabay.com/photo/2017/01/11/18/53/cold-1972619_960_720.jpg"
        postText = arrayListOf(
            " במלחמות פוליטיות ",
            " אתה נלחם על טובת הציבור כולו  ",
            " אבל בסופו של יום ",
            " זה משפיע רק על הבריאות שלך. "
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=22
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost4997(): Post {
        var post = Post()
        with(post) {
            postNum= tool.extractPostNumFromFunctionName()
            imageUri = "https://cdn.pixabay.com/photo/2022/08/27/11/50/flower-7414318_960_720.jpg"
            postText = arrayListOf(
                " הדברים שאתה צריך כרגע ",
                " כבר נמצאים אצלך,  ",
                " חוץ מאותה תודעה מבורכת ",
                " שיודעת את זה. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=21
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost4998(): Post {   //f
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
fun loadPost4_999(): Post {
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
    fun loadPost4_999_078(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/11/05/11/06/chain-1799916_960_720.jpg"
            postText = arrayListOf(
                " העבדים החדשים  ",
                " אלה אותם בני חורין ",
                "  שבחרו במודע להיות עבדים  ",
                " מתוך מה שהם. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=32
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }


}