<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
    <div class="container offset-md-2 col-md-8">
        <%@include file="header.jsp"%>
        <body>

        <c:choose>
            <c:when test="${activeUser.id == null}">
                <div class="card">
                    <div class="card-header">
                        Landing Page
                    </div>
                    <div class="card-body">
                        <h5 class="card-title">DotaStats is your one spot stop for all your dota statistics</h5>
                        <p class="card-text">Please create an account to view your dota match statistics</p>
                        <a href="signup.jsp" class="btn btn-primary">Sign-up</a>
                    </div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="card">
                    <div class="card-header">
                        <img src="${userProfile.avatarfull}" alt="Profile Image">
                        <h3>${activeUser.userName}'s Summary</h3>
                    </div>
                    <div class="card-body">
                        <div class="card">
                            <div class="card-header">
                                Last Match Played
                            </div>
                            <div>
                                    ID: ${activeUser.steamID}

                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                Lifetime Averages
                            </div>
                            <div>
                                    ${activeUser.steamID}
                            </div>
                        </div>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>

        </body>
    </div>
</html>