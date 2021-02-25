(ns exchange.database
  (:require [next.jdbc :as jdbc]
            [next.jdbc.connection :as connection]
            [environ.core :refer [env]]
            [exchange.utils :refer [defer]])
  (:import (com.zaxxer.hikari HikariDataSource)))

(def db-spec
  {:dbtype   "pgsql"
   :dbname   (env :database-dbname "bitcoin_exchange")
   :host     (env :database-host "localhost")
   :port     (env :database-port 5432)
   :username (env :database-username "postgres")
   :password (env :database-password nil)
   :maximum-pool-size (* 8 (.availableProcessors (Runtime/getRuntime)))})

(defonce db
  (delay (connection/->pool HikariDataSource db-spec)))

(def close-pool-on-shutdown
  (defer #(.close @db)))

