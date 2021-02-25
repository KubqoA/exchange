(defproject exchange "0.1.0"
  :description "A demo bitcoin exchange written in Clojure"
  :url "https://github.com/kubqoa/exchange"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot exchange.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
