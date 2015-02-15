
/*
 * NB :: 'module()' is angular's method used to define the module e.g here 'common.services'
 * - This is a reusable data access component 
 * - We inject ngResource module (as dependency) it is an optional angular module(thus not include by default thus u must download it) that addes functionalities to interact with RESTful services
 * - uses $Resource(found in ngResource module) to interact with the web server 
 *  
 */
(function (){
    
    'use strict';
    
    angular.module('common.services', ['ngResource']);
}());
