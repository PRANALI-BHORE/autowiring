package com.assignment;

import java.util.List;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;


public class placestovisit {
	private int id;
	private String month;
	private String season;
	@Autowired
	private Locations l;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public Locations getL() {
		return l;
	}
	
	public void setL(Locations l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "places_to_visit [id=" + id + ", month=" + month + ", season=" + season + ", l=" + l + "]";
	}
	public placestovisit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
