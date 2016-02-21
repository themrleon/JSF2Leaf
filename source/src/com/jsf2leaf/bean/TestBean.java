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
import com.jsf2leaf.model.Pulse;
import java.io.Serializable;

@ManagedBean(name = "testBean")
@ViewScoped 
public class TestBean implements Serializable { // "implements Serializable" to fix WELD-000072

	private Map springfieldMap = new Map();

	public TestBean()
	{
		//Configure Map
		springfieldMap.setWidth("350px").setHeight("250px").setCenter(new LatLong("42.111707","-72.541008")).setZoom(13);
                springfieldMap.setAttribution("JSF2Leaf | Your business");
                springfieldMap.setMiniMap(true);
                springfieldMap.setMiniMapWidth(100);
                springfieldMap.setMiniMapHeight(66);
                springfieldMap.setMiniMapPosition("bottomright");

		//Places Layer
		Layer placesLayer = (new Layer()).setLabel("Places");
		placesLayer.addMarker(new Marker(new LatLong("42.120000","-72.540000"),"<b>Krusty Burger</b><br>Phone: 555-5555"));
		placesLayer.addMarker(new Marker(new LatLong("42.114556","-72.526309"),"<b>Elementary School</b><br>Skinner&#39;s Phone: 555-5555"));
		placesLayer.addMarker(new Marker(new LatLong("42.120286","-72.547488"),"<b>Hospital</b><br>Dr. Hibbert lol", new Pulse(true, 10, "#ff0000")));
		springfieldMap.addLayer(placesLayer);
		
		//Cluster Layer
		Layer clusterLayer = (new Layer()).setLabel("Cluster").setClusterEnabled(true);
		for(double lat=42; lat<43; lat+=0.0001)	//10k markers !
			clusterLayer.addMarker(new Marker(new LatLong(""+lat,"-72.547488"),lat+" -72.547488"));
		springfieldMap.addLayer(clusterLayer);
		
		//Polyline and Circle Layer
		Layer polycircleLayer = (new Layer()).setLabel("Polyline/Circle");
		polycircleLayer.addPolyline((new Polyline()).addPoint(new LatLong("42.114556","-72.526309")).addPoint(new LatLong("42.120000","-72.540000")).addPoint(new LatLong("42.120286","-72.547488")));
		polycircleLayer.addCircle((new Circle()).setPosition(new LatLong("42.111707","-72.541008")));
		springfieldMap.addLayer(polycircleLayer);
	}

	public Map getSpringfieldMap() {
		return springfieldMap;
	}

}
