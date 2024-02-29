<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/28/2024
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.nyanja.jspcrud.dao.UserDao"%>
<jsp:useBean id="u" class="com.nyanja.jspcrud.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    int i=UserDao.update(u);
    response.sendRedirect("viewusers.jsp");
%>
