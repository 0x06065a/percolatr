(ns percolatr.core
  (:require [clojure.tools.cli :refer [parse-opts]]))


(defn -main
  [& args]
  (println (parse-opts args [])))
