(ns exchange.core
  (:require [exchange.server :as server])
  (:gen-class))

(defn -main
  [& args]
  server/start)
