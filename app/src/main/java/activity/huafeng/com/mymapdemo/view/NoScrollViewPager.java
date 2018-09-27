package activity.huafeng.com.mymapdemo.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 禁止滑动的ViewPager
 */
public class NoScrollViewPager extends ViewPager {

	public NoScrollViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public NoScrollViewPager(Context context) {
		super(context);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// 此处什么都不做, 从而达到禁用事件的目的
		return false;
	}
	@Override
    public boolean onTouchEvent(MotionEvent ev) {
		return false;
	}

}
