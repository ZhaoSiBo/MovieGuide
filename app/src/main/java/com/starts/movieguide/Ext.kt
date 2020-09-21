package com.starts.movieguide

import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.Color

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/28.
 *版本号：1.0

 */
fun getMaterialColor(resources: Resources, index:Int):Int {
    val colors = resources.obtainTypedArray(R.array.mdcolor_300);

    val  returnColor = colors.getColor(index % colors.length(), Color.BLACK);

    colors.recycle();
    return returnColor
}