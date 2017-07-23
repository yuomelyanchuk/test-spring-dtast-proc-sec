<!DOCTYPE html>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="ua">
<head>

    <title>Вино</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="/static/js/bootstrap.min.js"></script>


    <c:url value="/static/css/login.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">увійдіть щоб продовжити</h1>
            <div class="account-wall">
                <img class="profile-img" src="/static/yabloko.jpg"
                     alt="">
                <form class="form-signin" action="/j_spring_security_check" method="POST">
                    <input type="text" class="form-control" placeholder="№ картки" required autofocus name="j_login">
                    <input type="password" class="form-control" placeholder="Пароль" required name="j_password">
                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        увійти</button>
                    <label class="checkbox pull-left">
                        <input type="checkbox" value="remember-me">
                        Запам'ятати мене
                    </label>
                    <a href="#" class="pull-right need-help">потрібна допомога? </a><span class="clearfix"></span>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
