package com.sg.posti10.posts

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.sg.posti10.BOTTOM
import com.sg.posti10.model.Post
import com.sg.posti10.TOP
import com.sg.posti10.util.Helper

class DrawPostHelper: AppCompatActivity() {
    val helper= Helper()
    lateinit var layout: ConstraintLayout
    //    lateinit var currentPost:Post
    var position1=""
    var margin1=0
    var dis1=0
    fun drawPost( constraintLayout: ConstraintLayout, currentPost: Post) {
        layout=constraintLayout
      setCurrentParameters(currentPost)
      loadImage(constraintLayout, currentPost)
      createText(constraintLayout,currentPost)

    }
    private fun setCurrentParameters(currentPost: Post) {
        //    textLocation = arrayListOf(10,-1, 33,10,0,0, 0, 0)
        val dataAr =currentPost.textLocation
        dis1 = dataAr[2]
        if (dataAr[1] == -1) {
            position1 = TOP
            margin1= dataAr[3]
        }
        if (dataAr[3] == -1) {
            position1 = BOTTOM
            margin1= dataAr[1]
        }
//        logi("56 dis1=$dis1        position1=$position1     margin1=$margin1")
    }
    private fun createText(constraintLayout: ConstraintLayout, post: Post) {
        //    textLocation = arrayListOf(10,-1, 33,10,0,0, 0, 0)
//        val mainLayout = createMainLayout(this,post)
        val mainLayout = createLinearLayout(layout.context,post)
        mainLayout.id = View.generateViewId()
        constraintLayout.addView(mainLayout)
        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)
        constraintSet.connect(mainLayout.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        constraintSet.connect(mainLayout.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
        if (position1 == TOP) {
            constraintSet.connect(mainLayout.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, margin1.toPx())
        } else {
            constraintSet.connect(mainLayout.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM,margin1.toPx())
        }
        constraintSet.applyTo(constraintLayout)
        //setContentView(constraintLayout)
    }
    fun createLinearLayout(context: Context,post: Post): LinearLayout {
        val ll1 = LinearLayout(context)
        ll1.orientation = LinearLayout.VERTICAL
        ll1.gravity= Gravity.CENTER_HORIZONTAL
        val textViews = createTextViews(context,post)
        for (i in textViews) {
            ll1.addView(i)
        }
        val layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        when (position1) {
            TOP -> layoutParams.topMargin = margin1.toPx()

            BOTTOM -> layoutParams.bottomMargin =margin1.toPx()
        }
        ll1.layoutParams = layoutParams
        return ll1
    }

   private fun createTextViews(context: Context, post: Post): Array<TextView?> {
       val textViews = arrayOfNulls<TextView>(post.postText.size)
       for (index in 0 until post.postText.size) {
           textViews[index] = createTextView(context, post, index)
       }
       return textViews
   }

    private fun createTextView(context: Context, post: Post, index:Int): TextView {
        val textView = TextView(context)
        textView.id = View.generateViewId()
       textView.gravity = Gravity.CENTER_HORIZONTAL
        textView.textAlignment = View.TEXT_ALIGNMENT_CENTER
        textView.text = post.postText[index]
        textView.textSize = post.postTextSize[1].toFloat()
        textView.setTextColor(Color.parseColor(updateColor(post.postTextColor[1])))
        val shape = GradientDrawable()
        shape.cornerRadius = post.postRadiuas.toPx().toFloat()
        shape.setColor(Color.parseColor(updateColor(post.postBackground)))

        post.postBackground = post.postBackground.replace("#", "")
        post.postBackground = post.postBackground.replace("$", "")
        val tra = helper.getTransfo(post.postTransparency)
        shape.setColor(Color.parseColor("#$tra${post.postBackground}"))
        textView.background = shape
        val pad =post.postPadding
        textView.setPadding(pad[0].toPx(),pad[1].toPx(), pad[2].toPx(), pad[3].toPx())
        val typeface = helper.getFamilyFont(post.postFontFamily)
        textView.typeface = ResourcesCompat.getFont(layout.context, typeface)

//        logi("DrawPostHelper 121  post.lineSpacing=${post.lineSpacing}")

        textView.setLineSpacing(0f, post.lineSpacing)
/*
  if (post.lineSpacing==0.9f){
      val lineHeight = textView.lineHeight // get the total line height in pixels
      val reducedHeight = (lineHeight * 1.5).toInt() // set the height to 83% of the total line height
      textView.height = reducedHeight // set the reduced height
      textView.setLineSpacing(0f, post.lineSpacing)
  }else{
      textView.setLineSpacing(0f, post.lineSpacing)
  }*/

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(0,dis1.toPx(), 0, 0)
      layoutParams.gravity = Gravity.CENTER
        textView.layoutParams = layoutParams
        return textView

    }
    fun getTwoValues(index: Int): Pair<Int, Int> {
        return when (index) {
            3999018-> Pair(-30, 0)
            4967-> Pair(-200, 0)
            4969-> Pair(-430, 0)
            4956-> Pair(1, 0)
            4923-> Pair(-500, 0)
            else -> Pair(0, 0)
        }
    }
    fun getThreeValues(index: Int, scale: Float): Triple<Int, Int, Float> {
        return when (index) {
            3999018 -> Triple((-30 * scale).toInt(), 0, scale)
            else -> Triple(0, 0, scale)
        }
    }


    private fun loadImage(layout: ConstraintLayout, post: Post) {
     // val imageMove:Int=getImageMove(post.postNum)
        val (dxMovment,dyMovment) = getTwoValues(post.postNum)
        val imageView = ImageView(layout.context)
        imageView.id = View.generateViewId()
        val params = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
//        params.dimensionRatio = "H,1:1"
        params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        params.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
        imageView.layoutParams = params
        if (dxMovment==0 && dyMovment==0){
              imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        }else{
            imageView.scaleType = ImageView.ScaleType.MATRIX
            val matrix = Matrix()
            post.textLocation[4]=dxMovment
            post.textLocation[5]=dyMovment
            matrix.postTranslate(dxMovment.toPxf(),dyMovment.toPxf())

         logi( "DrawPostHelper 160  dxMovment=$dxMovment dyMovment=$dyMovment post.textLocation=${post.textLocation}")

            imageView.imageMatrix = matrix
        }
        layout.addView(imageView)
        Glide.with(layout.context)
            .load(post.imageUri)
            .into(imageView)
    }


    fun logi(message: String) {
        Log.i("gg", message)
    }

    fun updateColor(str: String): String {
        return "#" + str.replace("[^A-Za-z0-9]".toRegex(), "")
    }

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    fun Int.toPxf(): Float = (this * Resources.getSystem().displayMetrics.density)












    /* fun Context.dpToPx(dp: Int): Float {
         return dp * resources.displayMetrics.density
     }*/
//    fun dp(numf:Int):Int{
//        return  layout.context.dpToPx(margin1).toInt()
//    }


    /*
      val textView = TextView(context)
//        textView.text = post.text
      textView.text = "מה קורה מלך"
      textView.textSize = 20f
      textView.setTextColor(Color.BLACK)
      textView.id = View.generateViewId()
      val layoutParams = ConstraintLayout.LayoutParams(
          ConstraintLayout.LayoutParams.WRAP_CONTENT,
          ConstraintLayout.LayoutParams.WRAP_CONTENT
      )
      layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
      layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
      layoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
      layoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
      layoutParams.topMargin = 20
      layoutParams.leftMargin = 20
      layoutParams.rightMargin = 20
      layoutParams.bottomMargin = 20
      layoutParams.dimensionRatio = "1:1"
      textView.layoutParams = layoutParams
      constraintLayout.addView(textView)*/


    /*  fun dpToPx(dp: Int): Int {
          val density = resources.displayMetrics.density
          return (dp * density + 0.5f).toInt()
      }*/
}
