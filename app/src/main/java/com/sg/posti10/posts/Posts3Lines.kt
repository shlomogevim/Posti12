package com.sg.posti10.posts

import com.sg.posti10.CONSTANT
import com.sg.posti10.Post
import com.sg.posti10.Tools
import com.sg.posti10.Utility

class Posts3Lines {
    val util=Utility()
    val tool=Tools()


    fun loadPost3999010():Post {
        val post = Post()
        with(post) {
            postNum = 3999010
            lineNum = 3
            postText = arrayListOf(
                " בבחירה בטוב ",
                " אין בה התכחשות לרע, ",
                " אלא רק עניין של נוחות בחיים. ",
            )
            imageUri = "https://cdn.pixabay.com/photo/2017/10/12/22/11/morning-2846195_960_720.jpg"
            textLocation = arrayListOf(10,10,0,-1,0,0,0, 0)
            postId = 85
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            lineSpacing=1.3f
            videoUrl="te7mXWqqjPI"
            val postText1= arrayListOf("0.9")
//            videoText = util1.getPostExplanation(postNum, postText1)
        }
      return post
    }
    fun loadPost3999011():Post {
        val post = Post()
        with(post) {
            postNum = 3999011
            lineNum = 3
            postText = arrayListOf(
                " שגרה קיימת רק במעשי האדם, ",
                " במחשבות האדם ",
                " כל רגע הוא יצירה חדשה. ",
            )
            imageUri = "https://cdn.pixabay.com/photo/2022/06/12/11/57/street-7257864_960_720.jpg"
            textLocation = arrayListOf(10,10,0,-1,0,0,0, 0)
            postId = 85
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            lineSpacing=1.3f
            videoUrl="j4jtIDaeaWI"
            //  val postText1= arrayListOf("0.9")
//            videoText = util1.getPostExplanation(postNum, postText)
        }
       return post
    }


    fun loadPost3999012():Post {
        val post = Post()
        with(post) {
            postNum = 3999012
            lineNum = 3
            postText = arrayListOf(
                " בגלל הצורך האובססיבי הזה שלך ",
                " להיות מעודכן במה שקורה כל רגע ",
                " אתה לא מודע מה קורה באמת. ",
            )
            imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_960_720.jpg"
            textLocation = arrayListOf(10,10,0,-1,0,0,0, 0)
            postId = 85
            postTransparency =7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            lineSpacing=1.3f
            videoUrl="s0Z3q7i5PJs"
//            videoText = util1.getPostExplanation(postNum, postText)
        }
       return post
    }

    fun loadPost3999013(): Post {
        val post = Post()
        with(post) {
            postNum=tool.extractPostNumFromFunctionName()
            postText = arrayListOf(
                " אין בשבילך יופי בעולם ",
                " מלבד מה שאתה תופס כרגע ",
                " כיופי. "
            )
             imageUri = "https://cdn.pixabay.com/photo/2022/12/13/18/00/autumn-7653897_960_720.jpg"
            textLocation = arrayListOf(10,-1,0,10,0,0,0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postId = 85
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            postBackground = "#0A174E"
            postTextColor = arrayListOf(CONSTANT,  "#F5D042")
            postFontFamily = 103
            videoUrl = "M063lXohF8Y"
//            videoText = util1.getPostExplanation(postNum, postText)
        }
        return post
    }
}