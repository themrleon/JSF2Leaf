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

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.jsf2leaf.model.Layer;
import com.jsf2leaf.model.Map;
import com.jsf2leaf.model.Marker;

@ManagedBean(name = "testBean")
@ViewScoped 
public class TestBean {

	Map springfieldMap = new Map();

	public TestBean()
	{
		List<Marker> places = new ArrayList<Marker>();
		
		//We can add a marker this way (old school)
		Marker krusty = new Marker();
		krusty.setLatitude("42.120000");
		krusty.setLongitude("-72.540000");
		krusty.setPopupMsg("<b>Krusty Burger</b><br>Phone: 555-5555");
		places.add(krusty);
		
		//or this (concatenation)
		Marker hospital = new Marker();
		hospital.setLatitude("42.120286").setLongitude("-72.547488").setPopupMsg("<b>Hospital</b><br>Dr. Hibbert lol");
		places.add(hospital);
		
		//and this too (just constructor)
		places.add(new Marker("42.114556","-72.526309","<b>Elementary School</b><br>Skinner&#39;s Phone: 555-5555"));
		
		//We can use toString() for debug purposes
		System.out.println(places.toString());
		
		//Now we need insert 'places' into a Layer
		Layer placesLayer = new Layer();
		placesLayer.setLabel("Places").addMarker(places);	//Concatenation works everywhere!
		placesLayer.addMarker(new Marker("42.121456","-72.533680","Sideshow Bob Hideout"));	//We can add a Marker directly too
	
		//Second layer, in a compact way and without popup messages
		Layer riversLayer = new Layer();
		riversLayer.setLabel("Rivers");
		riversLayer.addMarker(new Marker("42.104702","-72.530923")).addMarker(new Marker("42.111707","-72.541008")).addMarker(new Marker("42.102824","-72.551394"));
		
		//Now we add these layers and configure the Map
		springfieldMap.setCenter("42.120954,-72.538862").setZoom(12).setLayerControl(true);
		springfieldMap.addLayer(placesLayer).addLayer(riversLayer);
	}

	public Map getSpringfieldMap() {
		return springfieldMap;
	}

}