package com.sg.posti10.posts

import com.sg.posti10.*

class Posts10Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost1006(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/20/22/21/palace-4781577_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה איך שאתה תופס אותם, ",
                " אתה תופס אותם כטוב ",
                " אתה חי בטוב, ",
                " אתה תופס אותם כרע  ",
                " אתה חי ברע, ",
                " כך שאם אתה שואל: ",
                " מי זה האלוהים הזה ",
                " שקובע לי איך החיים שלי יהיו ? ",
                " זהו, שזה אתה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost12(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }





 }