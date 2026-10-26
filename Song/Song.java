
public class Song {
	//instance variable
	private String title;
	private String artist;
	private int length;
	private String album;
	
	//constructors
	public Song (String title,String artist, int length, String album) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		this.album = album;
	}
	public Song (String title,String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		album = title;
	}

	//getters
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getLength() {
		return length;
	}
	public String getAlbum() {
		return album;
	}
	//setters
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String toString () {
		String str = "TItle: " +title+"\nArtist: "+artist+"\nLength: "+length+"\nAlbum: "+album;
		return str;
	}
	// instance variables
	//public void printSong() {
		
	}
