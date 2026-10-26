public class SongTester {

	public static void main(String[] args) {
		Song song1 = new Song("3005", "Childish Gambino", 362, "Because the Internet");
		System.out.println("song1 title " + song1.getTitle());
		System.out.println("song1 Artist " + song1.getArtist());
		System.out.println("song1 Length " + song1.getLength());
		System.out.println("song1 Album " + song1.getAlbum());

	}

}
