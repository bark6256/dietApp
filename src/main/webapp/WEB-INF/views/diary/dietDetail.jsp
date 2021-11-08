<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<%-- 
	<c:if test="${sessionScope.principal.id eq boardEntity.user.id}">

		<button class="btn btn-danger"
			onclick="deleteById(${boardEntity.id })">삭제</button>
		<script>
	     	async function deleteById(id){
	    		// 1. 비동기 함수 호출 -> 비동기를 잘처리하는 방법  
	     		let response = await fetch("http://localhost:8080/board/"+id, {
	    		  method: "delete"
	    	  } ); // 약속 - 어음 (10초)
	
	    	  
	    	  // 2.코드
	    	  // json() method는 json 형태의 String을 Javascript object로 convert
	    	  let parseResponse = await response.json();
	    	  console.log(parseResponse);
	  			
	    	  if(parseResponse.code == 1) {
	    		  
	    	  alert("삭제 성공");
	    	  location.href = "/";
	    	  } else {
	    	  alert(parseResponse.msg);
	    	  location.href = "/";
	    	  }
	    	  // 3.코드
	     		
	     	}
	      
	      
	      </script>
	</c:if>


 --%>

	<br /> <br />
	<div>
	작성자 : <span><i>${foodsEntity.user.username} </i></span>
	</div>
	<br />
	<div>
		<h3>${foodsEntity.mealtime }</h3>
	</div>
	<hr />
	<div>
		<div id="food">${foodsEntity.food}  ${foodsEntity.food1}  ${foodsEntity.food2}  ${foodsEntity.food3}  ${foodsEntity.food4}</div>
	</div>
	<div id = "kcal">
		<div> </div>
	</div>
	<hr />
</div>


<script>
$("#food").css({ "font-size": "200%"});
var kcal = ${foodsEntity.kcal };


function kcalWithComma(kcal) {
    return kcal.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
}
document.getElementById("kcal").innerHTML = kcalWithComma(kcal) + "kcal";

</script>


<%@ include file="../layout/footer.jsp"%>