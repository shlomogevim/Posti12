package com.sg.posti10

import android.content.res.Resources

class DemiPost {
    var colorA=""
    var colorB=""
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
            16 -> {colorA = "#815854"    //?
                colorB = "#815854" }
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
        }

    }
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




    fun demiPost201610(postNum: Int, imageUri: String, postText: ArrayList<String>): Post {
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

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
}

/*

class DemiPost {
    var colorA=""
    var colorB=""
    private fun getColors(index:Int) {
        when (index) {
            10 -> {
                colorA = "#02343F"
                colorB = "#F0EDCC"
            }
            11 -> {
                colorA = "#331B3F"
                colorB = "#ACC7B4"
            }
            12 -> {
                colorA = "#0A174E"
                colorB = "#F5D042"
            }
        }

    }
    fun demiPost100(postNum: Int, imageUri: String, postText: ArrayList<String>,
                    postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int, selector: Int): Post {
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
            if (selector==1) {
                this.postBackground = colorA
                this.postTextColor = arrayListOf(CONSTANT, colorB)
            }else{
                this.postBackground = colorB
                this.postTextColor = arrayListOf(CONSTANT, colorA)
            }
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }

    fun demiPost200(postNum: Int, imageUri: String, postText: ArrayList<String>,
                    postTransparency: Int, postTextSize: ArrayList<Int>, margin: Int, selector: Int): Post {
        val post = Post()
        with(post) {
            this.postNum = postNum
            this.imageUri = imageUri
            this.postText = postText
            this.postId = 87
            this.textLocation = arrayListOf(10, -1, 0, margin.toPx(), 0, 0, 0, 0)
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
            this.postFontFamily = 103
            this.videoUrl = "9UVjjcOUJLE"
        }
        return post
    }


*/

