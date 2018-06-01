var app = app || {};
var route = route || {};
app = (()=>{
	var init = x=>{
		route.init(x);
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
	};
	var setContentView=()=>{
		move("intro");
	};
	var move = x=>{
		location.href=route.$()+"/move/"+x;
	}
	return {init : init,move : move}; 
})();
route = (()=>{
	return {
				init : x => 
				{
					console.log('context is '+x);
					sessionStorage.setItem('x', x);
				}, 
				$ : ()=>{
					return sessionStorage.getItem('x');
				},
				$j : ()=>{
					return sessionStorage.getItem('x')+'/resources/js';
				},
				$c : ()=>{
					return sessionStorage.getItem('x')+'/resources/css';
				},
				$i : ()=>{
					return sessionStorage.getItem('x')+'/resources/img';
				}
				
			};
})();
	