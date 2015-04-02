# JSF2Leaf
This is a JSF2 component that wraps the <a href="http://leafletjs.com">Leaflet</a> map library into a single .jar library file. This allow a simpler way to insert maps into your application using just a tag, like any other JSF component. The map provider is <a href="http://www.openstreetmap.org">OpenStreetMap</a>.

### Features
* Simple - Just a single tag and you have a map!
* Small - Library's size ~ 41 kb
* Easy - No need to know Leaflet or any other map API

## Usage
Just copy <a href="https://github.com/themrleon/JSF2Leaf/raw/master/jsf2leaf.jar">jsf2leaf.jar</a> to:
```
<project_dir>\WebContent\WEB-INF\lib
```
Then in your .xhtml file insert the library namespace:
```
xmlns:leaf="http://java.sun.com/jsf/composite/jsf2leaf"
```

## Examples

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

## License
GPLv2 License, details <a href="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/LICENSE">HERE</a>.
