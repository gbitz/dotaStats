<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/5/19
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<div class="container offset-md-2 col-md-8">
    <%@include file="header.jsp"%>
    <body>
            <div class="card">
                <div class="card-header">
                    Admin
                </div>
                <div class="card-body">
                    <c:choose>

                    <c:when test="${users == null}" >
                    <form action="userSearch" class="form-inline">
                        <div class="form-group">
                            <label for="userName">Username</label>
                            <input class="form-control" id="userName" placeholder="" name="userName">
                        </div>
                        <button type="submit" name="submit" value="searchUsers" class="btn btn-primary">Search By Username</button>
                        <button type="submit" name="submit" value="displayUsers" class="btn btn-primary">View all users</button>
                    </form>
                    </c:when>
                    <c:otherwise>

                        <div class="card">
                            <div class="card-header">
                                Users
                            </div>
                            <div class="container">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <th>Name</th>
                                        <th>User Name</th>
                                        <th>Steam Id</th>
                                        </thead>
                                        <c:set var="admins" value="${admins}"></c:set>
                                        <c:forEach var="user" items="${users}">
                                        <tr>
                                            <td>${user.firstName} ${user.lastName}</td>
                                            <td>${user.userName}</td>
                                            <td>${user.steamID}</td>
                                            <td>${user.steamID}</td>
                                            <form action="createAdmin">
                                                <input hidden name="newAdminName" value="${user.userName}">
                                                <input hidden name="newAdminUser" value="${user}">
                                                <td><button name="createAdmin" value="createAdmin" action="CreateAdmin">Make Admin</button></td>
                                            </form>
                                            <form action="deleteUser">
                                                <input hidden value="${user.userName}">
                                                <td><button name="deleteUser" value="deleteUser" action="DeleteUser">Delete User</button></td>
                                            </form>
                                        </tr>
                                        </c:forEach>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </c:otherwise>
                    </c:choose>
                </div>
            </div>
    </body>
</div>
<body>

</body>
</html>
