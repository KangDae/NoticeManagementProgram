package notice.view;

import notice.rc;
import notice.model.NoticeVo;

public class NoticeDelete extends NoticeView {

	@Override
	public void display() {
		System.out.println(":::::��� ���� ����::::::");
		if (rc.type == rc.SEARACH) {

			System.out.print("������ �̸�>>");
			String name = scan.next();
			rc.noticevo = new NoticeVo(0, name, null, null);
		
		}
	}

}
