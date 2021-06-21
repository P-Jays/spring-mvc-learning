<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>

<form:form action="processform" modelAttribute="student">
First name: <form:input path="firstName"/>

<br><br>

Last Name: <form:input path="lastName"/>
<input type="submit" value="Submit"/>
<br><br>
Country:

<form:select path="country">
<form:options items="${student.countryList}"></form:options>
</form:select>



  <br><br>  
        Favorite Language:  
        Java <form:radiobutton path="favLang" value="Java"/>  
        Python <form:radiobutton path="favLang" value="Python"/> 
        JS <form:radiobutton path="favLang" value="JS"/> 
        <br><br>  

   <br><br>  
        OS:  
        Windows<form:checkbox path="operatingSystem" value="Windows"/>  
        Mac<form:checkbox path="operatingSystem" value="Mac"/>  
        Linux<form:checkbox path="operatingSystem" value="Linux"/>  
        <br><br>  
</form:form>

</body>
</html>