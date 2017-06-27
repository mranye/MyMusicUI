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
import com.android.mymusicui.adapter.MyMessageAdapter;
import com.android.mymusicui.entity.MyMessage;

public class AtMeFragment extends Fragment {
	
	private ListView lv;
	private MyMessageAdapter myMessageAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = View.inflate(getActivity(), R.layout.fragment_atme, null);
		//��ʼ���ؼ�
		initViews(v);
		//��ʼ���¼�����
		initListeners();
		List<MyMessage> list=getData();
		if(list==null){
			View vno = View.inflate(getActivity(), R.layout.fragment_no_message, null);
			return vno;
		}else{
			myMessageAdapter = new MyMessageAdapter(getActivity(), list);
	        //����������
	        lv.setAdapter(myMessageAdapter);
		}
		return v;
	}

	private void initViews(View v) {
		lv = (ListView) v.findViewById(R.id.fragment_mymessage_atme_lv);
		
	}

	private void initListeners() {
		/***����ListView���¼�����*/
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			}
		});
	}
	//�������
    public List<MyMessage> getData() {
        List<MyMessage> list = new ArrayList<MyMessage>();
        list=null;
        return list;
    }

}
