package notice;

import notice.controller.NoticeController;
import notice.model.NoticeVo;
import notice.view.NoticeDelete;
import notice.view.NoticeDetail;
import notice.view.NoticeEdit;
import notice.view.NoticeListView;
import notice.view.NoticeView;
import notice.view.insertView;
import notice.view.menuView;

public class rc {
	public static int no;
	public static NoticeVo noticevo;
	public static NoticeVo[] noticeArr;
	
	public static final int SEARACH = 0, DETAIL=1;
	public static int type = 0;

	
	public static final NoticeView menuView = new menuView();
	public static final NoticeView insertView = new insertView();
	public static final NoticeView noticeDelete = new NoticeDelete();
	public static final NoticeView noticeDetail = new NoticeDetail();
	public static final NoticeView noticeEdit = new NoticeEdit();
	public static final NoticeView noticeListView = new NoticeListView();

	public static final NoticeController noticeController = new NoticeController();

}