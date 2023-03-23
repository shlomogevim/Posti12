package com.sg.posti10.posts.allPosts

import android.util.Log
import com.sg.posti10.model.Post
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts6Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost600(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
            postText = arrayListOf(
                "  המיינד  ",
                "  הוא כדור הרגעה  ",
                "  מהאין סופיות של החיים,  ",
                "  טוב להשתמש בו מידי פעם,  ",
                "  אבל כדי לשמור קשר טוב למציאות  ",
                "  רצוי שלא להתמכר אליו יותר מידי.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=66
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost601(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/23/16/unicorn-4766547_1280.jpg"
            postText = arrayListOf(
                "  אתה חי בתוך אגדה עתיקה,  ",
                "  גן העדן והגיהנום נמצאים כאן ועכשיו,  ",
                "  ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:  ",
                "    אתה.    ",
                "   ומה שנותר פתוח   ",
                "   זו אותה אמונה באגדות עתיקות.   "
            )
            postTransparency =0
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
    fun loadPost602(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
            postText = arrayListOf(
                "  הגאומטריה של הסבל,  ",
                " במשולש הקיום שלך שלשה קודקודים: ",
                "  מה שאתה צריך,  ",
                "  מה שאתה רוצה  ",
                "  ומה שיש לך,  ",
                "  וככול ששטח המשולש קטן יותר," +
                        " אתה פחות סובל.  "
            )
            postTransparency =6
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
    fun loadPost603(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/11/17/03/20/woman-7597270_960_720.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                "  הם לא מקומות  ",
                "  בעולם הבא,  ",
                "  הם יותר צורת  ",
                "  המחשבות שלך  ",
                "  בעולם הזה.  "
            )
            postTransparency =6
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
    fun loadPost604(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/08/29/22/33/sunset-7419911_960_720.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך ",
                "שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין",
                "שאתה בסדר."
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost605(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/11/21/15/40/farmer-540658_960_720.jpg"
            postText = arrayListOf(
                "  החופש הזה שלא לדעת,  ",
                "  החופש הזה שלא להיות צודק,  ",
                "  החופש הזה שלא להיות מקובל,  ",
                "  החופש הזה שלא להיות חכם,  ",
                "  החופש הזה שלא להיות מישהו,  ",
                "  החופש הזה של רק להיות.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=64
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost606(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2010/12/16/14/49/justice-3612_1280.jpg"
            val st1 = " בסעיף של "
            val st2 = " עשה אל תעשה "
            val st12 = "\""
            val st = st1 + st12 + st2 + st12
            postText = arrayListOf(
                st,
                " אל תחשוב תמיד במושגים של: ",
                " טוב ורע, ",
                "  אלא במושגים של:  ",
                "  מתאים למה שאני ",
                "  לא מתאים  למה שאני.  "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost607(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/11/01/14/couple-5028352_960_720.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                "בשר ודם הוא רק בשר ודם, ",
                "ולפעמים ",
                "הוא הופך לעפר ואפר",
                "ולפעמים ",
                "הוא הופך לקסם."
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost608(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2011/12/13/14/28/earth-11009_1280.jpg"
            postText = arrayListOf(
                "  העולם מתנהל לפי דרכו  ",
                "   ממש בסדר,   ",
                " האנשים גם הם מתנהלים לפי דרכם ",
                "   ממש בסדר,   ",
                "  ואם אתה חושב אחרת  ",
                " גם זה ממש בסדר."
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost609(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/29/auto-3368094_1280.jpg"
            postText = arrayListOf(
                "מאמין במה שאינו נגמר לעולם,",
                "באנשים שנשארים בך",
                "גם אחרי שהם הולכים,",
                "בשירים שעדיין מתנגנים בך ",
                "במרחק השנים,",
                " ובמה שחי בך מאז ומתמיד."
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost610(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/04/17/16/08/poverty-727510_960_720.jpg"
            postText = arrayListOf(
                " כדי להישרד ",
                " אתה צריך לפעמים ",
                "  להתעמת עם העולם סביבך, ",
                " כדי להיות נכון ",
                " אתה צריך לפעמים ",
                "להתעמת עם עצמך. "
            )
            postTransparency =7
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
    fun loadPost611(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/10/06/00/25/woman-2821623_1280.jpg"
            postText = arrayListOf(
                " העולם הזה ברדק אחד גדול, ",
                " אף אחד לא אומר לך ",
                " מתי החיים שלך מתחילים, ",
                "   וגם תאריך הסיום לא ברור,   ",
                " בוא נאמר ששירות הלקוחות שלהם ",
                "  לא משהו.  "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost612(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/18/16/53/earth-1990298_1280.jpg"
            postText = arrayListOf(
                " אתה כמו לווין אבוד בחלל ",
                " שנע סביב כדור הארץ, ",
                " היחס שלך לעולם ",
                " הוא נקודת המבט הרגעית שלך על הכדור, ",
                " פעם אתה קולט אותו בצידו האפל ",
                "  ופעם בצידו המואר. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,15)
            margin=1
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost613(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://images.unsplash.com/photo-1575893363557-0aa0ab80e225?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
            postText = arrayListOf(
                " דוח מצב זמני : ",
                " אתה נמצא על כוכב לכת כלשהו ",
                " בצורה מוגדרת ובתפקיד לא ידוע, ",
                " הגוף מוכר לך בתשוקותיו ומכאוביו, ",
                " אבל אתה לא ברור ",
                "  מלבד היכולת הזאת לחוות. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=2
            val colorIndex=56
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost614(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/10/03/47/guy-2617866_960_720.jpg"
            postText = arrayListOf(
                " המוצר הכי מיותר בעולם ",
                " שהאדם יוצר על בסיס יומי ",
                " הם עוגמות הנפש, ",
                " הם ממש לא שימושיות, ",
                " מבאסות לך את החיים ",
                "  ומקשות עליך להיות מה שאתה. "
            )
            postTransparency =7
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
    fun loadPost615(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
            postText = arrayListOf(
                " אלוהי הרייטינג  ",
                " נבחר כאל הכי פופולרי ביקום, ",
                " אני יודע שזה לא צודק ",
                " ויש אחרים ששווים יותר ",
                " אבל זה העולם שהאדם יצר סביבו ",
                "  בצלמו ובדמות. "
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
    fun loadPost616(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/07/17/22/06/sri-lanka-4345091_1280.jpg"
            postText = arrayListOf(
                " שהייתי קטן  ",
                " רציתי להכיר את העולם, ",
                " שהייתי כבר יותר גדול ",
                " השתדלתי להסתדר אתו כמה שיותר, ",
                "     ועכשיו בגילי המופלג      ",
                "  אני מסתפק בכמה שפחות להיפגע ממנו. "
            )
            postTransparency =7
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
    fun loadPost617(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/10/21/15/04/sea-2874928_1280.jpg"
            postText = arrayListOf(
                " הזמן שעובר  ",
                " הוא השובל שאתה משאיר אחריך ",
                " במסע הזה שלך באוקיאנוס הקיום, ",
                " ומי שמצליח לראות את השובל הזה ",
                " נעלם לאט לתוך המים הגדולים  ",
                " מודע לתנועה שלו בחיים. "
            )
            postTransparency =7
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
    fun loadPost618(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/01/25/19/13/nature-6967075_1280.jpg"
            postText = arrayListOf(
                " העולם שסביב מושלם ",
                " בדיוק כמו שהיה צריך להיות, ",
                " האדם שסביב מושלם  ",
                " בדיוק כמו שהיה צריך להיות, ",
                " חוסר השלמות שבנו מושלם  ",
                " בדיוק כמו שהיה צריך להיות. "
            )
          postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=30
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost619(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/11/14/12/06/farmer-5741416_960_720.jpg"
            postText = arrayListOf(
                " השוטה ",
                " נמצא ברע ",
                " גם שהוא בטוב,  ",
                " החכם ",
                " נמצא בטוב ",
                " גם שהוא ברע. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=25
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost620(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/01/17/16/13/daisy-75191_1280.jpg"
            postText = arrayListOf(
                " בין לחיות בעולם חסר ",
                " של -לרצות- ",
                " לבין לחיות בשממה  ",
                " של -לא לרצות-, ",
                " עדיף לחיות עכשיו ",
                " את מה שיש. "
            )
            postTransparency =6
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
    fun loadPost621(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334_1280.jpg"
            postText = arrayListOf(
                " אפשר לרדוף כל היום אחרי הזנב שלך ",
                " מיטב הכלבים עושים את זה ",
                " בעיקר שהם גורים קטנים,  ",
                " והשאלה הקוסמית העולה: ",
                " האם אתה מנטלית ",
                " גור כלבים טיפוסי. "
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
    fun loadPost622(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/13/13/20/guy-598180_1280.jpg"
            postText = arrayListOf(
                " לחיות את הקונפליקט ",
                " בין מה שאתה עכשיו ",
                " למה שהיית לפני חמש דקות,  ",
                " זו משימה די קשה ",
                " בעיקר אם אתה מאמין ",
                " שיש לך אישיות מוגדרת. "
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost623(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/11/13/22/44/fire-3814159_1280.jpg"
            postText = arrayListOf(
                " אתה יוצר את אלוהיך ",
                " שיוצר אותך, ",
                " תיצור אותו מעגל הזהב  ",
                " הוא יהיה עגל זהב, ",
                " תיצור אותו מסנה בוער ",
                " הוא יהיה סנה בוער. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost624(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/09/28/14/21/clocks-6664622_1280.jpg"
            postText = arrayListOf(
                " לכל רגע יש את האיכות שלו, ",
                " ואם אתה לא מוצא אותה ",
                " כנראה חיפשת את האיכות הזו  ",
                " בזמן או במקום אחר, ",
                " או שבכלל לא חיפשת אותה ",
                " בגלל שאין לך צורך אישי בזה. "
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
    fun loadPost625(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/24/21/33/football-1350779_960_720.jpg"
            postText = arrayListOf(
                " אומנם העולם גדול ורחב  ",
                " אבל אתה חי בתוך הראש שלך ",
                " שכולו בגודל כדורגל ממוצע,  ",
                " אז מה הפלא ",
                " שאתה מרגיש בדרך כלל ",
                " שהעולם מתאמן עליך בבעיטות חופשיות. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost626(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/31/19/22/portrait-1634421_1280.jpg"
            postText = arrayListOf(
                " אל תטריד את השדים שלך ",
                " תן להם לחיות את חייהם במנוחה ",
                " רחוק ממך בארץ השדים,  ",
                " אתה יכול לקרא להם מידי פעם ",
                " כי אחרי הכל אתם ידידים וותיקים ",
                "    אבל רצוי שלא להגזים בזה.   "
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
    fun loadPost627(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/09/16/40/dinosaur-4833796_960_720.jpg"
            postText = arrayListOf(
                " הדינוזאורים הגדולים נכחדו מהעולם  ",
                " כי לא יכלו להסתגל למציאות המשתנה,",
                " ככה זה בעולם  ",
                " מי שלא מצליח לנוע עם הזרם ",
                " פשוט טובע. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost628(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/31/10/31/sense-3277815_1280.jpg"
            postText = arrayListOf(
                " הרוח מעיפה הכל  ",
                " גם נעל בית וגם עיתון ישן, ",
                " רוח הזמנים שבאה עם היום החדש  ",
                " מעיפה אותך מעצמך,  ",
                " בעיקר אם אתה תופס את עצמך ",
                " כנעל בית או עיתון ישן. "
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
    fun loadPost629(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/05/22/29/gorilla-2586193_960_720.jpg"
            postText = arrayListOf(
                " אתה מה שאתה מיועד להיות  ",
                " בדיוק ",
                " לא יותר לא פחות,  ",
                " התיסכול שלך צריך להיות  ",
                " ממה שיועדת להיות ",
                " לא ממה שאתה. "
            )
            postTransparency =5
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
    fun loadPost630(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/07/08/03/55/mount-everest-6395759_1280.jpg"
            postText = arrayListOf(
                " מודעות ",
                " זה לדעת מאיפה אתה בא ",
                " ולאיפה את הולך,  ",
                " אותנטיות  ",
                " זה לתת לידע הזה מקום וזמן ",
                " לאורך כל המסע. "
            )
            postTransparency =6
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
    fun loadPost631(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/10/15/02/33/selfie-489119_960_720.jpg"
            postText = arrayListOf(
                " אם האלוהים היה יודע ",
                " שהאדם מסתפק בפייסבוק, ",
                " נראה שהוא היה מביא לו  ",
                " אלבום צילומי סלפי,  ",
                " במקום לארגן לו ",
                " מסע מורכב שכזה בארץ החיים. "
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
    fun loadPost632(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/30/20/37/broken-heart-1489818_1280.jpg"
            postText = arrayListOf(
                "   להשקיע טונה רגשות ",
                " במלחמות אבודות, ",
                " זה כמו  ",
                "   לשפוך טונה של מים ",
                " סתם באמצע המדבר, ",
                " זה לא יצמיח דבר. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=60
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost633(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/05/07/19/46/desperate-2293377_1280.jpg"
            postText = arrayListOf(
                " כאדם ",
                " יש לך את האישור האלוהי ",
                "      להיות טמבל,      ",
                " אבל רק כתזכורת, ",
                " זו לא חובה ",
                "   להשתמש באישור הזה. "
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
    fun loadPost634(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/30/09/39/time-2801596_1280.jpg"
            postText = arrayListOf(
                " אין רגע משעמם או חסר ערך ",
                " בחיים האלה, ",
                " אבל יש הרבה רגעים  ",
                " שאתה פשוט לא מבין ",
                " או לא  מקבל ",
                " את טיבם. "
            )
            postTransparency =10
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
    fun loadPost635(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/14/07/52/train-2401406_960_720.jpg"
            postText = arrayListOf(
                " אם אתה לא שומע ",
                " את שקשוק גלגלי רכבת החיים שלך ",
                " העוברת ביעף על מסילת הזמנים,  ",
                " אז כנראה ",
                " אתה תקוע באיזה תחנה ",
                " בעבר שלך. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=37
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost636(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/02/13/13/02/red-lighthouse-6011477_960_720.jpg"
            postText = arrayListOf(
                " ביום בהיר עם ראות טובה ",
                " כזה שרואים חופשי למרחקים, ",
                " אם תחפש את קצה העולם,  ",
                " תראה אחרי מאמצים רבים ",
                " שם בקצה האופק ",
                " אותך מחפש את קצה העולם. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=34
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost637(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/17/00/31/trains-1599445_960_720.jpg"
            postText = arrayListOf(
                "   האדם רוצה   ",
                "   שבמותו   ",
                "   יזכרו את האהבות שלו,    ",
                "   אבל משום מה   ",
                "  בחייו   ",
                " הוא מטפח את השנאות שלו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost638(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/06/18/39/ball-3204197_960_720.jpg"
            postText = arrayListOf(
                " אתה כמו כדור משחק, ",
                " לכאורה אתה יכול לנוע לכל כיוון ",
                " (קוראים לזה: בחירה חופשית)  ",
                " למעשה אתה נע ",
                "   רק לפי   ",
                " איך שהחיים האלה בועטים אותך. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost639(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/12/23/05/41/woman-4713807_960_720.jpg"
            postText = arrayListOf(
                " לפעמים, ",
                " שאתה לבד ",
                " זה לא בגלל שהשאירו אותך מאחור,  ",
                " אלא בגלל שבקטע הזה ",
                " של הדרך הזו שלך ",
                " יש מקום לאדם אחד בלבד. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost640(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/07/20/17/baby-1081334_960_720.jpg"
            postText = arrayListOf(
                " בחיים האלה אתה נמצא תמיד ",
                " אבל תמיד ",
                " בזמן הנכון ובמקום הנכון לך,  ",
                " ומה שנותר לך בכל זה ",
                " להתרווח לחוות ואולי אפילו להנות  ",
                " מהרגע הזה במסע הזה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=26
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost641(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/31/06/50/forest-868715_960_720.jpg"
            postText = arrayListOf(
                " מי שאומר שהעולם חרא ",
                " צודק מאה אחוז, ",
                " מי שאומר שהעולם נפלא  ",
                " צודק מאה אחוז, ",
                " כל אחד רואה את העולם  ",
                " מהמקום שהוא מצוי בו ברגע זה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=14
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost642(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554_960_720.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                "   אתה נמחץ בין    ",
                " הצורך האובססיבי שלך לדעת הכל  ",
                " (כצורך הישרדותי קדום), ",
                " והעייפות הנפשית שנובעת מזה  ",
                " (כבעל קיבולת חוויתית מוגבלת). "
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
    fun loadPost643(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/01/19/07/boy-1637188_960_720.jpg"
            postText = arrayListOf(
                " יש לך תחביב מוזר, ",
                " ליצור בורות חדשים בכל יום ",
                " וליפול לבורות האלה,  ",
                " צריך כושר גופני לתחביב הזה, ",
                " יכולת לקבל בראש ללא הגבלה  ",
                " והתמדה לעסוק בזה כל יום מחדש. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=21
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost644(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/04/27/03/50/portrait-3353699_960_720.jpg"
            postText = arrayListOf(
                " אתה לא נהנה בחיים שלך ",
                " כי לא באת הנה להנות, ",
                " באת לחיות כמה שנים  ",
                " וזהו, ",
                "אומנם חלק מהחיים זה להראות שאתה נהנה",
                " אבל אין לזה שום קשר עם ההנאה עצמה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost645(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646_960_720.jpg"
            postText = arrayListOf(
                "   אני כזה   ",
                " ולפעמים אני מרגיש אשם ",
                "   שאני כזה,    ",
                "   אם הייתי אחר   ",
                " בטוח שלפעמים הייתי מרגיש אשם ",
                "    שאני אחר.    "
            )
             postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost646(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/02/08/22/23/afghanistan-79492_960_720.jpg"
            postText = arrayListOf(
                " כל הבעיות בעולם  ",
                " יסתדרו גם בלעדיך ",
                " בצורה כזו או אחרת,  ",
                " השאלה ",
                "  כמה אתה תסתדר בלעדיך  ",
                " בזמן שכולך שקוע בבעיות האלה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost647(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/07/20/51/monk-1378196_960_720.jpg"
            postText = arrayListOf(
                " מילת כזב ",
                " היא מילה שעוברת לידך, ",
                " מילת אמת  ",
                " היא מילה שחיה בך, ",
                " זו יכולה להיות אותה מילה ",
                " שפוגשת אותך בזמנים שונים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=62
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost648(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_960_720.jpg"
            postText = arrayListOf(
                " האדם בנוי מהחלק הגלוי לכולם ",
                " והוא תוצר של כל הבעיות שלו ",
                " שנפתרו בעבר,  ",
                " ומהחלק הסמוי מכול ",
                " והוא תוצר של כל הבעיות שלו ",
                " שלא נפתרו מעולם. "
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
    fun loadPost649(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/01/16/14/31/train-5922321_960_720.jpg"
            postText = arrayListOf(
                " כדי להגיע לאור ",
                " אתה צריך התכוונות אישית ",
                " להביא את עצמך אליו, ",
                " כדי להגיע  לחושך ",
                " אתה לא צריך שום התכוונות ",
                " הוא ימצא אותך בכוחות עצמו. "
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
    fun loadPost650(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/02/10/59/water-4173134_960_720.jpg"
            postText = arrayListOf(
                " משמעות ",
                " זה אפיק בחיים שבו אתה זורם ",
                " פעם בשטף ופעם בנחת, ",
                " בלעדי המשמעות ",
                " אתה נגר עלי ",
                " הזורם סתם לכל הכיוונים. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost651(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/06/06/27/emoji-3202669_960_720.jpg"
            postText = arrayListOf(
                " לאדם יש שני מצבי קיום: ",
                " או מצב פיסי ירוד ",
                " מה שנקרא \"אני מרגיש זיפת\", ",
                " או מצב נפשי ירוד ",
                " מה שנקרא טמטום חושים, ",
                " זה בדרך כלל לא הולך ביחד. "
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
    fun loadPost652(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/03/05/00/13/hands-4903050_960_720.jpg"
            postText = arrayListOf(
                " איך אתה טופס את עצמך ? ",
                " כתמונת פייסבוק קפואה ",
                " של נחל זורם, ",
                " או  ",
                " שידור און ליין דינמי ",
                " של נחל מבעבע מתוך האדמה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=34
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

      fun loadPost653(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/29/16/42/smartphone-2354157_960_720.jpg"
            postText = arrayListOf(
                " אם אתה מצלם חוויה ",
                " החיים שלך משתנים באותו רגע, ",
                " מהחוויה - לצילום החוויה, ",
                " מהשחקן הראשי - לפועל במה  ",
                " ולא תמיד זה שווה. ",
                " (אלא אם הקהל בהצגת חייך הוא המרכז) "
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
    fun loadPost654(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/07/03/07/33/seagull-2466929_960_720.jpg"
            postText = arrayListOf(
                " אין קשר ממשי ",
                " בין המילים לחיים עצמם, ",
                " הקשר היחידי הקיים ",
                " זו אותה תחושה עמומה של סיפוק  ",
                " שהמילה הזו שכתבת ",
                " הצליחה לגעת ברגע הזה שחלף."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=20
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost655(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2015/08/31/22/32/summer-916181_960_720.jpg"
            postText = arrayListOf(
                " יש מקומות בך ",
                " שהם מחוץ למימד הזמן ",
                " השנים לא נוגעות בהם כלל, ",
                " הם נראים די מפגרים  ",
                " בראי המציאות המשתנה ",
                " אבל הם החלק היותר אמיתי שבך."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost656(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/02/02/15/15/bottle-2032980_960_720.jpg"
            postText = arrayListOf(
                " בעולם שלך ",
                " אתה נותן לדברים חיים, ",
                " מהמפלצות הגדולות  ",
                "   עד למקור היצירה שבך,    ",
                " אל תעשה זאת מתוך הרגל ",
                "   כי אתה חי בעולם הזה.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost657(): Post {
    var post = Post()
    with(post) {
        imageUri ="https://cdn.pixabay.com/photo/2023/03/02/11/38/man-7825138_960_720.jpg"
        postText = arrayListOf(
            " הנטייה הזו שלך  ",
            " לעשות דברים מסוימים בצורה מסוימת ",
            " מגדירה את האישיות שבך,  ",
            " האמונה  שלך  ",
            " באישיות הזאת ",
            "  מגדירה את החופש שבך.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=28
        val selector=1
        val fontFamily=103
       val grade=75
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,
                                                 margin,colorIndex,selector,fontFamily,grade)
    }
    return post
}
fun loadPost658(): Post {
    var post = Post()
    with(post) {
        imageUri ="https://cdn.pixabay.com/photo/2018/11/17/23/46/boy-3822290_960_720.jpg"
        postText = arrayListOf(
            " האדם מרגיש רע עם עצמו  ",
            " לא בגלל המודעות שלו ",
            " לדברים שקורים,  ",
            " אלא בעיקר  ",
            " בגלל חוסר המודעות שלו ",
            "  לדברים שקורים.  "
        )
        postTransparency =5
        postTextSize = arrayListOf(0,15)
        margin=10
        val colorIndex=28
        val selector=1
        val fontFamily=103
        val grade=78
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,
                                    colorIndex,selector,fontFamily,grade)
    }
    return post
}
    fun logi(message: String) {
        Log.i("gg", message)
    }
 }