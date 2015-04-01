# JSF2Leaf
This is a JSF2 component that wraps the Leaflet javascript library into a single .jar library file. This allow a simple way to insert maps into your application using just a tag, take a look:
```
<leaf:map center="-15.601875,-50.141602" />
```
The code above will produce this map:
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/default.png">

Now specifying all the possible parameters:
```
<leaf:map mapId="mymap1" center="-15.601875,-50.141602"  marker="-15.601875,-50.141602" 
popupMsg="ACME&lt;br&gt;Phone: 555-5555" zoomGlobal="false" zoom="10" width="300px" height="200px" 
maxZoom="19" minZoom="1" dragging="false" zoomControl="false" attribution="JSF2Leaf" />
```
will result this:
<img src="https://raw.githubusercontent.com/themrleon/JSF2Leaf/master/images/full.png">
