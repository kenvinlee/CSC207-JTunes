import javax.sound.midi.*;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * A Player allows stopping, starting, and pausing a Song object
 */
public class JPlayer { 
	private boolean sound = false;
	private Sequencer sqcr;
	
	/**
	 * Create a new instance of the Player class by giving it a Song path as a parameter 
	 */
	public JPlayer() throws MidiUnavailableException {
		this.sqcr = MidiSystem.getSequencer();
		
	}
	
	/**
	 * Return a Sequence object from a given path name.
	 */
	public Sequence returnSequence(String path) throws InvalidMidiDataException, IOException {
		FileInputStream inputStream = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(inputStream);
		Sequence sq = MidiSystem.getSequence(bis);
		return sq;
	}
	
	public Sequencer getSqcr()
	{
		return this.sqcr;
	}
	
	/**
	 * Open the sqcr instance variable.
	 */
	public void openSequencer() throws MidiUnavailableException {
		this.sqcr.open();
	}
	
	/**
	 * Set the Sequence for the sqcr instance variable.
	 */
	public void setSong(Sequence sq) throws IOException, InvalidMidiDataException, MidiUnavailableException 
	{
		// This needs to take "returnSequence" as input
    	this.sqcr.setSequence(sq);
	}
	
	/**
	 * Play a song by starting a sequence.
	 */
	public void play() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        if (! sound) {
        	sqcr.start();
        	sound = ! sound;
        }
        else {}	
	}
	
	/** 
	 * Pause a song by stopping a sequence. N.B. Currently stops sequence.
	 */
	public void pause() {
		if (sound) {
			sqcr.stop();
			sound = !sound;
		}
		else {}
	}
	
	/** 
	 * Stop a song by closing the song file.
	 */
	public void stop() {
		sqcr.close();
	}
	
	/**
	 * Return true if sound is playing. If not, return False.
	 */
	public boolean isPlaying()
	{
		return sound;
	}
}
