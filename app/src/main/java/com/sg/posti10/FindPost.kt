package com.sg.posti10

import com.sg.posti10.posts.*

class FindPost {
    var cP = Post()

    private val posts1Lines = Posts1Lines()
    private val posts2Lines = Posts2Lines()
    private val posts3Lines = Posts3Lines()
    private val posts4Lines = Posts4Lines()
    private val posts5Lines = Posts5Lines()
    private val posts6Lines = Posts6Lines()
    private val posts7Lines = Posts7Lines()
    private val posts8Lines = Posts8Lines()
    private val posts9Lines = Posts9Lines()
    private val posts10Lines = Posts10Lines()
    private val posts11Lines = Posts11Lines()
    private val posts12Lines = Posts12Lines()


    fun individualPost(): Post {
        var post = Post()

//post=posts1Lines.loadPost100()
//post=posts1Lines.loadPost103()
//---------
//        post=posts2Lines.loadPost29910()
//        post=posts2Lines.loadPost29913()
//---------
              post = posts3Lines.loadPost3999010()
//        post = posts3Lines.loadPost3999019()
//---------
//        post = posts4Lines.loadPost4999067()
//        post = posts4Lines.loadPost4999072()
//---------
//        post = posts5Lines.loadPost5999000()
//        post = posts5Lines.loadPost5999005()
//---------
//        post = posts6Lines.loadPost651()
//        post = posts6Lines.loadPost654()
//---------
//        post = posts7Lines.loadPost719()
//---------
//        post = posts8Lines.loadPost814()
//---------
//        post = posts9Lines.loadPost905()
//---------
//        post = posts10Lines.loadPost1006()
//---------
//        post = posts11Lines.loadPost1100()
//---------
//        post = posts12Lines.loadPost1200()
//---------
        return post
    }


}