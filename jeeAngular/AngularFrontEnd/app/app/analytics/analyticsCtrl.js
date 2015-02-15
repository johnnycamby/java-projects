
(function (){
    
    'use strict';
    angular.module('mainApp')
            .controller('AnalyticsCtrl', ['$scope', 'filter', 'employees', 'employeeService',AnalyticsCtrl ]);
    
    function AnalyticsCtrl($scope, $filter, employees, employeeService){
        
        $scope.title = 'Analytics';
    }
}());