/**
 * Created by liyudong on 2017/9/26.
 */
(function(angular) {
    'use strict';
    angular.module('httpExample', [])
        .config(['$sceDelegateProvider', function($sceDelegateProvider) {
            // We must whitelist the JSONP endpoint that we are using to show that we trust it
            $sceDelegateProvider.resourceUrlWhitelist([
                'self',
                'https://angularjs.org/**'
            ]);
        }])
        .controller('FetchController002', ['$scope', '$http', '$templateCache',
            function($scope, $http, $templateCache) {
                $http({
                    method: 'GET',
                    url: 'http://127.0.0.1:8080/dept/getAll'
                }).then(function successCallback(response) {
                    // this callback will be called asynchronously
                    $scope.depts=response.data
                    // when the response is available
                }, function errorCallback(response) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
                $scope.fetch = function(method,url) {
                    $scope.code = null;
                    $scope.response = null;
                    $http({method: method, url: url, cache: $templateCache}).
                    then(function(response) {
                        $scope.status = response.status;
                        $scope.data = response.data;
                    }, function(response) {
                        $scope.data = response.data || 'Request failed';
                        $scope.status = response.status;
                    });
                };
                $scope.fetch2 = function(method,url) {
                    $scope.code = null;
                    $scope.response = null;
                    $http({
                        method:'post',
                        url:url,
                        data:{"id":1,"name":"tudou"}
                    }).then(function successCallback(response) {
                        alert('添加成功');
                    }, function errorCallback(response) {
                        alert('添加失败');
                    });
                };
                $scope.updateModel = function(method, url) {
                    $scope.method = method;
                    $scope.url = url;
                };
            }]);
})(window.angular);