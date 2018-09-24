<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto agenda</title>
  <link rel="stylesheet" href="css/jquery.css">
  <script src="js/jquery.js"></script>
  <script src="js/jquery-ui.js"></script>
<script  src="js/datepicker-pt-BR.js"></script>

</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>  

<c:import url="cabecalho.jsp" />

<form action="mvc">
Id <input type="text" name="id" readonly="readonly" value="${param.id}"/><br/>
Nome <input type="text" name="nome" value="${param.nome}"/><br/>
Email <input type="text" name="email"value="${param.email}" /><br/>
Endereco <input type="text" name="endereco" value="${param.endereco}" /><br/>
Data <input type="text"  name="dataNascimento" value="${param.dataNascimento}" /><br/>

 <input type="submit" name="Gravar"/><br/>
 <input type="hidden" name="logica" value="AlteraContatoLogic" />  
</form>

<c:import url="rodape.jsp" />

</body>
</html>