package codingTest.hash;

public class Music implements Comparable<Music>{
	private int id;
	private String genre;
	private int played;
	
	public Music( int id, String genre, int played) {
		this.id = id;
		this.genre = genre;
		this.played = played;
	}

	@Override
	public int compareTo(Music o) {
//		if(played == o.played) {
//			return 0;
//		} else if(played < o.played) {
//			return 1;
//		}
//		return -1;
		
		if (this.played == o.played) {
            if (this.id > o.id) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.played < o.played) {
            return 1;
        } else {
            return -1;
        }
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPlayed() {
		return played;
	}

}
