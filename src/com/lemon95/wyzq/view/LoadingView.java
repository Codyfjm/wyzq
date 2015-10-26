package com.lemon95.wyzq.view;

import com.lemon95.wyzq.R;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
/**
 *读取视频的loading界面的配置 
 * 
 */
public class LoadingView extends RelativeLayout {
	
	private Context mContext;
	
	public LoadingView(Context context) {
		super(context);
		initView(context);
	}
	
	public LoadingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
	}
	
	private void initView(Context context) {
		mContext = context;
		View loadingView = View.inflate(context, R.layout.view_loading, this);
		
		Button back = (Button)loadingView.findViewById(R.id.btn_player_exit);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				((Activity)mContext).finish();
			}
		});
	}
}
