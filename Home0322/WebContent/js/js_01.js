/**
 * 
 */

function check(){
	if(form.id.value==""||form.psw.value==""){
		alert("please input your id or password");
		form.id.focus();
		return false;
	}else if(!(form.id.value=="admin"&&form.psw.value=="1234")){
		alert("ID or PassWord is wrong check agian")
		form.id.focus();
		return false;
	}else if(form.id.value=="admin"&&form.psw.value=="1234"){
		
		return form.submit();
	}
}