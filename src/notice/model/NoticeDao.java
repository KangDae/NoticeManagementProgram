package notice.model;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


public class NoticeDao {

	
	private static final int MAX = 100;
	private static final NoticeVo[] noticeArr = new NoticeVo[MAX];
	private static int top = 0;
	private static int sequenceNo = 1;
	static {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		
		noticeArr[top++] = new NoticeVo(sequenceNo++, "user1", "Memo", formattedDate);
		noticeArr[top++] = new NoticeVo(sequenceNo++, "user2", "memo2", formattedDate);
		noticeArr[top++] = new NoticeVo(sequenceNo++, "user3", "memo3", formattedDate);
	}

	// 전체 출력
	public NoticeVo[] selectAll() {
		
		NoticeVo[] newArr = new NoticeVo[top];
		for (int i = 0; i < newArr.length; i++) {
			
			NoticeVo newNoitce = new NoticeVo();
			newNoitce.setNo(noticeArr[i].getNo());
			newNoitce.setName(noticeArr[i].getName());
			newNoitce.setNotice(noticeArr[i].getNotice());
			newNoitce.setregdate(noticeArr[i].getregdate());
			newArr[i] = newNoitce;
		}
		return newArr;
		
		
	}

	// 상세보기
	public NoticeVo selectOne(NoticeVo vo) {
	
		for (int i = 0; i < top; i++) {
			if (vo.getName().equals(noticeArr[i].getName())) {
				NoticeVo newNoitce = new NoticeVo();
				newNoitce.setNo(noticeArr[i].getNo());
				newNoitce.setName(noticeArr[i].getName());
				newNoitce.setNotice(noticeArr[i].getNotice());
				newNoitce.setregdate(noticeArr[i].getregdate());
				return newNoitce;
			}
		}

		return null;

	}

	public NoticeVo selectByNo(int no) {
	
		for (int i = 0; i < top; i++) {
			if (no == noticeArr[i].getNo()) {
				NoticeVo newNoitce = new NoticeVo();
				newNoitce.setNo(noticeArr[i].getNo());
				newNoitce.setName(noticeArr[i].getName());
				newNoitce.setNotice(noticeArr[i].getNotice());
				newNoitce.setregdate(noticeArr[i].getregdate());
				return newNoitce;
			}
		}

		return null;

	}

	
	public void insert(NoticeVo vo) {

		if (top >= MAX) {
			System.out.println("더이상 입력이 불가능합니다");
			return;
		}
		vo.setNo(sequenceNo++);

		noticeArr[top++] = vo;

	}
	
	public void update(NoticeVo vo) {
	
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {
				
				noticeArr[i] = vo;
			}
		}

	}


	public void delete(NoticeVo vo) {
		
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {
				for(int j = i; j<top-1;j++)
				{
				   noticeArr[j] = noticeArr[j+1];	
				}
				noticeArr[top-1] = null;
				top--;
			}
		}
	}
	
	public void getDate()
	{
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
	}

}
