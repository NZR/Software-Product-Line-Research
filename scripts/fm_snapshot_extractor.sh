#!/bin/sh

# creates feature model history based on a list of commits of the Linux Kernel

#list of commit tags (1 tag per line and nothing else in the file)
FP="releases"

#repository which will be used to extract model history
REPO_DIR="workspace/linux"

#repository in which the models will be dumped
OUTPUT_DIR="workspace/linux_history"

cd $REPO_DIR

#for each commit tag
while read LINE; do
  
  echo "Recovering version $LINE of the linux kernel"
  #move to commit
  git checkout "$LINE"

  echo "Extracting Undertaker models"
  #generate model
  undertaker-kconfigdump
  #save the result in the output folder
  mv ./models "$OUTPUT_DIR/$LINE"

done < "$FP"
