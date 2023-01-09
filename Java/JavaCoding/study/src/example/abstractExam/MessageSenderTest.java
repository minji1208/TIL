package example.abstractExam;

public class MessageSenderTest {

	public static void main(String[] args) {
		
		
		EMailSender email = new EMailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인 쿠폰이 발행되었습니다.");
		SMSSender sms = new SMSSender("생일을 축하합니다","고객센터", "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
		
		System.out.println("-----------------------------------------");
		email.sendMessage("javaone@naver.com");
		System.out.println("-----------------------------------------");
		sms.sendMessage("010-000-0000");
	}

}
