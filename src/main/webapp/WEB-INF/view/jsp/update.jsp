<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Update ToDo </title>
</head>
<body>
<form action='/update/${ToDoObject.id}' method="POST" enctype="application/x-www-form-urlencoded" >
    <table>
        <tr><td>ToDo</td><td><input type="text" name="ToDoString" value="${ToDoObject.toDoString}"/></td></tr>
    </table>
    <button type="submit">Update ToDo</button>
</form>
</body>
</html>
