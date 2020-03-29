$(document).ready(function(){
	var count=0;
	
	$("#div1").mouseenter(function(){
		$("p:first").text("mouseEnter Count")
		$("p:last").text(count++);
	})
	$("#div1").mouseleave(function(){
		$("p:first").text("mouse out");
		$("p:last",this).text("final count:"+n);
	})
});