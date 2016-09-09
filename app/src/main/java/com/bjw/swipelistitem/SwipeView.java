package com.bjw.swipelistitem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/9/9 0009.
 */
public class SwipeView extends FrameLayout {

    public SwipeView(Context context) {
        this(context,null);
    }

    public SwipeView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SwipeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        
    }
}
