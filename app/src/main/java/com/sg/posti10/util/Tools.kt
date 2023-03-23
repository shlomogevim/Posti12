package com.sg.posti10.util

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.posti10.*
import com.sg.posti10.model.Post

class Tools {
 /*  fun extractPostNumFromFunctionName(): Int {
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("loadPost") }
        val postNum = func.methodName.substringAfter("loadPost").toInt()
        return postNum
    }*/
 fun extractPostNumFromFunctionName(): Int {
     val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith("loadPost") }
     val postNum = func.methodName.substringAfter("loadPost")
     return if (postNum.length > 3) {
         postNum.replace("_", "").toInt()
     } else {
         postNum.toInt()
     }
 }


    fun extractPostNumFromFunctionName1(): Int {
        val st="demiPost"
        val func = Thread.currentThread().stackTrace.first { it.methodName.startsWith(st) }
        val postNum = func.methodName.substringAfter("st").toInt()
        return postNum
    }

    fun sendPostToStringFirestore(post: Post) {
        val postNum = post.postNum.toString()
        val db = FirebaseFirestore.getInstance()
        val query = db.collection(POST_REF).whereEqualTo(POST_NUM, postNum)
        query.get().addOnSuccessListener { documents ->
            if (documents.isEmpty) {
                // Document does not exist, create a new one
                val data = getPostData(post)
                db.collection(POST_REF).document(postNum).set(data)
                    .addOnSuccessListener {
                        Log.d(TAG, "Document created/updated with ID: $postNum")
                    }
                    .addOnFailureListener { e ->
                        Log.w(TAG, "Error creating/updating document", e)
                    }
            } else {
                // Document already exists, update it with new data
                val data = getPostData(post)
                db.collection(POST_REF).document(postNum).update(data)
                    .addOnSuccessListener {
                        Log.d(TAG, "Document updated with ID: $postNum")
                    }
                    .addOnFailureListener { e ->
                        Log.w(TAG, "Error updating document", e)
                    }
            }
        }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error getting documents", e)
            }
    }

    private fun getPostData(post: Post): HashMap<String, Any> {
        val data = hashMapOf(
            POST_ID to post.postId,
            POST_NUM to post.postNum.toString(),
            POST_LINE_NUM to post.lineNum,
            POST_IMAGE_URI to post.imageUri,
            POST_TEXT to post.postText,
            POST_MARGIN to post.postMargin.joinToString(),
            POST_BACKGROUND to post.postBackground,
            POST_TRANPARECY to post.postTransparency,
            POST_TEXT_SIZE to post.postTextSize.joinToString(),
            POST_PADDING to post.postPadding.joinToString(),
            POST_TEXT_LOCATION to post.textLocation.joinToString(),
            POST_TEXT_COLOR to post.postTextColor,
            POST_FONT_FAMILY to post.postFontFamily,
            POST_RADIUS to post.postRadiuas,
            POST_TIME_STAMP to FieldValue.serverTimestamp(),
            POST_LINE_SPACING to post.lineSpacing.toDouble(),
            POST_GRADE to post.grade,
            POST_VIDEO_URL to post.videoUrl,
            POST_VIDEO_TEXT to post.videoText
        )
        return data
    }



    /* fun sendPostToStringFirestore(post: Post) {
         val postNum = post.postNum.toString()
         val db = FirebaseFirestore.getInstance()
         val query = db.collection(POST_REF).whereEqualTo(POST_NUM, postNum)
         query.get().addOnSuccessListener { documents ->
             if (documents.isEmpty) {
                 // Document does not exist, create a new one
                 val data = hashMapOf(
                     POST_ID to post.postId,
                     POST_NUM to postNum,
                     POST_LINE_NUM to post.lineNum,
                     POST_IMAGE_URI to post.imageUri,
                     POST_TEXT to post.postText,
                     POST_MARGIN to post.postMargin.joinToString(),
                     POST_BACKGROUND to post.postBackground,
                     POST_TRANPARECY to post.postTransparency,
                     POST_TEXT_SIZE to post.postTextSize.joinToString(),
                     POST_PADDING to post.postPadding.joinToString(),
                     POST_TEXT_LOCATION to post.textLocation.joinToString(),
                     POST_TEXT_COLOR to post.postTextColor,
                     POST_FONT_FAMILY to post.postFontFamily,
                     POST_RADIUS to post.postRadiuas,
                     POST_TIME_STAMP to FieldValue.serverTimestamp(),
                     POST_LINE_SPACING to post.lineSpacing.toDouble(),
                     POST_GRADE to post.grade,
                     POST_VIDEO_URL to post.videoUrl,
                     POST_VIDEO_TEXT to post.videoText
                 )
                 db.collection(POST_REF).document(postNum).set(data)
                     .addOnSuccessListener {
                         Log.d(TAG, "Document created/updated with ID: $postNum")
                     }
                     .addOnFailureListener { e ->
                         Log.w(TAG, "Error creating/updating document", e)
                     }
             } else {
                 // Document already exists, update it with new data
                 val data = hashMapOf(
                     POST_ID to post.postId,
                     POST_LINE_NUM to post.lineNum,
                     POST_IMAGE_URI to post.imageUri,
                     POST_TEXT to post.postText,
                     POST_MARGIN to post.postMargin.joinToString(),
                     POST_BACKGROUND to post.postBackground,
                     POST_TRANPARECY to post.postTransparency,
                     POST_TEXT_SIZE to post.postTextSize.joinToString(),
                     POST_PADDING to post.postPadding.joinToString(),
                     POST_TEXT_LOCATION to post.textLocation.joinToString(),
                     POST_TEXT_COLOR to post.postTextColor,
                     POST_FONT_FAMILY to post.postFontFamily,
                     POST_RADIUS to post.postRadiuas,
                     POST_TIME_STAMP to FieldValue.serverTimestamp(),
                     POST_LINE_SPACING to post.lineSpacing.toDouble(),
                     POST_GRADE to post.grade,
                     POST_VIDEO_URL to post.videoUrl,
                     POST_VIDEO_TEXT to post.videoText
                 )
                 db.collection(POST_REF).document(postNum).update(data)
                     .addOnSuccessListener {
                         Log.d(TAG, "Document updated with ID: $postNum")
                     }
                     .addOnFailureListener { e ->
                         Log.w(TAG, "Error updating document", e)
                     }
             }
         }
             .addOnFailureListener { e ->
                 Log.w(TAG, "Error getting documents", e)
             }
     }*/




  /*  fun sendPostToStringFirestore(post: Post) {
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
            data[POST_GRADE]=grade
            data[POST_VIDEO_URL]=videoUrl
            data[POST_VIDEO_TEXT]=videoText
        }
        *//*  timestamp,
            postLineSpacing!!.toFloat(),
            0,
            postVideoUrl,
            postVideoText*//*
        FirebaseFirestore.getInstance().collection(POST_REF).document(post.postNum.toString())
            .set(data)
    }*/
    fun logi(message: String) {
        Log.i("gg", message)
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