$(document).ready(function(){ //1


	$("#email").click(function(){//4
		$("#email1").css({"background-color":"#ccc"});//
		$("#email1").prop("readonly", true);
		$('#email1').val('');
			if($("#email").is(":checked")){ //3
			$("#email1").css({"background-color":"#fff"});//
			$("#email1").prop("readonly", false);
		
				
			}
	
}); 
	
	$("#email").click(function(){//4
		$("#email2").css({"background-color":"#ccc"});//
		$("#email2").prop("readonly", true);
		$('#email2').val('');
			if($("#email").is(":checked")){ //3
			$("#email2").css({"background-color":"#fff"});//
			$("#email2").prop("readonly", false);
		
				
			}
	
}); 
	
	$("#email").click(function(){//4
		$("#email_select").css({"background-color":"#ccc"});//
		$("#email_select").prop("readonly", true);
		
			if($("#email").is(":checked")){ //3
			$("#email_select").css({"background-color":"#fff"});//
			$("#email_select").prop("readonly", false);
		
				
			}
	
}); 
	
	
	
	$("#email33").click(function(){//4
		$("#sms_select").css({"background-color":"#ccc"});//
		$("#sms_select").prop("readonly", true);
		
			if($("#email33").is(":checked")){ //3
			$("#sms_select").css({"background-color":"#fff"});//
			$("#sms_select").prop("readonly", false);
		
				
			}
	
}); 
	
	
	$("#email33").click(function(){//4
		$("#input_phone02").css({"background-color":"#ccc"});//
		$("#input_phone02").prop("readonly", true);
		$('#input_phone02').val('');
			if($("#email33").is(":checked")){ //3
			$("#input_phone02").css({"background-color":"#fff"});//
			$("#input_phone02").prop("readonly", false);
		
				
			}
	
}); 
	
	$("#email33").click(function(){//4
		$("#input_phone03").css({"background-color":"#ccc"});//
		$("#input_phone03").prop("readonly", true);
		$('#input_phone03').val('');
			if($("#email33").is(":checked")){ //3
			$("#input_phone03").css({"background-color":"#fff"});//
			$("#input_phone03").prop("readonly", false);
		
				
			}
			
}); 
	
	
	
	
		
	var email_check	= /^[A-Za-z]$/;
	var phone_num_check = /^[0-9]$/;
	
	$("#btn_green").click(function(){
		if(form.question.value==""){
			alert("내용을 입력하세요");
			question.focus();
			return false;
		}
	});
//	$("#btn_green").click(function(){
//		if(form.email1.value==""){
//			alert("이메일을 입력하세요");
//			email1.focus();
//			return false;
//		}
//	});
	
//	$("#btn_green").click(function(){
//	if(!(email_check.test(form.email1.value))){
//		alert("영어만 입력 가능합니다");
//		email1.focus();
//		return false;
//	}
//	});
//	
//	$("#btn_green").click(function(){
//		if(!(email_check.test(form.email2.value))){
//			alert("영어만 입력 가능합니다");
//			email2.focus();
//			return false;
//		}
//		});
//	
//	$("#btn_green").click(function(){
//		if(!(phone_num_check.test(form.input_phone02.value))){
//			alert("숫자만 입력 가능합니다");
//			input_phone02.focus();
//			return false;
//		}
//		});
//	
//	$("#btn_green").click(function(){
//		if(!(phone_num_check.test(form.input_phone03.value))){
//			alert("숫자만 입력 가능합니다");
//			input_phone03.focus();
//			return false;
//		}
//		});
	
	
	
	
}); 


