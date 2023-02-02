package com.sg.posti10

import com.sg.posti10.posts.*

class FindPost {
    var cP=Post()

    private val posts3Lines= Posts3Lines()
    private val posts4Lines=Posts4Lines()


 /*   inline fun <reified T : Post> koko(index: Int): T {
        val firstDigit = index.toString().first()
        val clazz = when(firstDigit) {
            '1' -> Posts1Lines::class.java
            '2' -> Posts2Lines::class.java
            '3' -> Posts3Lines::class.java
            '4' -> Posts4Lines::class.java
            '5' -> Posts5Lines::class.java
            '6' -> Posts6Lines::class.java
            '7' -> Posts7Lines::class.java
            '8' -> Posts8Lines::class.java
            '9' -> Posts9Lines::class.java
          //  '10' -> Posts10Lines::class.java
            else -> throw IllegalArgumentException("Invalid index")
        }
        val method = clazz.getMethod("loadPost$index")
        return method.invoke(clazz.newInstance()) as T
    }*/
 inline fun <reified T : Post> koko(index: Int): T {
     val firstTwoDigits = index.toString().substring(0, 2)
     val clazz = when(firstTwoDigits) {
         "10" -> Posts10Lines::class.java
         "11" -> Posts11Lines::class.java
         "12" -> Posts12Lines::class.java
//         "13" -> Posts13Lines::class.java
         "1" -> Posts1Lines::class.java
         "2" -> Posts2Lines::class.java
         "3" -> Posts3Lines::class.java
         "4" -> Posts4Lines::class.java
         "5" -> Posts5Lines::class.java
         "6" -> Posts6Lines::class.java
         "7" -> Posts7Lines::class.java
         "8" -> Posts8Lines::class.java
         "9" -> Posts9Lines::class.java
         else -> throw IllegalArgumentException("Invalid index")
     }
     val method = clazz.getMethod("loadPost$index")
     return method.invoke(clazz.newInstance()) as T
 }

    fun individualPost1(index: Int):Post{

//       cP=koko(3999013)
//       val currrentPost=posts3Lines.loadPost3999011()
//       val currrentPost=posts3Lines.loadPost3999012()
//       val currrentPost=posts3Lines.loadPost3999013()
//       ------
        cP=koko(index)

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

        return cP
    }

    fun individualPost():Post{

/*
cP=koko(3999013)
val currrentPost=posts3Lines.loadPost3999011()
val currrentPost=posts3Lines.loadPost3999012()
val currrentPost=posts3Lines.loadPost3999013()
------
*/
        cP=koko(4999060)
 //  val currrentPost=posts3Lines.loadPost3999010()
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

       return cP
   }

}