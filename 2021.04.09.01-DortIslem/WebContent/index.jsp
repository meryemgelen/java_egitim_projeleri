<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
 <%@ taglib="prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Dort Islem</title>
</head>
<body>
<form action="<c:url  value="/hesapla"/>">

Say� 1:<input type="text" name="sayi1"/></br>
Say� 2:<input type="text" name="sayi2"/></br>
<input type="submit" name="topla" value="Topla"/>
<input type="submit" name="cikar" value="Cikar"/>
<input type="submit" name="carp" value="�arp"/>
<input type="submit" name="bol" value="B�l"/>
</form>
</body>
</html>