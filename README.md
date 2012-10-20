Description
===========
This is a plugin for [PS3MediaServer](https://github.com/ps3mediaserver/ps3mediaserver) (PMS) that allows you to stream all TV shows from [RTVE.es](http://www.rtve.es/alacarta/).

Installation
============
Download the [pms-RTVE jar file](https://github.com/danighieri/pms-RTVE/downloads) or build pms-RTVE, place it in the PMS *plugins* directory.
Put pms-RTVE.properties file in the *plugins* directory and set rtve.key property.

    ## Sample properties file
    rtve.key=RTVEKEY

Restart PMS.

NOTE: You can find the key in the RTVE flash player.

Building
========
Make sure PS3 media server is available in local maven repository and execute:

    mvn package

Uninstalling
============
To uninstall pms-RTVE, remove the jar and properties files from the *plugins* directory and restart PMS.

