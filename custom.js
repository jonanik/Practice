/**
 * 
 */
var id_check=(/^(?=.*[a-z]).*$/);
//var pw_check=(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*]).{2,14}$/);
var pw_check=(/^(?=.*[0-9]).*$/);
function login_check(){
	if(login.id.value==""){
		alert("아이디를 입력하세요.");
		login.id.focus();
		return false;
	}
	if(!(id_check.test(login.id.value))){
		alert("아이디는 영문 소문자와 대문자 각각 한글자 이상 입력해야합니다.");
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
		alert("비밀번호는 영문 소문자와 대문자,특수문자 각각 한글자 이상 입력해야합니다.");
		login.pw.value="";
		login.pw.focus();
		return false;
	}
	return login.submit();
}