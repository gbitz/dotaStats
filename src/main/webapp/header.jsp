<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
    <%--<div class="container">--%>
        <a class="navbar-brand js-scroll-trigger" href="#page-top">DotaStats</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="show50Matches">Match History</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="showFavoriteMatches">Match History</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="admin.jsp">Admin</a>
                </li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${activeUser.id == null}">
                        <li><a href="signup.jsp"><span class="fa fa-user-plus"></span> Sign Up </a></li>
                        <li><a href="signedIn.jsp"><span class="fa fa-sign-in"></span> Login</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="logoutUser"><span class="fa fa-sign-out"></span> Logout</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    <%--</div>--%>
</nav>