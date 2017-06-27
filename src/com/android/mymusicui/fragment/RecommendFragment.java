package com.android.mymusicui.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.android.mymusicui.R;
import com.android.mymusicui.adapter.MyRecommendAdapter;
import com.android.mymusicui.entity.RecommendDujia;
import com.android.mymusicui.entity.RecommendNew;
import com.android.mymusicui.entity.RecommendTop;
import com.android.mymusicui.entity.RecommendTuijian;
import com.android.mymusicui.entity.RecommendZhuanlan;

public class RecommendFragment extends Fragment {
	
	private ListView lv;
	
	private MyRecommendAdapter myRecommendAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = View.inflate(getActivity(), R.layout.fragment_recommend, null);
		//初始化控件
		initViews(v);
		//初始化事件监听
		initListeners();
		
	    RecommendTop myRecommendTop=getDataTop();
		List<RecommendTuijian> myRecommendTuijian=getDataTuijian();
		RecommendDujia myRecommendDujia=getDataDujia();
		RecommendNew myRecommendNew=getDataNew();
		RecommendZhuanlan myRecommendZhuanlan=getDataZhuanlan();
	    myRecommendAdapter = new MyRecommendAdapter(getActivity(), myRecommendTop,myRecommendTuijian,myRecommendDujia,myRecommendNew,myRecommendZhuanlan);
        //设置适配器
        lv.setAdapter(myRecommendAdapter);
		return v;
	}

	private void initViews(View v) {
		lv = (ListView) v.findViewById(R.id.fragment_recommend_lv);
		
	}

	private void initListeners() {
		/***设置ListView的事件监听*/
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			}
		});
	}
	
	//填充数据
	public RecommendTop getDataTop() {
		RecommendTop list = new RecommendTop();
		/*ImageView imageView1 = new ImageView(getActivity());
		imageView1.setImageDrawable();
		list.setImageview1(imageView1);*/
		return list;
	}
    public List<RecommendTuijian> getDataTuijian() {
        List<RecommendTuijian> list = new ArrayList<RecommendTuijian>();
        RecommendTuijian recommendTuijian1 = new RecommendTuijian();
        recommendTuijian1.setTv_title("推荐歌单");
        recommendTuijian1.setTv_context2("介绍2");
        recommendTuijian1.setTv_context3("介绍3");
        recommendTuijian1.setTv_context5("介绍5");
        recommendTuijian1.setTv_context6("介绍6");
        list.add(recommendTuijian1);
        RecommendTuijian recommendTuijian2 = new RecommendTuijian();
        recommendTuijian2.setTv_title("主播电台");
        recommendTuijian2.setTv_context2("电台介绍2");
        recommendTuijian2.setTv_context3("电台介绍3");
        recommendTuijian2.setTv_context5("电台介绍5");
        recommendTuijian2.setTv_context6("电台介绍6");
        list.add(recommendTuijian2);
        return list;
    }
    public RecommendDujia getDataDujia() {
    	RecommendDujia list = new RecommendDujia();
    	list.setTv_context2("介绍2");
    	list.setTv_context3("介绍3");
    	return list;
    }
    public RecommendNew getDataNew() {
    	RecommendNew list = new RecommendNew();
    	list.setTv_context2("介绍2");
    	list.setTv_title2("标题2");
    	return list;
    }
    public RecommendZhuanlan getDataZhuanlan() {
    	RecommendZhuanlan list = new RecommendZhuanlan();
    	/*list.setTv_context2("介绍2");
    	list.setTv_title2("标题2");*/
    	return list;
    }

}
