#! bin/bash

javac -d bin --module-path /usr/share/openjfx/lib --add-modules javafx.controls src/*.java
java -cp bin:image --module-path /usr/share/openjfx/lib --add-modules javafx.controls Executable
