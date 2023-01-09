package example.interfaceExam;

public class BookCDMS {

	public static void main(String[] args) {
		SeparateVolume book = new SeparateVolume("b324123", "엄마를 부탁해", "신경숙");
		book.checkOut("홍길동", "20210801");
		book.checkIn();
		
		AppCDInfo app = new AppCDInfo("A123123","Redhat Fedora");
		app.checkOut("박희진", "20210810");
		book.checkIn();
		
		MusicCDInfo music = new MusicCDInfo("M321522", "동행", "김동률", new String[] {"고백", "청춘", "내 사람"});
		System.out.println(music.toString());
	}

}
