/**
 * 
 */

name_check = /^[가-힣]{1,}$/;
		num_check = /^[0-9]{1,4}$/;
		
		var numa = form.num1.value;
		var numb = form.num2.value;
		var numc = form.num3.value;
		var numd = form.num4.value;

		function check() {
			if (!(name_check.test(form.name.value))) {
				alert("한글 1자 이상 입력해주세요.");
				form.name.focus();
				return false;
			}
			if (!(num_check.test(form.num1.value))) {
				alert("숫자 1자 이상 입력해주세요.");
				form.num1.focus();
				return false;
			}

		}
		
		var total=add(numa,numb,numc,numd);
		var total2=multi(numa,numb,numc,numd);
		
		document.write("숫자 4개 합:"+total+"<br>");
		document.write("숫자 4개 곱:"+total2+"<br>");
		
		function add(a,b,c,d){
			return a+b+c+d;
		}
		function multi(a,b,c,d){
			return a*b*c*d;
		}