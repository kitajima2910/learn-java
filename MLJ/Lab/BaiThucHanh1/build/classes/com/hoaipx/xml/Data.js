angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {code: 'SN54', name:'Sony 54', price: 1700, img:'img.png'},
        {code: 'SS49', name:'SamSung 49', price: 9000, img:'img.png'},
	{code: 'SS59', name:'SamSung Note 10', price: 19000, img:'img.png'}
    ];
});