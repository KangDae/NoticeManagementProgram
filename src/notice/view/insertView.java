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

		System.out.println("::::: �Է� ��� :::::");
		// ����,��ȭ��ȣ,�̸���
		// r.saramvo�� ������ controller�� �̵�
		System.out.print("�̸� �Է�>>");
		String name = scan.next();
		System.out.print("�޸� �Է�>>");
		String notice = scan.next();

		rc.noticevo = new NoticeVo(0, name, notice, formattedDate);

		System.out.println("�Է¿Ϸ�");
	}

}
