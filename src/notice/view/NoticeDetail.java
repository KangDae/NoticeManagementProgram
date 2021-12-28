package notice.view;

import notice.rc;
import notice.model.NoticeVo;

public class NoticeDetail extends NoticeView {

	
	@Override
	public void display() {
		if(rc.type == rc.SEARACH)
		{
		System.out.println("::::: 사람 정보 상세보기 :::::");
		System.out.print("검색할 이름>>");
		String name = scan.next();
		rc.noticevo = new NoticeVo(0,name,null,null);
		}
		else {
			System.out.println(":::::사람 정보 상게 보기:::::");
			System.out.println(rc.noticevo);
		}
	}

}
