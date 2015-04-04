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

package com.jsf2leaf.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

import com.jsf2leaf.model.Map;

@FacesComponent("mapAdvanced") 
public class MapAdvanced extends UINamingContainer {
 
	private transient Map mapObject;
	
	public Map getMapObject() {
		if (mapObject == null)
			mapObject = ((Map) this.getAttributes().get("map"));
		
		return mapObject;
	}

}