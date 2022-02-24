package in.co.rays.project_3.exception;


/**
 *  DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * 
 * @author Harsh
 *
 */
public class DatabaseException extends Exception{
	public DatabaseException(String msg){
		super(msg);
	}
}
