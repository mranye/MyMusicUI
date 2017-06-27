package com.android.mymusicui.entity;

import java.io.Serializable;

import android.widget.ImageView;

public class RecommendNew implements Serializable {

	private ImageView imageView1;
	private ImageView imageView2;
	private ImageView imageView3;
	private ImageView imageView4;
	private ImageView imageView5;
	private ImageView imageView6;
	private String tv_title1;
	private String tv_title2;
	private String tv_title3;
	private String tv_title4;
	private String tv_title5;
	private String tv_title6;
	private String tv_context1;
	private String tv_context2;
	private String tv_context3;
	private String tv_context4;
	private String tv_context5;
	private String tv_context6;

	public RecommendNew(ImageView imageView1, ImageView imageView2,
			ImageView imageView3, ImageView imageView4, ImageView imageView5,
			ImageView imageView6, String tv_title1, String tv_title2,
			String tv_title3, String tv_title4, String tv_title5,
			String tv_title6, String tv_context1, String tv_context2,
			String tv_context3, String tv_context4, String tv_context5,
			String tv_context6) {
		super();
		this.imageView1 = imageView1;
		this.imageView2 = imageView2;
		this.imageView3 = imageView3;
		this.imageView4 = imageView4;
		this.imageView5 = imageView5;
		this.imageView6 = imageView6;
		this.tv_title1 = tv_title1;
		this.tv_title2 = tv_title2;
		this.tv_title3 = tv_title3;
		this.tv_title4 = tv_title4;
		this.tv_title5 = tv_title5;
		this.tv_title6 = tv_title6;
		this.tv_context1 = tv_context1;
		this.tv_context2 = tv_context2;
		this.tv_context3 = tv_context3;
		this.tv_context4 = tv_context4;
		this.tv_context5 = tv_context5;
		this.tv_context6 = tv_context6;
	}

	public RecommendNew() {
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

	public ImageView getImageView4() {
		return imageView4;
	}

	public void setImageView4(ImageView imageView4) {
		this.imageView4 = imageView4;
	}

	public ImageView getImageView5() {
		return imageView5;
	}

	public void setImageView5(ImageView imageView5) {
		this.imageView5 = imageView5;
	}

	public ImageView getImageView6() {
		return imageView6;
	}

	public void setImageView6(ImageView imageView6) {
		this.imageView6 = imageView6;
	}

	public String getTv_title1() {
		return tv_title1;
	}

	public void setTv_title1(String tv_title1) {
		this.tv_title1 = tv_title1;
	}

	public String getTv_title2() {
		return tv_title2;
	}

	public void setTv_title2(String tv_title2) {
		this.tv_title2 = tv_title2;
	}

	public String getTv_title3() {
		return tv_title3;
	}

	public void setTv_title3(String tv_title3) {
		this.tv_title3 = tv_title3;
	}

	public String getTv_title4() {
		return tv_title4;
	}

	public void setTv_title4(String tv_title4) {
		this.tv_title4 = tv_title4;
	}

	public String getTv_title5() {
		return tv_title5;
	}

	public void setTv_title5(String tv_title5) {
		this.tv_title5 = tv_title5;
	}

	public String getTv_title6() {
		return tv_title6;
	}

	public void setTv_title6(String tv_title6) {
		this.tv_title6 = tv_title6;
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

	public String getTv_context4() {
		return tv_context4;
	}

	public void setTv_context4(String tv_context4) {
		this.tv_context4 = tv_context4;
	}

	public String getTv_context5() {
		return tv_context5;
	}

	public void setTv_context5(String tv_context5) {
		this.tv_context5 = tv_context5;
	}

	public String getTv_context6() {
		return tv_context6;
	}

	public void setTv_context6(String tv_context6) {
		this.tv_context6 = tv_context6;
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
				+ ((imageView4 == null) ? 0 : imageView4.hashCode());
		result = prime * result
				+ ((imageView5 == null) ? 0 : imageView5.hashCode());
		result = prime * result
				+ ((imageView6 == null) ? 0 : imageView6.hashCode());
		result = prime * result
				+ ((tv_context1 == null) ? 0 : tv_context1.hashCode());
		result = prime * result
				+ ((tv_context2 == null) ? 0 : tv_context2.hashCode());
		result = prime * result
				+ ((tv_context3 == null) ? 0 : tv_context3.hashCode());
		result = prime * result
				+ ((tv_context4 == null) ? 0 : tv_context4.hashCode());
		result = prime * result
				+ ((tv_context5 == null) ? 0 : tv_context5.hashCode());
		result = prime * result
				+ ((tv_context6 == null) ? 0 : tv_context6.hashCode());
		result = prime * result
				+ ((tv_title1 == null) ? 0 : tv_title1.hashCode());
		result = prime * result
				+ ((tv_title2 == null) ? 0 : tv_title2.hashCode());
		result = prime * result
				+ ((tv_title3 == null) ? 0 : tv_title3.hashCode());
		result = prime * result
				+ ((tv_title4 == null) ? 0 : tv_title4.hashCode());
		result = prime * result
				+ ((tv_title5 == null) ? 0 : tv_title5.hashCode());
		result = prime * result
				+ ((tv_title6 == null) ? 0 : tv_title6.hashCode());
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
		RecommendNew other = (RecommendNew) obj;
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
		if (imageView4 == null) {
			if (other.imageView4 != null)
				return false;
		} else if (!imageView4.equals(other.imageView4))
			return false;
		if (imageView5 == null) {
			if (other.imageView5 != null)
				return false;
		} else if (!imageView5.equals(other.imageView5))
			return false;
		if (imageView6 == null) {
			if (other.imageView6 != null)
				return false;
		} else if (!imageView6.equals(other.imageView6))
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
		if (tv_context4 == null) {
			if (other.tv_context4 != null)
				return false;
		} else if (!tv_context4.equals(other.tv_context4))
			return false;
		if (tv_context5 == null) {
			if (other.tv_context5 != null)
				return false;
		} else if (!tv_context5.equals(other.tv_context5))
			return false;
		if (tv_context6 == null) {
			if (other.tv_context6 != null)
				return false;
		} else if (!tv_context6.equals(other.tv_context6))
			return false;
		if (tv_title1 == null) {
			if (other.tv_title1 != null)
				return false;
		} else if (!tv_title1.equals(other.tv_title1))
			return false;
		if (tv_title2 == null) {
			if (other.tv_title2 != null)
				return false;
		} else if (!tv_title2.equals(other.tv_title2))
			return false;
		if (tv_title3 == null) {
			if (other.tv_title3 != null)
				return false;
		} else if (!tv_title3.equals(other.tv_title3))
			return false;
		if (tv_title4 == null) {
			if (other.tv_title4 != null)
				return false;
		} else if (!tv_title4.equals(other.tv_title4))
			return false;
		if (tv_title5 == null) {
			if (other.tv_title5 != null)
				return false;
		} else if (!tv_title5.equals(other.tv_title5))
			return false;
		if (tv_title6 == null) {
			if (other.tv_title6 != null)
				return false;
		} else if (!tv_title6.equals(other.tv_title6))
			return false;
		return true;
	}

}
