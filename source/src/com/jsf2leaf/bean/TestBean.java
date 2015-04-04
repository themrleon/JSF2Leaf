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

package com.jsf2leaf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.jsf2leaf.model.Circle;
import com.jsf2leaf.model.LatLong;
import com.jsf2leaf.model.Layer;
import com.jsf2leaf.model.Map;
import com.jsf2leaf.model.Marker;
import com.jsf2leaf.model.Polyline;

@ManagedBean(name = "testBean")
@ViewScoped 
public class TestBean {

	private Map springfieldMap = new Map();

	public TestBean()
	{
		Layer placesLayer = (new Layer()).setLabel("Places");
		placesLayer.addMarker(new Marker(new LatLong("42.120000","-72.540000"),"<b>Krusty Burger</b><br>Phone: 555-5555"));
		placesLayer.addMarker(new Marker(new LatLong("42.114556","-72.526309"),"<b>Elementary School</b><br>Skinner&#39;s Phone: 555-5555"));
		placesLayer.addMarker(new Marker(new LatLong("42.120286","-72.547488"),"<b>Hospital</b><br>Dr. Hibbert lol"));
	
		Layer riversLayer = (new Layer()).setLabel("Rivers");
		riversLayer.addMarker(new Marker(new LatLong("42.104702","-72.530923"))).addMarker(new Marker(new LatLong("42.111707","-72.541008")));

		Layer polycircleLayer = (new Layer()).setLabel("Polyline/Circle");
		polycircleLayer.addPolyline((new Polyline()).addPoint(new LatLong("42.114556","-72.526309")).addPoint(new LatLong("42.120000","-72.540000")));
		polycircleLayer.addCircle((new Circle()).setPosition(new LatLong("42.111707","-72.541008")));

		springfieldMap.setWidth("350px").setHeight("250px").setCenter(new LatLong("42.111707","-72.541008")).setZoom(13);
		springfieldMap.addLayer(placesLayer).addLayer(riversLayer).addLayer(polycircleLayer);
	}

	public Map getSpringfieldMap() {
		return springfieldMap;
	}

}