# Overview
JSF2Leaf is a JavaServer Faces component that allows a simpler way to insert maps in your webpage using just a tag, like any other JSF component. This is possible because JSF2Leaf wraps the <a href="http://leafletjs.com">Leaflet</a> map library, using <a href="http://www.openstreetmap.org">OpenStreetMap</a> as map provider.

### Features
* Simple, just a single tag and you have a map!
* Support Markers, Layers, Polylines, Circles and [Clusterization](http://leaflet.github.io/Leaflet.markercluster/example/marker-clustering-realworld.10000.html)
* Easy, no need to know Leaflet, javascript or any other map API !
* Small ~ 63 kb

### Article
<a href="http://www.l3oc.com/2015/06/jsf2leaf.html">http://www.l3oc.com/2015/06/jsf2leaf.html</a>

## Usage
Just copy [jsf2leaf.jar](lib/jsf2leaf.jar?raw=true) to:
```
<project_dir>\WebContent\WEB-INF\lib
```
Then in your .xhtml file insert the library namespace:
```
xmlns:leaf="http://java.sun.com/jsf/composite/jsf2leaf"
```
Now you have access to the `<leaf:map />` and `<leaf:mapAdvanced />` tags !

## Simple Map
For a simple map, `<leaf:map />` should be used, because all parameters can be set in the tag and a Bean is not really necessary, however, there are some limitations, you can add only a single marker and no layers. Look:

Simplest way to insert a map:
```html
<leaf:map center="42.120000,-72.540000" />
```
![](images/simple.png?raw=true)

Specifying all possible parameters:
```html
<leaf:map center="42.120000,-72.540000" 
marker="42.120000,-72.540000"
popupMsg="Krusty Burger&lt;br&gt; Phone: 555-5555" 
zoomGlobal="false" 
zoom="12"
width="300px" 
height="200px" 
maxZoom="19" 
minZoom="1" 
dragging="false"
zoomControl="false"
attribution="JSF2Leaf" />
```
![](images/full.png?raw=true)

The parameters list can be found [HERE](docs/map.pdf?raw=true).

## Advanced Map
Advanced map should be used if you want advanced features like multiple markers, layers, polylines etc, as well as build the map from Java Bean. The tag `<leaf:mapAdvanced />` have just the `map` parameter, that receives the Map object built in the Bean. JSF2Leaf supply all the classes needed to build the Map object, they will be available after the lib installation and import in the Bean. Look:

test.xhtml:
```html
<leaf:mapAdvanced map="#{testBean.springfieldMap}" />
```
testBean.java:
```java
import com.jsf2leaf.model.Circle;
import com.jsf2leaf.model.LatLong;
import com.jsf2leaf.model.Layer;
import com.jsf2leaf.model.Map;
import com.jsf2leaf.model.Marker;
import com.jsf2leaf.model.Polyline;
...
	private Map springfieldMap = new Map();
...
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
...
```
![](images/advanced.png?raw=true)

All classes support concatenation of methods and have a toString() method for debug purposes. Details can be found [HERE](docs/mapadvanced.pdf?raw=true).

## New version (february 2016) :
You can display a minimap :

![](images/minimap.jpg?raw=true)

You can use a "urlTemplate" customized to choose your <a href="http://wiki.openstreetmap.org/wiki/Tile_servers">tile server</a> or run offline :

![](images/offline.jpg?raw=true)

## License
GPLv2 License, details [HERE](LICENSE).
