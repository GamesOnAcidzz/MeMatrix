package com.example.mematrix.customviews



import android.content.ClipData
import android.content.Context
import android.graphics.Canvas
import android.os.Build
import android.util.AttributeSet
import android.view.DragEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import com.example.mematrix.R

@RequiresApi(Build.VERSION_CODES.N)
class GridItem(context: Context, attrs:AttributeSet): FrameLayout(context,attrs) {


    init {

        //LayoutInflater.from(context).inflate(R.layout.handlers_layout, this)
        View.inflate(context,R.layout.handlers_layout,this)
        val top_handle = findViewById<ImageView>(R.id.top_handle)
        val bottom_handle = findViewById<ImageView>(R.id.bottom_handle)
        val left_handle = findViewById<ImageView>(R.id.left_handle)
        val right_handle = findViewById<ImageView>(R.id.right_handle)
        top_handle.setOnLongClickListener(){
            it.startDragAndDrop(ClipData.newPlainText("",null),View.DragShadowBuilder(it),null,0)
        }
        top_handle.setOnDragListener { view, dragEvent ->
            when (dragEvent.action) {
                DragEvent.ACTION_DRAG_STARTED -> {
                    view.visibility=View.GONE
                    true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    view.invalidate()
                    true
                }
                DragEvent.ACTION_DRAG_LOCATION -> {

                    true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    true
                }
                DragEvent.ACTION_DROP -> {
                    true
                }
                DragEvent.ACTION_DRAG_ENDED -> {
                    true
                }
                else -> {
                    false
                }
            }

        }
    }



}