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

            <div class="card-body">
                <div class="card">
                    <div class="card-header">
                        Match Details
<<<<<<< HEAD

                        <form action="saveMatch">
                            <button class="btn btn-primary" value="${generalDetail.matchId}" name="saveMatch">Add To Favorites</button>
                            <span style="color:rgba(254,0,0,0.62);">${successMessage}</span>
                        </form>
=======
>>>>>>> 674a118aeb9dd668b7a9af5019dd0d64edd7b5f6
                    </div>

                    <div class="card">
                        <div class="card-body">
                            <table>
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Duration</th>
                                        <th>Winner</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>${generalDetail.matchId}</td>
                                        <td>${generalDetail.duration}</td>
                                        <td><c:choose>
                                            <c:when test="${generalDetail.radiantWin == true}">
                                                Radiant
                                            </c:when>
                                            <c:otherwise>
                                                Dire
                                            </c:otherwise>
                                        </c:choose></td>

                                    </tr>
                                </tbody>
                            </table>
                            Id #${generalDetail.matchId}
                        </div>

                    </div>

                    <div class="card">
                        <div class="card-body">
                            <div class="card-header">
                                Radiant
                            </div>
                            <div class="container">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>Hero</th>
                                            <th>Player Name</th>
                                            <th>Kills</th>
                                            <th>Deaths</th>
                                            <th>Assists</th>
                                            <th>Gold/Min</th>
                                            <th>XP/Min</th>
                                            <th>Gold Total</th>
                                            <th>Hero Damage</th>
                                            <th>Tower Damage</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="radiantPlayer" items="${radiant}">
                                        <tr>
                                            <td><img class="heroImg" style="width: 40%; height: auto;" src="https://api.opendota.com${radiantPlayer.heroImg}"></td>
                                            <td>${radiantPlayer.personaname}</td>
                                            <td>${radiantPlayer.kills}</td>
                                            <td>${radiantPlayer.deaths}</td>
                                            <td>${radiantPlayer.assists}</td>
                                            <td>${radiantPlayer.goldPerMin}</td>
                                            <td>${radiantPlayer.xpPerMin}</td>
                                            <td>${radiantPlayer.totalGold}</td>
                                            <td>${radiantPlayer.heroDamage}</td>
                                            <td>${radiantPlayer.towerDamage}</td>
                                        </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-body">
                            <div class="card-header">
                                Dire
                            </div>
                            <div class="container">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>Hero</th>
                                            <th>Player Name</th>
                                            <th>Kills</th>
                                            <th>Deaths</th>
                                            <th>Assists</th>
                                            <th>Gold/Min</th>
                                            <th>XP/Min</th>
                                            <th>Gold Total</th>
                                            <th>Hero Damage</th>
                                            <th>Tower Damage</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="direPlayer" items="${dire}">
                                            <tr>
                                                <td><img class="heroImg" style="width: 40%; height: auto;" src="https://api.opendota.com${direPlayer.heroImg}"></td>
                                                <td>${direPlayer.personaname}</td>
                                                <td>${direPlayer.kills}</td>
                                                <td>${direPlayer.deaths}</td>
                                                <td>${direPlayer.assists}</td>
                                                <td>${direPlayer.goldPerMin}</td>
                                                <td>${direPlayer.xpPerMin}</td>
                                                <td>${direPlayer.totalGold}</td>
                                                <td>${direPlayer.heroDamage}</td>
                                                <td>${direPlayer.towerDamage}</td>
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
        </div>
    </div>
</header>