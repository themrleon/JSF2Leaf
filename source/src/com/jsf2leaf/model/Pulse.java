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

public class Pulse {

	private boolean pulsing;
	private int size;
	private String color;
	
	public Pulse(boolean pulsing)
	{
		this.pulsing = pulsing;
	}

	public Pulse(boolean pulsing, int size)
	{
                this.pulsing = pulsing;
                this.size = size;
	}

	public Pulse(boolean pulsing, int size, String color)
	{
                this.pulsing = pulsing;
                this.size = size;
                this.color = color;
	}

        public boolean isPulsing() {
               return pulsing;
        }

        public void setPulsing(boolean pulsing) {
               this.pulsing = pulsing;
        }

        public int getSize() {
               return size;
        }

        public void setSize(int size) {
               this.size = size;
        }

        public String getColor() {
               return color;
        }

        public void setColor(String color) {
               this.color = color;
        }

	@Override
	public String toString() {
		return "Pulse [pulsing=" + pulsing 
                        + ", size=" + size 
                        + ", color=" + color 
                        + "]";
	}

}
