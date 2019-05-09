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
                    Sign-up
                </div>
                <div class="card-body">
                    <h5 class="card-title">Become a DotaStats Member</h5>
                    <p class="card-text">Please fill out the following Information</p>
                    <form action="createUser">
                        <%--<div class="form-group">--%>
                        <%--<label>First Name</label>--%>
                        <%--<input type="text" class="form-control" id="firstName" aria-describedby="emailHelp" placeholder="Enter email">--%>
                        <%--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
                        <%--</div>--%>
                        <div class="form-group">
                            <label for="userName">Username</label>
                            <input class="form-control" id="userName" placeholder="" name="userName">
                        </div>
                        <div class="form-group">
                            <label for="firstName">First Name</label>
                            <input class="form-control" id="firstName" placeholder="" name="firstName">
                        </div>
                        <div class="form-group">
                            <label for="lastName">Last Name</label>
                            <input class="form-control" id="lastName" placeholder="" name="lastName">
                        </div>
                        <div class="form-group">
                            <label class="form-check-label" for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password">
                        </div>
                        <div class="form-group">
                            <label class="form-check-label" for="confirmPassword">Confirm Password</label>
                            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
                        </div>
                        <div class="form-group">
                            <label class="form-check-label" for="steamID">Steam Friend Code</label>
                            <input class="form-control"  aria-describedby="steamIdHelp" name="steamID" id="steamID">
                            <small id="steamIdHelp" class="form-text text-muted">Found on your Dota 2 Client Profile Page</small>
                        </div>
                        <button name="createAccount" id="createAccount" value="confirm" class="btn btn-primary">Create Account</button>
                    </form>
                </div>
            </div>



        </div>
    </div>
</header>