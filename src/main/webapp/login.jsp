<%@include file="head.jsp"%>
<html>
<div class="container offset-md-2 col-md-8">
    <%@include file="header.jsp"%>
    <body>
    <div class="card">
        <div class="card-header">
            Sign-up
        </div>
        <div class="card-body">
            <h5 class="card-title">Sign-In to Account</h5>
            <p class="card-text">Enter Your Credentials</p>
            <form ACTION="j_security_check" METHOD="POST">

                <div class="form-group">
                    <label for="userName">Username</label>
                    <input class="form-control" id="userName" placeholder="" name="j_username">
                </div>
                <div class="form-group">
                    <label class="form-check-label" for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="j_password">
                </div>
                <button action="Submit" name="signIn" id="signIn" value="Log In" class="btn btn-primary">Sign-In</button>
            </form>
        </div>
    </div>
    </body>
</div>
</html>