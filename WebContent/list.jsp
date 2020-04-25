<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resource/css/css.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/axios.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
// 	alert(123);
});

function add(){
	location="toAdd";
}

function del(empid){
// 	alert(empid);
	//{}-->json
	$.ajax({
		url: "del",
		data: {"empid": empid},
		success: function(res){
// 			alert(res);
			if(res=="success"){
				location="list";
			}
		}
	});
}

</script>
</head>
<body>

<form action="list" method="post">
电影名称,empname: <input type="text" name="empname" value="${empname }">
<input type="submit" value="查询">
</form>
<br>
<table>
<tr>
   <td></td>
   <td>empid</td>
    <td>empname</td>
    <td>empdesc</td>
    <td>departid</td>
    <td>jobid</td>
<!--     <td>shengid</td> -->
<!--     <td>shiid</td> -->
<!--     <td>xianid</td> -->
    <td>age</td>
    <td>sex</td>
    <td>birth</td>
  <td>
     <input type="button" value="添加" onclick="add()">
  </td>
</tr>

<c:forEach items="${empList }" var="m">
<tr>
	<td>
		<input type="checkbox" name="ck" value="${m.empid }" />
	</td>
	<td>${m.empid }</td>
	<td>${m.empname }</td>
	<td>${m.empdesc }</td>
	<td>${m.departid }</td>
	<td>${m.jobid }</td>
	<td>${m.age }</td>
	<td>${m.sex }</td>
	<td>${m.birth }</td>
	<td><input type="button" value="del"  onclick="del(${m.empid})" /> </td>
</tr>
</c:forEach>
<tr>
<td colspan="13"> ${fenye } </td>
</tr>
</table>

</body>
</html>