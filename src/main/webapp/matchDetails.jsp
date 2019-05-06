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
<%@include file="header.jsp"%>

<!-- Masthead -->
<header class="masthead">
    <div class="container h-100">
        <div class="row h-100 align-items-center justify-content-center text-center">
            <div class="col-lg-10 align-self-end">
                <h1 class="text-uppercase text-white font-weight-bold">Match Details</h1>
                <hr class="divider my-4">
            </div>
            <div class="card">
                <div class="card-header">
                    Match Details
                </div>
                <div class="card-body">
                    <c:forEach var="player" items="${players}">
                        ${player.personaname}
                    </c:forEach>

                </div>
            </div>
        </div>
    </div>
</header>