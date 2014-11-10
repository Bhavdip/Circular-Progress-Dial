package com.mindtherobot.samples.thermometer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class AdvDialView extends View {
	 
	Paint[] mPaints = new Paint[10];
	
	final RectF rect = new RectF();
	final RectF innerRect = new RectF();
	
	int mRadius = 160;
	Context mContext;
 
	public static final int SIZE = 250;
 
	int deviceWidth = 0;
	int deviceHeight = 0;
	
	public AdvDialView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		mContext = context;
		setUp();
	}
 
	public AdvDialView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		setUp();
	}
 
	public AdvDialView(Context context) {
		super(context);
		mContext = context;
		setUp();
	}
	
	public int getStrokeWidth(){
		return (int)(mRadius/1.40);
	}
 
	private void setUp() {
 
		mPaints[0] = new Paint();
		mPaints[0].setColor(Color.parseColor("#0D0D0D"));
		mPaints[0].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[0].setStrokeWidth(getStrokeWidth());
		mPaints[0].setAntiAlias(true);
		mPaints[0].setStrokeCap(Paint.Cap.BUTT);
		mPaints[0].setStyle(Paint.Style.STROKE);
 
		mPaints[1] = new Paint();
		mPaints[1].setColor(Color.parseColor("#0072CF"));
		mPaints[1].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[1].setStrokeWidth(getStrokeWidth());
		mPaints[1].setAntiAlias(true);
		mPaints[1].setStrokeCap(Paint.Cap.BUTT);
		mPaints[1].setStyle(Paint.Style.STROKE);
 
		mPaints[2] = new Paint();
		mPaints[2].setColor(Color.parseColor("#02CE24"));
		mPaints[2].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[2].setStrokeWidth(getStrokeWidth());
		mPaints[2].setAntiAlias(true);
		mPaints[2].setStrokeCap(Paint.Cap.BUTT);
		mPaints[2].setStyle(Paint.Style.STROKE);
 
		mPaints[3] = new Paint();
		mPaints[3].setColor(Color.parseColor("#FFDE00"));
		mPaints[3].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[3].setStrokeWidth(getStrokeWidth());
		mPaints[3].setAntiAlias(true);
		mPaints[3].setStrokeCap(Paint.Cap.BUTT);
		mPaints[3].setStyle(Paint.Style.STROKE);
 
		mPaints[4] = new Paint();
		mPaints[4].setColor(Color.parseColor("#F89200"));
		mPaints[4].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[4].setStrokeWidth(getStrokeWidth());
		mPaints[4].setAntiAlias(true);
		mPaints[4].setStrokeCap(Paint.Cap.BUTT);
		mPaints[4].setStyle(Paint.Style.STROKE);
 
		mPaints[5] = new Paint();
		mPaints[5].setColor(Color.parseColor("#F73D04"));
		mPaints[5].setFlags(Paint.ANTI_ALIAS_FLAG);
		mPaints[5].setStrokeWidth(getStrokeWidth());
		mPaints[5].setAntiAlias(true);
		mPaints[5].setStrokeCap(Paint.Cap.BUTT);
		mPaints[5].setStyle(Paint.Style.STROKE);
 
		mPaints[6] = new Paint();
		mPaints[6].setColor(Color.parseColor("#320F30"));
		mPaints[6].setFlags(Paint.ANTI_ALIAS_FLAG);
		//mPaints[6].setStrokeWidth(mRadius / 2);
		mPaints[6].setStrokeCap(Paint.Cap.BUTT);
		mPaints[6].setStyle(Paint.Style.FILL);
		
		mPaints[7] = new Paint();
		mPaints[7].setColor(Color.WHITE);
		mPaints[7].setStrokeWidth(5);
		mPaints[7].setAntiAlias(true);
		mPaints[7].setStrokeCap(Paint.Cap.BUTT);
		mPaints[7].setStyle(Paint.Style.STROKE);
	}
 
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		
		rect.set(getWidth() / 2 - (mRadius/2), getHeight() / 2 - (mRadius/2),
				getWidth() / 2 + (mRadius/2), getHeight() / 2 + (mRadius/2));
 
		canvas.drawArc(rect, 0, 60, false, mPaints[5]);
		canvas.drawArc(rect, 60, 60, false, mPaints[0]);
		canvas.drawArc(rect, 120, 60, false, mPaints[1]);
		canvas.drawArc(rect, 180, 60, false, mPaints[2]);
		canvas.drawArc(rect, 240, 60, false, mPaints[3]);
		canvas.drawArc(rect, 300, 60, false, mPaints[4]);
 
		canvas.drawLine(getWidth()/2,getHeight()/2, getWidth()/2-mRadius/2,getHeight()/2-mRadius/4,mPaints[7]);
		canvas.drawLine(getWidth()/2,getHeight()/2, getWidth()/2+mRadius/2, getHeight()/2-mRadius/4,mPaints[7]);
		
		canvas.drawLine(getWidth()/2,getHeight()/2, getWidth()/2+mRadius/2, getHeight()/2+mRadius/2,mPaints[7]); 
        canvas.drawLine(getWidth()/2,getHeight()/2, getWidth()/2-mRadius/4-mRadius/2, getHeight()/2,mPaints[7]); 
        canvas.drawLine(getWidth()/2,getHeight()/2, getWidth()/2+mRadius/4+mRadius/2, getHeight()/2,mPaints[7]); 
		 
		//
		// canvas.drawLine(getWidth()/2,
		// getHeight()/2, getWidth()/2+mRadius/2,
		// getHeight()/2-mRadius/2,paint3);
		//
		// canvas.drawLine(getWidth()/2,
		// getHeight()/2, getWidth()/2-mRadius/2,
		// getHeight()/2+mRadius/2,paint3);
		//
		// canvas.drawLine(getWidth()/2,
		// getHeight()/2, getWidth()/2+mRadius/2,
		// getHeight()/2+mRadius/2,paint3);
		//
		// canvas.drawLine(getWidth()/2,
		// getHeight()/2, getWidth()/2-mRadius/4-mRadius/2,
		// getHeight()/2,paint3);
		//
		// canvas.drawLine(getWidth()/2,
		// getHeight()/2, getWidth()/2+mRadius/4+mRadius/2,
		// getHeight()/2,paint3);
 
		innerRect.set(getWidth() / 2 - (mRadius/2), getHeight() / 2 - (mRadius/2),
				getWidth() / 2 + (mRadius/2), getHeight() / 2 + (mRadius/2));
		
		 canvas.drawOval(innerRect, mPaints[6]);
		 
		 //canvas.drawCircle(getWidth() / 2, getHeight() / 2,mRadius/2,mPaints[6]);
				
 
		// paint8.setColor(Color.YELLOW);
		// paint8.setStrokeWidth(3);
		// paint8.setAntiAlias(true);
		// paint8.setStrokeCap(Paint.Cap.BUTT);
		// paint8.setStyle(Paint.Style.STROKE);
		//
		// canvas.drawCircle(getWidth()/2, getHeight()/2, mRadius/2, paint8);
	}
	
	public void initSize(int width,int height)
	{
	    deviceWidth = width;
	    deviceHeight = height;
	    mRadius = deviceWidth > deviceHeight ? deviceHeight /2 : deviceWidth /2;
	    setUp();
	    this.invalidate();
	}
 
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
		final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
		final int widthSize = MeasureSpec.getSize(widthMeasureSpec);
		final int heightSize = MeasureSpec.getSize(heightMeasureSpec);
 
		final int chosenWidth = chooseDimension(widthMode, widthSize);
		final int chosenHeight = chooseDimension(heightMode, heightSize);
		
		setMeasuredDimension(chosenWidth, chosenHeight);
	}
 
	private int chooseDimension(final int mode, final int size) {
		switch (mode) {
		case View.MeasureSpec.AT_MOST:
		case View.MeasureSpec.EXACTLY:
			return size;
		case View.MeasureSpec.UNSPECIFIED:
		default:
			return getDefaultDimension();
		}
	}
 
	private int getDefaultDimension() {
		return SIZE;
	}
 
	@Override
	protected void onSizeChanged(final int w, final int h, final int oldw,
			final int oldh) {
	}
}
