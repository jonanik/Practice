/**
 * 
 */


function check() {
	if(form.id.value==""||form.psw.value==""){
		alert("input PassWord or ID");
		form.id.focus();
		return false;
	}else{
		if(!(form.id.value=="admin")){
			alert("it`s wrong ID try again");
			form.id.focus();
			return false;
		}else if(!(form.psw.value=="1234")){
			alert("it`s wrong PassWord try again");
			form.psw.focus();
			return false;
		}
	}
	return form.submit();
}

//function check(){
//	 if(form.id.value==""){
//	  alert('아이디를 입력해주세요.');
//	  form.id.focus();
//	  return false;
//	 }
//	 if(!(form.id.value=="admin")){
//	  alert('아이디가 틀렸습니다. 다시 입력해주세요.');
//	  form.id.focus();
//	  return false;
//	 }
//
//	 if(form.pw.value==""){
//	  alert('패스워드를 입력해주세요.');
//	  form.pw.focus();
//	  return false;
//	 }
//	 
//	 if(!(form.pw.value=="12345")){
//	  alert('패스워드가 잘못 입력되었습니다.');
//	  form.pw.focus();
//	  return false;
//	 }
//	 
//	 return form.submit();
//	 
//	}