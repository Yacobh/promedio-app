(ns micarpeta.mi-deps-app
  (:gen-class)
  (:require [org.httpkit.server :refer [run-server]]))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, World!"})

(defn -main []
  (run-server handler {:port 8080}))

(defn promedio
  "Devuelve el promedio de una lista de numeros"
  [lista-de-numeros]
  (println (str "esta es mi lista de numeros" lista-de-numeros))
  #_(/ 
   (reduce + lista-de-numeros)
   (count lista-de-numeros)
   ))


(comment
  (-main)
  )