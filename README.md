# JSF2Leaf
This is a JSF2 component that wraps the Leaflet javascript library into a single .jar library file. This allow a simple way to insert maps into your application using just a tag.

### Features
* Simple - Just a single tag and you have a map!
* Small - Library size of 41 kb
* Easy - No need to know the Leaflet API

<div align="center"><img width="30%" src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/primefaces.png"></div>

## Usage
Just copy the library .jar file to:
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
<br><img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/default.png">

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
<br><img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/full.png">

## License
GPLv2 License, details <a href="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/LICENSE">HERE</a>.
