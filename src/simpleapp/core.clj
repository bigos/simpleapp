(ns simpleapp.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [org.httpkit.server :refer [run-server]]))

;; https://learnxinyminutes.com/docs/compojure/
;; http://http-kit.github.io/
;; curl -X POST http://localhost:5000/generate/abc.xml/def.pdf

(defroutes app
  (GET "/" [] "<h1>Hello</h1>")
  (POST "/generate" req (let [iff (get (:params req) :iff)
                              off (get (:params req) :off)]
                          (str "iff: " iff ", off: " off)))
  (route/not-found "<h1>Page not found</h1>"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "booooo")
  (run-server app {:port 5000}))
