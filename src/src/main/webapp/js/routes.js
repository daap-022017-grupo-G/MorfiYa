morfiApp.config(function ($stateProvider, $urlRouterProvider) {

  $urlRouterProvider.otherwise("/");

  $stateProvider

    .state('inicio', {
      url: "/",
      templateUrl: "partials/home.html",  
      controller: "HomeCTRL as home"      
    })

});