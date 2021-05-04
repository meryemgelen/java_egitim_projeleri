<%@ page language="java" contentType="text/html; charset=ISO-8859-9" pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Birlik listesi</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Adi</th>
				<th>Mevcut</th>
				<th>�ehir</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${liste}" var="birlik">
				<tr>
					<td>${birlik.adi}</td>
					<td>${birlik.mevcut }</td>
					<td>${birlik.sehir }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>