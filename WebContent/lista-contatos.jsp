<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto agenda</title>
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/style.css" rel="stylesheet">
</head>

<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<c:import url="cabecalho.jsp" />
	
	<c:if test="${empty contatos}">
		<c:redirect url="mvc?logica=ListaContatosLogic" />
	</c:if>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">count</div>
				<th scope="col">nome</div>
				<th scope="col">endereco</div>
				<th scope="col">email</div>
				<th scope="col">dataNascimento</div>
				<th scope="col"></div>
				<th scope="col"></div>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
				<td>${contato.endereco}</td>
				<td>${contato.email}</td>
				<td>
					<fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" />
				</td>

				<td>
				<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">remover</a>
				</td>
				
				<td>
				<a href="altera-contato.jsp?id=${contato.id}&nome=${contato.nome}&endereco=${contato.endereco}&email=${contato.email}&dataNascimento=<fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" />"/>alterar</a>
				</td>

			</tr>

		</c:forEach>

		<footer class="row"> </footer>
	</div>

	<c:import url="rodape.jsp" />

</body>
</html>