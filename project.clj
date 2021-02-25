(defproject exchange "0.1.0"
  :description "A demo bitcoin exchange written in Clojure"
  :url "https://github.com/kubqoa/exchange"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [metosin/reitit "0.5.12"]
                 [ring/ring-core "1.9.1"]
                 [ring/ring-mock "0.4.0"]
                 [metosin/pohjavirta "0.0.1-alpha7"]
                 [metosin/muuntaja "0.6.8"]
                 [environ "1.2.0"]
                 [com.zaxxer/HikariCP "4.0.2"]
                 [com.impossibl.pgjdbc-ng/pgjdbc-ng "0.8.6"]
                 [seancorfield/next.jdbc "1.1.613"]
                 [com.taoensso/timbre "5.1.2"]
                 [com.fzakaria/slf4j-timbre "0.3.20"]]
  :main ^:skip-aot exchange.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
