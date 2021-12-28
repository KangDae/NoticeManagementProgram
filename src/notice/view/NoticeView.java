package notice.view;

import java.util.Scanner;

import notice.rc;


public class NoticeView {
	public static  Scanner scan = new Scanner(System.in);
	
	public void display()
	{
		if(rc.type == rc.SEARACH) {
		System.out.println(":::::메모 정보검색:::::");	
		
		}
		else {
			System.out.println(":::::::: 메모 작성 정보 상세보기:::::::");
		}
	}

}
