package notice.view;

import notice.rc;
import notice.model.NoticeVo;

public class NoticeDetail extends NoticeView {

	
	@Override
	public void display() {
		if(rc.type == rc.SEARACH)
		{
		System.out.println("::::: ��� ���� �󼼺��� :::::");
		System.out.print("�˻��� �̸�>>");
		String name = scan.next();
		rc.noticevo = new NoticeVo(0,name,null,null);
		}
		else {
			System.out.println(":::::��� ���� ��� ����:::::");
			System.out.println(rc.noticevo);
		}
	}

}
