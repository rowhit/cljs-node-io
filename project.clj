(defproject cljs-node-io "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  ; :min-lein-version "2.5.3"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-2"]]


  :clean-targets ["server.js"
                  "target"]

  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src" "test"]
                        :figwheel true
                        :compiler {
                                   :main cljs-node-io.core
                                   :output-to "target/server_dev/cljs_node_io.js"
                                   :output-dir "target/server_dev"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {
                                   :output-to "server.js"
                                   :output-dir "target/server_prod"
                                   :target :nodejs
                                   :optimizations :simple}}]})