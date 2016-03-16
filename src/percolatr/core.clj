(ns percolatr.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]
            [clojure.string :as cstr]))

(def ^:private cli-options
  [["-D" "--db DB_PATH" "database path"]
   ["-h" "--help"]])

(defn- exit
  [code msg]
  (println msg)
  (System/exit code))

(defn -main
  [& args]
  (let [{:keys [options summary]} (parse-opts args cli-options)]
    (cond
      (:help options) (exit 0 summary))))
