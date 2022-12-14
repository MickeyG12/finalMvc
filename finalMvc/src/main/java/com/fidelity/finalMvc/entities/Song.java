/**
 * 
 */
package com.fidelity.finalMvc.entities;


public class Song {

	private Long id;
	private String name;
	private String time;
	private String style;
	
	/**
	 * 
	 */
	public Song() {
		// TODO Auto-generated constructor stub
	}


	public Song(Long id, String name, String time, String style) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.style = style;
	}




	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
