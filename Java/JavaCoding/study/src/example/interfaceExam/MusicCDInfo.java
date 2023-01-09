package example.interfaceExam;

public class MusicCDInfo extends CDInfo{
	private String artist;
	private String[] songTitle;
	
	public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
		super(registerNo, title);
		this.artist = artist;
		this.songTitle = songTitle;
	}
	
	public String toString() {
		String result = artist+" "+getTitle()+"[ ";
		for(String s : songTitle) {
			result+=s+" ";
		}
		
		result +="] 음반";
		return result;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String[] getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String[] songTitle) {
		this.songTitle = songTitle;
	}
	
	
}
