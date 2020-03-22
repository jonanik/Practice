/**
 * 
 */
function check(){
if(form.id.value==""){
	alert("input ID");
	form.id.focus();
	return false;
}
if(!(form.id.value=="admin")){
	alert("wrong Id try again");
	form.id.focus();
	return false;
}
if(form.psw.value==""){
	alert("input PSW");
	form.psw.focus();
	return false;
}
if(!(form.psw.value=="12345")){
	alert("wrong PSW try again");
	form.psw.focus();
	return false;
}
return form.submit()

}

//function check(){
//var id = admin;
//var pw=12345;
//if (id == form.id.value) {
//	pw = prompt('please input password')
//	if (pw == form.psw.value) {
//		alert('you are login. nice to meet you');
//		location.href = "login_ok.html";
//
//	} else {
//		alert('password is wrong');
//		location.href = "login_error.html";
//	}
//} else {
//	alert('id isn`t match');
//	location.href = "login_error.html";
//}
//}
