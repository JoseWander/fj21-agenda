package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {


public String executa(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	return "primeira-logica.jsp";
}
			 
		
	
}
