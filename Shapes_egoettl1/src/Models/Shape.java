/**
 * 
 */
package Models;

import org.cvtc.shapes.Dialog;

/**
 * @author ericgoettl
 *
 */

//Abstract class to be used as blueprint for subclasses.
//Abstract methods are declared here but will be defined
//in the subclasses.
public abstract class Shape implements Dialog{
	
	private Dialog messageBox;
	/**
	 * @return the messageBox
	 */
	public Dialog getMessageBox() {
		return messageBox;
	}
	/**
	 * set the message box with the right message
	 */
	protected void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox) {
	}
	
	public abstract float surfaceArea();

	public abstract float volume();

	
};