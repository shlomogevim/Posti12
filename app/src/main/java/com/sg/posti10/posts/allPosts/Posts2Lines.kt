package com.sg.posti10.posts.allPosts

import com.sg.posti10.model.Post
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts2Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost200(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
            postText = arrayListOf(
                "  אין בעיות בעולם  ",
                "  חוץ מאלה שאצלך בראש.  "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost201(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
            postText = arrayListOf(
                "  לאמת פנים רבות  ",
                "  אחד מהם הוא השקר."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=56
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost202(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/12/16/22/22/bora-bora-3023437_1280.jpg"
            postText = arrayListOf(
                " כל חלום מפסיק להיות כזה ",
                " ברגע שהוא הופך לשגרה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=56
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost203(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
            postText = arrayListOf(
                "ונתתי את האור וחושך לפניך",
                "ובחרת באור."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost204(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא יכול להטיב את המצב ",
                " אז על תתערב. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost205(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
            postText = arrayListOf(
                "  אי עשייה גוררת  אי עשייה,  ",
                "  עשייה גוררת  עשייה.  "
            )
            postTransparency =8
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
    fun loadPost206(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/06/26/08/28/soil-5342049_1280.jpg"
            postText = arrayListOf(
                "  ככל  שהחיים נעשים שבירים יותר,  ",
                " כך הם  מובנים יותר. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost207(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText = arrayListOf(
                " האלוהים ברא את היצירה ",
                " האדם  את  הביקורת. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=0
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost208(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/05/25/17/03/travel-5219496_1280.jpg"
            postText = arrayListOf(
                "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
                "אבל החיים בוחרים לך את סוג החוויה שם."
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost209(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
            postText = arrayListOf(
                "  זה שאתה באמת מאמין בהבלים,  ",
                "  זה לא עושה אותם פחות הבלים.  "
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
    fun loadPost210(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
            postText = arrayListOf(
                " חכם לא עושה דברים ",
                " שטיפש סובל מהם על בסיס קבוע. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=3
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost211(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
            postText = arrayListOf(
                " הטיפש בטוח בחכמתו ",
                " החכם בטוח בטיפשוטו. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=3
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost212(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
            postText = arrayListOf(
                "   להיתפס כטמבל בעיני עצמך   ",
                " זה הרבה יותר גרוע מלהיות טמבל. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=48
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost213(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
            postText = arrayListOf(
                "אתה לא יכול להרוויח משהו אמיתי בחיים האלה,",
                "פרט לזכות הזאת לחיות את הרגע הזה."
            )
            postTransparency =0
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
    fun loadPost214(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
            postText = arrayListOf(
                " אתה לא מספיק טוב ",
                " כדי להבין כמה טוב. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=20
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost215(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/05/02/18/15/church-750251_1280.jpg"
            postText = arrayListOf(
                " הימים הנוראים לא כל כך נוראיים, ",
                " סתם יצא להם שם שכזה. "
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
    fun loadPost216(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/21/18/43/smilies-1610505_1280.jpg"
            postText = arrayListOf(
                "  החיים טובים  ",
                "  למי שטוב לעצמו  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=30
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost217(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/28/12/20/happiness-824419_1280.jpg"
            postText = arrayListOf(
                "החיים לא שווים הרבה",
                "אם לא חיים אותם."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=2
            val colorIndex=51
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost218(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/28/02/08/diary-3435095_1280.jpg"
            postText = arrayListOf(
                "  מילים יכולות לפתוח לך עולמות  ",
                "  התחכמויות סוגרות לך עולמות.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=67
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost219(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/09/29/12/51/man-5612736_1280.jpg"
            postText = arrayListOf(
                "משתדל שלא להילחם עם החיים",
                "למרות שאני תמיד צודק."
            )
            postTransparency =5
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
    fun loadPost220(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/01/14/59/person-4733756_1280.jpg"
            postText = arrayListOf(
                "האדם",
                "הוא מה שהוא חושב שהוא."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=0
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost221(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/19/15/animal-1836482_1280.jpg"
            postText = arrayListOf(
                "זה שהחילזון רואה את השמים",
                "זה לא עושה אותו פחות חילזון."
            )
            postTransparency =0
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
    fun loadPost222(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/05/09/16/06/windsurfing-2298647_1280.jpg"
            postText = arrayListOf(
                "אם זה נכון בשבילך",
                "כל טרחה שווה."
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
    fun loadPost223(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/08/23/16/11/abstract-5511271_1280.jpg"
            postText = arrayListOf(
                "החיים זה מרחב אינסופי",
                "שבו גם אתה קורה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost224(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/15/11/51/forest-2068376_1280.jpg"
            postText = arrayListOf(
                "החיים הם הרבה יותר",
                "מהסיפור שאתה מספר לעצמך עליהם."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost225(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/04/05/18/04/brick-2205882_1280.jpg"
            postText = arrayListOf(
                "  רגשות אשמה זה המקום  ",
                "  בו אתה לא מקבל את מה שאתה.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=52
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost226(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/08/09/15/45/sky-414199_1280.jpg"
            postText = arrayListOf(
                "  מי שאין לו קצת עננים מעליו,  ",
                "קרינת השמש שורפת לו את המחשבה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=110
            val colorIndex=56
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost227(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/06/26/19/23/intravenous-141551_1280.jpg"
            postText = arrayListOf(
                " מעדיף תיסכולים דמיוניים של אדם בריא   ",
                "  על תסכולים אמיתיים של אדם חולה.  "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=11
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost228(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/12/17/38/music-5035159_960_720.jpg"
            postText = arrayListOf(
                "במקום שבו כולם חרשים",
                "מי ששומע חריג."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost229(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/26/15/41/girl-2175843_1280.jpg"
            postText = arrayListOf(
                "אחד המכשולים הגדולים של החיים",
                "  הוא חוסר במכשולים.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=41
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost230(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_1280.jpg"
            postText = arrayListOf(
                "  הדרך לגיהנום  ",
                "  רצופה בחוסר מודעות.  "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=41
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost231(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/19/47/hand-845269_1280.jpg"
            postText = arrayListOf(
                "הדברים שאתה יוצר",
                "יוצרים אותך."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost232(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/03/12/18/06/boys-286179_960_720.jpg"
            postText = arrayListOf(
                "הכישרון הכי כיפי שאני מכיר",
                "זה היכולת להינות גם מקלישאות."
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost233(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/17/31/boy-1853960_1280.jpg"
            postText = arrayListOf(
                "מה שאתה עושה מהחיים",
                "זה מה שהם בשבילך."
            )
            postTransparency =0
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
    fun loadPost234(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593_1280.jpg"
            postText = arrayListOf(
                "  הבעיה המרכזית של בני האדם  ",
                "  היא בהיותם בני אדם.  "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=83
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost235(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/10/09/02/06/hands-2832239_1280.jpg"
            postText = arrayListOf(
                "  שתיצור בחיים  ",
                "  יותר מאשר החיים יצרו אותך.  "
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
    fun loadPost236(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/12/23/11/46/man-7674167_960_720.jpg"
            postText = arrayListOf(
                "אתה לא צריך להיות טיפש",
                "כדי לדבר בטיפשות."
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=79
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost237(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/07/04/17/desperate-5011953_1280.jpg"
            postText = arrayListOf(
                " אל תעסוק הרבה במחשבות שלך ",
                "הם מסתדרות יפה מאוד גם בלעדיך."
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=79
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost238(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/27/07/02/time-2980690_1280.jpg"
            postText = arrayListOf(
                "  זמן פנוי יכול להיות הרסני  ",
                "  למי שיש לו רק זמן פנוי.  "
            )
            postTransparency =6
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
    fun loadPost239(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/02/22/20/07/book-15584_1280.jpg"
            postText = arrayListOf(
                " החיים זה דבר משעמם ",
                "  לאנשים שלא מבינים בזה.  "
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
    fun loadPost240(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/26/09/09/merry-1162081_1280.jpg"
            postText = arrayListOf(
                " גם מחצי כוס ריקה ",
                "  אפשר לשתות לרוויה.  "
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
    fun loadPost241(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/03/17/12/57/phone-4060860_1280.jpg"
            postText = arrayListOf(
                " אתה לא יכול לשחק משחק ",
                "  שאתה מתנכר לכללים שלו.  "
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
    fun loadPost242(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/07/31/08/12/dogs-2556820_1280.jpg"
            postText = arrayListOf(
                " וויכוחים פוליטיים ",
                "  היא הרכילות של אנשים רציניים.  "
            )
            postTransparency =6
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
    fun loadPost243(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/05/32/rooster-1867562_1280.jpg"
            postText = arrayListOf(
                " כל מה שאתה חושב על העולם, ",
                "  זה רק מה שאתה חושב על העולם.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=53
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost244(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_1280.jpg"
            postText = arrayListOf(
                " שתתבאס פחות על דברים ",
                " שאתה בכלל לא צריך להתבאס מהם. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost245(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/08/20/17/16/dna-6560897_1280.jpg"
            postText = arrayListOf(
                " האדם הוא מוטציה ",
                " של יצור הגיוני.  "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=10
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost246(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2013/04/27/09/48/old-lady-107404_960_720.jpg"
            postText = arrayListOf(
                "   למציאות פרשנויות רבות ",
                "   לאגו פרשנות אחת.  "
            )
            postTransparency =8
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
    fun loadPost247(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/14/11/01/jerusalem-1328645_1280.jpg"
            postText = arrayListOf(
                " הציונות בת יותר ממאה שנים ",
                " והיא באמת נראית ככה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=33
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost248(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/12/01/12/02/yesterday-221763_960_720.jpg"
            postText = arrayListOf(
                " יום חדש הוא כמו יום האתמול ",
                " אם אתה נשאר מה שהיית אתמול.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost249(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/12/15/13/40/smartphone-569076_1280.jpg"
            postText = arrayListOf(
                " מי שלא רץ אחרי סיפורים ",
                " לא נפגע מבדותות.  "
            )
            postTransparency =5
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
    fun loadPost250(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/07/01/09/26/mobile-phones-1490691_1280.jpg"
            postText = arrayListOf(
                " שאתה מתייחס להבלים ",
                " אתה הופך להבלים. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost251(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/01/12/17/30/warm-and-cozy-1975215_1280.jpg"
            postText = arrayListOf(
                " הנוחות לאורך זמן ",
                " הופכת ללא נוחה. "
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
    fun loadPost252(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/19/07/30/girl-2961959_1280.jpg"
            postText = arrayListOf(
                " שמור אותי מעוגמות הנפש שלי, ",
                " עם החיים עצמם אסתדר כבר בעצמי. "
            )
            postTransparency =0
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
    fun loadPost253(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/16/14/38/portrait-3157821_1280.jpg"
            postText = arrayListOf(
                " אתה לא תמיד הכי מוצלח ",
                " אבל אתה תמיד הכי אתה. "
            )
            postTransparency =0
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
    fun loadPost254(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/24/14/51/lonely-273629_1280.jpg"
            postText = arrayListOf(
                " השמים הגבוהים לא שימושיים ",
                " למי שחי בתוך המחשבות שלו. "
            )
            postTransparency =2
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=40
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost255(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/03/22/22/17/phone-292994_1280.jpg"
            postText = arrayListOf(
                "   הלבד   ",
                " זה הביחד החדש. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost256(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/27/02/11/cemetery-1697469_1280.jpg"
            postText = arrayListOf(
                " שאתה נוכח בשקט  ",
                " אתה יוצר שקט בך. "
            )
            postTransparency =10
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
    fun loadPost257(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/23/07/47/baby-2972221_960_720.jpg"
            postText = arrayListOf(
                " אם תצליח לוותר על שניתן לוותר ",
                " תוכל להתחיל מנקודת ההתחלה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=47
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost258(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/06/18/18/48/highway-5314645_1280.jpg"
            postText = arrayListOf(
                "    אין חופש אמיתי     ",
                "   ללא חרדה מהבלתי ידוע.   "
            )
            postTransparency =0
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
    fun loadPost259(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/16/22/55/road-601871_1280.jpg"
            postText = arrayListOf(
                " הגוף חי בעולם הזה ",
                "  הנשמה קובעת איך. "
            )
            postTransparency =6
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
    fun loadPost260(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/11/05/14/29/trees-sunrise-3796183_1280.jpg"
            postText = arrayListOf(
                " מי שמסתייג מהצל שלו ",
                "  שלא יצא לשמש. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=49
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost261(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/02/11/21/39/weightlifter-3146825_1280.jpg"
            postText = arrayListOf(
                " אל תהיה מטומטם ",
                "  כדי שלא תרגיש מטומטם. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost262(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/26/18/40/baby-3109433_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא מתחדש ",
                "  אתה מתיישן. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,18)
            margin=10
            val colorIndex=49
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost263(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/02/13/16/14/water-1198130_1280.jpg"
            postText = arrayListOf(
                " אל תתבאס מהמקומות הלא נחמדים  ",
                "  אפשר ששם מונחת בשבילך התשובה. "
            )
            postTransparency =8
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
    fun loadPost264(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/10/16/20/00/woman-491623_1280.jpg"
            postText = arrayListOf(
                " אם החלומות שלך מזדקנים איתך,  ",
                "  סימן שלא בחרת את החלומות הנכונים. "
            )
            postTransparency =0
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
    fun loadPost265(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/27/16/30/pretty-1357039_1280.jpg"
            postText = arrayListOf(
                "  מי שלא יודע להניח לדברים  ",
                "  הדברים לא מניחים לו.  "
            )
            postTransparency =5
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
    fun loadPost266(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2013/08/24/08/35/mountain-bike-175216_1280.jpg"
            postText = arrayListOf(
                "בעולם ללא ירידות",
                "אין עליות."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=19
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost267(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/18/23/26/man-850971_960_720.jpg"
            postText = arrayListOf(
                "העולם נראה לך כזה",
                "בגלל שאתה כזה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=12
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost268(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/03/21/19/27/sea-4955005_1280.jpg"
            postText = arrayListOf(
                "כל קסם הופך לשיגרה",
                "אם הוא קורה על בסיס יומי."
            )
            postTransparency =0
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
   fun loadPost269(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/06/dog-1854119_1280.jpg"
            postText = arrayListOf(
                "  אדם החושב כמו כלב  ",
                "  חי כמו כלב.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=27
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost270(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/10/10/19/57/elderly-981400_1280.jpg"
            postText = arrayListOf(
                "  כמה שמסביבך הכל יותר בסדר  ",
                "  כך אתה יותר בסדר.  "
            )
            postTransparency =10
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
    fun loadPost271(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/11/17/22/15/trees-3822149_1280.jpg"
            postText = arrayListOf(
                "  לא כל הנוצץ זהב  ",
                "  ולא כל זהב נוצץ.  "
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost272(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/22/07/30/burning-log-2088631_1280.jpg"
            postText = arrayListOf(
                "  אי אפשר להתחמם  ",
                "  מצילומי אח בוערת.  "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=25
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost273(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/13/19/23/rome-1591429_1280.jpg"
            postText = arrayListOf(
                "  שמור אותי מהצודקים  ",
                "  עם הטועים אני כבר אסתדר.  "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=22
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost274(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/03/27/22/32/mood-4086055_1280.jpg"
            postText = arrayListOf(
                "אין הרבה חכמים גדולים בחיים האלה",
                "בעיקר בסוף הלילה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=80
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost275(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/01/21/20/earth-1365995_1280.jpg"
            postText = arrayListOf(
                "אם אתה רוצה לשנות את העולם",
                "זה סימן שלא הבנת אותו מי יודע מה."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=10
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost276(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/07/15/19/28/solitaire-7323878_1280.jpg"
            postText = arrayListOf(
                "פוליטיקה זו ארץ גזרה",
                "שאתה הולך אליה מרצון."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=90
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost277(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/05/02/20/10/lonely-5122894_1280.jpg"
            postText = arrayListOf(
                "אנשים נוטים לבזבז את החיים שלהם",
                "במחשבות על החיים שלהם."
            )
            postTransparency =0
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
    fun loadPost278(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/45/human-3368111_1280.jpg"
            postText = arrayListOf(
                " נראה, שכדי להישאר בגן עדן ",
                " כדאי לך להימנע מעץ הדעת. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=22
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost279(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/07/10/20/18/goats-5392037_960_720.jpg"
            postText = arrayListOf(
                "כולם יכולים להשתתף בוויכוח פוליטי",
                " רק מעטים יכולים להמנע מכך. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=25
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost280(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_960_720.jpg"
            postText = arrayListOf(
                "שתבין כאלוהים",
                "את חיית השדה שבך."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=10
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost281(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/28/22/32/analogue-1701651_960_720.jpg"
            postText = arrayListOf(
                "עדיף חיים עם בעיות",
                "ממוות ללא בעיות."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=10
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost282(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/04/06/02/20/cyclist-4106536_960_720.jpg"
            postText = arrayListOf(
                "אם עשית את המיטב שלך",
                "איש לא יכול להאשים אותך בדבר."
            )
            postTransparency =7
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
    fun loadPost283(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/03/31/11/06/crowd-4987227_960_720.jpg"
            postText = arrayListOf(
                "  פוליטיקה  ",
                "  היא אלטרנטיבה לא משהו לחיים.  "
            )
            postTransparency =7
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
    fun loadPost284(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/06/06/23/37/death-valley-4257280_960_720.jpg"
            postText = arrayListOf(
                "  שתצליח לגעת בחיים  ",
                "  לפני שהמוות יגע בך.  "
            )
            postTransparency =7
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
    fun loadPost285(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/08/29/02/48/sunset-176939_960_720.jpg"
            postText = arrayListOf(
                "הכל צפוי",
                "גם התגובה שלך."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,18)
            margin=5
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost286(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/07/23/06/10/man-3556090_960_720.jpg"
            postText = arrayListOf(
                "אם את הולך קדימה",
                "אל תביט לאחור."
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
    fun loadPost287(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/26/10/35/home-5094603_960_720.jpg"
            postText = arrayListOf(
                "תהיה אופטימי",
                "תמיד יכול להיות יותר גרוע."
            )
            postTransparency =0
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
    fun loadPost288(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/01/21/13/39/night-sky-7733876_960_720.jpg"
            postText = arrayListOf(
                "השקט כבר פה",
                "אתה רק צריך להביא את עצמך אליו."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=32
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost289(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/06/26/22/09/sheep-7286385_960_720.jpg"
            postText = arrayListOf(
                "שתהיה לך חוצפה להיות אתה",
                "גם במקומות שמקדשים את העדר."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost290(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/21/15/42/disposal-1846033_960_720.jpg"
            postText = arrayListOf(
                " יש אומרים שהכל פוליטי ",
                "וזה נכון רק לאלה שנמצאים בגיהינום."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=20
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost291(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/27/16/50/beach-2179624_960_720.jpg"
            postText = arrayListOf(
                "  כמה שהאופק שלך יותר רחוק   ",
                "  ככה נכנס בך יותר עולם.  "
            )
            postTransparency =3
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
    fun loadPost292(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/18/14/21/swimmer-1678307_960_720.jpg"
            postText = arrayListOf(
                "את החלומות רצוי שתשמור באיזור החלומות,",
                " במציאות הם יכולים לגרום לך ברדק רציני."
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
    fun loadPost293(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/25/man-1850181_960_720.jpg"
            postText = arrayListOf(
                "אני רק בן אדם",
                " ואין לי הרבה מה לעשות בנושא זה."
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
    fun loadPost294(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/04/23/02/candle-2038736_960_720.jpg"
            postText = arrayListOf(
                " להביא חושך בחשכה כל אחד יכול ",
                " להביא אור בחשכה רק מעטים יודעים."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=21
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost295(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/12/09/39/animals-1974166_960_720.jpg"
            postText = arrayListOf(
                " מה שמזעזע אותי  ",
                " זה מה שמזעזע אותי. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=0
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
   fun loadPost296(): Post {
       var post = Post()
       with(post) {
           imageUri = "https://cdn.pixabay.com/photo/2020/09/30/14/21/man-5615889_960_720.jpg"
           postText = arrayListOf(
               " אל תהיה מוטרד  ",
               " מזה שאתה מוטרד. "
           )
           postTransparency =10
           postTextSize = arrayListOf(0,16)
           margin=5
           val colorIndex=26
           val selector=2
           val fontFamily=103
           postNum= tool.extractPostNumFromFunctionName()
           post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
       }
       return post
   }

   fun loadPost297(): Post {
       var post = Post()
       with(post) {
           imageUri = "https://cdn.pixabay.com/photo/2016/07/29/15/30/game-1553995_960_720.jpg"
           postText = arrayListOf(
               " כמה שאתה יותר מחובר לרשת  ",
               " ככה אתה פחות מחובר לעצמך. "
           )
           postTransparency =10
           postTextSize = arrayListOf(0,16)
           margin=0
           val colorIndex=39
           val selector=1
           val fontFamily=103
           postNum= tool.extractPostNumFromFunctionName()
           post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
       }
       return post
   }

   fun loadPost298(): Post {
       var post = Post()
       with(post) {
           imageUri = "https://cdn.pixabay.com/photo/2023/02/01/16/04/fog-7760708_960_720.jpg"
           postText = arrayListOf(
               " השלמות  היא מצב רגעי ",
               " חוסר השלמות היא הבסיס. "
           )
           postTransparency =6
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
    fun loadPost299(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/12/24/21/14/portrait-7676482_960_720.jpg"
            postText = arrayListOf(
                " זה פחות איפה טעינו בעבר ",
                " ויותר איך לעשות את נכון עכשיו. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=46
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29900(): Post {    // f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/09/05/07/28/writing-923882_960_720.jpg"
            postText = arrayListOf(
                " אתה הוא זה  ",
                " שעושה את הדשא של השכן ירוק יותר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=48
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost29901(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/07/18/14/57/baby-164003_960_720.jpg"
            postText = arrayListOf(
                " אל תוציא סתם מילים  ",
                " כי אתה מה שאתה אומר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost29902(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/27/13/13/monk-1545250_960_720.jpg"
            postText = arrayListOf(
                " כמה שתכיר במגבלה שלך  ",
                " ככה תהיה פחות מוגבל. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29903(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/03/01/16/52/puzzle-654956_960_720.jpg"
            postText = arrayListOf(
                " חוסר השלמות נוצרת  ",
                " מחוסר ההבנה של השלמות. "
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

    fun loadPost29904(): Post {     //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/12/30/22/47/baby-1941747_960_720.jpg"
            postText = arrayListOf(
                " ההקלה האמתית מגיעה עם התובנה ",
                " שרגשות אשמה הם רק רגשות אשמה. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29905(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/21/23/55/daniel-2667386_960_720.jpg"
            postText = arrayListOf(
                " האדם מתמחה בללכת בדרכים ללא מוצא ",
                " ובלקטר שלדרכים האלה אין מוצא. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost29906(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/18/23/26/man-850971_960_720.jpg"
            postText = arrayListOf(
                " אני לא תמיד הכי חכם בעולם ",
                " אבל אני תמיד הכי אני בעולם. "
            )
            postTransparency =0
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
    fun loadPost29907(): Post {     //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/06/13/15/33/leaf-7260246_960_720.jpg"
            postText = arrayListOf(
                " מי שחי בעולם שהטוב מובן מאליו ",
                " חי בעולם שרובו דברים מבאסים. "
            )
            postTransparency =0
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
    fun loadPost29908(): Post {   //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/28/12/20/happiness-824419_960_720.jpg"
            postText = arrayListOf(
                "  המסכנות זה מקצוע  ",
                " האושר זה תחביב. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=27
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29909(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/06/24/17/24/ruin-5337039_960_720.jpg"
            postText = arrayListOf(
                " אין עצה כנגד הזמן ",
                " אבל יש תבונה בלהסתדר איתו. "
            )
            postTransparency =5
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
    fun loadPost29910(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/08/12/13/56/people-5482729_960_720.jpg"
            postText = arrayListOf(
                " אל תיקח את העולם הזה כל כך אישית ",
                " הוא מתנהג ככה לכולם. "
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
      fun loadPost29911(): Post {  //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/17/20/23/create-4857731_960_720.jpg"
            postText = arrayListOf(
                " אתה יוצר את החיים ",
                " שיוצרים אותך. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,18)
            margin=0
            val colorIndex=42
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost29912(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/11/19/20/03/tranquility-base-7602925_960_720.jpg"
            postText = arrayListOf(
                " ככל שהחיים נעשים יותר שבירים ",
                " כך הם יותר מובנים. "
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
fun loadPost29913(): Post {  //f
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2019/01/28/07/15/man-3959784_960_720.jpg"
        postText = arrayListOf(
            " אל תתייאש ",
            " החיים זה מצב זמני. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,18)
        margin=5
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost29914(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/25/19/57/marijuana-2174302_960_720.jpg"
            postText = arrayListOf(
                " החיים זה חומר משובח  ",
                " חבל שהאדם לא יודע להשתמש בו טוב יותר. "
            )
            postTransparency =0
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

fun loadPost29_915(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2022/08/21/14/55/seagull-7401497_960_720.jpg"
        postText = arrayListOf(
            " רק הרגע הזה ",
            " קובע מה אתה באמת. "
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=35
        val selector=2
        val grade=83
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
      /*  post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,
            margin,colorIndex,selector,fontFamily,grade)*/
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,
            margin,colorIndex,selector,fontFamily,grade)
    }
    return post
}
    fun loadPost29_916(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/06/09/25/hijab-3064633_960_720.jpg"
            postText = arrayListOf(
                " כל אחד רוצה להיות מישהו אחר ",
                " כאילו שאת עצמו הוא כבר ניסה באמת. "
            )
            postTransparency =0
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
   fun loadPost29_917(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/02/10/13/44/gorilla-7780902_960_720.jpg"
            postText = arrayListOf(
                " שמור אותי מעצמי ",
                " משאר העולם אני כבר אשמר. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost29_918(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/03/01/20/07/flowers-7823941_960_720.jpg"
            postText = arrayListOf(
                " שהיית כל כך עסוק בחיים ",
                " שלא נותר בך זמן לחיות אותם. "
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

    fun loadPost29_919(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2023/03/11/11/19/bird-7844233_960_720.jpg"
            postText = arrayListOf(
                " הכעס מעצב לנו את האישיות ",
                " האהבה מאפשרת לנו לצאת ממנה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=28
            val selector=1
            val grade=80
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,
                margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }

    fun loadPost29_920(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/25/15/53/girl-1107788_960_720.jpg"
            postText = arrayListOf(
                "   לאחרים אתה מייצג מישהו  ",
                "   לעצמך אתה לא מייצג דבר. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=28
            val selector=1
            var grade=81
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }

    fun loadPost29_921(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/06/29/12/11/snail-5352510_960_720.jpg"
            postText = arrayListOf(
                "   החופש בחיים הוא  ",
                "   להבין שאתה לא מבין. "
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=28
            val selector=1
            var grade=82
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }
}
