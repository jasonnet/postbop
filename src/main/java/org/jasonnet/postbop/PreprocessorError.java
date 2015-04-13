/*
 * Copyright (c) 2004 Object Factory Inc. All rights reserved.
 * This file is made available under the Common Public License (CPL) 1.0
 * (see http://www.opensource.org/licenses/cpl.php).
 * Every copy, modified or not, must retain the above copyright
 * and license notices.
 */
package org.jasonnet.postbop;

/**
 * @author Bob Foster
 */
public class PreprocessorError extends Exception {

	private FileLocator locator;
	
	/**
	 * @param message
	 */
	public PreprocessorError(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PreprocessorError(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PreprocessorError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	public PreprocessorError(String message, FileLocator locator) {
		super(message);
		this.locator = locator;
	}

	public FileLocator getLocator() {
		return locator;
	}

	public void setLocator(FileLocator locator) {
		this.locator = locator;
	}

}
