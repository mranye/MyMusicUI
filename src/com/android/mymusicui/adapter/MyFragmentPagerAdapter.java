package com.android.mymusicui.adapter;

import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	private Context mContext;
	private List<Fragment> myfragments;
	
	

	public MyFragmentPagerAdapter(FragmentManager fm, Context mContext,
			List<Fragment> myfragments) {
		super(fm);
		this.mContext = mContext;
		this.myfragments = myfragments;
	}

	/**��ǰ��ʾ���Ǹ�Fragment*/
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return myfragments.get(arg0);
	}

	/**�м���Fragment����*/
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myfragments==null?0:myfragments.size();
	}

}
