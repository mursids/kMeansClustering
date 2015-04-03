package com.gpaduana.kmeans.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class TextOverlay{

	private String text;
	private int x, y;
	private Paint strokePaint;
	private Paint textPaint;
	
	public TextOverlay(String text, int size, int x, int y,
			int a, int r, int g, int b, int strokeWidth, Paint.Align align){
		this.text = text;
		this.x = x;
		this.y = y;

		strokePaint = new Paint();
	    strokePaint.setARGB(a/2, (~r & 0xFF), (~g & 0xFF), (~b & 0xFF));
	    strokePaint.setTextAlign(align);
	    strokePaint.setTextSize(size);
	    strokePaint.setTypeface(Typeface.DEFAULT_BOLD);
	    strokePaint.setStyle(Paint.Style.STROKE);
	    strokePaint.setStrokeWidth(strokeWidth);
	    strokePaint.setAntiAlias(true);
	    
	    textPaint = new Paint();
	    textPaint.setARGB(a, r, g, b);
	    textPaint.setTextAlign(align);
	    textPaint.setTextSize(size);
	    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
	    textPaint.setAntiAlias(true);
	}
	
	public void draw(Canvas canvas) {
	    canvas.drawText(text, x, y, strokePaint);
	    canvas.drawText(text, x, y, textPaint);
	}
}
