<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<%--<html>--%>
    <%--<style>--%>
        <%--.heroImg {--%>
            <%--border: 1px solid #ddd;--%>
            <%--border-radius: 4px;--%>
            <%--padding: 5px;--%>
            <%--width: 150px;--%>
        <%--}--%>
    <%--</style>--%>
    <%--<div class="container offset-md-2 col-md-8">--%>
        <%--<bodyid="page-top">--%>
        <%--<%@include file="header.jsp"%>--%>

        <%--<c:choose>--%>
            <%--<c:when test="${activeUser.id == null}">--%>
                <%--<div class="card">--%>
                    <%--<div class="card-header">--%>
                        <%--Landing Page--%>
                    <%--</div>--%>
                    <%--<div class="card-body">--%>
                        <%--<h5 class="card-title">DotaStats is your one spot stop for all your dota statistics</h5>--%>
                        <%--<p class="card-text">Please create an account to view your dota match statistics</p>--%>
                        <%--<a href="signup.jsp" class="btn btn-primary">Sign-up</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <%--<div class="card">--%>
                    <%--<div class="card-header">--%>
                        <%--<img src="${userProfile.avatarfull}" alt="Profile Image">--%>
                        <%--<h3>${activeUser.userName}'s Summary</h3>--%>
                        <%--<h3>MMR : ${userRank}</h3>--%>

                    <%--</div>--%>
                    <%--<div class="card-body">--%>
                        <%--<div class="card">--%>
                            <%--<div class="card-header">--%>
                                <%--Last Match Played--%>
                            <%--</div>--%>
                            <%--<div class="container">--%>
                                <%--<div class="table-responsive">--%>
                                    <%--<table class="table">--%>
                                        <%--<thead>--%>
                                        <%--<tr>--%>
                                            <%--<th>Hero</th>--%>
                                            <%--<th>Match ID</th>--%>
                                            <%--<th>Duration (Min)</th>--%>
                                            <%--<th>Kills</th>--%>
                                            <%--<th>Deaths</th>--%>
                                            <%--<th>Assists</th>--%>
                                        <%--</tr>--%>
                                        <%--</thead>--%>
                                        <%--<tbody>--%>
                                        <%--<tr>--%>
                                            <%--<td><img class="heroImg" size="50%" src="https://api.opendota.com${lastMatchHero.img}"></td>--%>
                                            <%--<td>${matchHistory.get(0).matchId}</td>--%>
                                            <%--<td>${matchHistory.get(0).duration / 60}</td>--%>
                                            <%--<td>${matchHistory.get(0).kills}</td>--%>
                                            <%--<td>${matchHistory.get(0).deaths}</td>--%>
                                            <%--<td>${matchHistory.get(0).assists}</td>--%>
                                        <%--</tr>--%>
                                        <%--</tbody>--%>
                                    <%--</table>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="card">--%>
                            <%--<div class="card-header">--%>
                                <%--Lifetime Averages--%>
                            <%--</div>--%>
                            <%--<div>--%>
                                    <%--${activeUser.steamID}--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>

        <%--</body>--%>
    <%--</div>--%>
<%--</html>--%>
<%@include file="header.jsp"%>
<style>
    #linkButton {
        background: none !important;
        color: inherit;
        border: none;
        padding: 0 !important;
        font: inherit;
        /*border is optional*/
        border-bottom: 1px solid #444;
        cursor: pointer;
    }
</style>
<!-- Masthead -->
<header class="masthead">
    <div class="container h-100">
        <div class="row h-100 align-items-center justify-content-center text-center">
            <div class="col-lg-10 align-self-end">
                <h1 class="text-uppercase text-white font-weight-bold">DotaStats</h1>
                <hr class="divider my-4">
            </div>
            <c:choose>
                <c:when test="${activeUser.id == null}">
                    <div class="col-lg-8 align-self-baseline">
                        <p class="text-white-75 font-weight-light mb-5">Your one spot stop for all your dota statistics</p>
                        <a class="btn btn-primary btn-xl js-scroll-trigger" href="signup.jsp">Sign-up</a>
                        <a class="btn btn-primary btn-xl js-scroll-trigger" href="signedIn.jsp">Sign-in</a>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="card">
                        <div class="card-header">
                            <img src="${userProfile.avatarfull}" alt="Profile Image">
                            <h3>${activeUser.userName}'s Summary</h3>
                            <h3>MMR : ${userRank}</h3>

                        </div>
                        <div class="card-body">
                            <div class="card">
                                <div class="card-header">
                                    Last Match Played
                                </div>
                                <div class="container">
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                            <tr>
                                                <th>Hero</th>
                                                <th>Match ID</th>
                                                <th>Duration (Min)</th>
                                                <th>Kills</th>
                                                <th>Deaths</th>
                                                <th>Assists</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td><img class="heroImg" size="50%" src="https://api.opendota.com${lastMatchHero.img}"></td>
                                                <td>
                                                    <form action="showMatchDetail" class="form-inline">
                                                        <button name="matchIdDetail" value="${matchHistory.get(0).matchId}" class="btn btn-primary">${matchHistory.get(0).matchId}</button>
                                                    </form>
                                                </td>
                                                <td>${matchHistory.get(0).duration / 60}</td>
                                                <td>${matchHistory.get(0).kills}</td>
                                                <td>${matchHistory.get(0).deaths}</td>
                                                <td>${matchHistory.get(0).assists}</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
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


        </div>
    </div>
</header>