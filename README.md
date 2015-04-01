# JSF2Leaf
This is a JSF2 component that wraps the Leaflet map library into a single .jar file. This allow a simpler way to insert maps into your application using just a tag, like any other JSF component.

### Features
* Simple - Just a single tag and you have a map!
* Small - Library's size ~ 41 kb
* Easy - No need to know the Leaflet API

<div align="center"><img width="30%" src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/primefaces.png"></div>

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
<leaf:map center="-15.601875,-50.141602" />
```
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/default.png">

Specifying all the possible parameters:
```
<leaf:map mapId="mymap1" 
center="-15.601875,-50.141602"  
marker="-15.601875,-50.141602" 
popupMsg="ACME&lt;br&gt;Phone: 555-5555" 
zoomGlobal="false" 
zoom="10" 
width="300px" 
height="200px" 
maxZoom="19" 
minZoom="1" 
dragging="false" 
zoomControl="false" 
attribution="JSF2Leaf" />
```
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/full.png">

## License
GPLv2 License, details <a href="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/LICENSE">HERE</a>.
