morfiYa.config(function ($stateProvider, $urlRouterProvider) {

  $urlRouterProvider.otherwise("/");

  $stateProvider


    
    .state('home', {
      url: "/home",
      templateUrl: "partials/home.html",
      controller: "MorfiController"
    })


});   