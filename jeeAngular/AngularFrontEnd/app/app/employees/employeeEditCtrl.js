

(function() {

    'use strict';

    angular.module('mainApp')
            .controller('EmployeeEditCtrl', ['employee', "$state", 'employeeService', EmployeeEditCtrl]);

    function EmployeeEditCtrl(employee, employeeService, $state) {

        var vm = this;

        vm.employee = employee;

        if (vm.employee && vm.employee.employeeNumber) {

            vm.title = 'Edit: ' + vm.employee.firstName;
            vm.email = /^[a-z]+[a-z0-9._]+@[a-z]+\.[a-z.]{2,5}$/;
        } else {
            vm.title = 'New Employee';
        }

        vm.open = function($event) {

            $event.preventDefault();
            $event.stopPropagation();

            vm.opened = !vm.opened;
        };

        vm.submit = function(isValid) {

            if (isValid) {
                vm.employee.$save(function(data) {
                    toastr.success('Save was Successful!!');
                });
            } else {
                toastr.error('Please correct the validation errors first!!');
            }
        };

        vm.cancel = function() {
            $state.go('employeeList');
        };

    }
    

}());