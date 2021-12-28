package notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import notice.rc;
import notice.model.NoticeVo;

public class insertView extends NoticeView {

	@Override
	public void display() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);

		System.out.println("::::: 입력 기능 :::::");
		// 성명,전화번호,이메일
		// r.saramvo에 저장후 controller로 이동
		System.out.print("이름 입력>>");
		String name = scan.next();
		System.out.print("메모 입력>>");
		String notice = scan.next();

		rc.noticevo = new NoticeVo(0, name, notice, formattedDate);

		System.out.println("입력완료");
	}

}
