package com.sg.posti10

import android.content.res.Resources

class DemiPost {
    var colorA=""
    var colorB=""
    var colorAB=""

    fun demiPost100(postNum: Int, imageUri: String, postText: ArrayList<String>,
                    postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int,colorIndex:Int, selector: Int,fontFamily:Int): Post {
        val post = Post()
        with(post) {
            getColors(colorIndex)
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            if (selector==1) {
                this.postBackground = colorA
                this.postTextColor = arrayListOf(CONSTANT, colorB)
            }else{
                this.postBackground = colorB
                this.postTextColor = arrayListOf(CONSTANT, colorA)
            }
            this.postFontFamily = fontFamily
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }
    fun demiPost200(postNum: Int, imageUri: String, postText: ArrayList<String>,
                    postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int,colorIndex:Int, selector: Int,fontFamily:Int): Post {
        val post = Post()
        with(post) {
            getColors(colorIndex)
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //up
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            if (selector==1) {
                this.postBackground = colorA
                this.postTextColor = arrayListOf(CONSTANT, colorB)
            }else{
                this.postBackground = colorB
                this.postTextColor = arrayListOf(CONSTANT, colorA)
            }
            this.postFontFamily = fontFamily
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    private fun getColors(index:Int) {
        when (index) {
            10 -> {colorA = "#000000"
                colorB = "#ffffff"}
            11 -> {colorA = "#02343F"
                colorB = "#F0EDCC"}
            12 -> {colorA = "#331B3F"
                colorB = "#ACC7B4" }
            13 -> {colorA = "#0A174E"
                colorB = "#F5D042" }
            14 -> {colorA = "#07553B"
                colorB = "#CED46A" }
            15 -> {colorA = "#50586C"
                colorB = "#DCE2F0" }
            16 -> {colorA = "#815854"
                colorB = "#F9EBDE" }
            17 -> {colorA = "#1E4174"
                colorB = "#DDA94B" }
            18 -> {colorA = "#A4193D"
                colorB = "#FFDFB9" }
            19 -> {colorA = "#1AAFBC"
                colorB = "#80634C" }
            20 -> {colorA = "#FFDFDE"
                colorB = "#6A7BA2" }
            21 -> {colorA = "#3B1877"
                colorB = "#DA5A2A" }
            22 -> {colorA = "#5F4B8B"
                colorB = "#E69A8D" }
            23 -> {colorA = "#00203F"
                colorB = "#ADEFD1" }
            24 -> {colorA = "#606060"
                colorB = "#D6ED17" }
            25 -> {colorA = "##2C5F2D"
                colorB = "#97BC62" }
            26 -> {colorA = "#00539C"
                colorB = "#EEA47F" }
            27 -> {colorA = "#0063B2"
                colorB = "#9CC3D5" }
            28 -> {colorA = "#101820"
                colorB = "#FEE715" }
            29 -> {colorA = "#CBCE91"
                colorB = "#d3687f" }
            30-> {colorA = "#B1624E"
                colorB = "#5CC8D7" }
            31-> {colorA = "#7b9acc"
                colorB = "#FCF6F5" }
            32-> {colorA = "#101820"
                colorB = "#F2AA4C" }
            33-> {colorA = "#A07855"
                colorB = "#D4B996" }
            34-> {colorA = "#195190"
                colorB = "#A2A2A1" }
            35-> {colorA = "#603F83"
                colorB = "#C7D3D4" }
            36->seperateColors("#2BAE66#FCF6F5")
            37-> seperateColors("#FAD0C9#6E6E6D")
            38-> seperateColors("#2D2926#ed6f63")
            39->seperateColors( "#DAA03D#616247")
            40->seperateColors( "#990011#FCF6F5")
            41-> seperateColors( "#364b44#D64161")
            42->  seperateColors( "#CBCE91#76528B")
            43->  seperateColors("#FAEBEF#333D79")
            44->  seperateColors( "#c72d1b#FDD20E")
            45-> seperateColors( "#F2EDD7#755139")
            46-> seperateColors( "#1a7a4c#101820")
            47-> seperateColors( "#F95700#FFFFFF")
            48-> seperateColors( "#FFD662#00539C")
            49-> seperateColors( "#D7C49E#343148")
            50-> seperateColors( "#DF6589#3C1053")
            51-> seperateColors( "#FFE77A#2C5F2D")
            52-> seperateColors( "#e9877e#9E1030")
            53-> seperateColors( "#FCF951#422057")
            54-> seperateColors( "#4B878B#921416")
            55-> seperateColors( "#1C1C1B#CE4A7E")
            56-> seperateColors( "#00B1D2#FDDB27")
            57-> seperateColors( "#558600#ff9967")
            58-> seperateColors( "#BD7F37#A13941")
            59-> seperateColors( "#eedfe2#9FC131")
            60-> seperateColors( "#00239C#ed6a66")
            61-> seperateColors( "#F96167#FCE77D")
            62-> seperateColors( "#F9D142#292826")
            63-> seperateColors( "#DF678C#3D155F")
            64-> seperateColors( "#CCF381#4831D4")
            65-> seperateColors( "#4A274F#F0A07B")
            66-> seperateColors( "#FFF548#3C1A5B")
            67-> seperateColors( "#2E3C7E#FBEAEB")
            68-> seperateColors( "#EC4D36#1D1B1B")
            69-> seperateColors( "#141A46#EC8B5E")
            70-> seperateColors( "#141A46#EC8B5E")
            71-> seperateColors( "#295F2E#FFE67C")
            72-> seperateColors( "#F3A950#161B21")
            73-> seperateColors( "#ef4da0#070952")
            74-> seperateColors( "#4A171E#E2B143")
            75-> seperateColors( "#D2302C#F7F7F9")
            76-> seperateColors( "#E7D044#A04EF6")
            77-> seperateColors( "#262223#DDC6B6")
            78-> seperateColors( "#F4EFEA#9A161F")
            79-> seperateColors( "#234E70#FBF8BE")
            80-> seperateColors( "#FFE8F5#9000FF")
            81-> seperateColors( "#191919#BD8F4D")
            82-> seperateColors( "#CC313D#F7C5CC")
            83-> seperateColors( "#E2D3F3#013DC4")
            84-> seperateColors( "#99F443#EC449B")
            85-> seperateColors( "#EE4E34#FCEDDA")
            86-> seperateColors( "#96351F#DBB98F")
            87-> seperateColors( "#E2D0F9#317773")
        }
    }

    fun seperateColors(color:String){
        colorA = color.substring(0, 7)
        colorB = color.substring(8)
    }




 /*   fun demiPost201610(postNum: Int, imageUri: String, postText: ArrayList<String>): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, 0, 0, 0, 0, 0)  //  up
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = 10
            this.postTextSize = arrayListOf(0, 16)
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost101610(postNum: Int, imageUri: String, postText: ArrayList<String>): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, 0, 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = 10
            this.postTextSize = arrayListOf(0, 16)
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost111610(postNum: Int, imageUri: String, postText: ArrayList<String>): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, 0, 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = 10
            this.postTextSize = arrayListOf(0, 16)
            this.postBackground = "#F0EDCC"
            this.postTextColor = arrayListOf(CONSTANT, "#02343F")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost121610(postNum: Int, imageUri: String, postText: ArrayList<String>): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, 0, 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = 10
            this.postTextSize = arrayListOf(0, 16)
            this.postBackground = "#FFD662"
            this.postTextColor = arrayListOf(CONSTANT, "#00539C")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost10(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize

            this.postBackground = "#FFD662"
            this.postTextColor = arrayListOf(CONSTANT, "#00539C")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }

        return post
    }

    fun demiPost20(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#FFD662"
            this.postTextColor = arrayListOf(CONSTANT, "#00539C")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }

        return post
    }


    fun demiPost11(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#F0EDCC"
            this.postTextColor = arrayListOf(CONSTANT, "#02343F")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }

        return post
    }

    fun demiPost21(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#F0EDCC"
            this.postTextColor = arrayListOf(CONSTANT, "#02343F")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost12(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#000000"
            this.postTextColor = arrayListOf(CONSTANT, "#FFFFFF")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }

        return post
    }

    fun demiPost22(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#000000"
            this.postTextColor = arrayListOf(CONSTANT, "#FFFFFF")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost13(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost23(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }


    fun demiPost199(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, margin.toPx(), 0, -1, 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost299(
        postNum: Int, imageUri: String, postText: ArrayList<String>,
        postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int
    ): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)  //  Bottom
            this.postPadding = arrayListOf(0, 0, 0, 0)
            this.postTransparency = postTransparency
            this.postTextSize = postTextSize
            this.postBackground = "#0A174E"
            this.postTextColor = arrayListOf(CONSTANT, "#F5D042")
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }
*/
    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
}
