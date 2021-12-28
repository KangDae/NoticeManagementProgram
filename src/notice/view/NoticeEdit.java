package notice.view;

import notice.rc;
import notice.model.NoticeVo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoticeEdit extends NoticeView {
	@Override
	public void display() {
		
		String notice = "";
		String updatename = "";
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		
		
		boolean whilecontrol = true;

		if (rc.type == rc.SEARACH) {
			System.out.println("::::: ��� ���� �󼼺��� :::::");
			System.out.print("������ �̸�>>");
			String name = scan.next();
			rc.noticevo = new NoticeVo(0, name, null, formattedDate);
			whilecontrol = true;
		} else {
			System.out.println(":::::������ ��� ���� ����:::::");
			System.out.println(rc.noticevo);

			while (whilecontrol) {
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				System.out.println("1.�̸� 2.�޸� 3.������� 4.���ư���");

				int selectnum = scan.nextInt();

				switch (selectnum) {
				case 1:
					System.out.print("�̸� �Է�>>");
					updatename = scan.next();
					rc.noticevo.setName(updatename);
					break;

				case 2:
					System.out.print("�޸� �Է�>>");
					notice = scan.next();
					rc.noticevo.setNotice(notice);
					break;

			
				case 3:
					System.out.print("�̸� �Է�>>");
					updatename = scan.next();
					rc.noticevo.setName(updatename);
					
					System.out.print("�޸� �Է�>>");
					notice = scan.next();
					rc.noticevo.setNotice(notice);
					
				
					break;

				case 4:
					whilecontrol = false;
					break;

				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}

		}

	}

}
