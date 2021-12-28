package notice.controller;

import notice.ViewCoantainer;
import notice.rc;
import notice.model.NoticeDao;

public class NoticeController {
	private ViewCoantainer vc = new ViewCoantainer();
	private NoticeDao dao = new NoticeDao();

	public void action() {
		
		if (rc.no == 0) {
			vc.run(rc.menuView);
		}

		switch (rc.no) {
		case 1:
			vc.run(rc.insertView);
			dao.insert(rc.noticevo);
			break;
		case 2:
	        rc.noticeArr = dao.selectAll();			
			vc.run(rc.noticeListView);
			break;
		case 3:
			rc.type = rc.SEARACH;
			vc.run(rc.noticeDetail);
			rc.type = rc.DETAIL;
			rc.noticevo =dao.selectOne(rc.noticevo);
			vc.run(rc.noticeDetail);
			break;
		case 4:
			rc.type = rc.SEARACH;
			vc.run(rc.noticeDetail);
			rc.type = rc.DETAIL;
			rc.noticevo = dao.selectOne(rc.noticevo);
			dao.update(rc.noticevo);	
			vc.run(rc.noticeEdit);
			break;
		case 5:
			rc.type = rc.SEARACH;
			vc.run(rc.noticeDetail);
			rc.type = rc.DETAIL;		
			rc.noticevo =dao.selectOne(rc.noticevo);
			dao.delete(rc.noticevo);
			vc.run(rc.noticeDelete);
			break;
		case 6:
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당기능이 없습니다!");
		}
		rc.no = 0;
		action();
	}

}
