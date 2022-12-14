<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table, th, td {
  border: 3px solid black;
  border-collapse: collapse;
}
</style>
<title>getUserDataByLoginId</title>
<script>
/* var arr = ${lanid2};
for(list in arr)
	{
	console.log(list);
	} */
</script>
</head>
<body>
getUserDataByLoginId pages <br> <br>
<%-- ${lanid2} --%>
 
<br><br>
 
    
  <table>    
	    <tr>
	    	<th>lan id</th> 
	    	<th>emailid</td>
	    </tr>    
    <c:forEach items="${lanid2}" var="module">    
	    <tr >
	    	 <td> ${module.lanid}</td> 
	    	 <td> ${module.emailid}</td>
	    </tr>
	</c:forEach>
 	
 </table>

<br><br>

<%-- <c:if test="${not empty lanid2}"> --%>
<%--     <c:forEach items="${lanid2}" var="lists"> --%>
<%--        ${lists} --%>
<%-- </c:forEach> --%>
<%-- </c:if> --%>



</body>
</html>