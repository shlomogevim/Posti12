package com.sg.posti10

import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

class Tools {
   fun extractPostNumFromFunctionName(): Int {
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("loadPost") }
        val postNum = func.methodName.substringAfter("loadPost").toInt()
        return postNum
    }
    fun sendPostToStringFirestore(post: Post) {
        val data = HashMap<String, Any>()
        with(post) {
            data[POST_ID] = postId
            data[POST_NUM] = postNum
            data[POST_LINE_NUM] = lineNum
            data[POST_IMAGE_URI] = imageUri
            data[POST_TEXT] = postText
            data[POST_MARGIN] = postMargin.joinToString()
            data[POST_BACKGROUND] = postBackground
            data[POST_TRANPARECY] = postTransparency
            data[POST_TEXT_SIZE] = postTextSize.joinToString()
            data[POST_PADDING] = postPadding.joinToString()
            data[POST_TEXT_LOCATION] = textLocation.joinToString()
            data[POST_TEXT_COLOR] = postTextColor
            data[POST_FONT_FAMILY] = postFontFamily
            data[POST_RADIUS] = postRadiuas
            data[POST_TIME_STAMP] = FieldValue.serverTimestamp()
            data[POST_LINE_SPACING]=lineSpacing.toDouble()
            data[POST_VIDEO_URL]=videoUrl
            data[POST_VIDEO_TEXT]=videoText
        }
        FirebaseFirestore.getInstance().collection(POST_REF).document(post.postNum.toString())
            .set(data)
    }
    fun sendPostToStringFirestoreWithoutChangingTimeStamp(post: Post) {
        val data = HashMap<String, Any>()
        with(post) {
            data[POST_ID] = postId
            data[POST_NUM] = postNum
            data[POST_LINE_NUM] = lineNum
            data[POST_IMAGE_URI] = imageUri
            data[POST_TEXT] = postText
            data[POST_MARGIN] = postMargin.joinToString()
            data[POST_BACKGROUND] = postBackground
            data[POST_TRANPARECY] = postTransparency
            data[POST_TEXT_SIZE] = postTextSize.joinToString()
            data[POST_PADDING] = postPadding.joinToString()
            data[POST_TEXT_LOCATION] = textLocation.joinToString()
            data[POST_TEXT_COLOR] = postTextColor
            data[POST_FONT_FAMILY] = postFontFamily
            data[POST_RADIUS] = postRadiuas
            // data[POST_TIME_STAMP] = FieldValue.serverTimestamp()
            data[POST_LINE_SPACING]=lineSpacing.toDouble()
            data[POST_VIDEO_URL]=videoUrl
            data[POST_VIDEO_TEXT]=videoText
        }
        FirebaseFirestore.getInstance().collection(POST_REF).document(post.postNum.toString())
            .update(data)
    }
}