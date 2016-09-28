<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Create ToDo</title>
</head>
<body>
<form action="create" method="POST" enctype="application/x-www-form-urlencoded" >
    <table>
        <tr><td>ToDo</td><td><input type="text" name="ToDoString" /></td></tr>

    </table>
    <button type="submit">New ToDo</button>
</form>

</body>
</html>
