package notice.view;

import java.util.Scanner;

import notice.rc;


public class NoticeView {
	public static  Scanner scan = new Scanner(System.in);
	
	public void display()
	{
		if(rc.type == rc.SEARACH) {
		System.out.println(":::::�޸� �����˻�:::::");	
		
		}
		else {
			System.out.println(":::::::: �޸� �ۼ� ���� �󼼺���:::::::");
		}
	}

}
