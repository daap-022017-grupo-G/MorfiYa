morfiApp.config(function ($stateProvider, $urlRouterProvider) {

  $urlRouterProvider.otherwise("/");

  $stateProvider

    .state('home', {
      url: "/",
      templateUrl: "partials/home.html",  
      controller: "HomeCTRL as home"      
    })

});