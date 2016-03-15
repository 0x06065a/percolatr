(ns percolatr.storage
  (:require [korma.db :as kdb]
            [korma.core :as kc]
            [clojure.string :as cstr]))

(defn init-db
  [db-path]

  (kdb/defdb storage (kdb/h2 {:db db-path
                              :naming {:keys cstr/lower-case
                                       :fields cstr/upper-case}}))

  (kc/exec-raw (str "CREATE TABLE IF NOT EXISTS ITEMS("
                    "ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                    "SOURCE VARCHAR(3000),"
                    "SCORE INT NOT NULL,"
                    "URL VARCHAR(3000) NOT NULL)")))

(kc/defentity items)

