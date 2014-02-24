("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->"
  "<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->"
  "<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->"
  "<!--[if gt IE 8]><!-->"
  [:html.no-js
   " "
   "<!--<![endif]-->"
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:content "IE=edge", :http-equiv "X-UA-Compatible"}]
    [:title]
    [:meta {:content "", :name "description"}]
    [:meta
     {:content "width=device-width, initial-scale=1", :name "viewport"}]
    "<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->"
    [:link {:href "css/normalize.css", :rel "stylesheet"}]
    [:link {:href "css/main.css", :rel "stylesheet"}]
    [:script {:src "js/vendor/modernizr-2.6.2.min.js"}]]
   [:body
    "<!--[if lt IE 7]>\n            <p class=\"browsehappy\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n        <![endif]-->"
    "<!-- Add your site or application content here -->"
    [:p "Hello world! This is HTML5 Boilerplate."]
    [:script
     {:src
      "//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"}]
    [:script
     "window.jQuery || document.write('<script src=\"js/vendor/jquery-1.10.2.min.js\"><\\/script>')"]
    [:script {:src "js/plugins.js"}]
    [:script {:src "js/main.js"}]
    "<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->"
    [:script
     "\n            (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=\n            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;\n            e=o.createElement(i);r=o.getElementsByTagName(i)[0];\n            e.src='//www.google-analytics.com/analytics.js';\n            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));\n            ga('create','UA-XXXXX-X');ga('send','pageview');\n        "]]])
