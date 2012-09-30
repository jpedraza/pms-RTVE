Description
===========
This is a plugin for [PS3MediaServer](https://github.com/ps3mediaserver/ps3mediaserver) (PMS) that allows you to stream all TV shows from [RTVE.es](http://www.rtve.es/alacarta/).

Installation
============
See Building.

Building
========
Before building the plugin, set the key in file Alacarta.java.
You can find the key in the RTVE flash player.
Make sure PS3 media server is available in local maven repository and execute:

    mvn package

Place result file in the PMS *plugins* directory and restart PMS.

Uninstalling
============
To uninstall pms-RTVE, remove the jar file from the *plugins* directory and restart PMS.

