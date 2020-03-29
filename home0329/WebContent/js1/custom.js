$(document).ready(function() {
	$(".ans").hide();
	$("#showAns").click(function(){
		$("#ans1").show();
	});
	$("#ans1").click(function(){
		$(this).hide();
	})
	$("#showAns1").click(function(){
		$("#ans2").show();
	});
	$("#ans2").click(function(){
		$(this).hide();
	})
	
	
});
