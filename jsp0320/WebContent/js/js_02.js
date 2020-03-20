/**
 * 
 */
function valid(){
if(!(form.id.value=="admin"&&form.psw.value=="12345")){
	alert("it`wrong id or password");
	location.href="login_error.html";
	return false;
}else if(form.id.value=="admin"&&form.psw.value=="12345"){
	alert("wecome")
}
return form.submit();

}