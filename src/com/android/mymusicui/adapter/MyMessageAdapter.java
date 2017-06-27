package com.android.mymusicui.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.mymusicui.R;
import com.android.mymusicui.entity.MyMessage;

public class MyMessageAdapter extends BaseAdapter {
	
	private Context myContext;
	private List<MyMessage> myMessage;

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myMessage==null?0:myMessage.size();
	}

	public MyMessageAdapter(Context myContext, List<MyMessage> myMessage) {
		super();
		this.myContext = myContext;
		this.myMessage = myMessage;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return myMessage.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHodler vh=null;
		if(convertView==null){
			vh=new ViewHodler();
			convertView=View.inflate(myContext, R.layout.list_item_mymessage,null);
			vh.tvMessageName=(TextView) convertView.findViewById(R.id.mymessage_lv_item_tv_name);
			vh.tvMessageContext=(TextView) convertView.findViewById(R.id.mymessage_lv_item_tv_time);
			vh.tvMessageTime=(TextView) convertView.findViewById(R.id.mymessage_lv_item_tv_time);
			convertView.setTag(vh);
		}else{
			vh=(ViewHodler) convertView.getTag();
		}
		/**设置数据源*/
		MyMessage m=myMessage.get(position);
		vh.tvMessageName.setText(m.getMessageName());
		vh.tvMessageContext.setText(m.getMessageContext());
		vh.tvMessageTime.setText(m.getMessageTime());
		return convertView;
	}
	
	class ViewHodler{
		  TextView tvMessageName;
		  TextView tvMessageContext;
		  TextView tvMessageTime;
	  }

}
