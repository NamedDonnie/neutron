var userInfoModule = angular.module('UserInfoModule',[])//[]是依赖其他模块的时候用的
//与ng-ctroller对应
userInfoModule.controller('UserInfoCtrl',['$scope',function ($scope) {
    //在scope上赋值
    $scope.userInfo={
        email:'1231@qq.com',
        password:'32131',
        autoLogin:true
    }
    //之后就可以在页面绑定值了

    //页面点击事件，输出到控制台
    $scope.getFormData = function() {
        console.log($scope.userInfo);
    };

    $scope.setFormData = function() {
        $scope.userInfo = {
            email: 'damoqiongqiu@126.com',
            password: 'damoqiongqiu',
            autoLogin: false
        }
    };
    $scope.resetForm = function() {
        $scope.userInfo = {
            email: "00000000@00.00",
            password: "0000000000",
            autoLogin: true
        };
    }
}])
