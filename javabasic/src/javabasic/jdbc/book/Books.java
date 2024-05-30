package javabasic.jdbc.book;

public class Books {

	private int bid;
	private String btitle;
	private String bauthor;
	private String bpublisher;
	private int bprice;

	public Books(int bid, String btitle, String bauthor, String bpublisher, int bprice) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bauthor = bauthor;
		this.bpublisher = bpublisher;
		this.bprice = bprice;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBpublisher() {
		return bpublisher;
	}

	public void setBpublisher(String bpublisher) {
		this.bpublisher = bpublisher;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", btitle=" + btitle + ", bauthor=" + bauthor + ", bpublisher=" + bpublisher
				+ ", bprice=" + bprice + "]";
	}

}
