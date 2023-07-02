<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: yanyan
  Date: 2023/7/2
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>JeffChang's Concert</title>
</head>
<body>
<h1 align="center">张信哲第11轮世界巡回演唱会 - 未来式</h1>
<p>
    <%
        List styles = (List)request.getAttribute("styles");  //从请求对象得到一个属性（就是答案）
        /* 将结果显示在网页上 */
        Iterator it = styles.iterator();
        while (it.hasNext())
            out.println(it.next() + "<br>");
    %>
</p>
</body>
</html>
