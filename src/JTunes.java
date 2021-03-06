import java.io.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * The class containing the main method which will run the program.
 */
public class JTunes {
	
	/**
	 * Main class which instantiates user interface.
	 */
	public static void main(String[] args) throws IOException, InvalidMidiDataException, MidiUnavailableException 
	{
		new GUI();
	}
}
