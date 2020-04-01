$(document).ready(function(){
	$("#add").click(function(){
		$("h1,h2,p").addClass("style");
		$("div").addClass("div");
	})
	$("#delete").click(function(){
		$("h1,h2,p").removeClass("style");
		$("div").removeClass("div");
	})
	
});