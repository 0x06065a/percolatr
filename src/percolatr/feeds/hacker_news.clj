(ns percolatr.feeds.hacker-news
  (:require [clj-http.client :as httpc]))

(def ^:private top-stories-url
  "https://hacker-news.firebaseio.com/v0/topstories.json")

(defn- make-item-url
  [item-id]
  (format "https://hacker-news.firebaseio.com/v0/item/%d.json" item-id))


(defn get-top-news-ids
  []
  (->>
   (httpc/get top-stories-url {:as :json})
   (:body)))

(defn get-item
  [item-id]
  (let [response (httpc/get (make-item-url item-id) {:as :json})
        {:keys [id score url]} (:body response)]
    {:id id
     :source "https://news.ycombinator.com"
     :score score
     :url url}))
