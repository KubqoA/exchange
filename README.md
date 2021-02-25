# exchange

A demo bitcoin exchange written in Clojure

## Installation

### Building from source

1. Clone the git repo
```
$ git clone https://github.com/KubqoA/exchange.git
```
2. Enter the exchnage directory
```
$ cd exchange
```
3. Buld the jar using [leiningen](https://leiningen.org/)
```
$ lein uberjar
```
4. The built jar will be available in `target/uberjar/exchange-0.1.0-standalone.jar`

## Usage

Running the jar intializes the database and starts the webserver.

    $ java -jar exchange-0.1.0-standalone.jar

## Options

FIXME: listing of options this app accepts.

