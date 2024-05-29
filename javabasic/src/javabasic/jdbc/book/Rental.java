package javabasic.jdbc.book;

import java.util.Date;

public class Rental {

	private int rid;
	private Date rdate;
	private Date rredate;

	public Rental(int rid, Date rdate, Date rredate) {
		super();
		this.rid = rid;
		this.rdate = rdate;
		this.rredate = rredate;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public Date getRredate() {
		return rredate;
	}

	public void setRredate(Date rredate) {
		this.rredate = rredate;
	}

	@Override
	public String toString() {
		return "Rental [rid=" + rid + ", rdate=" + rdate + ", rredate=" + rredate + "]";
	}

}
