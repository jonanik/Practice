/**
 * 
 */
function check(){
	
	if(form.id.value==""||form.psw.value==""){
		alert("please input id or password");
		form.id.focus();
		return false;
	}else{
		if(!(form.id.value=="admin")){
			alert("it`s wrong ID try again.");
			form.id.focus();
			return false;
			
		}else if(!(form.psw.value=="1234")){
			alert("it`s wrong psw ");
			form.psw.focus();
			location.href="login_error.html"
			return false;
		}
		
	}
	return form.submit();
}