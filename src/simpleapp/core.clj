(ns simpleapp.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defroutes app
  (GET "/" [] "<h1>Hello</h1>")
  (route/not-found "<h1>Page not found</h1>"))
