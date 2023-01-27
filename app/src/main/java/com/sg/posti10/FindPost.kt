package com.sg.posti10

import com.sg.posti10.posts.Posts3Lines
import com.sg.posti10.posts.Posts4Lines

class FindPost {
    val posts4Lines=Posts4Lines()
    val posts3Lines= Posts3Lines()

   fun individualPost():Post{

       val currrentPost=posts3Lines.loadPost3999010()
//       val currrentPost=posts3Lines.loadPost3999011()
//       val currrentPost=posts3Lines.loadPost3999012()
//       val currrentPost=posts3Lines.loadPost3999013()
//       ------
//       val currrentPost=posts4Lines.loadPost4999060()
//       val currrentPost=posts4Lines.loadPost4999061()
//       val currrentPost=posts4Lines.loadPost4999062()
//       val currrentPost=posts4Lines.loadPost4999063()
//       val currrentPost=posts4Lines.loadPost4999064()
//       val currrentPost=posts4Lines.loadPost4999065()
//       val currrentPost=posts4Lines.loadPost4999066()
//       val currrentPost=posts4Lines.loadPost4999067()
//        val currrentPost=posts4Lines.createPost4999068()
//        val currrentPost=posts4Lines.createPost4999069()
//        val currrentPost=posts4Lines.createPost4999070()
//        val currrentPost=posts4Lines.createPost4999071()


       return currrentPost
   }
}