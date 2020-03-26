/**
 * 
 */

function check(){
	
	var id_check=/^[a-zA-Z][a-zA-Z0-9]{3,14}$/; 
	var name_check=/^[가-힣]{1,}$/;
	var age_check=/^[0-9]{1,3}$/;
	//패스워드는 소문자, 대문자, 숫자,특수문자를 1개 이상은 반드시 써야한다.
	var pw_check=(/(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[`~!@#$%^&*()-_=+\|;':",<.>/?]).{4,10}$/);
	

//	if(!(id_check.test(join.j_id.value))){
//		alert("아이디는 3자리이상 문자와 숫자만 가능합니다.");
//		join.j_id.focus();
//		return false;
//	}
	
	
	if(join.j_pw.value==""){
		alert('비밀번호를 입력해주세요.');
		join.j_pw.focus();
		return false;
	}
	
	if(!(pw_check.test(join.j_pw.value))){
		alert('소문자,대문자,숫자,특수문자 각각 반드시 1개이상 포함되게 4자리 이상 입력해주세요.');
		join.j_pw.focus();
		return false;
	}
	
	
	if(!(join.j_pw.value==join.j_pw2.value)){
		alert('비밀번호가 일치하지 않습니다.');
		join.j_pw.focus();
		return false;
	}
	
	if(join.j_name.value==""){
		alert('이름을 입력해주세요.');
		join.j_name.focus();
		return false;
	}
	if(!(name_check.test(join.j_name.value))){
		alert("한글 한자리 이상 입력해주세요.");
		join.j_name.focus;
		return false;;
	}
	
	if(!(age_check.test(join.j_age.value))){
		alert("나이는 숫자1자리 이상으로 3자리 이하만 입력해주세요.")
		join.j_age.focus;
		return false;
	}
	
	return join.submit();  //form의 action으로 리턴하겠다는 것임
}