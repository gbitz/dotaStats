<%@include file="taglib.jsp"%>
<c:set var="title" value="All User Information" />
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userResultsTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Name</th>
        <th>User Name</th>
        <th>Steam Id</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.steamID}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
