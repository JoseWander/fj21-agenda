package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class AlteraContatoLogic implements Logica {


public String executa(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	
	long id=Long.parseLong(request.getParameter("id"));
	 String nome=request.getParameter("nome");
	 String email=request.getParameter("email");
	 String endereco=request.getParameter("endereco");
	 String dataEmTexto=request.getParameter("dataNascimento");
	 
	 Calendar dataNascimento=null;
	 try {
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		dataNascimento=Calendar.getInstance();
		dataNascimento.setTime(date);
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 Contato contato=new Contato(id, nome,email,endereco,dataNascimento);
	 Connection connection=(Connection)request.getAttribute("conexao");
	 ContatoDao dao=new ContatoDao(connection);
	 dao.altera(contato);
	
	return "mvc?logica=ListaContatosLogic";
}
			 
		
	
}
