<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head><title>${parcel.lesson}</title></head>
  <body>
  <h1>${parcel.lesson}</h1>

  <%--@elvariable id="parcel" type="ch"--%>
  <form:form modelAttribute="parcel">
  <form:hidden path="id"/><pre>
      <c:import var="data"
                url="file:///C:/Users/eqein/spring-webmvc-static/src/main/res/1.txt"
                scope="session"/>

<c:out value="${data}"/>
  </form:form>

  </body>
</html>