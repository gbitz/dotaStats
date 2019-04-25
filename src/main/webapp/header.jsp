<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">DotaStats</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">page2</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">page3</a>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:choose>
                <c:when test="${activeUser.id == null}">
                    <li><a href="signup.jsp"><span class="fa fa-user-plus"></span> Sign Up </a></li>
                    <li><a href="login.jsp"><span class="fa fa-sign-in"></span> Login</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="logoutUser"><span class="fa fa-sign-out"></span> Logout</a></li>

                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>