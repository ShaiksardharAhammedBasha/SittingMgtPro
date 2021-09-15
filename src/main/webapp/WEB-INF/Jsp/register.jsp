<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="registerForm" modelAttribute="registerForm"
		, method="POST" align="center">

		Enter Your FirstName: <input type="text" name="firstName"> <br>
		Enter Your LastName: <input type="text" name="lastName"> <br>
		Enter Your Email : <input type="text" name="email"> <br>
		Enter Your Password: <input type="text" name="password"> <br>
		Enter Your Phone : <input type="text" name="phone"> <br>
		Enter Your Address : <input type="text" name="address"> <br>

		Select Your Country: <label for="country">Choose a car:</label> <select
			name="country" id="cars">
			<option value="INDIA">INDIA</option>
			<option value="saab">Saab</option>
			<option value="mercedes">Mercedes</option>
			<option value="audi">Audi</option>
		</select> 
		
		<label for="state">Choose a state:</label> <select name="state" id="state">
			<option value="volvo">KAR</option>
			<option value="saab">MUM</option>
			<option value="mercedes">Mercedes</option>
			<option value="audi">Audi</option>
		</select>
		
		<label for="city">Choose a city:</label> <select name="city" id="city">
			<option value="volvo">BANG</option>
			<option value="saab">HYD</option>
			<option value="mercedes">Mercedes</option>
			<option value="audi">Audi</option>
		</select> 
		
		<input type="submit" value="REGISTER">
</body>
</html>








