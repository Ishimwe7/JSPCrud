<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/28/2024
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.nyanja.jspcrud.dao.UserDao"%>
<jsp:useBean id="u" class="com.nyanja.jspcrud.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    UserDao.delete(u);
    response.sendRedirect("viewusers.jsp");
%>
