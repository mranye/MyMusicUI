package com.android.mymusicui.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.mymusicui.R;
import com.android.mymusicui.entity.RecommendDujia;
import com.android.mymusicui.entity.RecommendNew;
import com.android.mymusicui.entity.RecommendTop;
import com.android.mymusicui.entity.RecommendTuijian;
import com.android.mymusicui.entity.RecommendZhuanlan;

public class MyRecommendAdapter extends BaseAdapter {

	private Context myContext;
	private RecommendTop myRecommendTop;
	private List<RecommendTuijian> myRecommendTuijian;
	private RecommendDujia myRecommendDujia;
	private RecommendNew myRecommendNew;
	private RecommendZhuanlan myRecommendZhuanlan;

	private final int TYPE_COUNT = 5;
	private final int FIRST_TYPE = 0;
	private final int SECOND_TYPE = 1;
	private final int THIRD_TYPE = 2;
	private final int FOURTH_TYPE = 3;
	private final int FIFTH_TYPE = 4;
	private int currentType;

	public MyRecommendAdapter(Context myContext) {
		super();
		this.myContext = myContext;
	}

	public MyRecommendAdapter(Context myContext, RecommendTop myRecommendTop,
			List<RecommendTuijian> myRecommendTuijian,
			RecommendDujia myRecommendDujia, RecommendNew myRecommendNew,
			RecommendZhuanlan myRecommendZhuanlan) {
		super();
		this.myContext = myContext;
		this.myRecommendTop = myRecommendTop;
		this.myRecommendTuijian = myRecommendTuijian;
		this.myRecommendDujia = myRecommendDujia;
		this.myRecommendNew = myRecommendNew;
		this.myRecommendZhuanlan = myRecommendZhuanlan;
	}

	@Override
	public int getCount() {
		int i = 0;
		if (myRecommendTop != null) {
			i++;
		}
		if (myRecommendTuijian != null) {
			i = i + myRecommendTuijian.size();
		}
		if (myRecommendDujia != null) {
			i++;
		}
		if (myRecommendNew != null) {
			i++;
		}
		if (myRecommendZhuanlan != null) {
			i++;
		}
		return i;
	}

