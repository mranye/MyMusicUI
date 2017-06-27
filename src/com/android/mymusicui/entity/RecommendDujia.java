package com.android.mymusicui.entity;

import java.io.Serializable;

import android.widget.ImageView;

public class RecommendDujia implements Serializable {

	private ImageView imageView1;
	private ImageView imageView2;
	private ImageView imageView3;
	private String tv_context1;
	private String tv_context2;
	private String tv_context3;

	public RecommendDujia(ImageView imageView1, ImageView imageView2,
			ImageView imageView3, String tv_context1, String tv_context2,
			String tv_context3) {
		super();
		this.imageView1 = imageView1;
		this.imageView2 = imageView2;
		this.imageView3 = imageView3;
		this.tv_context1 = tv_context1;
		this.tv_context2 = tv_context2;
		this.tv_context3 = tv_context3;
	}

	public RecommendDujia() {
		super();
	}

	public ImageView getImageView1() {
		return imageView1;
	}

	public void setImageView1(ImageView imageView1) {
		this.imageView1 = imageView1;
	}

	public ImageView getImageView2() {
		return imageView2;
	}

	public void setImageView2(ImageView imageView2) {
		this.imageView2 = imageView2;
	}

	public ImageView getImageView3() {
		return imageView3;
	}

	public void setImageView3(ImageView imageView3) {
		this.imageView3 = imageView3;
	}

	public String getTv_context1() {
		return tv_context1;
	}

	public void setTv_context1(String tv_context1) {
		this.tv_context1 = tv_context1;
	}

	public String getTv_context2() {
		return tv_context2;
	}

	public void setTv_context2(String tv_context2) {
		this.tv_context2 = tv_context2;
	}

	public String getTv_context3() {
		return tv_context3;
	}

	public void setTv_context3(String tv_context3) {
		this.tv_context3 = tv_context3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imageView1 == null) ? 0 : imageView1.hashCode());
		result = prime * result
				+ ((imageView2 == null) ? 0 : imageView2.hashCode());
		result = prime * result
				+ ((imageView3 == null) ? 0 : imageView3.hashCode());
		result = prime * result
				+ ((tv_context1 == null) ? 0 : tv_context1.hashCode());
		result = prime * result
				+ ((tv_context2 == null) ? 0 : tv_context2.hashCode());
		result = prime * result
				+ ((tv_context3 == null) ? 0 : tv_context3.hashCode());
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
		RecommendDujia other = (RecommendDujia) obj;
		if (imageView1 == null) {
			if (other.imageView1 != null)
				return false;
		} else if (!imageView1.equals(other.imageView1))
			return false;
		if (imageView2 == null) {
			if (other.imageView2 != null)
				return false;
		} else if (!imageView2.equals(other.imageView2))
			return false;
		if (imageView3 == null) {
			if (other.imageView3 != null)
				return false;
		} else if (!imageView3.equals(other.imageView3))
			return false;
		if (tv_context1 == null) {
			if (other.tv_context1 != null)
				return false;
		} else if (!tv_context1.equals(other.tv_context1))
			return false;
		if (tv_context2 == null) {
			if (other.tv_context2 != null)
				return false;
		} else if (!tv_context2.equals(other.tv_context2))
			return false;
		if (tv_context3 == null) {
			if (other.tv_context3 != null)
				return false;
		} else if (!tv_context3.equals(other.tv_context3))
			return false;
		return true;
	}

}
