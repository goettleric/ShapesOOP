/**
 * 
 */
package org.cvtc.shapes.tests;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Dialog;

/**
 * @author ericgoettl
 *
 */
public class MessageBoxSub implements Dialog {

	/**
	 * 
	 */
	public MessageBoxSub() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Dialog#show(java.lang.String, java.lang.String)
	 */
	@Override
	public int show(String message, String title) {
		
		return JOptionPane.OK_OPTION;
	}

}
