<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
    <title> findByName</title>
</head>
<body>
<table class="table table-hover " width="500px">
  <thead>
  <tr id="listShopView">
    <th>ID</th>
    <th>Name</th>
    <th>Local</th>
    <th>Email</th>
  </tr>
  </thead>

  <c:forEach var="listShops" items="${listShops}">
    <tbody>
    <tr>
      <td>${listShops.id}</td>
      <td>${listShops.name}</td>
      <td>${listShops.local}</td>
      <td>${listShops.email}</td>
    </tr>
    </tbody>
  </c:forEach>
</table>

</body>
</html>
