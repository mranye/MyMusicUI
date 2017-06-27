package com.android.mymusicui.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.mymusicui.R;
import com.android.mymusicui.adapter.MyFragmentPagerAdapter;
import com.android.mymusicui.fragment.AtMeFragment;
import com.android.mymusicui.fragment.PingLunFragment;
import com.android.mymusicui.fragment.RecommendFragment;
import com.android.mymusicui.fragment.SiXinFragment;
import com.android.mymusicui.fragment.SysNoticeFragment;

public class RecommendActivity extends FragmentActivity implements
		OnClickListener, OnPageChangeListener {

	private ViewPager vp;
	/** 定义集合保存所有的Fragment */
	ArrayList<Fragment> fragments = new ArrayList<Fragment>();

	// 选项卡中的文本
	private TextView tv_recommend;
	private TextView tv_gedan;
	private TextView tv_radio;
	private TextView tv_paihang;

	// 作为指示标签的按钮
	private ImageView cursor;
	// 标志指示标签的横坐标
	float cursorX = 0;
	// 所有按钮的宽度的数组
	private int[] widthArgs;
	// 所有标题按钮的数组
	private TextView[] tvArgs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recommend);
		initViews();
	}

	private void initViews() {
		tv_recommend = (TextView) findViewById(R.id.recommend_tv_recommend);
		tv_gedan = (TextView) findViewById(R.id.recommend_tv_gedan);
		tv_radio = (TextView) findViewById(R.id.recommend_tv_radio);
		tv_paihang = (TextView) findViewById(R.id.recommend_tv_paihang);
		// 初始化按钮数组
		tvArgs = new TextView[] { tv_recommend, tv_gedan, tv_radio, tv_paihang };
		// 指示标签设置为红色
		cursor = (ImageView) findViewById(R.id.recommend_iv_cursor);
		cursor.setBackgroundColor(Color.RED);

		vp = (ViewPager) findViewById(R.id.recommend_vp);
		vp.setOnPageChangeListener(this);
		initListener();
		tv_recommend.post(new Runnable() {
			@Override
			public void run() {
				LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) cursor
						.getLayoutParams();
				// 减去边距*2，以对齐标题栏文字
				lp.width = tv_recommend.getWidth()
						- tv_recommend.getPaddingLeft() * 2;
				cursor.setLayoutParams(lp);
				cursor.setX(tv_recommend.getPaddingLeft());
			}
		});

		// 先重置所有按钮颜色
		resetButtonColor();
		// 再将第一个按钮字体设置为红色，表示默认选中第一个
		tv_recommend.setTextColor(Color.RED);

		fragments.add(new RecommendFragment());
		fragments.add(new RecommendFragment());
		fragments.add(new RecommendFragment());
		fragments.add(new RecommendFragment());
		MyFragmentPagerAdapter myAdapter = new MyFragmentPagerAdapter(
				getSupportFragmentManager(), this, fragments);
		vp.setAdapter(myAdapter);
	}

	private void resetButtonColor() {
		tv_recommend.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_gedan.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_radio.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_paihang.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_recommend.setTextColor(Color.BLACK);
		tv_gedan.setTextColor(Color.BLACK);
		tv_radio.setTextColor(Color.BLACK);
		tv_paihang.setTextColor(Color.BLACK);
	}

	private void initListener() {
		tv_recommend.setOnClickListener(this);
		tv_gedan.setOnClickListener(this);
		tv_radio.setOnClickListener(this);
		tv_paihang.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.recommend_tv_recommend:
			vp.setCurrentItem(0);
			cursorAnim(0);
			break;
		case R.id.recommend_tv_gedan:
			vp.setCurrentItem(1);
			cursorAnim(1);
			break;
		case R.id.recommend_tv_radio:
			vp.setCurrentItem(2);
			cursorAnim(2);
			break;
		case R.id.recommend_tv_paihang:
			vp.setCurrentItem(3);
			cursorAnim(3);
			break;
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		cursorX = 0;
		cursorX = cursorX + tvArgs[0].getWidth() * (arg1 + arg0);
		cursor.setX(cursorX);

	}

	// 每次滑动ViewPager的时候触发,页面滑动结束后执行此处代码 arg0 表示当前页面位置
	@Override
	public void onPageSelected(int arg0) {
		if (widthArgs == null) {
			widthArgs = new int[] { tv_recommend.getWidth(),
					tv_gedan.getWidth(), tv_radio.getWidth(),
					tv_paihang.getWidth() };
		}
		// 每次滑动首先重置所有按钮的颜色
		resetButtonColor();
		// 将滑动到的当前按钮颜色设置为红色
		tvArgs[arg0].setTextColor(Color.RED);
		cursorAnim(arg0);

	}

	// 指示器的跳转，传入当前所处的页面的下标
	public void cursorAnim(int curItem) {
		// 每次调用，就将指示器的横坐标设置为0，即开始的位置
		cursorX = 0;
		// 再根据当前的curItem来设置指示器的宽度
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) cursor
				.getLayoutParams();
		// 减去边距*2，以对齐标题栏文字
		lp.width = widthArgs[curItem] - tvArgs[0].getPaddingLeft() * 2;
		cursor.setLayoutParams(lp);
		// 循环获取当前页之前的所有页面的宽度
		for (int i = 0; i < curItem; i++) {
			cursorX = cursorX + tvArgs[i].getWidth();
		}
		// 再加上当前页面的左边距，即为指示器当前应处的位置
		cursor.setX(cursorX + tvArgs[curItem].getPaddingLeft());
	}

}
