package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {

		Connection connection=null;
		try {
			connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ContatoDao dao=new ContatoDao(connection);
		List<Contato> contatos=dao.getLista();
	
		for(Contato contato : contatos){
			System.out.println(contato);
			
		}
		
		
	}

}
