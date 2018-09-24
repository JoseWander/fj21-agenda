package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class ListaContatosLogic implements Logica {


public String executa(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	Connection connection=(Connection)request.getAttribute("conexao");
	
	ContatoDao dao=new ContatoDao(connection);
	List<Contato> contatos=dao.getLista();

	request.setAttribute("contatos", contatos);
	return "lista-contatos.jsp";
}
			 
		
	
}
