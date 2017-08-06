import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * A MusicLibrary which holds all the Song objects a user may choose to listen to. It inherits the 'name', 
 * 'numSongs' and 'songsInPlaylist' instance variables from Playlist. It adds on the 'playlistLibrary'
 * instance variable which is an ArrayList which holds all the Playlists a user has created.
 */
public class MusicLibrary extends Playlist {
	
// INHERITED INSTANCE VARIABLES //

//	private String name;
//	private int numSongs = 0;
//	private ArrayList<Song> songsInPlaylist = new ArrayList<Song>();
	private int numPlaylists = 0;
	private ArrayList<Playlist> playlistsInLibrary = new ArrayList<Playlist>();
	
	/**
	 * Create a new MusicLibrary object with name parameter
	 */
	public MusicLibrary(String name) {
		super(name);

		Playlist main;
		
		main = new Playlist("Main Library");
		main.playlistAddSong(new Song("Dammit", "Blink-182", "Blink-182-Dammit.mid", "blank"));
		main.playlistAddSong(new Song("Resistance", "Muse", "muse-resistance.mid", "blank"));
		main.playlistAddSong(new Song("Thriller", "Michael Jackson", "michael_jackson-thriller.mid", "blank"));
		main.playlistAddSong(new Song("All That She Wants", "Ace of Base", "ace_of_base-all_that_she_wants.mid", "blank"));
		main.playlistAddSong(new Song("Another One Bites the Dust", "Queen", "queen-another_one_bites_the_dust.mid", "blank"));
		main.playlistAddSong(new Song("Undone - The Sweater Song", "Weezer", "weezer-sweater.mid", "blank"));
		main.playlistAddSong(new Song("Fix You", "Coldplay", "Fix You.mid", "blank"));
		main.playlistAddSong(new Song("While My Guitar Gently Weeps", "The Beatles", "While My Guitar Gently Weeps.mid", "blank"));
		main.setMain();
		this.addPlaylistToLibrary(main);
	}
	
	// ------------------------------------------------------------------- //
	
	// SETTER AND GETTER FUNCTIONS //
	
	/**
	 * Getter function for instance variable numPlaylists
	 */
	public int getNumPlaylists() {
		return this.numPlaylists;
	}
	
	/**
	 * Getter function for instance variable playlistsInLibrary
	 */
	public ArrayList<Playlist> getPlaylistsInLibrary() {
		return this.playlistsInLibrary;
	}
	
	
	// ------------------------------------------------------------------- //
	
	
	/**
	 * Add a Playlist object to the MusicLibrary's 'playlistsInLibrary' ArrayList
	 */
	public void addPlaylistToLibrary(Playlist pl) {
		this.playlistsInLibrary.add(this.numPlaylists, pl);
		
		this.numPlaylists = this.numPlaylists + 1;
	}
	
	/**
	 * Delete a Playlist object from the MusicLibrary's 'playlistInLibrary' ArrayList
	 */
	public void deletePlaylistFromLibrary(String name) {
		
		// For each item in the ArrayList, check if the name of the Playlist matches the name parameter
		// given. If it matches the name parameter, we have found the Playlist. Return its 
		// idxNumberInList (index). This index number will be used later to delete the playlist.
		
		int idxNumberInList = 0;
		
		if (! this.playlistsInLibraryIsEmpty()) {	
			idxNumberInList = this.searchForPlaylist(name);
		}
		
		// Remove the Playlist from the ArrayList
		if (this.playlistsInLibrary.get(idxNumberInList).isMain())
		{
			JOptionPane.showMessageDialog(null, "You can't delete the Main Library.");
		}
		else
			this.playlistsInLibrary.remove(idxNumberInList);
		
		// Edit the numPlaylists variable as we have one less Playlist
		this.numPlaylists = this.numPlaylists - 1;		
	}
	
	/**
	 * Return true if this.numPlaylists ArrayList is empty. If not, return false.
	 */
	public boolean playlistsInLibraryIsEmpty() {
		if (this.numPlaylists == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * Return the int index of a Song in a Playlist given its artist and title.
	 * Return -1 if the Song is not in the playlist
	 */
	public int search(String artist, String title, Playlist playlist) {
		
		int counter = 0;
		
		if (playlist.playlistIsEmpty()) {
			return -1;
		}
		
		else {
		    for (int i = 0; i < playlist.getSongsInPlaylist().size(); i = i + 1) {
			    counter = counter + 1; 
			    //get the song at index i
			    Song s = playlist.getSongsInPlaylist().get(i); 
		        if  (s.getArtist().equals(artist) && s.getTitle().equals(title)) {
		        	//exit loop
		            i = playlist.getSongsInPlaylist().size();
		           
		        }
		    }
		    return counter;
        }
	}
	
	/**
	 * Return the int index of a Playlist in the Music Library given its name.
	 */
	public int searchForPlaylist(String name) {
		
		int counter = 0;
		
		if (this.playlistsInLibraryIsEmpty()) {
			return - 1;
		}
		
		else {
		
		    for (int i = 0; i < this.playlistsInLibrary.size(); i++) {
		    	counter++;
		    	//get the playlist at index i
		    	Playlist p = this.playlistsInLibrary.get(i);
		    	if (p.getName().equals(name)) {
		    		//exit loop
		    		i = this.playlistsInLibrary.size();
		    	}
		    	
		    }
		    return counter - 1;
	    }
	}	
	
}		
