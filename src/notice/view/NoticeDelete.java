package notice.view;

import notice.rc;
import notice.model.NoticeVo;

public class NoticeDelete extends NoticeView {

	@Override
	public void display() {
		System.out.println(":::::사람 정보 삭제::::::");
		if (rc.type == rc.SEARACH) {

			System.out.print("삭제할 이름>>");
			String name = scan.next();
			rc.noticevo = new NoticeVo(0, name, null, null);
		
		}
	}

}
