<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {backgroud-color: powderblue;}
h1{color: blue; font-family: verdana;}
p{color: red; font-family: courier; border: 1px solid powderblue;}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<meta charset="ISO-8859-1">
<title>Sinh vien</title>
</head>
<body>
<h1>Danh sach sinh vien</h1>
<form action="/SpringMVCAnnotation/studentadmissionform1.html" method="post">
<table border="1">
<tr>
<td><p>Ma sinh vien:</p></td>
<td>
<input type="text" name="Madouong" size="20">
</td>
</tr>
<tr>
<td><p>Ten sinh vien :</p></td>
<td><input type="text" name="Nuocsx" size ="20"></td>
</tr>
<tr>
<td><p>Ngay sinh :</p></td>
<td>
<input type="text" name="Tendouong_MQuang" size="20">
</td>
</tr>
<tr>
<td><p>Gioi tinh:</p></td>
<td>
<input type="text" name="Hangsx" size="20">
</td>
</tr>
<tr>
<td><p>Diem:</p></td>
<td>
<input type="text" name="Luongcalo" size="20">
</td>
</tr>
</table>
<input type="submit" value="submit form">
</form>
</body>
</html>
