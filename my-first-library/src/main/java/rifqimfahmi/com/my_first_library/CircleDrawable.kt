package rifqimfahmi.com.my_first_library

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.View

/**
 * Created by rifqimfahmi on 05/02/18.
 */

class CircleDrawable : View {
    private var DEFAULT_RADIUS: Int = 20

    private var mRadius: Int = DEFAULT_RADIUS
    private lateinit var mPaint: Paint

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    fun init (context: Context, attrs: AttributeSet?) {
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint.style = Paint.Style.FILL
        mPaint.color = ContextCompat.getColor(context, android.R.color.holo_red_dark)
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle((width / 2).toFloat(),
                (height / 2).toFloat(),
                Math.min(width/2, height/2).toFloat(),
                mPaint)
    }
}
