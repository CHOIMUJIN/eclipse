package javabasic.jdbc.book;

public class Books {

	private int bid;
	private String btitle;
	private String bauthor;
	private String bpublisher;
	private String bavailable;

	public Books(int bid, String btitle, String bauthor, String bpublisher, String bavailable) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bauthor = bauthor;
		this.bpublisher = bpublisher;
		this.bavailable = bavailable;
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

	public String getBavailable() {
		return bavailable;
	}

	public void setBavailable(String bavailable) {
		this.bavailable = bavailable;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", btitle=" + btitle + ", bauthor=" + bauthor + ", bpublisher=" + bpublisher
				+ ", bavailable=" + bavailable + "]";
	}

}
