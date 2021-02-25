(ns exchange.utils)

(defn defer
  "Adds the function as a shutdown hook"
  [f]
  (.addShutdownHook (Runtime/getRuntime) (Thread. ^Runnable f)))

