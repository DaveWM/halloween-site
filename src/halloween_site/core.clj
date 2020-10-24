(ns halloween-site.core
  (:require [hiccup.core :as h]))

(def content
  [:main.container
   [:div.jumbotron
    [:h1.display-3 "A quarantined Halloween!"]
    [:img {:src "https://www.freepnglogos.com/uploads/pumpkin-png/halloween-pumpkin-icon-1.png"
           :width "40%"}]]
   [:p.lead
    "On Halloween, the 52 of Brodie Avenue opens up again for the most terrifying online experience.
      We know events, parties, etc. got cancelled, but Halloween cannot die!"]
   [:p.lead "All you need to survive this terrifying night is a spooky costume (or makeup), and plenty of drinks in your fridge."]
   [:p.lead "This is what you can expect, if you're prepared:"]
   [:dl.timetable
    [:dt "6pm - 8pm"]
    [:dd "A warmup with " [:a {:href "https://www.netflix.com/watch/70251894"
                               :target "_blank"} "The Conjuring"] " while we eat."]
    [:dt "8pm - 9pm"]
    [:dd "We'll play a " [:a {:href "https://www.triviaquestionss.com/halloween-trivia-questions-with-answers/"
                              :target "_blank"} "trivia game"] " (no cheating!), with drinks and (spooky) shots."]
    [:dt "9pm - 11pm"]
    [:dd "The grand finale - for the last pass, we have the movie " [:a {:href "https://www.netflix.com/watch/70221486"
                                                                         :target "_blank"}
                                                                     "Sinister"] "."]]
   [:p
    [:a {:href "https://meet.google.com/oqw-yxje-dcj"
         :target "_blank"}
     "Click here to join the video call - if you dare!"]]])

(def page
  [:html
   [:head
    [:meta {:name "viewport"
            :content "width=device-width, initial-scale=1"}]
    [:link {:rel "stylesheet"
            :href "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"}]
    [:link {:rel "stylesheet"
            :href "/styles.css"}]
    [:link {:rel "stylesheet"
            :href "https://fonts.googleapis.com/css2?family=Creepster&display=swap"}]]
   [:body
    content]])

(defn -main [& args]
  (println "Running...")
  (spit "public/index.html" (h/html page)))

(-main)

