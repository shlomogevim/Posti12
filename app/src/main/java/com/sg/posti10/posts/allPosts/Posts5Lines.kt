package com.sg.posti10.posts.allPosts

import com.sg.posti10.model.Post
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts5Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost500(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/12/02/20/26/till-eulenspiegel-3852068_1280.jpg"
            postText = arrayListOf(
                " ההבדל בין: ",
                "  טמבל רגיל  ",
                " לטמבל עם תואר של דוקטור, ",
                " הוא רק הכבוד ",
                " שאתה חולק לכל אחד מהם. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost501(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2020/03/01/07/25/remote-control-4891936_1280.jpg"
            postText = arrayListOf(
                " האומנות בחיים  היא: ",
                "שלא לחיות אותם ",
                " בשידורים חוזרים שוב ושוב, ",
                " אלא להיות מספיק פתוח ",
                " לשידורים בזמן אמת. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost502(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055_1280.jpg"
            postText = arrayListOf(
                " אמת לא הולכת אף פעם לאיבוד ",
                " אף פעם לא משתנה, ",
                " היא רק מתגלית לך ",
                " כל פעם מחדש  ",
                " בצורה קצת אחרת. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost503(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/09/23/23/13/children-3698745_1280.jpg"
            val s1="  מגרש נדל"
            val s2="ן.  "
            val s3=s1+ "\""+s2
            postText = arrayListOf(
                " העולם הזה, ",
                "   לקטנים   ",
                " הוא מגרש משחקים, ",
                "   לגדולים   ",
                s3
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost504(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/19/17/22/children-1149671_1280.jpg"
            val st1 = " בסוף מה נשאר לך? "
            val st2 = " רק אהבה "
            postText = arrayListOf(
                " בזמנים שהכול נשבר מסביב ",
                " וכל גל נראה מאיים ואינסופי, ",
                " ניזכר במשפט של אריק איינשטיין: ",
                "\"" + st1,
                st2 + "\""
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost505(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/27/00/19/male-2101801_1280.jpg"
            postText = arrayListOf(
                "  כל הטרדות שלך  ",
                "  גדולות כקטנות,  ",
                "  הן עוגנים השומרים אותך  ",
                "  לבל תתנפץ  ",
                "  בחוסר המשמעות של הקיום.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost506(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/27/00/19/male-2101801_1280.jpg"
            postText = arrayListOf(
                "  כל הטרדות שלך  ",
                "  גדולות כקטנות,  ",
                "  הן עוגנים השומרים אותך  ",
                "  לבל תתנפץ  ",
                "  בחוסר המשמעות של הקיום.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost507(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/08/09/23/11/forest-4395986_1280.jpg"
            postText = arrayListOf(
                "מלחמות גדולות",
                "מלחמות קטנות,",
                "בחלק מהם ניצחתי",
                "ובחלק פחות,",
                "והמוצלחות ביותר היו אילו שלא היו."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost508(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/08/19/00/13/sea-5499649_1280.jpg"
            postText = arrayListOf(
                " יש אנשים האומרים ",
                " שהיופי עובר עם הגיל, ",
                " לא יודע מי האנשים האלה ",
                " אבל בטוח ",
                "שהם לא מכירים את הים הגדול."
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
    fun loadPost509(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/14/42/knight-2565957_1280.jpg"
            postText = arrayListOf(
                " היכולת שלך לחיות בשלום עם עצמך ",
                " תלויה בכישרון שבך, ",
                " לבחור בקפידה ",
                " להילחם ",
                " רק את המלחמות שמתאימות לך. "
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
    fun loadPost510(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439952_1280.jpg"
            postText = arrayListOf(
                "  אתה רוצה דברים מסוימים  ",
                "  שלא בגלל שאין לך אותם,   ",
                "   כמו   ",
                "   שאין בך מודעות    ",
                "   שבעצם יש לך כבר אותם.   "
            )
            postTransparency =10
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
    fun loadPost511(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/05/11/08/28/sunset-110305__340.jpg"
            postText = arrayListOf(
                "הטוב,",
                "הרבה יותר קרוב",
                "ממה שאתה חושב,",
                "והרבה יותר רחוק",
                "ממה שאתה מצפה לו."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=62
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost512(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/03/04/01/01/father-22194_1280.jpg"
            postText = arrayListOf(
                "  גם אם תשתדל  ",
                "  לא תהיה הכי חכם בעולם,  ",
                "  לעומת זאת  ",
                "  אם תשתדל  ",
                "  תוכל להיות הכי אתה בעולם.  "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost513(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/04/09/33/male-4177635_1280.jpg"
            postText = arrayListOf(
                "הנוחות של החיים שלך",
                "אינה נמדדת לפי",
                "כמה אחרים מציקים לך,",
                "אלא לפי",
                "כמה שאתה מציק לעצמך."
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
    fun loadPost514(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/07/05/08/37/graveyard-384604_1280.jpg"
            postText = arrayListOf(
                "החיים בסך הכל",
                "זה דיל לא רע,",
                "הבעיה",
                "שאתה מצליח להבין את זה",
                "רק בצ'ק אאוט."
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
    fun loadPost515(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/29/06/08/people-1550502_960_720.jpg"
            postText = arrayListOf(
                " גם אם תחייה עוד מאתיים שנה ",
                " לא תהיה חכם יותר, ",
                " או רעב פחות, ",
                " תהיה הרבה יותר זמן אתה, ",
                "  וזהו.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost516(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/06/04/06/56/religion-3452571_1280.jpg"
            postText = arrayListOf(
                " זה שלא הספקת לחיות ",
                " כי היית עסוק מידי, ",
                " זה לא סיבה מספיק טובה ",
                " לפתור אותך מדרך הנשמות ",
                " שיבוא יומך. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost517(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/22/22/36/girl-3422711_1280.jpg"
            postText = arrayListOf(
                " יש הרבה סיבות  ",
                " להיות אומלל בעולם הזה, ",
                " וכול הסיבות יחד ",
                " זה לא סיבה מספיקה ",
                " להיות אומלל.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost518(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/15/20/49/people-1394377_1280.jpg"
            postText = arrayListOf(
                "  האדם הוא יצור מוזר,  ",
                " כשהוא מרגיש רע יותר  ",
                " הוא מתפלל להרגיש טוב יותר, ",
                " ווכשהוא כבר מרגיש טוב יותר ",
                " יהוא מנצל את זה להרגיש רע יותר.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost519(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/11/11/10/46/opposites-3808487_1280.jpg"
            postText = arrayListOf(
                "  מעבר למפלס הטוב ורע  ",
                " יש מרחב של קיום בסיסי, ",
                " אתה לא מגיע אליו בדרך כלל ",
                " בגלל האופי ההישרדותי שבך ",
                " וחבל.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=39
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost520(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/03/17/16/59/clown-678042_1280.jpg"
            postText = arrayListOf(
                " האדם משמש סטטיסט  ",
                " בהפקה של תפיסת העולם שלו, ",
                " ההמולה מסביב אמיתית ",
                " אבל היא רק תפאורה לסיפור ",
                " שהאדם חי בו.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost521(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/07/30/00/03/winding-road-1556177_1280.jpg"
            postText = arrayListOf(
                " זה שאיבדת את הדרך לרגע  ",
                " זה לא אומר שאין דרך, ",
                " או שהדרך משובשת ",
                " זה רק אומר ",
                " שאיבדת את הדרך לרגע.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost522(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/07/08/15/10/himba-6397124_960_720.jpg"
            postText = arrayListOf(
                " האדם הקדמון  ",
                " השתמש פחות בפייסבוק ",
                " עשה פחות לייקים ",
                "   אבל נראה לי   ",
                " שהיו לו יותר חברים.  "
            )
            postTransparency =10
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
    fun loadPost523(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/04/29/04/37/flower-3359072_1280.jpg"
            postText = arrayListOf(
                " האדם הטיפוסי  ",
                " בדרך כלל לא סגור על עצמו ",
                " אם הוא חיית השדה ",
                " דמות בסרט מצויר ",
                " או סתם עציץ.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=24
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost524(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/01/24/20/47/mountains-5946500_1280.jpg"
            postText = arrayListOf(
                " אין נחמה באזורי הכעס ",
                " אין תכלית באיזורי ההמון ",
                " אין אמת באזורי הצדק ",
                " אין שקט באזורי האומללות ",
                " הכל צומח ברגע הזה.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost525(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/05/16/21/24/gorilla-2318998_1280.jpg"
            postText = arrayListOf(
                " האדם המודרני הוא יצור די אבוד, ",
                "    הוא חכם מדי     ",
                " בשביל לחשוב כמו אבותיו הקדמונים, ",
                "    וטיפש מידי    ",
                " בשביל להבין שהוא נשאר יצור פרימיטיבי."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost526(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/12/12/18/02/window-4691326_1280.jpg"
            postText = arrayListOf(
                " זה לא משנה  ",
                " עד כמה האקס שלך דביל, ",
                " כאקס ",
                " תמיד הוא מוסיף ",
                " עוד מרחב לעולם שלך. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=60
            val colorIndex=14
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost527(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/24/23/03/railway-2439189_1280.jpg"
            postText = arrayListOf(
                " אנשים שחיים לעד  ",
                " הם אלה שיודעים לעצור את הזמן ",
                " ויש כאלה ביננו, ",
                " הזמן אומנם ממשיך לזרום כדרכו ",
                " אבל לא בשבילם. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost528(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/06/20/18/04/people-5321914_1280.jpg"
            postText = arrayListOf(
                " להיות מבסוט מהחיים  ",
                " זה פחות ענין של ",
                " כמה כסף יש לך בבנק ",
                " ויותר ",
                " כמה הבנה יש לך בלב. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost529(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/05/08/13/37/sea-758165_960_720.jpg"
            postText = arrayListOf(
                " שאתה חושב שטוב לך אז טוב לך  ",
                " שאתה חושב שרע לך אז רע לך, ",
                " זה שאתה נותן למחשבה ",
                " זכות בלעדית על איכות החיים שלך ",
                " זה חוסר אחריות בעליל. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost530(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/00/41/homeless-861899_1280.jpg"
            postText = arrayListOf(
                " אמת  ",
                " היא דבר יחסי, ",
                " ההתבאסות שלך מחוסר האמת  ",
                " (לדעתך) ",
                " היא דבר מוחלט. "
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
    fun loadPost531(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/05/19/40/beach-1238462_1280.jpg"
            postText = arrayListOf(
                " בסוף הדרך ",
                " אין לך נצחנות והפסדים, ",
                " יש רק תובנה עמוקה  ",
                " עד כמה חיית את החיים שלך ",
                " כפי שאתה באמת. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=27
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost532(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/04/20/13/12/little-boy-731165_1280.jpg"
            postText = arrayListOf(
                " יש שני צורות חיים: ",
                " האחד נסיעה שבה כל הנוף חוזר על עצמו ",
                " והשנייה נסיעה בה הכל מתחדש בכל רגע,  ",
                " זה לא משנה איזה נוף תראה בחלון שמולך ",
                " אלא בפתיחות שלך אליו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,13)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost533(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/24/16/00/church-820339_1280.jpg"
            postText = arrayListOf(
                " קשה לך לסלוח לאנשים ",
                " שהם כאלה, ",
                " כנראה בגלל  ",
                " שקשה לך לסלוח לעצמך ",
                " שאתה כזה. "
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
    fun loadPost534(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072821_1280.jpg"
            postText = arrayListOf(
                " אומנם הדרכים אל האושר ",
                "  לא מסומנות בצורה מסודרת, ",
                " אבל בטוח שאם לא תתחיל ללכת  ",
                " באחד הדרכים האלה ",
                " וודאי שלא תגיע אליו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost535(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/19/21/24/avenue-815297_1280.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה מה שקורה אצלך עכשיו, ",
                " מה שלא קורה אצלך עכשיו  ",
                " קורה מן הסתם ",
                " אבל זה לא החיים שלך. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost536(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/28/23/05/sheeps-3437467_1280.jpg"
            postText = arrayListOf(
                " הכרחי לך שתהיה בך תפיסת עולם  ",
                " כדי להתנהל בו ביציבות, ",
                " בגלל עייפות קוסמית שלי  ",
                " משתדל לא לתפוס את העולם בבוקר, ",
                " מצידי שיסתובב לו חופשי. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=22
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost537(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/21/23/03/hand-2773840_960_720.jpg"
            postText = arrayListOf(
                " המון תחנות בטלוויזיה ",
                " אבל אין משהו טוב, ",
                " בדומה לחיים שלך  ",
                " המון אפשרויות ",
                " אבל אין משהו טוב. "
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
    fun loadPost538(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/03/21/51/artist-2578454_1280.jpg"
            postText = arrayListOf(
                " שתהיה לך שגרה ",
                " מספיק מעניינת ",
                " שלא תיפול בה לשעמום ולטמטום,  ",
                " ומספיק רגועה ",
                " שלא תיפול בה להרס הגוף והנפש. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost539(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/03/17/05/malham-cove-3196076_1280.jpg"
            postText = arrayListOf(
                "  אמר השיר: אין מקום אחר, ",
                " זה  נכון לגבי האבן ",
                " ונכון לגבי האדם,  ",
                " בגלל שהאבן מוטלת בשדה ",
                " והאדם איפה שהמחשבה שלו. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=12
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost540(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_1280.jpg"
            postText = arrayListOf(
                " ג'אנק מודעות ",
                " (פוליטיקה, רכילות, שיטוט ברשת) ",
                " כמו ג'אנק פוד  ",
                " בכמות קטנה נסבלת איכשהו ",
                " אבל בכמות גדולה דופקת לך את הבטן. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost541(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/11/13/23/06/tree-6792528_1280.jpg"
            postText = arrayListOf(
                " כשהמודעות מגיעה  לנקודה מסוימת, ",
                " הכניסה לפרטים ",
                " רק מקטינה את הדיוק,  ",
                " צריך אדם לשאוף לנקודה הזאת ",
                " וכשהגיע אליה להרפות. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost542(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/11/22/07/26/indiana-dunes-state-park-1848559_1280.jpg"
            postText = arrayListOf(
                " החופש  ",
                " הוא השחרור המיוחל ",
                " מכל ההתחייבויות לכולם  ",
                " לטובת העריצות האיומה  ",
                " של מה שאתה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost543(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/02/17/40/photos-256887__480.jpg"
            postText = arrayListOf(
                " לאדם יש זוגיות משתנה עם החיים,  ",
                " בחלק הראשון של חייו ",
                " הוא לא בדיוק שמח שהם באים אליו  ",
                " ובחלק השני   ",
                " הוא לא בדיוק שמח שהם הולכים ממנו. "
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
    fun loadPost544(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/12/05/18/49/city-3000060_1280.jpg"
            postText = arrayListOf(
                " שהשחור  ",
                " הוא סוג של לבן ",
                " וכשהלבן  ",
                " הוא סוג של שחור  ",
                " תמונת המציאות כולה דמיונית. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=100
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost545(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/06/22/23/40/picking-flowers-2432972_1280.jpg"
            postText = arrayListOf(
                " המוות בדרך כלל  ",
                " הוא לא סוף החיים ",
                " סוף החיים קורה לך הרבה לפני , ",
                " באותו רגע  ",
                " שאתה מפסיק לחיות. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=25
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost546(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_1280.jpg"
            postText = arrayListOf(
                " בראשית ברא אלוהים את האור,  ",
                " זו הייתה ונשארה המצאה די טובה ",
                " אבל לא מי יודע שימושית, ",
                " כי האדם מטבעו מתנהל בחושך  ",
                " והאור לא עוזר לו בזה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=25
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost547(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/30/19/26/rotorua-3442253_1280.jpg"
            postText = arrayListOf(
                " קח את מה שאתה סובל מהחוץ  ",
                " וקח מה שאתה סובל מהפנים ",
                " והשתדל ",
                " שלא לעשות את הסכום שלהם  ",
                " אלא את ההפרש. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost548(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/04/16/23/59/sad-4133121_1280.jpg"
            postText = arrayListOf(
                " אנשים זה לא איך שהם נראים ",
                " אנשים זה לא מה שהם אומרים ",
                " אנשים זה לא מה שהם חולמים ",
                " אנשים זה לא מה שהם בשבילנו  ",
                " אנשים זה מה שהם. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost549(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/09/16/19/52/beach-4481919_1280.jpg"
            postText = arrayListOf(
                " השקיעות נאספות אל הים  ",
                " הימים חולפים כסדרם, ",
                " לא מובן מאליו, ",
                " מלא הערכה למי שמפיק הכל   ",
                " יש לו את זה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=79
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost550(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/05/07/21/41/drip-339940_1280.jpg"
            postText = arrayListOf(
                " שתחיה בטוב  ",
                " פירושו: ",
                " שתגיע לרמת מודעות ",
                " כזאת  ",
                " שתצליח לגעת בטוב. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=79
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost551(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/12/10/44/lost-places-597166_1280.jpg"
            postText = arrayListOf(
                " אל תחשוב שיש עולם אחר בשבילך  ",
                " אין דבר כזה ",
                " אבל ",
                " יש אמונה, שהיא מעבר למחשבה   ",
                " וכדאי לך להשתמש בה פה ושם. "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=79
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost552(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/27/12/24/beyond-3265854_1280.jpg"
            postText = arrayListOf(
                " המוות  ",
                " פותר את כל הבעיות בחיים, ",
                " אז אם אתה ממש לא רוצה למות ",
                " תשתדל להשאיר בעיה או שנים שלך  ",
                "   לא פתורות.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost553(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/04/08/22/26/buddhism-2214532_1280.jpg"
            postText = arrayListOf(
                " האמונה זו היכולת האנושית המובנת  ",
                "  למלא חללים בחומר ידידותי,  ",
                " ובגלל שהעולם הזה ברובו חלל ",
                " רצוי לפתח את היכולת הזו  ",
                " בכל תנאי מזג אוויר. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=49
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost554(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/11/05/20/16/horses-5716127_1280.jpg"
            postText = arrayListOf(
                " קסמים, ",
                " בשביל קוסם מקצועי ",
                " זה להוציא יונה מכובע ריק, ",
                " בשביל בן אדם  ",
                " זה להוציא יום חדש מבוקר שגרתי. "
            )
            postTransparency =5
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
    fun loadPost555(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/23/23/03/sunrise-1765027_1280.jpg"
            postText = arrayListOf(
                " החיים האלה ",
                " הם כלי לא רע  כדי לחיות, ",
                " בכל מקרה ",
                " בלעדיהם היה לך קצת קשה  ",
                " להשתמש בסמרטפון שלך. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost556(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/03/07/14/09/landscape-2124104_1280.jpg"
            postText = arrayListOf(
                " אתה לא צריך לחסל את כל השדים שלך",
                " זה אכזרי מדי ולא ראלי, ",
                " מספיק שתשלח אותם לביתם הפרטי ",
                " שמצוי אי שם  ",
                " במרחבי העולם הנפשי שלך. "
            )
            postTransparency =8
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
    fun loadPost557(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2015/08/31/10/07/man-915230_1280.jpg"
            postText = arrayListOf(
                " האפשרות המובנת של  האדם ",
                "   לחשוב כמו מישהו אחר,   ",
                "      חיסלה כמעט לחלוטין      ",
                "   את היכולת הבסיסית שלו    ",
                "   להיות מה שהוא.  "
            )
            postTransparency =10
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
    fun loadPost558(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2014/02/23/09/16/man-272675_1280.jpg"
            postText = arrayListOf(
                " האדם ניכר ",
                " באתר הראשון במחשב ",
                " שהוא פותח בהתחלת היום שלו, ",
                "   ובסרט האחרון בטלוויזיה    ",
                " שהוא רואה בסוף היום שלו. "
            )
            postTransparency =10
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
    fun loadPost559(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/03/26/21/00/climber-299018_1280.jpg"
            postText = arrayListOf(
                " יש שני סוגי אנשים מפוספסים: ",
                " האבודים ",
                " ואלה שנאחזים במשהו  ",
                " אפילו שהמשהו הזה בדרך כלל  ",
                " לא בדיוק מתאים להם. "
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
    fun loadPost560(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/16/11/18/restaurant-601304_1280.jpg"
            postText = arrayListOf(
                " האדם בחיים דומה לאותו אחד ",
                " שנכנס למסעדת שף יוקרתית ",
                " הוא אוכל בנימוס והכל בסדר,  ",
                " אבל עמוק בפנים הוא יודע  ",
                " שהוא בנוי יותר לג'אנק פוד. "
            )
            postTransparency =7
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
    fun loadPost561(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/12/24/05/02/drop-of-water-578897_1280.jpg"
            postText = arrayListOf(
                " היכולת המרעננת להתחדש תלויה: ",
                " במחנק מהקיים כרגע, ",
                " בנכונות לוותר על הישן והמוכר, ",
                " ובעוז  ",
                " להיכנס למחוזות לא מוכרים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=56
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost562(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/07/26/03/35/jogger-7344979_1280.jpg"
            postText = arrayListOf(
                " אם אתה תופס את עצמך ",
                " כמישהו אחר, ",
                " אתה חי כמישהו אחר ",
                " את החיים שלך, ",
                " סתם חבל. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost563(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/07/26/03/35/sunset-7344981_1280.jpg"
            postText = arrayListOf(
                " בעולם הזה יש סט צבעים בסיסי, ",
                " אתה יוצר מהסט הזה ",
                " את הצבע המיוחד שלך, ",
                " ואיתו אתה צובע את כל הצורות ",
                " הקיימות בעולם הזה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost564(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/08/10/20/39/the-roots-of-the-4397679_1280.jpg"
            postText = arrayListOf(
                " אתה צומח מהשורשים שבך ",
                " אותם שממוקמים מתחת הקרקע ",
                " ומסרבים להתבגר עם כל יום שעובר, ",
                " נכון זה לא האזור הכי מפותח בך ",
                " אבל משם אתה צומח. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,15)
            margin=1
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost565(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/08/10/41/sports-1962574_1280.jpg"
            postText = arrayListOf(
                " החופש ",
                " הוא כמו אותם מתקני ספורט ביתיים ",
                " שאנשים קונים ברשת, ",
                " הוא קיים ",
                " אבל אף אחד לא באמת משתמש בו. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=1
            val colorIndex=37
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost566(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/20/23/21/woman-4866179_1280.jpg"
            postText = arrayListOf(
                " בחיים שלך ",
                " אתה מרגיש שמשהו חסר, ",
                " לא בגלל שמשהו באמת חסר, ",
                " אלא רק בגלל אותה הרגשה ",
                " שמשהו חסר. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=71
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost567(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/25/06/26/girl-1857703_1280.jpg"
            postText = arrayListOf(
                " לא משנה  כמה תעוף גבוה ",
                " במחשבות שלך, ",
                " בסוף  ",
                " תמיד תיפול חזרה ",
                " למקום שאתה מצוי בו. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=69
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost568(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/11/19/15/hard-3391402_1280.jpg"
            postText = arrayListOf(
                " האדם מתמחה ",
                " ביצירת חיים קשים לצריכה אישית, ",
                " לא בדיוק מבין  למה זה טוב  ",
                " אבל מניסיוני ",
                " זה יוצר חיים קשים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost569(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/01/25/adult-1866533_1280.jpg"
            postText = arrayListOf(
                " החיים האלה ",
                " הם אמצעי טוב לחיות, ",
                " הם פחות יעילים  ",
                " בניקוי לקראת החגים ",
                " או במציאת חניה. "
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
    fun loadPost570(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/04/18/51/forest-4178838_1280.jpg"
            postText = arrayListOf(
                " יש כאלה שמחפשים את המשמעות  ",
                " יש כאלה שמחפשים  את עצמם  ",
                " יש כאלה שמחפשים את אלוהים   ",
                " ועלי חביבים ",
                " אלה שמחפשים את הקסם בחיים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost571(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/08/18/29/entrepreneur-593358_1280.jpg"
            postText = arrayListOf(
                " אם אתה ",
                " מדבר כמו זקן  ",
                " חושב כמו זקן  ",
                " וחולם כמו זקן ",
                " יש סיכוי שאתה זקן. "
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
    fun loadPost572(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/25/09/19/highway-2679490_1280.jpg"
            postText = arrayListOf(
                " החיים שלי עוברים מולי ",
                " ואני לא יודע מזה בכלל, ",
                " הם מסווים את עצמם כשגרה  ",
                " כך שאין לי שמץ מושג לגביהם ",
                " באם היו כאן ומתי. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=15
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost573(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/06/12/11/57/street-7257864_1280.jpg"
            postText = arrayListOf(
                " שני דברים צריך אדם בחייו: ",
                " לדעת ",
                "   לחיות בשגרה מעניינת,  ",
                " ולדעת  ",
                "   להודות על השגרה הזו. "
            )
            postTransparency =7
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
    fun loadPost574(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/20/20/16/horror-4217529_960_720.jpg"
            postText = arrayListOf(
                " להתעמת עם השדים שלך ",
                " זה לא עסק פשוט ",
                " משתי סיבות עיקריות :  ",
                " סיבה ראשונה שהם שדים  ",
                " וסיבה שנייה שהם שלך . "
            )
            postTransparency =5
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
    fun loadPost575(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/02/28/12/55/boy-1226964_1280.jpg"
            postText = arrayListOf(
                " רגשי הנחיתות ",
                " סובלים מיחסי ציבור גרועים במיוחד, ",
                " הם מהווים חלק חשוב  ",
                " בעולם הנפשי של כל אדם  ",
                " אבל נחשבים משום מה לנחותים. "
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
    fun loadPost576(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/03/15/04/aggression-1641959_1280.jpg"
            postText = arrayListOf(
                " הרבה שנאה יש ברחובותינו, ",
                " לאהוב את השנאה זה לשנא, ",
                " לשנוא את השנאה זה לשנא,  ",
                " לדעת שהיא שם, וזהו,  ",
                "  לקבל. "
            )
            postTransparency =5
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
    fun loadPost577(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/02/16/54/horse-4596827_960_720.jpg"
            postText = arrayListOf(
                " בסוף היום ",
                " כל המלחמות האישיות שלך ",
                " הולכות לישון,  ",
                " מחר מחכה להן עוד יום מפרך  ",
                " בלהרוס לך את החיים. "
            )
            postTransparency =5
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
    fun loadPost578(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/02/28/13/25/sadness-4025950_960_720.jpg"
            postText = arrayListOf(
                "  לכל האנשים החיים יש בעיות  ",
                "  לכל האנשים המתים אין בעיות,  ",
                "     וזה אומר      ",
                " כל האנשים ללא בעיות הם די מתים  ",
                " ואם יש לך בעיות משמע אתה חי. "
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
    fun loadPost579(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/04/05/00/27/man-7112557_960_720.jpg"
            postText = arrayListOf(
                "  החיים שלך זה מוצר גולמי  ",
                "  והשאלה היא:  ",
                " מה אתה עושה עם המוצר הזה,  ",
                " תעשה חיים רעים יהיו לך חיים רעים  ",
                " תעשה חיים טובים יהיו לך חיים טובים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=74
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost580(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/14/03/animal-1834771_960_720.jpg"
            postText = arrayListOf(
                "  לא מכחיש את הדיכאון הקיומי ",
                "  הדיכאון היומיומי  ",
                " ההתבאסות הסטנדרטית  ",
                " וחוסר המשמעות המובנה,  ",
                " רק שלא לוקח אותם כל כך ברצינות. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=74
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost581(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/09/15/00/30/autumn-940401_960_720.jpg"
            postText = arrayListOf(
                "  החג הזה  ",
                "  שבו הקיץ מתחלף לסתיו  ",
                " אינו כלול בטבלת החגים הסדורה,  ",
                " הוא שם רק לאותם שצורכים אותו  ",
                " ורואים את האור משתנה. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=100
            val colorIndex=74
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost582(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/12/02/59/girl-1733357_960_720.jpg"
            postText = arrayListOf(
                " האדם לא בדיוק חי את החיים שלו  ",
                "  הוא יותר משתמש בהם  ",
                " כדי לדעת יותר על החיים של אחרים,  ",
                " על מה מה לקנות ואיפה   ",
                " ועל איך לחיות יותר נכון. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=73
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost583(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/09/18/24/driving-2732934_960_720.jpg"
            postText = arrayListOf(
                " וגם באם היו נותנים לך מפה  ",
                "  של הדרך המדויקת אל האושר  ",
                " לא היית מגיע לשם  ",
                " בגלל    ",
                " שאתה בדרך כלל לא הנהג. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=71
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost584(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/08/28/17/37/flower-7417160_960_720.jpg"
            postText = arrayListOf(
                " החיים די מוגבלים,  ",
                "  הם לא יכולים לתת לך להיות:  ",
                " צודק, מקובל, עשיר ויפה,  ",
                " הם יכולים לספק לך  ",
                " רק חיים. "
            )
            postTransparency =5
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
    fun loadPost585(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/18/06/25/grain-4858574_960_720.jpg"
            postText = arrayListOf(
                " הרוחות הרעות ייקחו אותך  ",
                "  בדרכם למקומות הנמוכים,  ",
                " אין לך כל כך מה לעשות  ",
                " חוץ מלהמתין שכיוון הרוח יתחלף  ",
                " ויוציא אותך מהמקומות האלה. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost586(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/10/00/forest-1868885_960_720.jpg"
            postText = arrayListOf(
                " אנשים יכולים להגיד  ",
                "  על הלילה יום  ",
                " ועל היום לילה,  ",
                " את השמש זה אף פעם לא מבלבל  ",
                " היא תזרח תמיד במועדה. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost587(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/07/01/will-be-bored-4656180_960_720.jpg"
            postText = arrayListOf(
                " האנשים נוטים להיות מוטרדים  ",
                " מעודף פעילות בחיים ",
                " ומחוסר פעילות בחיים, ",
                " או בקיצור ",
                " אנשים נוטים להיות מוטרדים. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost588(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/23/10/mausoleum-2442284_960_720.jpg"
            postText = arrayListOf(
                " חיו הרבה לפניך  ",
                " ויחיו הרבה אחריך, ",
                " ככה שאל תיקח את החיים האלה שלך ",
                " בצורה אישית מידי, ",
                " כולם עוברים את זה. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=49
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost589(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/08/24/05/44/duck-7406987_960_720.jpg"
            postText = arrayListOf(
                " כמה שבלב אתה פתוח לחיים  ",
                " ככה הם יכנסו אליך, ",
                " כי החיים כמו נהר זורם ",
                " יכולים לפורר סלעים ",
                " אבל לא לחדור אליהם. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=25
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost590(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/07/31/23/50/people-2562102_960_720.jpg"
            postText = arrayListOf(
                " הגבר אחרי הכל הוא רק גבר  ",
                " האישה גם היא רק אישה, ",
                " המפגש ביניהם  ",
                " יוצר לפעמים משהו ",
                " שהוא הרבה מעבר למה שהם. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=20
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost591(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/10/25/19/55/beach-7546731_960_720.jpg"
            postText = arrayListOf(
                " חיים רעים נופלים עליך  ",
                " תרצה או לא, ",
                " חיים טובים עוברים לידך,  ",
                " ככה שרצוי לך ללמוד ",
                " לקחת מהם כמה שיותר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost592(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/02/07/25/embroidery-3124830_960_720.jpg"
            postText = arrayListOf(
                " אי אפשר להבין את האדם בפני עצמו  ",
                " (למרות שהוא תופס את עצמו כיחיד) ",
                " בגלל שהוא חלק מרשת גדולה ,  ",
                " תבין קודם את הרשת הזו ",
                " ואז תהיה ברור לעצמך הרבה יותר. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost593(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/10/16/13/17/road-7525091_960_720.jpg"
            postText = arrayListOf(
                " האלוהים ברא את העולם בשבוע ימים  ",
                " ומאז ועד היום אנחנו משתמשים בזה, ",
                " ולעומתו האדם  ",
                " צריך להמציא את עצמו כל בוקר ",
                " אחרת הוא לא באמת קיים. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=58
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost594(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/12/31/06/25/adult-3051650_960_720.jpg"
            postText = arrayListOf(
                " אם היצירה שלך  ",
                " זה משהו שאתה עושה  ",
                " אז ליצור זה עיסוק נחמד וחיובי,  ",
                " אבל אם היצירה שלך זה מה שאתה ",
                " אז ליצור זה לחיות. "
            )
           postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=58
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost595(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/05/29/girl-1822702_960_720.jpg"
            postText = arrayListOf(
                " אתה קורבן ",
                " של כל תפיסות החיים שלך, ",
                "  האחרים  ",
                " סובלים את התגובות שלך ",
                " לתפיסות האלו. "
            )
            postTransparency =0
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

    fun loadPost5_999_007(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/01/28/12/18/fog-7750811_960_720.jpg"
            postText = arrayListOf(
                " אתה יוצר חיים בכל רגע, ",
                " בעשייה שלהם  ",
                " בצורה כזו או אחרת,  ",
                " ובחוסר עשייה שלהם ",
                " בטענה כזו או אחרת. "
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

    fun loadPost5_999_008(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/06/08/21/10/river-7251241_960_720.jpg"
            postText = arrayListOf(
                " מעטים היכולים לשמוע ",
                " את החיים שלהם עוברים  ",
                " מבעד לכל ההמולה הזו,  ",
                " הרוב מסתפקים ",
                " בלהיות חלק מההמולה הזו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=10
            val selector=1
            val grade=82
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }
   fun loadPost5_999_009(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/06/14/23/14/pigeons-50005_960_720.jpg"
            postText = arrayListOf(
                " בחוץ האביב מתארגן על עצמו ",
                " חמסין ראשון עם ריח פריחה  ",
                " יונה הומיה בראש עץ התות  ",
                " ממש כמו כל שנה, ",
                " ובחדר האוכל מודעה שחנוך איננו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=10
            val selector=1
            val grade=84
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }

    fun loadPost5_999_010(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/08/06/13/construction-2929325_960_720.jpg"
            postText = arrayListOf(
                " תן לזמן שלך לעבוד ",
                " הוא טוב בלשטח הרים של בעיות  ",
                " להחליק את הפסגות המחודדות שלהם ",
                " ולתת לך דרך נוחה יחסית ",
                " ולעבור דרכם הלאה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=10
            val selector=1
            val grade=82
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }
 }