/*
A JSF2 Leaflet wrapper component for OpenStreetMap
Copyright (C) 2015 Leonardo Ciocari

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.*/

package com.jsf2leaf.model;

public class Marker {

	private String latitude;
	private String longitude;
	private String popupMsg;

	public Marker()
	{
	}
	
	public Marker(String lat, String lon)
	{
		this.latitude=lat;
		this.longitude=lon;
	}
	
	public Marker(String lat, String lon, String popupMsg)
	{
		this.latitude=lat;
		this.longitude=lon;
		this.popupMsg=popupMsg;
	}
	
	public String getPopupMsg() {
		return popupMsg;
	}

	public Marker setPopupMsg(String popupMsg) {
		this.popupMsg = popupMsg;
		return this;
	}

	public String getLatitude() {
		return latitude;
	}

	public Marker setLatitude(String latitude) {
		this.latitude = latitude;
		return this;
	}

	public String getLongitude() {
		return longitude;
	}

	public Marker setLongitude(String longitude) {
		this.longitude = longitude;
		return this;
	}

	@Override
	public String toString() {
		return "Marker [latitude=" + latitude + ", longitude=" + longitude
				+ ", popupMsg=" + popupMsg + "]";
	}	

}
