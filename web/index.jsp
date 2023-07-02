<%--
  Created by IntelliJ IDEA.
  User: yanyan
  Date: 2023/7/1
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--  <head>--%>
<%--    <title>第一个tomcat</title>--%>
<%--  </head>--%>
<%--  <body>--%>
<%--  Hello,world!--%>

<%--  </body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>JeffChang's Concert</title>
</head>

<body>
<h1 align="center">Welcome to JeffChang's Concert Page!</h1>
<h2 align="center">Year Select Page</h2>
<form method="POST" action="query.do">   <!-- action即当用户提交这个表单时，将传递给url名为query.do的servlet -->
  Select year:
  <p>
    <!-- 创建一个下拉菜单-->
    <select name="year" size="1">
      <option value="2018"> 2018 </option>
      <option value="2019"> 2019 </option>
      <option value="2020"> 2020 </option>
    </select>
    <br><br>
  <div style="text-align: center;">
    <input type="SUBMIT">
  </div>
</form>
</body>

</html>
