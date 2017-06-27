package com.android.mymusicui.activity;

import java.util.ArrayList;

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
import com.android.mymusicui.fragment.SiXinFragment;
import com.android.mymusicui.fragment.SysNoticeFragment;

public class MyMessageActivity extends FragmentActivity implements
		OnClickListener, OnPageChangeListener {

	private ViewPager vp;
	/** ���弯�ϱ������е�Fragment */
	ArrayList<Fragment> fragments = new ArrayList<Fragment>();

	// ѡ��е��ı�
	private TextView tv_sixin;
	private TextView tv_pinglun;
	private TextView tv_atme;
	private TextView tv_sysnotice;

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
		setContentView(R.layout.activity_my_message);
		initViews();

	}

	private void initViews() {
		tv_sixin = (TextView) findViewById(R.id.mymessage_tv_sixin);
		tv_pinglun = (TextView) findViewById(R.id.mymessage_tv_pinglun);
		tv_atme = (TextView) findViewById(R.id.mymessage_tv_atme);
		tv_sysnotice = (TextView) findViewById(R.id.mymessage_tv_sysnotice);
		// ��ʼ����ť����
		tvArgs = new TextView[] { tv_sixin, tv_pinglun, tv_atme, tv_sysnotice };
		// ָʾ��ǩ����Ϊ��ɫ
		cursor = (ImageView) findViewById(R.id.mymessage_iv_cursor);
		cursor.setBackgroundColor(Color.RED);

		vp = (ViewPager) findViewById(R.id.mymessage_vp);
		vp.setOnPageChangeListener(this);
		initListener();
		tv_sixin.post(new Runnable() {
			@Override
			public void run() {
				LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) cursor
						.getLayoutParams();
				// ��ȥ�߾�*2���Զ������������
				lp.width = tv_sixin.getWidth() - tv_sixin.getPaddingLeft() * 2;
				cursor.setLayoutParams(lp);
				cursor.setX(tv_sixin.getPaddingLeft());
			}
		});

		// ���������а�ť��ɫ
		resetButtonColor();
		// �ٽ���һ����ť��������Ϊ��ɫ����ʾĬ��ѡ�е�һ��
		tv_sixin.setTextColor(Color.RED);

		fragments.add(new SiXinFragment());
		fragments.add(new PingLunFragment());
		fragments.add(new AtMeFragment());
		fragments.add(new SysNoticeFragment());
		MyFragmentPagerAdapter myAdapter = new MyFragmentPagerAdapter(
				getSupportFragmentManager(), this, fragments);
		vp.setAdapter(myAdapter);
	}

	private void resetButtonColor() {
		tv_sixin.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_pinglun.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_atme.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_sysnotice.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv_sixin.setTextColor(Color.BLACK);
		tv_pinglun.setTextColor(Color.BLACK);
		tv_atme.setTextColor(Color.BLACK);
		tv_sysnotice.setTextColor(Color.BLACK);
	}

	private void initListener() {
		tv_sixin.setOnClickListener(this);
		tv_pinglun.setOnClickListener(this);
		tv_atme.setOnClickListener(this);
		tv_sysnotice.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mymessage_tv_sixin:
			vp.setCurrentItem(0);
			cursorAnim(0);
			break;
		case R.id.mymessage_tv_pinglun:
			vp.setCurrentItem(1);
			cursorAnim(1);
			break;
		case R.id.mymessage_tv_atme:
			vp.setCurrentItem(2);
			cursorAnim(2);
			break;
		case R.id.mymessage_tv_sysnotice:
			vp.setCurrentItem(3);
			cursorAnim(3);
			break;
		}
	}

	// ÿ�λ���ViewPager��ʱ�򴥷�,ҳ�滬��������ִ�д˴����� arg0 ��ʾ��ǰҳ��λ��
	@Override
	public void onPageSelected(int arg0) {
		if (widthArgs == null) {
			widthArgs = new int[] { tv_sixin.getWidth(), tv_pinglun.getWidth(),
					tv_atme.getWidth(), tv_sysnotice.getWidth() };
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

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		cursorX = 0;
		cursorX = cursorX + tvArgs[0].getWidth() * (arg1 + arg0);
		cursor.setX(cursorX);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

}
