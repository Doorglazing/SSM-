<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/7
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/user/paramTest">
        账号:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
<%--        出生年月:<input name="">--%>
        用户名:<input name="lists[0].name" type="text"><br>
        出生年月:<input name = "lists[0].birthDay" type="test"><br>
        用户名:<input name="maps['first'].name" type="text"><br>
        出生年月:<input name = "maps['first'].birthDay" type="test"><br>
        用户名:<input name="maps['sec'].name" type="text"><br>
        出生年月:<input name = "maps['sec'].birthDay" type="test"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
