package notice.view;

import notice.rc;

public class menuView extends NoticeView {

	 int no;
	@Override
	public void display() {
		System.out.println(":::::�޴�:::::");
		

		while (true) {
			try {
				System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
				System.out.print("����:");
				no = scan.nextInt();

				while (no > 6 || no < 1) {
					System.out.println("������ �Ѿ����ϴ�.");
					System.out.println("����:");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
				scan.next();
				continue;
			}
		}
	
		rc.no = no;
	}

}
