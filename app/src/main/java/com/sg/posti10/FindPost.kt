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
//        post=posts2Lines.loadPost296()
//        post=posts2Lines.loadPost299()
//        post=posts2Lines.loadPost29900()
//        post=posts2Lines.loadPost29_916()
//---------
//              post = posts3Lines.loadPost300()
//              post = posts3Lines.loadPost390()
//              post = posts3Lines.loadPost3969()
//              post = posts3Lines.loadPost3_970()
//              post = posts3Lines.loadPost3998()
//              post = posts3Lines.loadPost3999()
//              post = posts3Lines.loadPost3_999_000()
//               post = posts3Lines.loadPost3_999_023()
//---------
        post = posts4Lines.loadPost460()
//        post = posts4Lines.loadPost490()
//        post = posts4Lines.loadPost4_900()
//        post = posts4Lines.loadPost4_999()
//        post = posts4Lines.loadPost4_999_000()
//        post = posts4Lines.loadPost4999050()
//           post = posts4Lines.loadPost4999076()
//        post = posts4Lines.loadPost4_999_077()
//---------
//        post = posts5Lines.loadPost596()
//        post = posts5Lines.loadPost599()
//        post = posts5Lines.loadPost5_999_000()
//        post = posts5Lines.loadPost5_999_006()
//---------
//        post = posts6Lines.loadPost648()
//        post = posts6Lines.loadPost655()
//---------
//        post = posts7Lines.loadPost718()
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