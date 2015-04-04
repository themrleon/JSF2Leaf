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

public class Circle {
	
	private LatLong position;
	private int radius = 200;
	private int weight = 5;
	private double fillOpacity = 0.2;
	private String color = "black";
	private String fillColor = "blue";
	private String popupMsg;
	
	public String getPopupMsg() {
		return popupMsg;
	}

	public Circle setPopupMsg(String popupMsg) {
		this.popupMsg = popupMsg;
		return this;
	}

	public int getWeight() {
		return weight;
	}

	public Circle setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Circle setColor(String color) {
		this.color = color;
		return this;
	}

	public String getFillColor() {
		return fillColor;
	}

	public Circle setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	public double getFillOpacity() {
		return fillOpacity;
	}

	public Circle setFillOpacity(double fillOpacity) {
		this.fillOpacity = fillOpacity;
		return this;
	}

	public LatLong getPosition() {
		return position;
	}
	
	public Circle setPosition(LatLong position) {
		this.position = position;
		return this;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Circle setRadius(int radius) {
		this.radius = radius;
		return this;
	}

	@Override
	public String toString() {
		return "Circle [position=" + position.toString() + ", radius=" + radius
				+ ", color=" + color + ", fillColor=" + fillColor
				+ ", fillOpacity=" + fillOpacity + ", weight=" + weight
				+ ", popupMsg=" + popupMsg + "]";
	}
	
}
