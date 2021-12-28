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
			System.out.println("::::: 사람 정보 상세보기 :::::");
			System.out.print("수정할 이름>>");
			String name = scan.next();
			rc.noticevo = new NoticeVo(0, name, null, formattedDate);
			whilecontrol = true;
		} else {
			System.out.println(":::::수정할 사람 정보 보기:::::");
			System.out.println(rc.noticevo);

			while (whilecontrol) {
				System.out.println("무엇을 수정하시겠습니까?");
				System.out.println("1.이름 2.메모 3.모든정보 4.돌아가기");

				int selectnum = scan.nextInt();

				switch (selectnum) {
				case 1:
					System.out.print("이름 입력>>");
					updatename = scan.next();
					rc.noticevo.setName(updatename);
					break;

				case 2:
					System.out.print("메모 입력>>");
					notice = scan.next();
					rc.noticevo.setNotice(notice);
					break;

			
				case 3:
					System.out.print("이름 입력>>");
					updatename = scan.next();
					rc.noticevo.setName(updatename);
					
					System.out.print("메모 입력>>");
					notice = scan.next();
					rc.noticevo.setNotice(notice);
					
				
					break;

				case 4:
					whilecontrol = false;
					break;

				default:
					System.out.println("잘못입력하셨습니다.");
				}
			}

		}

	}

}
