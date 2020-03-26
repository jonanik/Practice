$(document).ready(function(){
	$(".serve").hide();
	$("#prd1").click(function(){
		if($(this).is(":checked")){
			$("#service1").show();
		}else if((!$(this).is(":checked"))){
			$("#service1").hide();
		}
		
	})
	$("#prd2").click(function(){
		if($(this).is(":checked")){
			$("#service2").show();
		}else if((!$(this).is(":checked"))){
			$("#service2").hide();
		}
		
	})
	$("#prd3").click(function(){
		if($(this).is(":checked")){
			$("#service3").show();
		}else if((!$(this).is(":checked"))){
			$("#service3").hide();
		}
		
	})
	$("#prd4").click(function(){
		if($(this).is(":checked")){
			$("#service4").show();
		}else if((!$(this).is(":checked"))){
			$("#service4").hide();
		}
		
	})
	$("#prd5").click(function(){
		if($(this).is(":checked")){
			$("#service5").show();
		}else if((!$(this).is(":checked"))){
			$("#service5").hide();
		}
		
	})
})