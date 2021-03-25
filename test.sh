#!/bin/bash

rm -r out/
cd src
javac -cp '../provided.jar:.' TestSuite.java -d ../out/
cd ..
java -cp "provided.jar:out/" TestSuite basic-1v3-slimes