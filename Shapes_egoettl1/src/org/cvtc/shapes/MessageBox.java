/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author ericgoettl
 *
 */
public class MessageBox implements Dialog {

	/**
	 * 
	 */
	public MessageBox(){
		
	}

	@Override
	public int show(String message, String title) {
		
		return JOptionPane.OK_OPTION;
	}
	
	

}
