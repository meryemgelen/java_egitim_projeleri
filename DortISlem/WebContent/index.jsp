<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Hesap Makinesi(D�rt ��lem)</title>
</head>
<body>

	<form action="<c:url value="/hesapla" />">
		Say� 1: <input type="text" style="background: blue;" name="sayi1"><br/>
		Say� 2: <input type="text" style="background: green;" name="sayi2"><br>
		<input type="submit" value="Topla" name="topla" />
		<input type="submit" value="��kar" name="cikar" />
		<input type="submit" value="�arp" name="carp"/>
		<input type="submit" value="B�l" name="bol"/>
	</form>
</body>
</html>