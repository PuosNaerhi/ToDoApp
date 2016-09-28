<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>ToDo App</title>
</head>
<body>

<table>
    <tr><td>id</td><td>ToDo Text</td></tr>
    <c:forEach items="${ToDoObjects}" var="ToDoObject">
        <tr>
            <td>${ToDoObject.id}</td>
            <td>${ToDoObject.toDoString}</td>
            <td><a href="<c:url value='/update/${ToDoObject.id}' />">update</a></td>
            <td><a href="<c:url value='/delete/${ToDoObject.id}' />">delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value='/create' />">Create ToDo</a>
</body>
</html>
