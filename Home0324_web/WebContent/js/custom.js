/**
 * 
 */
var arr=[];
	
function input(){//값 입력
	for(var i=0; i<45;i++){
		arr[i]=i+1;
	}
}
function print(){//값 출력
	for(var i=0; i<arr.length;i++){
		document.write("Data: "+arr[i]+" "+"  ");
		if((i+1)%5==0){
			document.write("<br>");
		}
	}
}
function add(){//홀수번째 열값의  합
	var sum=0;
	for(var i=2; i<arr.length;i++){
		if(i%2==1){
			sum+=arr[i];
			document.write((i)+"th result: "+sum+"<br>")
		}
	}
	document.write("total of oddNum:"+sum+" ");
	
}
function add2(){
	var sum=0;
	for(var i=0; i<arr.length;i++){
		if(i%2==0){
			sum+=arr[i];
		}
	}
	document.write("total of EvenNum:"+sum+" ");
}
