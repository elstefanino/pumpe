<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>ePumpe - ${naslov}</title>
<script>
	window.menu = '${naslov}';
	window.contextRoot = '${contextRoot}'
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/mojcss.css" rel="stylesheet">
<link href="${css}/bootstrap-tema.css" rel="stylesheet">

<!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation bar -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page content -->
		<div class="content">
			<!-- Pocetna -->
			<c:if test="${korisnikKliknePocetna == true }">
				<%@include file="pocetna.jsp"%>
			</c:if>

			<!-- kada se klikne opis -->
			<c:if test="${korisnikKlikneOpis == true }">
				<%@include file="opis.jsp"%>
			</c:if>

			<!-- kada se klikne kontakt -->
			<c:if test="${korisnikKlikneKontakt == true }">
				<%@include file="kontakt.jsp"%>
			</c:if>
			
			<!-- kada se klikne sve pumpe-->
			<c:if test="${korisnikKliknePumpe == true or korisnikKlikneGradovePumpe == true}">
				<%@include file="listaGradova.jsp"%>
			</c:if>
			
			<c:if test="${korisnikKliknePrikaziPumpa == true}">
				<%@include file="pumpa.jsp"%>
			</c:if>
		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>


		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<script src="${js}/mojaapp.js"></script>
		<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- DataTable Bootstrap Script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
	</div>
</body>

</html>
