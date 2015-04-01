# JSF2Leaf
This is a JSF2 component that wraps the Leaflet javascript library into a single .jar library file. This allow a simple way to insert maps into your application using just a tag.

This component wraps just the basic parameters of Leaflet, to use advanced features like custom icons, polylines, events, layers etc, you need use the Leaflet API directly, this is possible because you can access the handler of the generated map throught the 'mapId' parameter.

### Usage

The simplest way to insert a map is this:
```
<leaf:map center="-15.601875,-50.141602" />
```
<br><img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/default.png">

Specifying all possible parameters:
```
<leaf:map mapId="mymap1" center="-15.601875,-50.141602"  marker="-15.601875,-50.141602" 
popupMsg="ACME&lt;br&gt;Phone: 555-5555" zoomGlobal="false" zoom="10" width="300px" height="200px" 
maxZoom="19" minZoom="1" dragging="false" zoomControl="false" attribution="JSF2Leaf" />
```
<br><img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/full.png">
