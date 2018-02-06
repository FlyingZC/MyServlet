<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> 欢迎页面 </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<h3>欢迎登录</h3>
<%=session.getAttribute("name")%>,欢迎登录！
</body>
</html>