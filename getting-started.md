# Getting Started

To develop the ＣＯＭＰＩＷＡＶＥ编译器 compiler we used the [ANTLR](http://www.antlr.org/) parse generator.

To install **ANTLR** we need to follow the following steps:

** inside the unix terminal emulator **
```
    $ cd /usr/local/lib
    $ sudo curl -O http://www.antlr.org/download/antlr-4.6-complete.jar
    $ export CLASSPATH=".:/usr/local/lib/antlr-4.6-complete.jar:$CLASSPATH"
    $ alias antlr4='java -jar /usr/local/lib/antlr-4.6-complete.jar'
    $ alias grun='java org.antlr.v4.gui.TestRig'
```