package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.mvc.logica.Logica;

@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		String parametro=request.getParameter("logica");
		String nomeClasse="br.com.caelum.mvc.logica."  + parametro;
		
		System.out.println(parametro);
		try {
			
			Class classe=Class.forName(nomeClasse);
			Logica logica=(Logica)classe.newInstance();
			String pag=logica.executa(request, response);
			
			request.getRequestDispatcher(pag).forward(request, response);
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
