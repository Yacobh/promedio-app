(ns micarpeta.mi-deps-app
  (:gen-class))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn promedio
  "Devuelve el promedio de una lista de numeros"
  [lista-de-numeros]
  (println (str "esta es mi lista de numeros" lista-de-numeros))
  (/ 
   (reduce + lista-de-numeros)
   (count lista-de-numeros)
     ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (promedio args))

(comment
  (-main 1 2 3 4)
  )