	@Override
	public Object getItem(int position) {
		if (position == 0) {
			return myRecommendTop;
		} else if (position == 1) {
			return myRecommendTuijian.get(0);
		} else if (position == 2) {
			return myRecommendDujia;
		} else if (position == 3) {
			return myRecommendNew;
		} else if (position == 4) {
			return myRecommendZhuanlan;
		} else if (position == 5) {
			return myRecommendTuijian.get(1);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return TYPE_COUNT;
	}

	@Override
	public int getItemViewType(int position) {
		if (position == 0) {
			return FIRST_TYPE;
		} else if (position == 1 || position == 5) {
			return SECOND_TYPE;
		} else if (position == 2) {
			return THIRD_TYPE;
		} else if (position == 3) {
			return FOURTH_TYPE;
		} else {
			return FIFTH_TYPE;
		}
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View firstItemView = null;
		View secondItemView = null;
		View thirdItemView = null;
		View fourthItemView = null;
		View fifthItemView = null;
		// 获取到当前位置所对应的Type
		currentType = getItemViewType(position);
		if (currentType == FIRST_TYPE) {
			firstItemView = convertView;
			FirstItemViewHolder firstItemViewHolder = null;
			if (firstItemView == null) {
				firstItemView = View.inflate(myContext,
						R.layout.list_item_recommend_top, null);
				firstItemViewHolder = new FirstItemViewHolder();
				firstItemViewHolder.imageView = (ImageView) firstItemView.findViewById(R.id.recommend_top_iv1);
				firstItemView.setTag(firstItemViewHolder);
			} else {
				firstItemViewHolder = (FirstItemViewHolder) firstItemView
						.getTag();
			}
			convertView = firstItemView;
		}
		if (currentType == SECOND_TYPE) {
			secondItemView = convertView;
			SecondItemViewHolder secondItemViewHolder = null;
			if (secondItemView == null) {
				secondItemView = View.inflate(myContext,
						R.layout.list_item_recommend_tuijian, null);
				secondItemViewHolder = new SecondItemViewHolder();
				secondItemViewHolder.tv_title = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian_title);
				secondItemViewHolder.imageView1 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian1);
				secondItemViewHolder.imageView2 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian2);
				secondItemViewHolder.imageView3 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian3);
				secondItemViewHolder.imageView4 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian4);
				secondItemViewHolder.imageView5 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian5);
				secondItemViewHolder.imageView6 = (ImageView) secondItemView.findViewById(R.id.recommend_iv_tuijian6);
				secondItemViewHolder.tv1 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian1);
				secondItemViewHolder.tv2 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian2);
				secondItemViewHolder.tv3 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian3);
				secondItemViewHolder.tv4 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian4);
				secondItemViewHolder.tv5 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian5);
				secondItemViewHolder.tv6 = (TextView) secondItemView.findViewById(R.id.recommend_tv_tuijian6);
				secondItemView.setTag(secondItemViewHolder);
			} else {
				secondItemViewHolder = (SecondItemViewHolder) secondItemView
						.getTag();
			}
			RecommendTuijian rt = null;
			/**设置数据源*/
			if(position==1){
				rt = myRecommendTuijian.get(position-1);
			}else if(position==5){
				 rt = myRecommendTuijian.get(position-4);
			}
			secondItemViewHolder.tv_title.setText(rt.getTv_title());
			secondItemViewHolder.tv2.setText(rt.getTv_context2());
			secondItemViewHolder.tv3.setText(rt.getTv_context3());
			secondItemViewHolder.tv5.setText(rt.getTv_context5());
			secondItemViewHolder.tv6.setText(rt.getTv_context6());
			convertView = secondItemView;
		}
		if (currentType == THIRD_TYPE) {
			thirdItemView = convertView;
			ThirdItemViewHolder thirdItemViewHolder = null;
			if (thirdItemView == null) {
				thirdItemView = View.inflate(myContext,
						R.layout.list_item_recommend_dujia, null);
				thirdItemViewHolder = new ThirdItemViewHolder();
				thirdItemViewHolder.imageView1 = (ImageView) thirdItemView.findViewById(R.id.recommend_iv_dujia1);
				thirdItemViewHolder.imageView2 = (ImageView) thirdItemView.findViewById(R.id.recommend_iv_dujia2);
				thirdItemViewHolder.imageView3 = (ImageView) thirdItemView.findViewById(R.id.recommend_iv_dujia3);
				thirdItemViewHolder.tv1 = (TextView) thirdItemView.findViewById(R.id.recommend_tv_dujia1);
				thirdItemViewHolder.tv2 = (TextView) thirdItemView.findViewById(R.id.recommend_tv_dujia2);
				thirdItemViewHolder.tv3 = (TextView) thirdItemView.findViewById(R.id.recommend_tv_dujia3);
				thirdItemView.setTag(thirdItemViewHolder);
			} else {
				thirdItemViewHolder = (ThirdItemViewHolder) thirdItemView
						.getTag();
			}
			/**设置数据源*/
			thirdItemViewHolder.tv2.setText(myRecommendDujia.getTv_context2());
			thirdItemViewHolder.tv3.setText(myRecommendDujia.getTv_context3());
			convertView = thirdItemView;
		}
		if (currentType == FOURTH_TYPE) {
			fourthItemView = convertView;
			FourthItemViewHolder fourthItemViewHolder = null;
			if (fourthItemView == null) {
				fourthItemView = View.inflate(myContext,
						R.layout.list_item_recommend_new, null);
				fourthItemViewHolder = new FourthItemViewHolder();
				fourthItemViewHolder.imageView1 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new1);
				fourthItemViewHolder.imageView2 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new2);
				fourthItemViewHolder.imageView3 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new3);
				fourthItemViewHolder.imageView4 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new4);
				fourthItemViewHolder.imageView5 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new5);
				fourthItemViewHolder.imageView6 = (ImageView) fourthItemView.findViewById(R.id.recommend_iv_new6);
				fourthItemViewHolder.tv_title1 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name1);
				fourthItemViewHolder.tv_title2 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name2);
				fourthItemViewHolder.tv_title3 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name3);
				fourthItemViewHolder.tv_title4 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name4);
				fourthItemViewHolder.tv_title5 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name5);
				fourthItemViewHolder.tv_title6 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_name6);
				fourthItemViewHolder.tv_context1 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context1);
				fourthItemViewHolder.tv_context2 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context2);
				fourthItemViewHolder.tv_context3 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context3);
				fourthItemViewHolder.tv_context4 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context4);
				fourthItemViewHolder.tv_context5 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context5);
				fourthItemViewHolder.tv_context6 = (TextView) fourthItemView.findViewById(R.id.recommend_tv_new_context6);
				fourthItemView.setTag(fourthItemViewHolder);
			} else {
				fourthItemViewHolder = (FourthItemViewHolder) fourthItemView
						.getTag();
			}
			/**设置数据源*/
			fourthItemViewHolder.tv_title2.setText(myRecommendNew.getTv_title2());
			fourthItemViewHolder.tv_context2.setText(myRecommendNew.getTv_context2());
			convertView = fourthItemView;
		}
		if (currentType == FIFTH_TYPE) {
			fifthItemView = convertView;
			FifthItemViewHolder fifthItemViewHolder = null;
			if (fifthItemView == null) {
				fifthItemView = View.inflate(myContext,
						R.layout.list_item_recommend_zhuanlan, null);
				fifthItemViewHolder = new FifthItemViewHolder();
				fifthItemViewHolder.imageView1 = (ImageView) fifthItemView.findViewById(R.id.recommend_iv_zhuanlan1);
				fifthItemViewHolder.imageView2 = (ImageView) fifthItemView.findViewById(R.id.recommend_iv_zhuanlan2);
				fifthItemViewHolder.imageView3 = (ImageView) fifthItemView.findViewById(R.id.recommend_iv_zhuanlan3);
				fifthItemViewHolder.tv_name1 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_name1);
				fifthItemViewHolder.tv_name2 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_name2);
				fifthItemViewHolder.tv_name3 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_name3);
				fifthItemViewHolder.tv_number1 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_number1);
				fifthItemViewHolder.tv_number2 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_number2);
				fifthItemViewHolder.tv_number3 = (TextView) fifthItemView.findViewById(R.id.recommend_tv_zhuanlan_number3);
				fifthItemView.setTag(fifthItemViewHolder);
			} else {
				fifthItemViewHolder = (FifthItemViewHolder) fifthItemView
						.getTag();
			}
			/**设置数据源*/
			/*fifthItemViewHolder.tv_name2.setText(myRecommendNew.getTv_title2());
			fifthItemViewHolder.tv_number1.setText(myRecommendNew.getTv_context2());*/
			convertView = fifthItemView;
		}
		return convertView;
	}

	class FirstItemViewHolder {
		ImageView imageView; 
	}
	class SecondItemViewHolder {
		
		TextView tv_title;
		ImageView imageView1;
		ImageView imageView2;
		ImageView imageView3;
		ImageView imageView4;
		ImageView imageView5;
		ImageView imageView6;
		TextView tv1;
		TextView tv2;
		TextView tv3;
		TextView tv4;
		TextView tv5;
		TextView tv6;
		
	}
	class ThirdItemViewHolder {
		
		ImageView imageView1;
		ImageView imageView2;
		ImageView imageView3;
		TextView tv1;
		TextView tv2;
		TextView tv3;
	}
	class FourthItemViewHolder {
		
		ImageView imageView1;
		ImageView imageView2;
		ImageView imageView3;
		ImageView imageView4;
		ImageView imageView5;
		ImageView imageView6;
		TextView tv_title1;
		TextView tv_title2;
		TextView tv_title3;
		TextView tv_title4;
		TextView tv_title5;
		TextView tv_title6;
		TextView tv_context1;
		TextView tv_context2;
		TextView tv_context3;
		TextView tv_context4;
		TextView tv_context5;
		TextView tv_context6;
		
	}
	class FifthItemViewHolder {
		
		ImageView imageView1;
		ImageView imageView2;
		ImageView imageView3;
		TextView tv_name1;
		TextView tv_name2;
		TextView tv_name3;
		TextView tv_number1;
		TextView tv_number2;
		TextView tv_number3;
	}

}
