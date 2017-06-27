package com.android.mymusicui.entity;

import java.io.Serializable;

import android.widget.ImageView;

public class RecommendZhuanlan implements Serializable {

	private ImageView imageView1;
	private ImageView imageView2;
	private ImageView imageView3;
	private String tv_name1;
	private String tv_name2;
	private String tv_name3;
	private String tv_number1;
	private String tv_number2;
	private String tv_number3;

	public RecommendZhuanlan(ImageView imageView1, ImageView imageView2,
			ImageView imageView3, String tv_name1, String tv_name2,
			String tv_name3, String tv_number1, String tv_number2,
			String tv_number3) {
		super();
		this.imageView1 = imageView1;
		this.imageView2 = imageView2;
		this.imageView3 = imageView3;
		this.tv_name1 = tv_name1;
		this.tv_name2 = tv_name2;
		this.tv_name3 = tv_name3;
		this.tv_number1 = tv_number1;
		this.tv_number2 = tv_number2;
		this.tv_number3 = tv_number3;
	}

	public RecommendZhuanlan() {
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

	public String getTv_name1() {
		return tv_name1;
	}

	public void setTv_name1(String tv_name1) {
		this.tv_name1 = tv_name1;
	}

	public String getTv_name2() {
		return tv_name2;
	}

	public void setTv_name2(String tv_name2) {
		this.tv_name2 = tv_name2;
	}

	public String getTv_name3() {
		return tv_name3;
	}

	public void setTv_name3(String tv_name3) {
		this.tv_name3 = tv_name3;
	}

	public String getTv_number1() {
		return tv_number1;
	}

	public void setTv_number1(String tv_number1) {
		this.tv_number1 = tv_number1;
	}

	public String getTv_number2() {
		return tv_number2;
	}

	public void setTv_number2(String tv_number2) {
		this.tv_number2 = tv_number2;
	}

	public String getTv_number3() {
		return tv_number3;
	}

	public void setTv_number3(String tv_number3) {
		this.tv_number3 = tv_number3;
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
				+ ((tv_name1 == null) ? 0 : tv_name1.hashCode());
		result = prime * result
				+ ((tv_name2 == null) ? 0 : tv_name2.hashCode());
		result = prime * result
				+ ((tv_name3 == null) ? 0 : tv_name3.hashCode());
		result = prime * result
				+ ((tv_number1 == null) ? 0 : tv_number1.hashCode());
		result = prime * result
				+ ((tv_number2 == null) ? 0 : tv_number2.hashCode());
		result = prime * result
				+ ((tv_number3 == null) ? 0 : tv_number3.hashCode());
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
		RecommendZhuanlan other = (RecommendZhuanlan) obj;
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
		if (tv_name1 == null) {
			if (other.tv_name1 != null)
				return false;
		} else if (!tv_name1.equals(other.tv_name1))
			return false;
		if (tv_name2 == null) {
			if (other.tv_name2 != null)
				return false;
		} else if (!tv_name2.equals(other.tv_name2))
			return false;
		if (tv_name3 == null) {
			if (other.tv_name3 != null)
				return false;
		} else if (!tv_name3.equals(other.tv_name3))
			return false;
		if (tv_number1 == null) {
			if (other.tv_number1 != null)
				return false;
		} else if (!tv_number1.equals(other.tv_number1))
			return false;
		if (tv_number2 == null) {
			if (other.tv_number2 != null)
				return false;
		} else if (!tv_number2.equals(other.tv_number2))
			return false;
		if (tv_number3 == null) {
			if (other.tv_number3 != null)
				return false;
		} else if (!tv_number3.equals(other.tv_number3))
			return false;
		return true;
	}

}
