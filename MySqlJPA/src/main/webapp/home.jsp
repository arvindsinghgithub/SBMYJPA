<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<br></br>
<h1>Spring Boot + Web + Data JPA + MVC +Mysql +JSON </h1>
<br><b>URL:</b>   http://localhost:8080/home  <br>

	<form action="addusers">
	  Insert data in table.<br>
	  lan id    <input type="text" name="lanid"/>
	  email id	<input type="text" name="emailid"/>
      <input type="submit" value="sumit form">
	</form> 

	<form action="getUserData"> <br>
		View data by ID	<br>	
		Lan ID <input type="text" name="lanid">
			   <input type="submit">		
	</form>
	
	<form action="getUserDataByLoginId">
		<br> show all data <br>
		
		Lan ID 	<input type="text" name="lanid">
				<input type="submit">
	</form>

<br><h2>Spring Boot | Data JPA | MVC | MySql | Query Methods Example</h2>

<form action="findByEmailID">
Lan ID <input type="text" name="lanid">
	<input type="submit">
</form>
<br><h2>Spring Boot | Data JPA | MVC | MySql | REST  Example</h2>
<h3>test it by --> <a href="http://localhost:8080/restDataAll">http://localhost:8080/restDataAll</a>  and http://localhost:8080/restDataById/101 </h3>
<br><h2>Spring Boot | Data JPA | MVC | MySql | REST with JSON formate data Example</h2>
<h3>test it by --> http://localhost:8080/restJSONDataAll  and   http://localhost:8080/restJSONDataById/101</h3>

<br><h2>Spring Boot | Data JPA | MVC | MySql | REST API with JSON + Postman Example</h2>
<br> <h5>install postman and use the same above mentioned url i.e.</h5>
<h3>test it by --> http://localhost:8080/restJSONDataAll  and   http://localhost:8080/restJSONDataById/101</h3>

<br><h2>Spring Boot | Data JPA | MVC | MySql | REST API with JSON + Postman with Content Negotiation </h2>
-->Content Negotiation: by default support JSON but we can allow with these steps
-->postman->header->key=accept -->value-->application/xml, application/xml
-->maven-><!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml -->
-->restrict xml/json from postman-see code in controller

<br><h2>Spring Boot | Data JPA | MVC | MySql | REST API with JSON + Postman with Content Negotiation+ Rest POST </h2>












</body>
</html>