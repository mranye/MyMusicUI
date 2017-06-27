package com.android.mymusicui.entity;

import java.io.Serializable;

import android.widget.ImageView;
import android.widget.TextView;

public class RecommendTop implements Serializable {

	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private TextView tv_date;

	public RecommendTop() {
		super();
	}

	public RecommendTop(ImageView imageview1) {
		super();
		this.imageview1 = imageview1;
	}

	public RecommendTop(ImageView imageview1, ImageView imageview2,
			ImageView imageview3, ImageView imageview4, TextView tv_date) {
		super();
		this.imageview1 = imageview1;
		this.imageview2 = imageview2;
		this.imageview3 = imageview3;
		this.imageview4 = imageview4;
		this.tv_date = tv_date;
	}

	public ImageView getImageview1() {
		return imageview1;
	}

	public void setImageview1(ImageView imageview1) {
		this.imageview1 = imageview1;
	}

	public ImageView getImageview2() {
		return imageview2;
	}

	public void setImageview2(ImageView imageview2) {
		this.imageview2 = imageview2;
	}

	public ImageView getImageview3() {
		return imageview3;
	}

	public void setImageview3(ImageView imageview3) {
		this.imageview3 = imageview3;
	}

	public ImageView getImageview4() {
		return imageview4;
	}

	public void setImageview4(ImageView imageview4) {
		this.imageview4 = imageview4;
	}

	public TextView getTv_date() {
		return tv_date;
	}

	public void setTv_date(TextView tv_date) {
		this.tv_date = tv_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imageview1 == null) ? 0 : imageview1.hashCode());
		result = prime * result
				+ ((imageview2 == null) ? 0 : imageview2.hashCode());
		result = prime * result
				+ ((imageview3 == null) ? 0 : imageview3.hashCode());
		result = prime * result
				+ ((imageview4 == null) ? 0 : imageview4.hashCode());
		result = prime * result + ((tv_date == null) ? 0 : tv_date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecommendTop other = (RecommendTop) obj;
		if (imageview1 == null) {
			if (other.imageview1 != null)
				return false;
		} else if (!imageview1.equals(other.imageview1))
			return false;
		if (imageview2 == null) {
			if (other.imageview2 != null)
				return false;
		} else if (!imageview2.equals(other.imageview2))
			return false;
		if (imageview3 == null) {
			if (other.imageview3 != null)
				return false;
		} else if (!imageview3.equals(other.imageview3))
			return false;
		if (imageview4 == null) {
			if (other.imageview4 != null)
				return false;
		} else if (!imageview4.equals(other.imageview4))
			return false;
		if (tv_date == null) {
			if (other.tv_date != null)
				return false;
		} else if (!tv_date.equals(other.tv_date))
			return false;
		return true;
	}

}
