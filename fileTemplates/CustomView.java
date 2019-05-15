package ${PACKAGE_NAME};

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/**
 * Created on 2016/1/10.  by Jonas{https://github.com/mychoices}
 */
public class ${NAME} extends View {

  private Context mContext;
  /**
   * 系统认为发生滑动的最小距离
   */
  private int mTouchSlop;

  public ${NAME}(Context context) {
    super(context);
    init(context);
  }

  //没使用自定义属性 则走这个构造方法
  public ${NAME}(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(context);
  }

//使用自定义属性
  public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
        //获取自定义属性
        if(attrs != null) {
			//TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MPieView, defStyleAttr, 0);
            //pieInterWidth = (int)typedArray.getDimension(R.styleable.MPieView_pieInterColor, 0);
            //backColor = typedArray.getColor(R.styleable.MPieView_piebackground, Color.WHITE);
            //specialAngle = typedArray.getInt(R.styleable.MPieView_specialAngle, 0);
            //PieSelector = typedArray.getBoolean(R.styleable.MPieView_PieSelector, true);
            //typedArray.recycle();
        }
    init(context);
  }

  private void init(Context context) {
    mContext = context;
    //系统认为发生滑动的最小距离
    mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
  }

 //onFinishInflate在 构造方法之后 结束Inflate之后 调用 可以用于 初始化相关操作
  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
  }

  //一定在onDrtaw之前
  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
  }

  @Override
  protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);

  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

  }

  @Override
  public boolean onTouchEvent(MotionEvent event){
      switch(event.getAction()) {
          case MotionEvent.ACTION_DOWN:
              PointF tdown = new PointF(event.getX(), event.getY());

              break;
          case MotionEvent.ACTION_MOVE:
              PointF tmove = new PointF(event.getX(), event.getY());
              break;
          case MotionEvent.ACTION_UP:
              PointF tup = new PointF(event.getX(), event.getY());
              break;

      }
      return super.onTouchEvent(event);
  }

  @Override
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    //释放资源
  }
}
