/**
 * 
 */

$(function(){
	$("#submit2").click(function(){
		var idKor = /^[가-힣]{1,}$/;
		var idAll = /[a-zA-Z가-힣0-9]$/;
		var idAge = /^[0-9]{1,3}$/;
		var idSpc = /^[a-z~!@#$%^&*()_+|<>?]{1,}$/;
		var pwCheck = (/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{3,16}$/);
		
		if(!idKor.test($("#name").val())){
			alert("name");
			return;
		}
		
		if(!idAll.test($("#id").val())){
			alert("id");
			return;
		}
		
		if(!pwCheck.test($("#pw").val())){
			alert("pw");
			return;
		}
	});
});