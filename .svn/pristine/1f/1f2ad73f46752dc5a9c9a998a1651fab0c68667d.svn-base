/**
 * A Song which contains instance variables pertaining to it
 */

public class Song {
	private String id;
	private String title;
	private String artist;
	private String path;

	/**
	 * Create a new Song object with String parameters title, artist, album, path
	 */
	public Song(String title, String artist, String path, String album) {
		this.title = title;
		this.artist = artist;
		this.path = path;
	}
	//This Song constructor allows downloading from the cloud
	public Song(String id, String title, String artist)
	{
		this.id = id;
		this.title = title;
		this.artist = artist;
	}

	// SETTER AND GETTER FUNCTIONS //

	/**
	 * Getter function for instance variable title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Getter function for instance variable artist
	 */
	public String getArtist() {
		return this.artist;
	}

	/**
	 * Getter function for instance variable path
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * Sets filepath for downloaded songs
	 */
	public void setPath(String path)
	{
		if (this.path == null)
			this.path = (path + ".mid");
		else
			System.out.println("Don't change an existing filepath, moron.");
	}
	
	/**
	 * Return cloud ID of song
	 */
	public String getID(){
		return this.id;
	}
	
	/**
	 * Compare artist strings alphabetically 
	 * (eg. given art begins with k, and this art begins with a)
	 * If this method returns false, it means the string is equal or lesser alphabetically 
	 */
	public boolean compArtist(String art)
	{
		//note that this method returns:
		// 1) Values > 0 IFF given String is lower alphabetically
		// 2) Values = 0 IFF given String is equal
		// 3) Values < 0 IFF given String is greater alphabetically
		int x = this.artist.compareTo(art);

		if (x < 0)
			return true;
		else
			return false;
	}

	/**
	 * Compare title strings alphabetically 
	 * (eg. given art begins with k, and this art begins with a)
	 * If this method returns false, it means the string is equal or lesser alphabetically 
	 */
	public boolean compTitle(String title)
	{
		int x = this.title.compareTo(title);

		if (x < 0)
			return true;
		else
			return false;
	}
	/**
	 * Return string representation of Song
	 */
	public String toString()
	{
		return artist + ": " + title;
	}

	public boolean equals(Song s)
	{
		return (this.title.equals(s.title) && this.artist.equals(s.artist));
	}
}
