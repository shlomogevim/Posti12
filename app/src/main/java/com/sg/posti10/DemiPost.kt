package com.sg.posti10

import android.content.res.Resources

class DemiPost {
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
