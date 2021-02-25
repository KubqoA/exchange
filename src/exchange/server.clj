(ns exchange.server
  (:require [environ.core :refer [env]]
            [pohjavirta.server :as server]
            [reitit.ring :as ring]
            [jsonista.core :as j]))

(defn json-encode
  [httpCode obj]
  {:status httpCode
   :headers {"Content-Type" "application/json"}
   :body (j/write-value-as-bytes obj)})

(defn json-handler [_]
  (json-encode 200 {:message "Hello World"}))

(def app
  (ring/ring-handler
    (ring/router
      [["/json" json-handler]])
    (ring/create-default-handler)))

(def start
  "Starts the web server"
  (let [cpus (.availableProcessors (Runtime/getRuntime))]
    (-> app
      (server/create
        {:port (env :server-port 8080)
         :host (env :server-host "0.0.0.0")
         :io-threads (* 2 cpus)
         :worker-threads (* 8 cpus)})
      server/start)))

