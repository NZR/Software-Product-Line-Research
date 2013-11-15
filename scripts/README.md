In this folder you'll find the shell script necessary to extract 
Linux feature model in .RSF format. 

The script "fm_snapshot_extractor.sh" run through all releases
contained in the associated "releases" file, get the state of the Linux code
associated with that release and dumps all architecture FM into the history folder.

In order to run this script you NEED to modify the file path contained within,
and make them point to the proper directories on your system. See script file for details.

WARNING: this must be run in Linux ! MacOS is case-preserving, but not sensitive. 
Due to file renaming in the Linux code, you'll get errors when moving in Linux history with MacOS.
(I don't know how to by-pass this, I used a Linux box to work on that). 

