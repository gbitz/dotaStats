<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<div class="container offset-md-2 col-md-8">
    <%@include file="header.jsp"%>
    <body>
    <div class="card">
        <div class="card-header">
            Test page
        </div>
        <div class="card-body">
            ${activeUser.id}
        </div>
    </div>
    </body>
</div>
</html>