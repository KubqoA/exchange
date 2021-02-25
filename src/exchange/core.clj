(ns exchange.core
  (:require [exchange.database :as db]
            [exchange.server :as server])
  (:gen-class))

(defn -main
  [& args]
  db/close-pool-on-shutdown
  server/start)
