# Cloudberry Matrix 


For Cache Capacity Change 
*go to cloudberry/twittermap/public/javascripts/cache/services.js
*Line 11 change cacheThreshold

For Change TestInput File
*go to cloudberry/twittermap/public/javascripts/map/controller.js
*go to Function loadFile()
*Change the address of input json file

For Changing Styles
*go to cloudberry/twittermap/public/javascripts/map/controller.js

For Changing Cached Region (BLUE Region)
go to line 545 cacheStyle

For Showing Cached City Polygons(Small Black Polygons)
go to line 550 cacheCityStyle 

For Changing Prefetch Region(Yellow Region)
go to line 557 prefetchStyle

For Changing Cache Miss Region(RED Region)
go to line 564 requestMissStyle


For Changing Cache Hit Region(GREEN Region)
go to line 572 requestMissStyle

To run simulation without Cache
change line 655 from testFunction to normalTest

Average Test Timing is seen in console after simulation is done
