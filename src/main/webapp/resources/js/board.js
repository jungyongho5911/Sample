var app = app || {};
app = (()=>{
	var init = x =>{
	    $.getScript(x+'/resources/js/router.js',()=>{
	        $.extend(new Router(x));
	        app.board.onCreate($.context());
	    })
	};
	return {init:init};
})();
app.board =(x=>{
	var $context, view, image;
	var onCreate =()=>{
		context = $.context();
		view = $.javascript() + '/view.js';
		image=$.image();
		setContentView();
	};
	var setContentView =()=>{

	};
	
	return {onCreate: onCreate};
})();