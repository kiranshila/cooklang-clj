(ns cooklang.core
  (:require
   [clojure.java.io :as io]
   [instaparse.core :as insta :refer [defparser]]))

(defparser spec (slurp (io/resource "grammar.ebnf")))

(spec "Crack @eggs{3} into a bowl.")
