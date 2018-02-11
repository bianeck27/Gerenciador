<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Busca Empresa</title>
	</head>
	<body>
		<h1>Resultado da busca: </h1>
		<ul> 
			<c:forEach var="empresa" items="${empresas}">
					<li>${empresa.id}: ${empresa.nome}</li>
			</c:forEach>
		</ul>
</body>
</html> 