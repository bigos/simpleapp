(ns simpleapp.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]

            [org.httpkit.server :refer [run-server]]))

;; https://learnxinyminutes.com/docs/compojure/
;; http://http-kit.github.io/
;; curl -X POST http://localhost:5000/generate/abc.xml/def.pdf

(defroutes app
  (GET "/generate*" {params :query-params} (str params))
  (GET "/" [] "<h1>Hello</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "booooo")
  (run-server app {:port 5000}))
