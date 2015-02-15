
/*
 * 
 * - This is a custom service that depends on the 'common.services' module
 * - It use $Resource to make calls to the web server
 * - It's registered with the 'common.services' module as seen below by calling the 'factory()'
 * 
 * NB :: Using the Resource Object
 * - It provides by default 5 methods that allow interaction with the backend web service
 *   => GET :: sends a get request to the url and expects a json object in the response
 *   => Query :: sends a get request to the url and expects a json array in the response
 *   => Save ::  sends a post request to the url
 *   => Delete :: sends a delete request to the url
 *   => Remove :: is annoymous with Delete thus its used in place of Delete coz 'delete' is a reserved word in java script
 * 
 */


(function (){
    
    'use strict';
    
    angular
            .module('common.services')
            .factory('employeeResource',['$resource', employeeResource]);
    
    function employeeResource($resource){
      
        var url = 'http://localhost:8080/AngularJEE/rs/employees/:employeeNumber';
      
        return $resource(url);
             
    }
}());