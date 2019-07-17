<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>List of lessons</title></head>
  <body>
  <h1>List of lessons</h1>
  <ul>
    <c:forEach items="${parcels}" var="parcel">
      <li><a href="/packages/${parcel.id}">&nbsp;<b>${parcel.id}</b> Lesson:&nbsp;<b>${parcel.lesson}</b></a>
    </c:forEach>
  </ul>
  </body>
</html>