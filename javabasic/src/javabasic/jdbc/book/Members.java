package javabasic.jdbc.book;

public class Members {

	private int mid;
	private String mname;
	private String mno;

	public Members(int mid, String mname, String mno) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mno = mno;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "Members [mid=" + mid + ", mname=" + mname + ", mno=" + mno + "]";
	}

}
