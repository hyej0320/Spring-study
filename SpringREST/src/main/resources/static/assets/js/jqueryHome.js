console.dir($("#out"));

document.querySelector("#out").innerHTML = "힘들게 내용 추가";

$("#out").html("간단하게 내용 추가");

console.dir($(".box"));

// 선택된 요소들의 여러 가지 내용들을 쉽게 수정할 수 있다
// html() : 해당 요소의 내용 추가
$(".box").html("내용 고침");

// prop() : 해당 요소의 속성 추가
$(".box").prop("title", "마우스를 오래 올리고 있으면 나오는 설명"); // html 속성 추가 
$(".box").prop("style", "background-color: gold");

// css() : 해당 요소의 css 설정
$(".box").css("color", "white");
$(".box").css("font-size", "20px");
$(".box").css("width", "150px");
$(".box").css("height", "100px");
$(".box").css("margin", "10px");
$(".box").css("padding", "20px");

let i = 0;

$("#btn1").click((e) => {
	const ajaxSettings = {
		url: "/entity/test5",
		method: "GET",
		dataType: "json",
		success: (data, state, xhttp) => {
			// JSON.parse() 없이도 알아서 객체 형태로 변환되어 있음
			console.log("받은 데이터: ", data); 
			console.log("받은 상태코드: ", state);
			console.log("xhttp 객체: ", xhttp);
			
			// 원한다면 전통적인 방식으로 xhttp 객체를 제어할 수도 있다 
			console.log("responseText: ", xhttp.responseText); 
			console.log("responseJSON: ", xhttp.responseJSON); 
			console.log("status: ", xhttp.status); 
			console.log("statusText: ", xhttp.statusText); 
		}
	};
	$.ajax(ajaxSettings);
});