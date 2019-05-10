<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

            <div class="card-body">
                <div class="card">
                    <div class="card-header">
                    Match History
                    </div>

                    <div class="container">
                        <div class="table-responsive">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th>Hero</th>
                                    <th>Id</th>
                                    <th>Duration</th>
                                    <th>Kills</th>
                                    <th>Deaths</th>
                                    <th>Assists</th>

                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="match" items="${matches}">
                                    <tr>
                                        <td><img src="https://api.opendota.com${match.heroImg}"></td>
                                        <td>
                                            <form action="showMatchDetail" class="form-inline">
                                                <button name="matchIdDetail" value="${match.matchId}" class="btn btn-primary">${match.matchId}</button>
                                            </form>
                                        </td>
                                        <td>${match.duration / 60}</td>
                                        <td>${match.kills}</td>
                                        <td>${match.deaths}</td>
                                        <td>${match.assists}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
