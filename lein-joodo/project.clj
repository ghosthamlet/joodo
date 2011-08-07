(defproject joodo/lein-joodo "0.6.0-SNAPSHOT"
  :description "Leiningen Plugin for Joodo, a Clojure framework for web apps."
  :license {:name "The MIT License"
            :url "file://LICENSE"
            :distribution :repo
            :comments "Copyright © 2011 Micah Martin All Rights Reserved."}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [filecabinet "1.0.4"]
                 [mmargs "1.2.0"]]
  :dev-dependencies [[speclj "1.4.0"]]
  :test-path "spec/"
  :shell-wrapper {:main joodo.kuzushi.core
                  :bin "bin/joodo"}
  :resources-path "resources/"
  :jar-exclusions [#"leiningen/.*"]
;  :eval-in-leiningen true
  )