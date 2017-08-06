import java.util.ArrayList;

/**
 * A JTunes Cloud User object
 */
public class CloudUser 
{
	private String password, user, email;
	private ArrayList<String> downloadedSongs;
	
	/**
	 * Create a new instance of CloudUser by passing in the Strings pass, use and email as parameters
	 * @param pass The password for the new CloudUser
	 * @param use The username for the new CloudUser
	 * @param email The email address of the new CloudUser
	 */
	public CloudUser(String pass, String use, String email)
	{
		//no setters, because we don't want ANY of this to change
		this.password = pass;
		this.user = use;
		this.email = email;
	}
	
	/**
	 * Helper function to verify a CloudUser. If the user and password match, return true. If not, return false.
	 * @param pass The password to verify
	 * @param use The username to verify
	 * @return boolean
	 */
	public boolean verUser(String pass, String use)
	{
		//might not be needed... maybe for a login?
		return (pass.equals(this.password) && (use.equals(this.user)));
	}
	
	/**
	 * Getter method for instance variable email
	 * @return String
	 */
	public String getEmail()
	{
		//no clue what we can do with this, but instinct tells me it's very necessary
		return this.email;
	}
	
	/**
	 * Getter method for instance variable user
	 * @return String
	 */
	public String getUser()
	{
		//This can be used to for some retrieve username function
		return this.user;
	}
	
	/**
	 * Getter method for instance variable password
	 * @return String
	 */
	public String getPass()
	{
		//I'm guessing this can be used for some retrieve password function
		return this.password;
	}
	
	/**
	 * Helper function to track if a Song has been downloaded from the Cloud already
	 * @param id The songid to track
	 */
	public void trackDownload(String id)
	{
		downloadedSongs.add(id);
	}
	
	/**
	 * Helper function that checks if another instance of CloudUser has the same credentials as this instance
	 * @param id The CloudUser object we want to check for
	 * @return boolean
	 */
	public boolean equals(CloudUser id)
	{
		return id.password.equals(this.password) && id.user.equals(this.user)&& id.email.equals(this.email); 
	}
}
