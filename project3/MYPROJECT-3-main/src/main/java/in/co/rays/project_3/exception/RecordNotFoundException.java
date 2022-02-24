package in.co.rays.project_3.exception;


/** RecordNotFoundException thrown when a record not found occurred
 * 
 * @author Harsh
 *
 */
public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String msg){
		super(msg);
	}
}
