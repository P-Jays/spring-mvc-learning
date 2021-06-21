<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>

<h2>This is ${student.firstName}</h2>
<h2>This is ${student.lastName}</h2>
<h2>This is ${student.country}</h2>
<h2>This is ${student.favLang}</h2>
<ul>  
<c:forEach var="os" items="${student.operatingSystem}">  
<li>${os}</li>  
</c:forEach>  
</ul>  
</body>
</html>