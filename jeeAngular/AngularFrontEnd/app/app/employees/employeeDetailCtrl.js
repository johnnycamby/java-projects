/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function (){
    
    'use strict';
    
    angular.module('mainApp')
            .controller('EmployeeDetailCtrl', ['employee', 'employeeService', EmployeeDetailCtrl]);
    
    function EmployeeDetailCtrl(employee, employeeService){
        
        var vm = this;
        vm.employee = employee;
        vm.firstName = 'Employee Detail: ' + vm.employee.firstName;
        
        // TODO: API computations
    }
}());
