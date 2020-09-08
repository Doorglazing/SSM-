<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<a href="/account/findAll">查询所有</a>
<form action="/account/insert" method="post">
    <input type="text" name ="name">
    <input type="text" name="money">
    <input type="submit" value="保存">
</form>
</html>
