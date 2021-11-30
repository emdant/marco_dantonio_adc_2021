package io.emdant.p2p;

import java.io.File;
import java.util.List;

public interface GitProtocol {

	/**
	 * Creates new repository in a directory
	 * @param repositoryName a String, the name of the repository.
	 * @param directory a File, the directory where create the repository.
	 * @return true if it is correctly created, false otherwise.
	 */
	public boolean createRepository(String repositoryName, File directory);

	/**
	 * Adds a list of File to the given local repository. 
	 * @param repositoryName a String, the name of the repository.
	 * @param files a list of Files to be added to the repository.
	 * @return true if it is correctly added, false otherwise.
	 */
	public boolean addFilesToRepository(String repositoryName, List<File> files);

	/**
	 * Apply the changing to the files in  the local repository.
	 * @param repositoryName a String, the name of the repository.
	 * @param message a String, the message for this commit.
	 * @return true if it is correctly committed, false otherwise.
	 */
	public boolean commit(String repositoryName, String message);

	/**
	 * Push all commits on the Network. If the status of the remote repository is changed, 
	 * the push fails, asking for a pull.
	 * @param repositoryName repositoryName a String, the name of the repository.
	 * @return a String, operation message.
	 */
	public String push(String repositoryName);

	/**
	 * Pull the files from the Network. If there is a conflict, the system duplicates 
	 * the files and the user should manually fix the conflict.
	 * @param repositoryName repositoryName a String, the name of the repository.
	 * @return a String, operation message.
	 */
	public String pull(String repositoryName);

}	