/**
 * 
 */
function loginCheck(){
	var id_check=(/(?=.*[a-z]).{2,14}$/);
	var pw_check=(/(?=.*[0-9]).{2,14}$/);
	
	if(login.id.value==""){
		alert("아이디를 입력하세요.");
		login.id.focus();
		return false;
	}
	if(!(id_check.test(login.id.value))){
		alert("아이디는 영문 소문자한글자 이상을 입력해주세요.");
		login.id.value="";
		login.id.focus();
		return false;
	}
	if(login.pw.value==""){
		alert("패스워드를 입력하세요.");
		login.pw.focus();
		return false;
	}
	if(!(pw_check.test(login.pw.value))){
		alert("패스워드는 숫자한글자 이상을 입력해주세요.");
		login.pw.value="";
		login.pw.focus();
		return false;
	}
	return login.submit();
	
}