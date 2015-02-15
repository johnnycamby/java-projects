
/*
 * 
 */

(function() {

    'use strict';

    var app = angular.module('mainApp',
            [
                'common.services',
                'ui.router',
                'ui.mask',
                'ui.bootstrap'
            ]);

    // global error and exception handler e.g $state, thus not let an error go unnoticed
    // We first call a 'decorator' for the $exceptionHandler service, this will send all errors to $rootScope for data binding before allowing the call to fall through to the default implementation 
    // (addError is a custom method on $rootScope, while $delegate represents the service being decorated). 
    // You could also try to send the errors back to the host and thereby collect errors from all clients.

    app.config(function($provide) {

        $provide.decorator('$exceptionHandler', ['$delegate', function($delegate) {
                return function(exception, cause) {
                    exception.message = "Please contact the Help Desk! \n Message: " + exception.message;
                    $delegate(exception, cause);
                    //alert(exception.message);
                    toastr.error(exception.message);
                };
            }]);
    });

    app.config(
            ['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

                    $urlRouterProvider.otherwise('/');
                    $stateProvider
                            //home
                            .state('home',
                                    {
                                        url: '/',
                                        templateUrl: 'app/welcomeView.html'
                                    })
                            // employees
                            .state('employeeList',
                                    {
                                        url: '/employees',
                                        templateUrl: 'app/employees/employeeListView.html',
                                        controller: 'EmployeeListCtrl as vm'
                                    })
                            // Edit
                            .state('employeeEdit',
                                    {
                                        abstract: true,
                                        url: '/employees/edit/:employeeNumber',
                                        templateUrl: 'app/employees/employeeEditView.html',
                                        controller: 'EmployeeEditCtrl as vm',
                                        resolve: {
                                            employeeResource: 'employeeResource',
                                            employee: function(employeeResource, $stateParams) {
                                                var employeeNumber = $stateParams.employeeNumber;
                                                return employeeResource.get({employeeNumber: employeeNumber}).$promise;
                                            }
                                        }
                                    })

                            /*
                             Nested state ::
                             - l'l use the parent controller
                             - when its activated the parent is also activated
                             - the resolve calls the web server and returns the product for edit
                             - the returned product is then injected into the parent controller
                             */

                            .state('employeeEdit.info',
                                    {
                                        url: '/info',
                                        templateUrl: 'app/employees/employeeEditInfoView.html'
                                    })

                            //details
                            .state('employeeDetail',
                                    {
                                        url: '/employees/:employeeNumber',
                                        templateUrl: 'app/employees/employeeDetailView.html',
                                        controller: 'EmployeeDetailCtrl as vm',
                                        resolve: {
                                            employeeResource: 'employeeResource',
                                            employee: function(employeeResource, $stateParams) {
                                                var employeeNumber = $stateParams.employeeNumber;
                                                return employeeResource.get({employeeNumber: employeeNumber}).$promise;
                                            }
                                        }
                                    });
                }]
            );
}());

