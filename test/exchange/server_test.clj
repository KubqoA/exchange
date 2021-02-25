(ns exchange.server-test
  (:require [clojure.test :refer :all]
            [exchange.server :refer :all]
            [ring.mock.request :as mock]))

(deftest json-handler-test
  (is (= (json-handler (mock/request :get "/json"))
         {:status  200
          :body    {:message "Hello World"}})))

