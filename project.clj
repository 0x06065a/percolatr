(defproject percolatr "0.1.0-SNAPSHOT"
  :description "news filter"
  :url "https://github.com/0x06065a/percolatr"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.3"]]
  :main ^:skip-aot percolatr.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
