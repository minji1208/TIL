package example.interfaceExam;

public class AppCDInfo extends CDInfo implements Lendable{
	
	private String borrower;
	private String checkOutDate;
	private int state=0;
	
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		state = 1;
		
		System.out.println("*"+getTitle()+" CD가 대출되었습니다.");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date);
		System.out.println();
	}

	@Override
	public void checkIn() {
		if(state ==0) {
			System.out.println("이미 반납 처리가 됐습니다.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		state = 0;
		System.out.println("*"+getTitle()+" CD가 반납되었습니다.");
		System.out.println();
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
}
