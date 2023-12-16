<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        h2,img,label{display:inline-block;}
        label{width:130px}
        button{background-color:blue;color:white;font-size:15px}
        h2{
            display:block;
            border: solid 2px lightskyblue;
            background-color: #006bb3;
            color: white;
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            font-weight: bold;
        }
        #block{
            display: block;

            border: solid 2px black;
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div style ='width:100%;text-align:center;padding-top:100px'>
    <div><h2>로그인이 필요한 서비스입니다.</h2></div>
<%--    <img src='../resources/img/Puppycat.jpeg' height="250">--%>
    <form id="block" method='post' action='loginOk'>
        <div><label>User ID:</label><input type='text' name='userid'/></div>
        <div><label>Password: </label><input type='password' name='password' /></div>
        <button type='submit'>login</button>
    </form>
</div>
</body>
</html>

