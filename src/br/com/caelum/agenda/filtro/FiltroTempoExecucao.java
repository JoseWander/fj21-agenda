package br.com.caelum.agenda.filtro;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class FiltroTempoExecucao implements javax.servlet.Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		long tempoIni=System.currentTimeMillis();
		
		chain.doFilter(request,response);
		
		long tempoFinal=System.currentTimeMillis();
		
		String uri= ((HttpServletRequest)request).getRequestURI();
		
		String par=((HttpServletRequest)request).getParameter("logica" );
		
		System.out.println("Tempo de " + uri + "?logica=" +  par + " demorou " + (tempoFinal - tempoIni));
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
