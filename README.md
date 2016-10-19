#Bug Fixes
==========

1. Handle Empty Database
Steps to reproduce: Uninstall the App. Turn Off Wifi or put the device in Airplane mode. Install and launch the app. You will notice that the main screen has no content
Fix: Inside the onLoadFinished callback, check to see if the cursor has 0 count.
