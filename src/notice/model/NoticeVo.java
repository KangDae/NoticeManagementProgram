package notice.model;

public class NoticeVo {
	private int no;
	private String name;
	private String notice;
	private String regdate;

	public NoticeVo() {
		this(0, "", "", "");
	}

	public NoticeVo(int no, String name, String notice, String regdate ) {
		this.no = no;
		this.name = name;
		this.notice = notice;
		this.regdate  = regdate ;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getregdate() {
		return regdate;
	}

	public void setregdate(String regdate) {
		this.regdate  = regdate ;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t notice= " + notice + "\t regdate= " + regdate;
	}

}
