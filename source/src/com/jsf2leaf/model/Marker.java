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

	private LatLong position;
	private String popupMsg;
	private Pulse pulse;
	
	public Marker(LatLong position)
	{
		this.position = position;
                this.pulse = new Pulse(false);
	}
	
	public Marker(LatLong position, String popupMsg)
	{
		this.position = position;
		this.popupMsg = popupMsg;
                this.pulse = new Pulse(false);
	}

	public Marker(LatLong position, String popupMsg, Pulse pulse)
	{
		this.position = position;
		this.popupMsg = popupMsg;
                if (pulse == null) {
                        this.pulse = new Pulse(false);
                } else {
        		this.pulse = pulse;
                }
	}

	public LatLong getPosition() {
		return position;
	}

	public Marker setPosition(LatLong position) {
		this.position = position;
		return this;
	}

	public String getPopupMsg() {
		return popupMsg;
	}

	public Marker setPopupMsg(String popupMsg) {
		this.popupMsg = popupMsg;
		return this;
	}

        public Pulse getPulse() {
                return pulse;
        }

        public void setPulse(Pulse pulse) {
                this.pulse = pulse;
        }

	@Override
	public String toString() {
		return "Marker [position=" + position.toString() 
                        + ", popupMsg=" + popupMsg 
                        + ", pulse=" + pulse 
                        + "]";
	}

}
