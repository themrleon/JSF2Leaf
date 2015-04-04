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

public class LatLong {
	
	private String latitude;
	private String longitude;
	
	public LatLong(String latitude, String longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public LatLong setLatitude(String latitude) {
		this.latitude = latitude;
		return this;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public LatLong setLongitude(String longitude) {
		this.longitude = longitude;
		return this;
	}

	@Override
	public String toString() {
		return "LatLong [latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}

}
