$(document).ready(function(){
	$(".pdetail").hide();
	$("#product1").click(function(){
		if($(this).is(":checked")){
			$('#product1check').show();
		}else if(!($(this).is(":checked"))){
			$('#product1check').hide();
		}
	});
	$("#product2").click(function(){
		if($(this).is(":checked")){
			$('#product2check').show();
		}else if(!($(this).is(":checked"))){
			$('#product2check').hide();
		}
	});
	$("#product3").click(function(){
		if($(this).is(":checked")){
			$('#product3check').show();
		}else if(!($(this).is(":checked"))){
			$('#product3check').hide();
		}
	});
	$("#product4").click(function(){
		if($(this).is(":checked")){
			$('#product4check').show();
		}else if(!($(this).is(":checked"))){
			$('#product4check').hide();
		}
	});
	$("#product5").click(function(){
		if($(this).is(":checked")){
			$('#product5check').show();
		}else if(!($(this).is(":checked"))){
			$('#productcheck').hide();
		}
	});
	
	
});