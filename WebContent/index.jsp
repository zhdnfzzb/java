<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.1.js" charset="UTF-8"></script>
<script type="text/javascript">
 <!-- $(function(){
	$.ajax({
		type:"GET",
		url:"Person3",
		dataType:"json",
		success:function(resultData){
			console.log(resultData);
		}
	}) */
})-->
</script> 
</head>
<body>
<!-- <a href="sp1/testMav2s?id=123&name=admin">点击2</a> -->
------------------------------------<br/>
------------------------------------<br/>
 <form action="sp1/param2" method="post"><br/>
 id:<input type="text" name="id"/><br/>
 name:<input type="text" name="name"/><br/>
 <input type="submit" value="提交"/>
 </form>
------------------------------------<br/>
 <!--  <form action="sp1/param3" method="get"><br/>
 id:<input type="text" name="id"/><br/>
 name:<input type="text" name="name"/><br/>
 <input type="submit" value="提交"/>
 </form>
 ------------------------------------<br/>
  <form action="sp1/param3" method="get"><br/>
 id:<input type="text" name="id"/><br/>
 name:<input type="text" name="name"/><br/>
 dog1:<input type="text" name="dog[0].dname"/><br/>
 dog2:<input type="text" name="dog[1].dname"/><br/>
 <input type="submit" value="提交"/>
 </form>
  ------------------------------------<br/>
  <form action="sp1/param4" method="get"><br/>
 id:<input type="text" name="id"/><br/>
 name:<input type="text" name="name"/><br/>
 map1:<input type="text" name="map['key1'].dname"/><br/>
map2:<input type="text" name="map['key2'].dname"/><br/>
 <input type="submit" value="提交"/>
   ------------------------------------<br/>
 <form action="sp1/param5" method="get"><br/>
 id:<input type="text" name="id"/><br/>
 name:<input type="text" name="name"/><br/>
 set1:<input type="text" name="setDog[0].dname"/><br/>
set2:<input type="text" name="setDog[1].dname"/><br/>
 <input type="submit" value="提交"/>
 </form>
    ------------------------------------<br/>
<form action="sp1/param6" method="get"><br/>
id1:<input type="checkbox" name="ids" value="1"/><br/>
id2:<input type="checkbox" name="ids" value="2"/><br/>
id3:<input type="checkbox" name="ids" value="3"/><br/>
id4:<input type="checkbox" name="ids" value="4"/><br/>
 <input type="submit" value="提交"/>
 </form>
     ------------------------------------<br/>
<form action="sp1/au4" method="get"><br/>
day:<input type="text" name="day"/><br/>
 <input type="submit" value="提交"/>
 </form>
 .......................................<br/>
 <a href="t1/Person3">点击2</a>
 <a href="Person3">点击2</a>  -->
</body>
</html>