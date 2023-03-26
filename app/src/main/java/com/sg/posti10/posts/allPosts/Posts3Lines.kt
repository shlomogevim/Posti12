package com.sg.posti10.posts.allPosts

import com.sg.posti10.model.Post
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts3Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0
    fun loadPost300(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/12/23/sport-1014035_1280.jpg"
            postText = arrayListOf(
                " יש כמה המצאות אנושיות ",
                " שלא עובדות כל כך במציאות, ",
                " אחת מהם היא ההגינות. ",
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
    fun loadPost301(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/03/04/08/35/despair-1235583_1280.jpg"
            postText = arrayListOf(
                " החיים לא כל כך מבאסים," ,
                " כמו שאתה  ",
                " יצור שנוטה להתבאס מהחיים. ",
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
    fun loadPost302(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/08/21/23/29/forest-3622519_1280.jpg"
            val str="\""
            postText = arrayListOf(
                str+"הרחק מההמון הסואן"+str ,
                " זה לא מקום ",
                " זה מצב נפשי. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=31
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost303(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/07/29/08/51/target-1551492_1280.jpg"
            postText =  arrayListOf(
                " ההצלחה שלך נמדדת ",
                " רק לפי האמונה שבך ",
                " שאתה מצליח. "

            )
            postTransparency =0
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
    fun loadPost304(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/10/03/23/23/puzzle-1713170_1280.jpg"
            postText =  arrayListOf(
                "החיים האלה דורשים ממך להתנהל בהיגיון,",
                "  למרות שהם עצמם ",
                " ממש לא הגיוניים. "
            )
            postTransparency =9
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=17
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost305(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/03/29/15/18/tianjin-2185510_1280.jpg"
            postText =  arrayListOf(
                " יש לך את הכל, ",
                "  גם את אותה המחשבה  ",
                " שחסר לך משהו. "
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost306(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
            postText = arrayListOf(
                "  המתכון הבטוח שלא  להזדקן  ",
                " הוא פשוט ",
                "   להישאר צעיר. ",
            )
            postTransparency =10
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
    fun loadPost307(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/10/09/13/12/man-5640540__340.jpg"
            postText = arrayListOf(
                "האדם הוא יצור שכחן,",
                "הוא בדרך כלל נזכר לחיות",
                "רק כמה רגעים לפני המוות שלו.",
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
    fun loadPost308(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/19/38/lost-places-1549096_1280.jpg"
            postText = arrayListOf(
                "אתה יוצר את עולמך משני חומרים,",
                "מהדברים שיש לך בקיומם",
                "והדברים שאין לך בחסרונם.",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=10
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost309(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_1280.jpg"
            postText = arrayListOf(
                "כל אחד נדפק בחיים פה ושם,",
                "אבל לא כל אחד",
                "מחשיב את עצמו לדפוק.",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=25
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost310(): Post {  //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/12/21/10/16/barbed-wire-6884984_1280.jpg"
            postText = arrayListOf(
                "בדיקטטורה האכזרית שבעולמך,",
                "אתה יוצר בכל בוקר",
                "את השליטים שלך.",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost311(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/10/25/16/54/african-lion-2888519_1280.jpg"
            postText = arrayListOf(
                "העולם הזה לא משוגע,",
                "הוא מתנהל לפי כללים ברורים",
                "שרק משוגע לא מבין אותם.",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost312(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/04/25/06/15/father-and-son-2258681_1280.jpg"
            postText = arrayListOf(
                "עם השנים אתה לא נעשה בוגר יותר,",
                "אתה רק לומד להסתיר יותר",
                "את הילדותיות שלך.",
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
    fun loadPost313(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_1280.jpg"
            postText = arrayListOf(
                "  יש אנשים בחיים שלך  ",
                "שלא יעזור לך גם אם תתרחק מהם אל מעבר לאופק,",
                " החוויה איתם נשארת איתך קרוב. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost314(): Post {  //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/22/20/51/rivers-272352_1280.jpg"
            postText = arrayListOf(
                " כל הנחלים זורמים לים ",
                "   גם אם זה צודק   ",
                " וגם אם לא. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=43
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost315(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/11/23/07/47/baby-2972221_960_720.jpg"
            postText = arrayListOf(
                " אתה בסדר ",
                " ברגע שאין בך צורך שמישהו אחר יגיד לך ",
                " שאתה בסדר. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=37
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost316(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/08/05/22/buddhist-1807526_1280.jpg"
            postText = arrayListOf(
                "  הצורך להתבטא  ",
                "  בדרך כלל חזק יותר  ",
                "  מהצורך להגיד משהוא אמיתי.  ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost317(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/06/07/12/21/hands-3460021_1280.jpg"
            postText = arrayListOf(
                " העבדות להבלים היא עבדות מרצון, ",
                " אומנם היא די נוחה  ",
                "  אבל זה לא עושה אותה פחות עבדות.  ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost318(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/07/26/07/18/man-5438612_1280.jpg"
            postText = arrayListOf(
                " (התנצלות לכולם וגם לעצמי) ",
                "  אני רק בן אדם  ",
                " ואין לי הרבה מה לעשות בנושא זה. ",
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
    fun loadPost319(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/02/27/17/00/ape-17474_1280.jpg"
            postText = arrayListOf(
                "השפיות של האדם נבחנת ביכולת שלו",
                "  לחיות בשלום יחסי  ",
                "עם החלקים הפחות שפויים שבו.",
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
    fun loadPost320(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/28/21/20/happiness-1866081_1280.jpg"
            postText = arrayListOf(
                " צריך להיות מונשם ימים ארוכים  ",
                " כדי לתפוס את הפלא הזה ",
                " של נשימה חופשית. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost321(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/04/17/20/19/woman-1335487_1280.jpg"
            postText = arrayListOf(
                "כל האנשים בנויים אותו דבר,",
                "רק שכל אחד",
                "מחביא את זה בצורה אחרת.",
            )
            postTransparency =0
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
    fun loadPost322(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/10/09/02/26/lake-192979__480.jpg"
            postText = arrayListOf(
                " שמפלס ",
                "הים שבפנים יורד",
                "אפשר לראות את הסלעים.",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=48
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost323(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/07/10/10/29/girl-3528292_1280.jpg"
            postText = arrayListOf(
                " האדם ",
                "  מכיר היטב את עלילת חייו לפרטים  ",
                "  אבל לא מבין את הסיפור כולו.  ",
            )
            postTransparency =10
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
    fun loadPost324(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/27/06/58/couple-4883585_1280.jpg"
            postText = arrayListOf(
                " לפעמים מילים ",
                "  באות לגלות דברים  ",
                "ולפעמים להסתיר.",
            )
            postTransparency =0
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
    fun loadPost325(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/12/20/14/river-1589616_1280.jpg"
            postText = arrayListOf(
                " הכעסים באים מהעבר ",
                "  החרדות מהעתיד  ",
                "והחיים עצמם מהרגע הזה .",
            )
            postTransparency =5
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
    fun loadPost326(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/01/16/15/55/people-6942460_1280.jpg"
            postText = arrayListOf(
                " כולם מדברים, ",
                "  רק מעטים ",
                " ממש אומרים משהו.",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost327(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/23/09/17/man-272676_1280.jpg"
            postText = arrayListOf(
                " כשאתה סולד מדברים מסוימים, ",
                "    זה אומר משהו לגביך   ",
                " לא על טיבם של הדברים עצמם. ",
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
    fun loadPost328(): Post {  //f
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/09/19/17/18/rag-doll-452774_1280.jpg"
            postText = arrayListOf(
                " שני דברים צריך האדם בחייו, ",
                "   אישור שלא להיות מושלם  ",
                " ורצון שלא להיות סמרטוט. ",
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
    fun loadPost329(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/27/13/13/monk-1545250_960_720.jpg"
            postText = arrayListOf(
                " תהיה אתה, ",
                " ביננו, יש  לך סיכוי לא רע ",
                " שאפילו תצליח בזה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=21
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost330(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/03/24/10/30/landscape-4963487_960_720.jpg"
            postText = arrayListOf(
                " חביבי, ",
                " אתה אורח בעולם הזה ",
                " אז תתנהג בהתאם. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost331(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/15/06/42/womman-845710_1280.jpg"
            postText = arrayListOf(
                " האדם מסכן, ",
                " ולא בגלל שהוא באמת מסכן ",
                " כמו שהוא חושב את עצמו למסכן. ",
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
    fun loadPost332(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/24/03/41/starry-sky-2675322_1280.jpg"
            postText = arrayListOf(
                " החיים שלך, ",
                " זה פיסה קטנה של אינסוף ",
                " המוגבלת בזמן. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=30
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost333(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/10/25/17/16/nature-6741602_1280.jpg"
            postText = arrayListOf(
                " החיים שלך בנויים  ",
                " ממה שקורה לך, ",
                " ומהקסם שאתה מצליח להפיק מזה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost334(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/06/27/17/18/beach-141768_960_720.jpg"
            postText = arrayListOf(
                " אתה נמחץ  ",
                " ממה שאתה נותן לו את הסמכות ",
                " למחוץ אותך. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=35
            val colorIndex=20
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost335(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/08/13/travel-1749508_1280.jpg"
            postText = arrayListOf(
                " שאתה לא שם, ",
                " גם חיים טובים ",
                "  לא יעשו לך טוב. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=90
            val colorIndex=19
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost336(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/05/31/10/51/technology-791029_1280.jpg"
            postText = arrayListOf(
                " חיים משומשים ",
                " בדרך כלל יותר בטוחים ",
                " אבל הריח שלהם לא משהו. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=52
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost337(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/04/01/08/03/plastic-flowers-702011_1280.jpg"
            postText = arrayListOf(
                " שהאמת והשקר ",
                " הופכים לשאלות פוליטיות, ",
                " הצדק הוא זיוף. ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=50
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost338(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/10/03/00/57/mouse-4522263_960_720.jpg"
            postText = arrayListOf(
                " ישנם הרבה חורים ומחילות בעולם ",
                " אתה רק צריך להחליט ",
                " אם אתה עכבר. ",
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
    fun loadPost339(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/08/08/11/23/butterfly-4392735_1280.jpg"
            postText = arrayListOf(
                " הבלי עולם הזה ",
                " זו המציאות הרגילה ",
                " שאין בה קורטוב של קדושה. ",
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
    fun loadPost340(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/07/20/53/hat-591973_1280.jpg"
            postText = arrayListOf(
                " נורמליות מקובלת ",
                " זו היכולת של האדם ",
                " להחביא את השיגעון שבו . ",
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
    fun loadPost341(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/12/15/23/26/glass-3877768_1280.jpg"
            postText = arrayListOf(
                " האדם הוא יצור מופלא, ",
                " הוא יכול להטביע את עצמו ",
                " אפילו בחצי הכוס הריקה . ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=31
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost342(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/15/07/13/homeless-845752_1280.jpg"
            postText = arrayListOf(
                " המסכנות ",
                " זאת תחושה עוברת ",
                " חוץ מלאותם שהפכו אותה למקצוע. ",
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
    fun loadPost343(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/05/35/new-york-1867570_1280.jpg"
            postText = arrayListOf(
                " כולם רואים את אותו עולם, ",
                " ויש שרואים אותו מקומת קרקע ",
                " ויש מקומה עליונה יותר. ",
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
    fun loadPost344(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/15/23/36/kid-1520706_1280.jpg"
            postText = arrayListOf(
                " הייה מה שאתה ",
                " ושתצליח להתמודד איכשהוא ",
                " עם מה שאחרים חושבים על זה. ",
            )
            postTransparency =10
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
    fun loadPost345(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/27/22/14/man-1483479_1280.jpg"
            postText = arrayListOf(
                " כשלא נתת לעצמך להיות צודק, ",
                " במרחק הזמן ",
                " היית הכי צודק. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=52
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost346(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/02/22/12/37/waves-1215449__480.jpg"
            postText = arrayListOf(
                " כולם מתרסקים פה ושם ",
                " אבל לא כולם יודעים להתאושש מזה ",
                " בצורה טובה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=67
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost347(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/02/19/17/17/winter-2080327_1280.jpg"
            postText = arrayListOf(
                " אין לי מושג אם אלוהים קיים או לא ",
                " אבל אם לוקחים אותו במינון נכון ",
                " זה יותר טוב מפרוזק. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=72
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost348(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/07/17/15/balloon-3206530_1280.jpg"
            postText = arrayListOf(
                " הקסם צומח מהעכשיו, ",
                " משאר הזמנים ",
                " צומחות אמיתות נדושות. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=61
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost349(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/05/11/08/28/sunset-110305_1280.jpg"
            postText = arrayListOf(
                " הדבר הכי חשוב בחיים ",
                " זה להכיר בזה ",
                " שאתה עדיין לא מת. ",
            )
            postTransparency =2
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
    fun loadPost350(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/11/12/16/58/worker-5736096__480.jpg"
            postText = arrayListOf(
                " כשאתה ",
                " לא מייצר לך חיים, ",
                " אין לך חיים. ",
            )
            postTransparency =2
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
    fun loadPost351(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/07/21/07/cat-1378203_1280.jpg"
            postText = arrayListOf(
                " אדם ניכר ",
                " בדברים שמעליבים אותו, ",
                " ובתגובה שלו אליהם. ",
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
    fun loadPost352(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/12/24/meme-4656855_1280.jpg"
            postText = arrayListOf(
                " אם אתה מספיק טמבל ",
                " כדי להיות טמבל, ",
                " מי אני שאפריע לך. ",
            )
            postTransparency =8
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
    fun loadPost353(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/07/10/09/09/animal-world-4328243_1280.jpg"
            postText = arrayListOf(
                " אם היית יודע מה אתה, ",
                " היית מרגיש פחות אשם ",
                " שאתה כזה. ",
            )
            postTransparency =6
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
    fun loadPost354(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/04/19/40/glass-1497232_1280.jpg"
            postText = arrayListOf(
                "  להרגיש שלם ",
                " זה לקבל את חוסר השלמות ",
                " בעולם סביב ובך. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost355(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/09/25/17/19/brick-957823_1280.jpg"
            postText = arrayListOf(
                " אופטימיות ",
                " זה לראות את המשך הדרך ",
                " גם אחרי הקיר. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=44
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost356(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/02/02/11/09/office-620822_960_720.jpg"
            postText = arrayListOf(
                " הרשתות החברתיות ",
                "  לא פותרות את הבדידות ",
                " אבל עושות אותה יותר נוחה. ",
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
    fun loadPost357(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/24/21/40/child-1539341_960_720.jpg"
            postText = arrayListOf(
                " אומנם כולם מתעסקים בבוץ ",
                " אבל לגביך  ",
                " רק הידיים שלך מתלכלכות. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=34
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost358(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/26/04/47/gorilla-1416459_960_720.jpg"
            postText = arrayListOf(
                " אנשים מרי נפש ",
                "  אינם אנשים שיש להם חיים מרים,   ",
                " אלא אותם שתופסים את החיים בצורה מרה. ",
            )
            postTransparency =5
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
    fun loadPost359(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://images.unsplash.com/photo-1527212986666-4d2d47a80d5f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"
            postText = arrayListOf(
                " ברכה שבאה מתוך אילוץ ",
                " וחיים שבאים מתוך הכרח  ",
                " אינם שווים הרבה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=71
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost360(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://images.unsplash.com/photo-1527212986666-4d2d47a80d5f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"
            postText = arrayListOf(
                " ברכה שבאה מתוך אילוץ ",
                " וחיים שבאים מתוך הכרח  ",
                " אינם שווים הרבה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=71
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost361(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/08/05/15/water-buffalo-1807517_1280.jpg"
            postText = arrayListOf(
                " ההנאה שלך בחיים ",
                " תלויה ביכולת שלך להתמודד בהצלחה ",
                " עם רגעי חוסר ההנאה. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,14)
            margin=2
            val colorIndex=69
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost362(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/08/21/18/truck-1655592__480.jpg"
            postText = arrayListOf(
                " יום חדש ",
                " הוא מוצר פחות שימושי ",
                " לאנשים משומשים. ",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=25
            val colorIndex=74
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost363(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/09/18/14/21/swimmer-1678307_1280.jpg"
            postText = arrayListOf(
                " עם מניפולציות ",
                " אפשר לעבוד על אנשים ",
                " לא על החיים. ",
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
    fun loadPost364(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/03/21/19/27/sea-4955005_1280.jpg"
            postText = arrayListOf(
                " שניתנו לך החיים בחינם",
                " ומאז אתה בודק בוקר וערב ",
                " איפה דפקו אותך עם זה. ",
            )
            postTransparency =5
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
    fun loadPost365(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/02/19/13/15/indians-642075_1280.jpg"
            postText = arrayListOf(
                " היה רצוי ",
                " שתתייחס לחיים שלך ",
                " כאילו הם החיים שלך. ",
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
    fun loadPost366(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/03/52/man-1867175_960_720.jpg"
            postText = arrayListOf(
                " ישנם דברים ",
                " שאני לא מודה בהם ",
                " אפילו בפני עצמי. ",
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
    fun loadPost367(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/02/02/17/33/photo-256868_1280.jpg"
            postText = arrayListOf(
                " זיכרונות העבר ",
                " הם הדבר היציב ביותר בעולמנו, ",
                " כל היתר אבק ברוח. ",
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
    fun loadPost368(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/03/24/15/52/anguish-4077946_1280.jpg"
            postText = arrayListOf(
                " אם אתה מתעסק בפוליטיקה  ",
                " או בכל מיני עוגמות נפש אחרות, ",
                " אז מגיע לך . ",
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
    fun loadPost369(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/20/13/girl-1561989_1280.jpg"
            postText = arrayListOf(
                " אתה צריך מדי פעם להיות  ",
                " בצד הלא בטוח של החיים ",
                " כדי להתרחק קצת מהשיממון.  ",
            )
            postTransparency =5
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
    fun loadPost370(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/11/15/13/smilies-1731855_1280.jpg"
            postText = arrayListOf(
                "   החיים האלה   ",
                "   לא באו לעשות לך טוב   ",
                " אלא לתת לך הזדמנות לחיות. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost371(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/09/sunbeds-2439961_1280.jpg"
            postText = arrayListOf(
                "   כמה שיש לך יותר אפשרויות בחיים  ",
                "   ככה יש לך יותר סיכוי  ",
                "  לבזבז אותם בהבלים. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,15)
            margin=2
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost372(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/31/18/17/arabs-618749_1280.jpg"
            postText = arrayListOf(
                " בשני דברים קשה להאשים את האדם: ",
                "   שבכל חייו הוא מתנהג כמו אדם ",
                " ושבסוף הוא מת. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=2
            val colorIndex=35
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost373(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/06/23/22/people-2597454_1280.jpg"
            postText = arrayListOf(
                "   אנשים רוצים אהבה  ",
                " אבל נוטים להתבאס מאוחר יותר ",
                " ממה שהיא מביאה איתה. ",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=1
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost374(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/02/17/02/read-1564105_1280.jpg"
            postText = arrayListOf(
                "   האדם הוא יצור  ",
                " עם פוטנציאל גאונות ",
                " ובצועים של מוגבלות. ",
            )
            postTransparency =3
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
    fun loadPost375(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/19/19/16/angry-2766265_1280.jpg"
            postText = arrayListOf(
                " חבל להתעצבן היום על דברים  ",
                " שאתה בקלי קלות ",
                " יכול להתעצבן עליהם גם מחר. ",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=41
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost376(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/09/29/14/38/event-4513446_1280.jpg"
            postText = arrayListOf(
                " האלטרנטיבה לחיים ",
                " זה המוות ",
                " או לעסוק בפוליטיקה. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=32
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost377(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/03/05/surgery-1822458_1280.jpg"
            postText = arrayListOf(
                " אתה לא מודע לחופש שלך ",
                " עד לאותו יום ",
                " בו הוא נלקח ממך. ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=69
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost378(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/13/14/37/bridge-843217_1280.jpg"
            postText = arrayListOf(
                "  למצוא יש מאין ",
                " זו אומנות הוויתור על תפיסות חיים  ",
                "  לטובת החיים עצמם. ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=86
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost379(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971556_1280.jpg"
            postText = arrayListOf(
                " אתה יודע מה מציק לך בחיים ",
                " אבל אין לך מושג  ",
                " מה באמת עושה לך טוב. ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=85
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost380(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/12/17/00/04/sheep-3023520_1280.jpg"
            postText = arrayListOf(
                "  למרות שאתה חלק מהעדר ",
                " הצרכים שלך ושל העדר ",
                "  לא תמיד אותו דבר.  ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=39
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost381(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/16/07/44/audi-r8-1521133_960_720.jpg"
            postText = arrayListOf(
                " אם אתה רץ לעבר האורות האלה",
                " רק שתדע שיש סיכוי  ",
                " שזו מכונית שנוסעת בכיוון שלך.  ",
            )
            postTransparency =3
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
    fun loadPost382(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/21/22/beach-1751455_1280.jpg"
            postText = arrayListOf(
                " המודעות שלך היא כל העולם בשבילך, ",
                " בלעדיה העולם אומנם נשאר כמו שהוא  ",
                " אבל לגביך הוא איננו.  ",
            )
            postTransparency =3
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
    fun loadPost383(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/20/00/30/maldives-1993704_960_720.jpg"
            postText = arrayListOf(
                " החיים האלה אין סופיים ",
                " ההתנסות שלך בהם  ",
                "מוגבלת במודעות שלך ובזמן חייך.",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=30
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost384(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/11/29/08/09/forest-549664_1280.jpg"
            postText = arrayListOf(
                " העולם הזה מפחיד ",
                " רק באותם המקומות  ",
                " בהם יצרת לעצמך פחד.  ",
            )
            postTransparency =0
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
    fun loadPost385(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/06/13/homeless-844215_1280.jpg"
            postText = arrayListOf(
                " חבל להציק לעצמך כל הזמן, ",
                " אחרים  ",
                " עושים לך את זה טוב יותר.  ",
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
    fun loadPost386(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/09/07/19/theravada-buddhism-1810156_1280.jpg"
            postText = arrayListOf(
                " גם אמת גדולה ",
                " יכולה להיות קטנה בשבילך ",
                " שאתה נמצא רחוק ממנה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost387(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/11/15/43/woman-1509956_1280.jpg"
            postText = arrayListOf(
                " המציאות אמיתית, ",
                "  מלבדה  ",
                " הכל המצאות שלך. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=13
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost388(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/08/25/07/36/girl-3629520_1280.jpg"
            postText = arrayListOf(
                " אתה אף פעם לא יודע ",
                " אם הסבל שלך אמיתי  ",
                " עד שהוא אמיתי. ",
            )
            postTransparency =0
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
    fun loadPost389(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/08/12/21/49/play-886343_1280.jpg"
            postText = arrayListOf(
                " הסכנה בעיסוק בפוליטיקה היא ",
                " שהאדם תופס אותה כתחביב  ",
                " ולא כהתמכרות מזיקה. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost390(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/04/16/18/02/old-couple-5051770_1280.jpg"
            postText = arrayListOf(
                " כמה שהחדשות השוטפות ",
                " תופסות חלק גדול מעולמך  ",
                " ככה יש לך פחות מקום לעצמך.  ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3901(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/06/06/21/53/child-1440526_1280.jpg"
            postText = arrayListOf(
                " תחייה בכיף ",
                " גם אם כולם מסביב יגידו לך  ",
                " שהחיים האלה לא חיים.  ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=35
            val colorIndex=30
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3903(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/11/22/16/58/road-5767221_1280.jpg"
            postText = arrayListOf(
                " תנועה נכונה ",
                " תביא ",
                " מחשבה נכונה.  ",
            )
            postTransparency =3
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
    fun loadPost3904(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
            postText = arrayListOf(
                " החושך יכול במקסימום ",
                " לדבר על האור, ",
                " האור מאיר.  ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=27
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3905(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/02/21/17/04/easter-bunny-644418_1280.jpg"
            postText = arrayListOf(
                " סיפורי העבר ",
                " הם ",
                " מחושי ההווה. ",
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
    fun loadPost3906(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/12/03/22/10/man-1075770_1280.jpg"
            postText = arrayListOf(
                " אתה  ",
                " זה המחשבה שלך ",
                "  בגוף שדי דומה לך.  ",
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
    fun loadPost3907(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/18/04/56/book-3755514_1280.jpg"
            postText = arrayListOf(
                " הזיכרונות שלך הם נחלת העבר,  ",
                " השדים שאתה עושה מהם  ",
                "  זה מה שאתה שקורה לך עכשיו.  ",
            )
            postTransparency =10
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
    fun loadPost3908(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/21/20/09/eye-2163237_1280.jpg"
            postText = arrayListOf(
                " אתה רואה את החיים האלה כאלוהים, ",
                " מנתח אותם כחיית השדה  ",
                "  ומגיב כאדם.  ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=18
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3909(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/12/14/53/watermelon-2395804_1280.jpg"
            postText = arrayListOf(
                " העולם הזה בשבילי הוא כמו אבטיח, ",
                " מעדיף לאכול את החלקים המתוקים שלו  ",
                "  למרות שקניתי את כולו.  ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3910(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/18/23/36/standard-1401913_1280.jpg"
            postText = arrayListOf(
                " מעדיף שלא להילחם על האגו שלי ",
                " שיעשה את המלחמות שלו בעצמו  ",
                "  לי אין כוח לזה.  ",
            )
            postTransparency =7
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

    fun loadPost3911(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/11/10/05/law-4617873_1280.jpg"
            postText = arrayListOf(
                " יש המון אי צדק בעולם ",
                " והסיבה העיקרית לזה  ",
                "  שרוב הצדק מרוכז אצלך.  ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=75
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3912(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/06/23/17/46/desert-2435404_1280.jpg"
            postText = arrayListOf(
                " מבחינת המודעות שבך, ",
                " החיים שלך  אף פעם לא התחילו  ",
                "  והם אף פעם לא יסתיימו.  ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3913(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/15/02/50/doll-3227004_1280.jpg"
            postText = arrayListOf(
                " הנוחות בלהודות שאתה סמרטוט ",
                " גוברת אצלי על הטרחה  ",
                "  של להיות מישהו מכובד.  ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,15)
            margin=2
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3914(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/04/06/00/25/trees-3294681_1280.jpg"
            postText = arrayListOf(
                " שיהיה לך ",
                " אדמה יציבה מתחת הרגליים  ",
                "  והרבה מסתורין מעל הראש.  ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=57
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3915(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/29/14/08/counting-3116201_1280.jpg"
            postText = arrayListOf(
                " כל חשבונות הנפש האלה שלך ",
                " גורמים לך להשתפר בחשבון ",
                "  ופחות להתפתח נפשית.  ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,20)
            margin=0
            val colorIndex=57
            val selector=2
            val fontFamily=10
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3916(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/03/27/12/59/adult-2178560_1280.jpg"
            postText = arrayListOf(
                " תן לי את האומץ ",
                " להודות בפני עצמי לפחות  ",
                "  במה שאני .  ",
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
    fun loadPost3917(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/07/31/11/14/lion-3574819_960_720.jpg"
            postText = arrayListOf(
                " אל תהיה צודק, ",
                " כי אם אתה כבר צודק ",
                " אתה לא צריך גם להיות צודק. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=58
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3918(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/04/07/01/01/bar-2209813_960_720.jpg"
            postText = arrayListOf(
                " באזור הנוחות שלך ",
                " אפשר להשמין מנחת או מדיכאון ",
                " אבל קשה יותר להתפתח . ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=60
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3919(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/08/05/09/21/leaf-1571833_1280.jpg"
            postText = arrayListOf(
                " הגוף הולך ונכחד עם השנים, ",
                "היכולת שלך להתחדש בכל יום ",
                " תלויה בקשר שיש לך עם הנצח. ",
            )
            postTransparency =8
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
    fun loadPost3920(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/03/19/06/teddy-2711675_1280.jpg"
            postText = arrayListOf(
                " פוליטיקה היא צורת חשיבה, ",
                " היא גם בית סוהר ",
                " אם אין לך צורות חשיבה נוספות. ",
            )
            postTransparency =8
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
    fun loadPost3921(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/03/01/22/27/women-655353_1280.jpg"
            postText = arrayListOf(
                " רגשי נחיתות, ",
                " זה שאתה מתחרה עם עצמך ",
                " ומגיע במקום האחרון. ",
            )
            postTransparency =8
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
    fun loadPost3922(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/02/18/15/07/people-1207310_1280.jpg"
            postText = arrayListOf(
                " הזקנה אינה נמדדת ",
                " לפי כמות השנים העוברות על האדם ",
                " אלא לפי כמות החיות שנותרה בו. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=25
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3923(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/08/29/18/32/glass-4439673_1280.jpg"
            postText = arrayListOf(
                " החצי הכוס הריקה זו אמת ",
                " אבל קשה לשתות משם ",
                " בעיקר אם אתה ממש צמא. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=22
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3924(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/06/19/21/24/avenue-815297_1280.jpg"
            postText = arrayListOf(
                " כל אמת בחיים ",
                " יכולה להיראות לך ככזב ",
                " אם היא לא קיימת בך. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=50
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3925(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/12/03/12/21/monk-555391_1280.jpg"
            postText = arrayListOf(
                " לא מכיר הרבה אנשים ",
                " שהצליחו ממש לסלוח לעצמם  ",
                " שהם רק בני אדם. ",
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

    fun loadPost3926(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg"
            postText = arrayListOf(
                " ישנם שני סוגי דברים בעולם: ",
                " אלה שהם בסדר גמור  ",
                " ואלה שלא הבנת. ",
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

    fun loadPost3927(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/07/24/19/22/sunset-2535770_1280.jpg"
            postText = arrayListOf(
                " מה שהכי מייחד אותך ",
                " ברגע זה,  ",
                " שאתה אתה. ",
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
    fun loadPost3928(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/07/10/09/09/animal-world-4328243_1280.jpg"
            postText = arrayListOf(
                " תפיסת העולם שלך ",
                " אינה מגדירה את העולם  ",
                " אלא מגדירה אותך. ",
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
    fun loadPost3929(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/05/15/11/23/wood-pigeon-7197299_1280.jpg"
            postText = arrayListOf(
                " יונה הומה על אחד העצים, ",
                " לגביה זה סתם מי שהיא  ",
                "   לגבי זה העולם. ",
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
    fun loadPost3930(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/31/15/01/man-869215_1280.jpg"
            postText = arrayListOf(
                " אתה טמבל ",
                " רק אם אתה מאמין  ",
                " שאתה טמבל. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=43
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3931(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/08/21/23/29/forest-3622519_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא מכניס את האלוהות ",
                " למשוואת הקיום שלך  ",
                " אז יוצא שאתה די לבד בעולם הזה. ",
            )
            postTransparency =0
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
    fun loadPost3932(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/05/30/19/55/desert-790640_960_720.jpg"
            postText = arrayListOf(
                " זה שאני מסתדר עם החיים ",
                " זה לא אומר  ",
                " שאני ביחסים טובים איתם. ",
            )
            postTransparency =0
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
    fun loadPost3933(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
            postText = arrayListOf(
                " רוב האנשים יודעים לשרוד, ",
                " מעטים יודעים לחיות  ",
                " ומתי מעט יודעים לחיות בטוב. ",
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
    fun loadPost3934(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_1280.jpg"
            postText = arrayListOf(
                " שיהיה בך מספיק שקט, ",
                " כדי לקלוט נכונה  ",
                " את כל הרעש הזה מסביב. ",
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
    fun loadPost3935(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/17/19/52/old-man-1145469_1280.jpg"
            postText = arrayListOf(
                " שני דברים קשים לך בעולם: ",
                " שהוא לא מתנהל בדיוק לפי דעתך  ",
                " ושלא כל האנשים חושבים כמוך. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=50
            val colorIndex=50
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3936(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/12/28/11/32/namaste-1935938_1280.jpg"
            postText = arrayListOf(
                " שתהיה מספיק מבין ",
                " להבין  ",
                " עד כמה אתה לא מבין. ",
            )
            postTransparency =2
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=18
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3937(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/01/28/02/24/japan-2014619_960_720.jpg"
            postText = arrayListOf(
                " האומנות לחיות ",
                " זה לראות את הקסם בדברים ",
                " מבעד לכל הבנאליות הזו. ",
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
    fun loadPost3938(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/04/11/12/56/wrench-717684_960_720.jpg"
            postText = arrayListOf(
                " היית פותר את הבעיות שלך תוך שנייה ",
                " אם זה לא היית ",
                " אתה. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=30
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3939(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/05/11/21/19/tee-2305381_960_720.jpg"
            postText = arrayListOf(
                " האדם מתחבט בקונפליקטים ",
                " שהוא יוצר עם עצמו. ",
                " (\"פורפטום מובילה\"). ",
            )
            postTransparency =10
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
    fun loadPost3940(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/04/24/04/47/buddhist-737275_960_720.jpg"
            postText = arrayListOf(
                " אדם חייב קצת קדושה בחייו ",
                " כי הרציונליזם בונה את גופו ",
                " והקדושה את נשמתו. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=20
            val colorIndex=31
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3941(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/09/06/18/16/lake-7437204_960_720.jpg"
            postText = arrayListOf(
                " רוב המתים משאירים אחריהם ",
                " תובנה שקטה: ",
                " טוב לחיות. ",
            )
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=33
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3942(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/01/09/26/people-3190181_960_720.jpg"
            postText = arrayListOf(
                " דבר יפה לא קיים בפני עצמו, ",
                " הוא מותנה בקיומו של אדם ",
                " שחווה אותו כיפה. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=29
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3943(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/09/05/16/08/leaves-7434524_960_720.jpg"
            postText = arrayListOf(
                " אל תתבאס מזה שאתה מבואס, ",
                " בגלל ",
                " שבדרך כלל זה ממש לא תלוי בך. ",
            )
            postTransparency =3
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
    fun loadPost3944(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/28/23/35/hills-615429_960_720.jpg"
            postText = arrayListOf(
                " המתכון הנכון לחיות ",
                " הוא להשתדל שלא למות ",
                " גם שאין לך סיבה טובה לחיות. ",
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
    fun loadPost3945(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/08/25/11/10/chess-5516446_960_720.jpg"
            postText = arrayListOf(
                " לפעמים עדיף  ",
                "  להתמקד בלא לעשות טעויות ",
                " מלנצח. ",
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
    fun loadPost3946(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/06/25/04/32/kids-4297372_960_720.jpg"
            postText = arrayListOf(
                " אני לא מסתדר עם העולם  ",
                " רק במקרים ",
                " שהוא לא בדיוק מתחשב בי. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=56
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3947(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/09/27/15/24/chimps-3707291_960_720.jpg"
            postText = arrayListOf(
                " בוויכוח הפוליטי שלך עם כולם  ",
                " לא ברור מי הצודק ומי הטועה ",
                " אבל בטוח מי המפסיד. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=36
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3948(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/11/07/05/13/terror-4607688_960_720.jpg"
            postText = arrayListOf(
                " אומנם למוות אין חוש הומור  ",
                " אבל זה לא סיבה שלא להתבדח אתו ",
                " בעיקר אם הבדיחה על חשבונך. ",
            )
            postTransparency =2
            postTextSize = arrayListOf(0,14)
            margin=2
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3949(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/07/31/23/45/flowers-2562079_960_720.jpg"
            postText = arrayListOf(
                " העבר והעתיד הם בדרך כלל  ",
                " סוג של מאמץ ",
                " ההווה הוא הרפיה. ",
            )
            postTransparency =2
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=37
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3950(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/07/30/23/38/cactus-2556000_960_720.jpg"
            postText = arrayListOf(
                "  לחיות בטוב  ",
                " זה לבקש ",
                " שלא ישתנה דבר. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=35
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3951(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/11/25/05/43/forest-fire-3836834_960_720.jpg"
            postText = arrayListOf(
                " כל מה שמדליק אותך ",
                " ולא גורם לשריפות יער מיותרות ",
                " מבורך. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=38
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3952(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/09/05/16/48/rapeseed-6599950_960_720.jpg"
            postText = arrayListOf(
                " האלוהים ",
                " מעולם ",
                " לא יצר אדם שיצר אותו. ",
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
    fun loadPost3953(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/01/01/23/55/telephone-586266_960_720.jpg"
            postText = arrayListOf(
                " כדאי לך לשמור קשר כלשהו ",
                " עם החיים שלך, ",
                " יש סיכוי שתשתמש בהם יום אחד. ",
            )
            postTransparency =3
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
    fun loadPost3954(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/09/25/11/55/fittings-2784902_960_720.jpg"
            postText = arrayListOf(
                " האדם הוא מכונה פשוטה ",
                " ההופכת מוצרי מזון למחשבות ",
                " בתהליך הקרוי חיים. ",
            )
            postTransparency =6
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
    fun loadPost3955(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/03/30/19/28/para-4091873_960_720.jpg"
            postText = arrayListOf(
                " בכל בוקר אני עושה היכרות מחודשת עם עצמי, ",
                " לפעמים יש כימיה ביננו ",
                " לפעמים פחות. ",
            )
            postTransparency =6
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3956(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/09/12/16/apples-1506119_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " במקצתם זה מה שקורה בהם ",
                " וברובם איך שאתה מתייחס לזה. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3957(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_960_720.jpg"
            postText = arrayListOf(
                " אין מנצחים ומפסידים בעולם הזה, ",
                " יש רק אנשים שחושבים שהם ניצחו ",
                " ואנשים שחושבים שהם הפסידו. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=16
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3958(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/10/15/11/51/tears-4551435_960_720.jpg"
            postText = arrayListOf(
                " זה שאתה משתדל להבין את החיים ",
                " זה לא מבטיח לך ",
                " שהחיים ישתדלו להבין אותך. ",
            )
            postTransparency =10
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
    fun loadPost3959(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2013/06/26/19/23/intravenous-141551_960_720.jpg"
            postText = arrayListOf(
                " אתה אף פעם ",
                "  לא יודע מה הבעיות שלך  ",
                " עד שיש לך ממש בעיות. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=38
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3960(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_960_720.jpg"
            postText = arrayListOf(
                " האדם מרגיש מסכן ברגע מסוים ",
                " פשוט כי הוא מסכן באותו רגע ",
                " ולא בגלל שום סיבה אחרת. ",
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
    fun loadPost3961(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/01/16/17/38/animal-3086397_960_720.jpg"
            postText = arrayListOf(
                " כל מה שאתה חושב על העולם, ",
                " זה רק ",
                " מה שאתה חושב על העולם. ",
            )
            postTransparency =6
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
    fun loadPost3962(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/06/09/man-844211_960_720.jpg"
            postText = arrayListOf(
                " הדרך לחיים נכונים יותר, ",
                "  להגיב פחות ",
                "  ולהכיל יותר. ",
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
    fun loadPost3963(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/11/19/20/55/apples-1841132_960_720.jpg"
            postText = arrayListOf(
                "   לשווק את החיים שלך לאחרים ",
                " זו טעות שיווקית ",
                " בגלל שיש להם כבר חיים משל עצמם. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=47
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3964(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/10/14/15/53/women-4549266_960_720.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                " הם לא מקומות בעולם הבא ",
                " הם תפיסות עולם בעולם הזה. ",
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=34
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3965(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2022/06/12/11/57/street-7257864_960_720.jpg"
            postText = arrayListOf(
                " המפתח לשקט הנפשי ",
                " הוא ",
                "מציאת השלמות בחוסר השלמות השגרתי.",
            )
            postTransparency =6
            postTextSize = arrayListOf(0,14)
            margin=5
            val colorIndex=34
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3966(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/12/03/20/25/girl-5801502_960_720.jpg"
            postText = arrayListOf(
                " תשתדל שלא לתת ",
                "  למחשבות שלך על החיים ",
                "  להרוס לך את החיים. ",
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
fun loadPost3967(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/08/04/01/46/boy-2578814_960_720.jpg"
        postText = arrayListOf(
            "    אתה אף פעם לא יודע   ",
            "     שקורים לך ימים טובים     ",
            " עד שקורים לך ימים פחות טובים. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=30
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3968(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/42/boy-1854308_960_720.jpg"
        postText = arrayListOf(
            " אם תיקח את עצמך ",
            " קצת יותר בקלות ",
            " יהיה לך קל יותר. ",
        )
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=48
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost3969(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/01/28/10/20/old-man-1166066_960_720.jpg"
            postText = arrayListOf(
                " עם השנים ",
                " העולם שוחק את הגוף האנושי ",
                " האדם את עצמו. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=55
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost3_970(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2015/06/06/22/38/baby-799956_960_720.jpg"
        postText = arrayListOf(
            " ההצלחה שלך בחיים ",
            " נמדדת לפי הכושר שלך ",
            " שלא להציק לעצמך. ",
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=20
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3_971(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2019/04/26/12/41/grandfather-4157450_960_720.jpg"
        postText = arrayListOf(
            "   אם יש לך כוח לכעוס   ",
            "  אז עדיין יש לך כוח כלשהוא  ",
            " וגם זה לטובה. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=21
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3_972(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2013/03/23/23/10/brush-96240_960_720.jpg"
        postText = arrayListOf(
            " החיים שלך זו היצירה שלך ",
            "  הביקורת על החיים האלה  ",
            " זה חלק מהיצירה הזו. ",
        )
        postTransparency =0
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

fun loadPost3_973(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2013/04/03/19/55/house-100205_960_720.jpg"
        postText = arrayListOf(
            "   בכל יום שאתה בונה את העולם שלך   ",
            " תשתדל שלא לעשות את זה עם חומרים נחותים, ",
            "  אחרי הכל אתה הולך לחיות בזה כל היום. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=26
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3_974(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2019/12/11/18/11/storm-4688918_960_720.jpg"
        postText = arrayListOf(
            " אף אחד לא יודע כלום ",
            " על החיים שלך ",
            "  כי רק אתה נמצא שם. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=17
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3975(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2021/09/26/07/48/man-6656628_960_720.jpg"
        postText = arrayListOf(
            " בשביל להיכנס למים ולהישאר יבש ",
            " אתה צריך רק דבר אחד, ",
            "  מישהו שיאמין לסיפורים שלך. ",
        )
        postTransparency =5
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
fun loadPost3976(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2018/09/03/23/56/sea-3652697_960_720.jpg"
        postText = arrayListOf(
            " החיים הם כמו אוקינוס גדול, ",
            " רק כשאתה מגיע לאזור קו החוף ",
            "  אתה מתחיל להבין את זה. ",
        )
        postTransparency =5
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

fun loadPost3977(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2014/05/21/16/00/traveller-349963_960_720.jpg"
        postText = arrayListOf(
            " כמה שאתה נותן לדברים ",
            " משקל גדול יותר ",
            "  כך הם מעיקים עליך יותר. ",
        )
        postTransparency =5
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

fun loadPost3978(): Post {         //f
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2020/08/19/05/53/asleep-5500058_960_720.jpg"
        postText = arrayListOf(
            " המוות בדרך כלל הוא לא סוף החיים, ",
            " סוף החיים קורה לך הרבה לפני  ",
            "  כשאתה מפסיק לחיות.  ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=46
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3979(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2019/06/25/13/59/city-4298285_960_720.jpg"
        postText = arrayListOf(
            " האדם  מצטיין בשני דברים: ",
            " ביכולת המוגבלת שלו לפרגן לאחרים ",
            " ובצפייה האינסופית שאחרים יפרגנו לו. ",
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

    fun loadPost3980(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/15/56/house-fire-1548280_960_720.jpg"
            postText = arrayListOf(
                " מה שהורס לך את החיים ",
                " זה בעיקר  ",
                " כל מה שאתה חושב עליהם. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
//            lineSpacing=0f
            val colorIndex=26
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost3981(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2016/03/27/21/44/musician-1284394_960_720.jpg"
        postText = arrayListOf(
            " אתה משחק תפקיד בחיים האלה, ",
            " הבעיה שלא תמיד   ",
            " התפקיד הזה מתאים לך. ",
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
fun loadPost3982(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2018/11/23/20/51/buffer-stop-3834560_960_720.jpg"
        postText = arrayListOf(
            " דרך ללא מוצא ",
            " גם שהיא זמינה יותר  ",
            " היא לא מובילה אותך הלאה. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost3983(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/05/25/20/26/mansion-4229081_960_720.jpg"
            postText = arrayListOf(
                " דברים שאין לך ",
                " זה רק דברים שאין לך  ",
                " אין בהם שום דבר מעבר לזה. ",
            )
            postTransparency =5
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

fun loadPost3984(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2016/03/27/22/01/person-1284444_960_720.jpg"
        postText = arrayListOf(
            " האושר הוא תוצר לוואי ",
            "  למעשים נכונים לך ",
            " שאתה עושה. ",
        )
        postTransparency =0
        postTextSize = arrayListOf(0,16)
        margin=10
        val colorIndex=47
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

fun loadPost3985(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/06/26/02/47/man-2442565_960_720.jpg"
        postText = arrayListOf(
            " האדם המושלם ",
            "  הוא אותו אחד שחי בשלום ",
            " עם חוסר השלמות שלו. ",
        )
        postTransparency =0
        postTextSize = arrayListOf(0,15)
        margin=10
        val colorIndex=28
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}


    fun loadPost3986(): Post {   //f
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/09/25/13/12/puppy-2785074_960_720.jpg"
        postText = arrayListOf(
            " בימים שכאלה ",
            "  להיות השוטה על הגבעה ",
            " זה הדבר הכי חכם לעשות. ",
        )
        postTransparency =0
        postTextSize = arrayListOf(0,15)
        margin=10
        val colorIndex=20
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}

    fun loadPost3987(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/29/auto-3368094_960_720.jpg"
            postText = arrayListOf(
                " השנים האלה  ",
                "  לא עושים אותך חכם יותר ",
                " אלא רק מבוגר יותר. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,15)
            margin=0
            val colorIndex=28
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

fun loadPost3988(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/10/24/07/12/hacker-2883632_960_720.jpg"
        postText = arrayListOf(
            " גם באם תדע איך אתה בנוי  ",
            "  זה לא יעזור לך הרבה ",
            " כי ככה אתה בנוי. ",
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
fun loadPost3989(): Post {  //f
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2012/02/29/15/49/chains-19176_960_720.jpg"
        postText = arrayListOf(
            "   להיות חופשי  ",
            " זה להחליט בצורה עצמאית ",
            "   למי ולמה תהיה עבד. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3990(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2016/09/28/18/20/smartphone-1701096_960_720.jpg"
        postText = arrayListOf(
            " רצוי שהאדם יחפש את החיים שלו בעצמו  ",
            "   ולא יסתפק   ",
            " בלקרוא עליהם באתרי הרשת. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=35
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3991(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2015/01/01/19/47/fire-586050_960_720.jpg"
        postText = arrayListOf(
            " אתה בוחר בגיהינום בכל יום מחדש  ",
            "   לא בגלל שכל כך נוח שם ",
            " כמו שהוא הסביבה הטבעית שלך. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=10
        val colorIndex=18
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3992(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2012/10/10/15/57/children-60654_960_720.jpg"
        postText = arrayListOf(
            "   לא כולם שווים בחיים האלה  ",
            "   אבל לכולם שמורה   ",
            " אפשרות שווה ליהנות מהם. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=33
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3993(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2015/01/08/16/35/play-593207_960_720.jpg"
        postText = arrayListOf(
            "  אין הבלים בעולם הזה  ",
            " חוץ מאותם הדברים ",
            " שאתה תופס אותם כהבלים. ",
        )
        postTransparency =0
        postTextSize = arrayListOf(0,15)
        margin=0
        val colorIndex=48
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3994(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/11/21/21/52/beer-garden-2969340_960_720.jpg"
        postText = arrayListOf(
            "    ובסוף הדרך ...   ",
            " הוא לא יאשים אותך שטעית פה ושם ",
            " אלא רק שלא חיית מספיק את החיים שלך. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=19
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3995(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/03/05/12/28/bison-european-2118538_960_720.jpg"
        postText = arrayListOf(
            "  תשתדל להיות פחות אמיתי ויותר נחמד  ",
            " בגלל שגם ככה העולם ",
            " זה לא המקום הכי קל. ",
        )
        postTransparency =10
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
fun loadPost3996(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2014/02/24/16/04/rock-crash-273703_960_720.jpg"
        postText = arrayListOf(
            "  החיים זה לא משהו הכי יציב,  ",
            " התשובה הופכת לשאלה או מתנדפת ",
            " השאלה הופכת לתשובה או למציאות. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=10
        val colorIndex=57
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost3997(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/19/20/25/xylophone-3759483_960_720.jpg"
            postText = arrayListOf(
                "  לכל אדם יש בעיות עם עצמו ועם אחרים ",
                " איכות החיים שלו נמדדת ",
                "  לפי הזמן שהוא קבור בבעיות האלו. ",
            )
            postTransparency =7
            postTextSize = arrayListOf(0,14)
            margin=10
            val colorIndex=26
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
fun loadPost3998(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2015/07/15/06/44/homeless-845711_960_720.jpg"
        postText = arrayListOf(
            "  אני יכול  להבין  ",
            " את אלה שיש להם בעיות איתי , ",
            " גם לי יש בעיות עם עצמי. ",
        )
        postTransparency =10
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
fun loadPost3999(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2018/11/26/20/24/railway-3840175_960_720.jpg"
        postText = arrayListOf(
            "  החיים שלך עוברים בכל מקרה  ",
            " גם אם תחייה אותם ",
            " וגם אם לא. ",
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
fun loadPost3_999_000(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2017/02/06/10/54/sad-2042536_960_720.jpg"
        postText = arrayListOf(
            "  לא חושב שיש מחסור באהבה בעולם,  ",
            " הבעיה שהיא זורמת בדרך כלל ",
            " למקומות מפוקפקים. ",
        )
        postTransparency =10
        postTextSize = arrayListOf(0,14)
        margin=20
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999001(): Post {
    var post = Post()
    with(post) {
        imageUri = "https://cdn.pixabay.com/photo/2013/02/08/22/23/afghanistan-79492_960_720.jpg"
        postText = arrayListOf(
            "  איכות החיים שלך  ",
            " אינה נקבעת לפי הדברים שקורים מסביב ",
            " אלא עד כמה אתה מוטרד מהם. ",
        )
        postTransparency =8
        postTextSize = arrayListOf(0,14)
        margin=0
        val colorIndex=49
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999002(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " מי שאין לו בורות בדרך ",
            " קל לו לייעץ  ",
            " איך לא ליפול לבורות. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2016/12/03/17/49/cave-1880282_960_720.jpg"
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=48
        val selector=2
        val fontFamily=101
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999003(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            "   למעט אנשים יש את אותו כשרון   ",
            "   לנצל את הרגעים המתאימים    ",
            "  ולהיות לרגע מבסוטים מהחיים שלהם.  ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2015/01/27/09/58/man-613601_960_720.jpg"
        postTransparency =8
        postTextSize = arrayListOf(0,14)
        margin=5
        val colorIndex=47
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999004(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " העולם אומנם קורה מסביב ",
            " אבל במפתיע  ",
            " הוא לא קורה לך במיוחד. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2013/11/28/16/22/japan-220696_960_720.jpg"
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
fun loadPost3999005(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " אתה נשאר צעיר ",
            "  כל זמן  ",
            " שהחלומות שלך לא מזדקנים. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2019/07/13/02/25/man-4333898_960_720.jpg"
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
fun loadPost3999006(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " החיים על האדמה הזאת ",
            " זה רעיון לא רע  ",
            " אבל הביצוע לא משהו. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2021/12/18/06/01/sunset-6878021_960_720.jpg"
        postTransparency =5
        postTextSize = arrayListOf(0,16)
        margin=5
        val colorIndex=11
        val selector=2
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999007(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            "  הנטייה הזאת שלך  ",
            "  להטריד את עצמך כל הזמן  ",
            " די מטרידה. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2020/07/27/23/26/monkey-5443638_960_720.jpg"
        postTransparency =7
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
fun loadPost3999008(): Post {   //f
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " אם אתה חי בשלום יחסי ",
            " עם מה שאין לך אותו ",
            " אז יש לך אותו. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2017/10/07/17/43/woman-2827317_960_720.jpg"
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=84
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
fun loadPost3999009(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            "  להיות חכם זה להבין  ",
            " עד כמה אתה טמבל ",
            " ברגע זה. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2015/08/04/20/16/person-875165_960_720.jpg"
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

fun loadPost3999010(): Post {    //f
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " בבחירה בטוב ",
            " אין התכחשות לרע ",
            " אלא רק עניין של נוחות בחיים. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2017/10/12/22/11/morning-2846195_960_720.jpg"
        postTransparency =4
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
fun loadPost3999011(): Post {
    var post = Post()
    with(post) {
        postText = arrayListOf(
            " שגרה קיימת רק במעשי האדם, ",
            " במחשבות האדם ",
            " כל רגע הוא יצירה חדשה. ",
        )
        imageUri = "https://cdn.pixabay.com/photo/2022/06/12/11/57/street-7257864_960_720.jpg"
        postTransparency =10
        postTextSize = arrayListOf(0,16)
        margin=0
        val colorIndex=34
        val selector=1
        val fontFamily=103
        postNum= tool.extractPostNumFromFunctionName()
        post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
    }
    return post
}
    fun loadPost3999012(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " בגלל הצורך האובססיבי הזה שלך ",
                " להיות מעודכן במה שקורה כל רגע ",
                " אתה לא מודע מה קורה באמת. ",
            )
            imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_960_720.jpg"
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
    fun loadPost3_999_013(): Post {
        var post = Post()
        with(post) {
            postText = arrayListOf(
                " אין בשבילך יופי בעולם ",
                " מלבד מה שאתה תופס כרגע ",
                " כיופי. ",
            )
            imageUri = "https://cdn.pixabay.com/photo/2022/12/13/18/00/autumn-7653897_960_720.jpg"
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=47
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
//            postNum=3_999_013
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3999014(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/09/28/12/44/woman-3709223_960_720.jpg"
            postText = arrayListOf(
                " המאבק שלך עם עצמך ",
                " זה להיות כמה שפחות עצמך ",
                " ויותר אתה. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=24
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3999015(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/05/13/22/43/get-well-soon-2310866_960_720.jpg"
            postText = arrayListOf(
                " יש הרבה עוולות בעולם הזה ",
                "  להתמקד בהן  ",
                " זה להוסיף עוד עוולה למאזן. "
            )
            postTransparency =3
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

     fun loadPost3999016(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2016/03/06/11/48/tv-1240159_960_720.jpg"
            postText = arrayListOf(
                " טמטום חושים שיגרתי ",
                " הוא בעיה ",
                " רק בארץ היצירה. "
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=45
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
      fun loadPost3999017(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2017/08/06/05/27/people-2589091_960_720.jpg"
            postText = arrayListOf(
                " החיים זו מסיבה שכזאת, ",
                " שרק שאתה יוצא ממנה ",
                "אתה מבין כמה היא הייתה פצצית."
            )
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            margin=10
            val colorIndex=51
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3_999_018(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_960_720.jpg"
            postText = arrayListOf(
                " הגוף והאגו  ",
                " מזדקנים עם השנים ",
                " אתה נשאר כמו שהיית. "
            )
            postTransparency =2
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

    fun loadPost3999019(): Post {
        var post = Post()
        with(post) {
            imageUri ="https://cdn.pixabay.com/photo/2019/09/25/07/49/soft-spots-4502861_960_720.jpg"
            postText = arrayListOf(
                " שתחייה חיים שלווים,  ",
                " כאלה שבהם יש לקחת ",
                " בעיקר החלטות קטנות. "
            )
            postTransparency =8
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
    fun loadPost3999020(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2014/07/31/21/37/bar-406884_960_720.jpg"
            postText = arrayListOf(
                "  הכל אמת, ",
                " אבל לא הכל מתאים ",
                "  למה שאתה ברגע זה. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=40
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

   fun loadPost3999021(): Post {
       var post = Post()
       with(post) {
           imageUri = "https://cdn.pixabay.com/photo/2022/10/23/07/19/cat-7540607_960_720.jpg"
           postText = arrayListOf(
               "  להבין את החיים ",
               " זה למצא את השלמות ",
               "  בחוסר השלמות השגרתי. ",
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

    fun loadPost3_999_022(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/01/24/18/14/man-3953040_960_720.jpg"
            postText = arrayListOf(
                "  כשיש בך ידיעה מלאה  ",
                " שהאמת איתך ",
                "  אין לך צורך להיות צודק. ",
            )
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=44
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3_999_023(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/03/15/17/15/celebration-3228848_960_720.jpg"
            postText = arrayListOf(
                "  עדיף להיות  ",
                " שוטה על הגבעה ",
                "  מחכם בבור. ",
            )
            postTransparency =5
            postTextSize = arrayListOf(0,16)
            margin=0
            val colorIndex=23
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }
    fun loadPost3_999_024(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2017/08/08/08/10/cow-2610663_960_720.jpg"
            postText = arrayListOf(
                " אתה יכול לשחוט לי פרות קדושות ",
                " זה מן הסתם גורלם של פרות, ",
                "  אבל אתה לא יכול לגעת בקדושה. ",
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

    fun loadPost3_999_025(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/02/21/05/20/autumn-4866493_960_720.jpg"
            postText = arrayListOf(
                " כולנו רוצים שקט ושלווה, ",
                " ושזה מגיע ",
                "  אין לנו מושג מה לעשות בזה.  ",
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

    fun loadPost3_999_026(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/05/14/20/16/algarve-5171222_960_720.jpg"
            postText = arrayListOf(
                " אתה נמצא במקום שאתה חושב עליו ",
                " ואם חשבת רחוק מדי ",
                "  רצוי שתמצא דרך לחזור הביתה.  ",
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

    fun loadPost3_999_027(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/11/02/16/17/london-1018629_960_720.jpg"
            postText = arrayListOf(
                " מי שלא מבין איך אנשים מסוימים ",
                " עושים דברים מסוימים ",
                "  לא מכיר את עצמו.  ",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,15)
            margin=5
            val colorIndex=20
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost200(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }

    fun loadPost3_999_028(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2018/10/08/09/47/rubiks-cube-3732404_960_720.jpg"
            postText = arrayListOf(
                " הגיון זה דבר חיובי ",
                " כל זמן שהוא לא מפריע לך ",
                "  להבין את עצמך.  ",
            )
            postTransparency =3
            postTextSize = arrayListOf(0,16)
            margin=25
            val colorIndex=11
            val selector=1
            val grade=79
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }

    fun loadPost3_999_029(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2019/01/21/12/47/burger-3946012_960_720.jpg"
            postText = arrayListOf(
                " יש אנשים שההבדל היחידי ",
                " בין היותם חיים או מתים ",
                "הוא כמות הג'נק פוד שהם צורכים.",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=2
            val colorIndex=28
            val selector=1
            val grade=79
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }

    fun loadPost3_999_030(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2021/04/04/11/53/cap-6149857_960_720.jpg"
            postText = arrayListOf(
                " אם קשה לראות ",
                " את המציאות כמו שהיא ",
                "  ההבעיה היא לא במציאות. ",
            )
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            margin=5
            val colorIndex=28
            val selector=1
            val grade=83
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily,grade)
        }
        return post
    }
 }