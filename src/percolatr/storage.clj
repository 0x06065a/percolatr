(ns percolatr.storage
  (:require [korma.db :as kdb]
            [korma.core :as kc]
            [clojure.string :as cstr]))

(kdb/defdb storage (kdb/h2 {:db "/tmp/percolatr.db"
                    :naming {:keys cstr/lower-case
                             :fields cstr/upper-case}}))

(kc/defentity items
  (kc/entity-fields :score :url))

