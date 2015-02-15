
/**
 * - Uses the 'employeeResource' service
 * - Makes a call to the web service to get back an json array by using the 'query' method of the Resource object
 * - 'query' sends a get request to the url defined in $Resource function
 *   => It's param is a callback function  that is called upon recieving a successful http response
 *   => The response is the json data
 */

(function (){
    
    'use strict';
    
    angular
            .module('mainApp')
            .controller('EmployeeListCtrl',['employeeResource',EmployeeListCtrl]);
    
    // ask angular to pass a reference to the 'employeeResource' service, thus add 'employeeResource' as parameter
    function EmployeeListCtrl(employeeResource){
        
        var vm = this;
        
       /**
        * @return { json data } description :: from the query
        * Assign the returned data to employees that is part of the module
        */
       employeeResource.query(function (data){
            
            vm.employees = data;
        });
        
        
        // turn the image on/off
        vm.showImage = false;
        
        vm.toggleImage = function (){
            vm.showImage = !vm.showImage;
        };
           
    }
}());


