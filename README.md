# Overview
JSF2Leaf is a JavaServer Faces component that allows a simpler way to insert a map into your webpage using just a tag, like any other JSF component. This is possible because JSF2Leaf wraps the <a href="http://leafletjs.com">Leaflet</a> map library, using <a href="http://www.openstreetmap.org">OpenStreetMap</a> as map provider.

### Features
* Simple - Just a single tag and you have a map!
* Small - Library's size ~ 50 kb
* Easy - No need to know Leaflet, javascript or any other map API

## Usage
Just copy <a href="https://github.com/themrleon/JSF2Leaf/raw/master/jsf2leaf.jar">jsf2leaf.jar</a> to:
```
<project_dir>\WebContent\WEB-INF\lib
```
Then in your .xhtml file insert the library namespace:
```
xmlns:leaf="http://java.sun.com/jsf/composite/jsf2leaf"
```
Now you will have access to the `<leaf:map />` and `<leaf:mapAdvanced />` tags. 

## Simple Map
For a simple map, `<leaf:map />` should be used, because all parameters can be set as tag's attributes and a Bean is not really necessary, however, there are some limitations, you can add only a single marker and no layers. Look:

Simplest way to insert a map:
```
<leaf:map center="42.120000,-72.540000" />
```
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/simple.png">

Specifying all possible parameters:
```
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
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/full.png">

The parameters list can be found <a href="https://github.com/themrleon/JSF2Leaf/raw/master/parameters.pdf">HERE</a>.

## Advanced Map
Advanced map should be used if you want advanced features like markers, layers etc, or just want build the map from Java Bean. The tag `<leaf:mapAdvanced />` have just the `map` parameter, it receives the Map object built in the Bean. The Map object can be built using these JSF2Leaf's classes: 'Marker', 'Layer' and 'Map'. These classes will be available after the lib installation and import in the Bean. Look:

test.xhtml:
```
<leaf:mapAdvanced map="#{testBean.springfieldMap}" />
```
testBean.java:
```
import com.jsf2leaf.model.Layer;
import com.jsf2leaf.model.Map;
import com.jsf2leaf.model.Marker;
...
	private Map springfieldMap = new Map();
...
		Layer placesLayer = new Layer();
		placesLayer.setLabel("Places");
		placesLayer.addMarker(new Marker("42.120000","-72.540000","<b>Krusty Burger</b><br>Phone: 555-5555"));
		placesLayer.addMarker(new Marker("42.121456","-72.533680","Sideshow Bob Hideout"));
		placesLayer.addMarker(new Marker("42.114556","-72.526309","<b>Elementary School</b><br>Skinner&#39;s Phone: 555-5555"));
		placesLayer.addMarker(new Marker("42.120286","-72.547488","<b>Hospital</b><br>Dr. Hibbert lol"));
	
		Layer riversLayer = new Layer();
		riversLayer.setLabel("Rivers");
		riversLayer.addMarker(new Marker("42.104702","-72.530923")).addMarker(new Marker("42.111707","-72.541008")).addMarker(new Marker("42.102824","-72.551394"));
		
		springfieldMap.setCenter("42.120954,-72.538862").setZoom(12);
		springfieldMap.addLayer(placesLayer).addLayer(riversLayer);
...
```
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/advanced.png">

## License
GPLv2 License, details <a href="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/LICENSE">HERE</a>.
