<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<%@include file="header.jsp"%>

<!-- Masthead -->
<header class="masthead">
    <div class="container h-100">
        <div class="row h-100 align-items-center justify-content-center text-center">

            <div class="card">
                <div class="card-header">
                    DotaStats
                </div>
                <div class="card-body">
                    <h5 class="card-title">Edit Dota Friend Id</h5>
                    <p class="card-text">Your New ID</p>
                    <form action="editUser" method="post">
                        <div class="form-group">
                            <label class="form-check-label" for="steamID">Current Id</label>
                            <input readonly class="form-control" placeholder="${activeUser.steamID}" name="currentId" id="currentId">

                            <label class="form-check-label" for="steamID">Dota Friend ID</label>
                            <input class="form-control" placeholder="${activeUser.steamID}" aria-describedby="steamIdHelp" name="steamID" id="steamID">
                            <small id="steamIdHelp" class="form-text text-muted">Found on your Dota 2 Client Profile Page</small>
                        </div>
                        <button name="editAccount" id="editAccount" value="confirm" class="btn btn-primary">Update Account Information</button>
                    </form>
                </div>
            </div>



        </div>
    </div>
</header>