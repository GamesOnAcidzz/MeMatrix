package com.example.mematrix.customviews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class WindowGrid(context: Context, attrs:AttributeSet): View(context,attrs) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val mPaint = Paint()
        mPaint.color= Color.BLACK

        val viewHeight = (parent as View).height
        val viewWidth = (parent as View).width

        var rows = 8
        var cols = 8

        var cellWidth = viewWidth/cols
        var cellHeight= viewHeight/rows

        for (i in 1..rows)
        {
            canvas?.drawLine(0F, i*cellHeight.toFloat(), width.toFloat(), i*cellHeight.toFloat(), mPaint)
        }
        for (i in 1..cols)
        {
            canvas?.drawLine(i*cellWidth.toFloat(), 0F, i*cellWidth.toFloat(), height.toFloat(), mPaint)
        }



    }

}