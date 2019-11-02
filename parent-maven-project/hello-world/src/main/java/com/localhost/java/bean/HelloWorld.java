/**
 * 
 */
package com.localhost.java.bean;

import java.io.Serializable;

/**
 * @author rohit
 *
 */
public class HelloWorld implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3548469184687387369L;
	private String id;
	private String content;
	/**
	 * @param id
	 * @param content
	 */
	public HelloWorld(String id, String content) {
		this.id = id;
		this.content = content;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return String.format("HelloWorld [id=%s, content=%s]", id, content);
	}
	
	

}
