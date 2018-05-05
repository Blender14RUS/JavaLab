<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<table>
    <table>
    <thead>
        <tr>
        <th>GET</th>
        <th>POST</th>
        <th>PUT</th>
        <th>DELETE</th>
        </tr>
    </thead>
    <tr>
        <td>
            <form method="GET" action="${pageContext.request.contextPath}/index">
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text"  name="name" /></td>
                    </tr>
                </table>
                <input type="submit"  value="submit"/>
            </form>
        </td>
        <td>
            <form method="POST" action="${pageContext.request.contextPath}/index">
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text"  name="name" /></td>
                    </tr>
                </table>
                <input type="submit"  value="submit"/>
            </form>
        </td>
        <td>
            <form method="PUT" action="${pageContext.request.contextPath}/index">
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text"  name="name" /></td>
                    </tr>
                </table>
                <input type="submit"  value="submit"/>
            </form>
        </td>
        <td>
            <form method="DELETE" action="${pageContext.request.contextPath}/index">
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text"  name="name" /></td>
                    </tr>
                </table>
                <input type="submit"  value="submit"/>
            </form>
        </td>
    </tr>
    </table>

    <table>
    <tr>
        <table>
            <c:forEach items="${data}" var="data">
                <tr>
                    <td>${data}</td>
                </tr>
            </c:forEach>
        </table>
    </tr>
    </table>

</table>
</body>
</html>
