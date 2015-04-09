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

	private List<Marker> markers = new ArrayList<Marker>();
	private List<Polyline> polylines = new ArrayList<Polyline>();
	private List<Circle> circles = new ArrayList<Circle>();
	private String label;
	private boolean checked = true;
	private boolean clusterEnabled = false;
	private int clusterDisableAtZoom = 19;
	private int clusterMaxRadius = 80;

	public int getClusterMaxRadius() {
		return clusterMaxRadius;
	}

	/**
	 * Set the maximum radius that a cluster will cover from the central marker
	 * @param clusterMaxRadius Cluster radius in pixels
	 */
	public Layer setClusterMaxRadius(int clusterMaxRadius) {
		this.clusterMaxRadius = clusterMaxRadius;
		return this;
	}

	public int getClusterDisableAtZoom() {
		return clusterDisableAtZoom;
	}

	/**
	 * Set the the zoom level where cluster will be disabled, then you can see the markers
	 * @param clusterDisableAtZoom Zoom level: 1 to 19
	 */
	public Layer setClusterDisableAtZoom(int clusterDisableAtZoom) {
		this.clusterDisableAtZoom = clusterDisableAtZoom;
		return this;
	}

	public boolean isClusterEnabled() {
		return clusterEnabled;
	}

	/**
	 * Enable layer clusterization, useful for large datasets
	 */
	public Layer setClusterEnabled(boolean clusterEnabled) {
		this.clusterEnabled = clusterEnabled;
		return this;
	}

	public List<Circle> getCircles() {
		return circles;
	}

	public Layer addCircle(List<Circle> circles) {
		this.circles.addAll(circles);
		return this;
	}

	public Layer addCircle(Circle circle) {
		this.circles.add(circle);
		return this;
	}

	public List<Polyline> getPolylines() {
		return polylines;
	}

	public Layer addPolyline(List<Polyline> polylines) {
		this.polylines.addAll(polylines);
		return this;
	}

	public Layer addPolyline(Polyline polyline) {
		this.polylines.add(polyline);
		return this;
	}

	public boolean isChecked() {
		return checked;
	}

	/**
	 * Set if the Layer checkbox will be checked
	 */
	public Layer setChecked(boolean checked) {
		this.checked = checked;
		return this;
	}

	public String getLabel() {
		return label;
	}

	/**
	 * Set the Layer checkbox label
	 */
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
		return "Layer [markers=" + markers.toString() + ", polylines=" + polylines.toString()
				+ ", circles=" + circles.toString() + ", label=" + label + ", checked="
				+ checked + ", cluster=" + clusterEnabled + ", clusterDisableAtZoom="
				+ clusterDisableAtZoom + ", clusterMaxRadius="
				+ clusterMaxRadius + "]";
	}


}
