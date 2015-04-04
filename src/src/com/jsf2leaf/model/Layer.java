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

import java.util.ArrayList;
import java.util.List;

public class Layer {

	private String id = Long.toHexString(Double.doubleToLongBits(Math.random()));
	private List<Marker> markers = new ArrayList<Marker>();
	private String label;
	private boolean checked = true;

	public String getId() {
		return id;
	}

	public boolean isChecked() {
		return checked;
	}

	public Layer setChecked(boolean checked) {
		this.checked = checked;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public Layer setLabel(String label) {
		this.label = label;
		return this;
	}

	public List<Marker> getMarkers() {
		return markers;
	}

	public Layer addMarker(List<Marker> markers) {
		this.markers.addAll(markers);
		return this;
	}

	public Layer addMarker(Marker marker)
	{
		this.markers.add(marker);
		return this;
	}

	@Override
	public String toString() {
		return "Layer [id=" + id + ", markers=" + markers.toString() + ", label=" + label
				+ ", checked=" + checked + "]";
	}

}
