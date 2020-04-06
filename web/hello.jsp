<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Java Web - laboratorium 4</title>
</head>
<body>
<h1>Witaj, <c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/>!</h1>
<a href="mailto:<c:out value="${person.email}"/>">Mail</a>

<c:forEach items="${dniTygodnia}" var="dzien">
    <p>
            ${dzien}
    </p>
</c:forEach>
</body>
</html>