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
	/** ���弯�ϱ������е�Fragment */
	ArrayList<Fragment> fragments = new ArrayList<Fragment>();

	// ѡ��е��ı�
	private TextView tv_recommend;
	private TextView tv_gedan;
	private TextView tv_radio;
	private TextView tv_paihang;

	// ��Ϊָʾ��ǩ�İ�ť
	private ImageView cursor;
	// ��־ָʾ��ǩ�ĺ�����
	float cursorX = 0;
	// ���а�ť�Ŀ�ȵ�����
	private int[] widthArgs;
	// ���б��ⰴť������
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
		// ��ʼ����ť����
		tvArgs = new TextView[] { tv_recommend, tv_gedan, tv_radio, tv_paihang };
		// ָʾ��ǩ����Ϊ��ɫ
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
				// ��ȥ�߾�*2���Զ������������
				lp.width = tv_recommend.getWidth()
						- tv_recommend.getPaddingLeft() * 2;
				cursor.setLayoutParams(lp);
				cursor.setX(tv_recommend.getPaddingLeft());
			}
		});

		// ���������а�ť��ɫ
		resetButtonColor();
		// �ٽ���һ����ť��������Ϊ��ɫ����ʾĬ��ѡ�е�һ��
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

	// ÿ�λ���ViewPager��ʱ�򴥷�,ҳ�滬��������ִ�д˴����� arg0 ��ʾ��ǰҳ��λ��
	@Override
	public void onPageSelected(int arg0) {
		if (widthArgs == null) {
			widthArgs = new int[] { tv_recommend.getWidth(),
					tv_gedan.getWidth(), tv_radio.getWidth(),
					tv_paihang.getWidth() };
		}
		// ÿ�λ��������������а�ť����ɫ
		resetButtonColor();
		// ���������ĵ�ǰ��ť��ɫ����Ϊ��ɫ
		tvArgs[arg0].setTextColor(Color.RED);
		cursorAnim(arg0);

	}

	// ָʾ������ת�����뵱ǰ������ҳ����±�
	public void cursorAnim(int curItem) {
		// ÿ�ε��ã��ͽ�ָʾ���ĺ���������Ϊ0������ʼ��λ��
		cursorX = 0;
		// �ٸ��ݵ�ǰ��curItem������ָʾ���Ŀ��
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) cursor
				.getLayoutParams();
		// ��ȥ�߾�*2���Զ������������
		lp.width = widthArgs[curItem] - tvArgs[0].getPaddingLeft() * 2;
		cursor.setLayoutParams(lp);
		// ѭ����ȡ��ǰҳ֮ǰ������ҳ��Ŀ��
		for (int i = 0; i < curItem; i++) {
			cursorX = cursorX + tvArgs[i].getWidth();
		}
		// �ټ��ϵ�ǰҳ�����߾࣬��Ϊָʾ����ǰӦ����λ��
		cursor.setX(cursorX + tvArgs[curItem].getPaddingLeft());
	}

}
