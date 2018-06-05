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
app.board = (()=>{
	var $context, view, image;
	var onCreate =()=>{
		context = $.context();
		view = $.javascript() + '/view.js';
		image=$.image();
		setContentView();
	};
	var setContentView =()=>{
			list(1);
	};
	var list = x =>{
		    alert('작동함0')
		$.getJSON(context+'/user/board' ,function(){
		    $.getScript(view,()=>{
		    	alert('작동함1')
		    })
		});
		
	};
	
	return {onCreate: onCreate,list:list};
})()