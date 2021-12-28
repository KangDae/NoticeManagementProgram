package notice.view;

import notice.rc;
import notice.model.NoticeVo;

public class NoticeListView extends NoticeView {
	
	@Override
	public void display() {
		System.out.println(":::::�޸� ���:::::");
	    for(NoticeVo notice: rc.noticeArr) {
	    	System.out.println(notice);
	    }
	}

}
