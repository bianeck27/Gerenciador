package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/executa")//define a url como fazTudo
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		String tarefa = req.getParameter("tarefa");//pega a tarefa digitada como parametro no navegador
		//se a tarefa não for passada, gera uma Exception
		if (tarefa == null) throw new IllegalArgumentException("Voce esqueceud e passar a tarefa");
		
		//concatena a tarefa com o nome completo do pacote
		tarefa = "br.com.alura.gerenciador.web." + tarefa;
		
		//trata com try catch
		try {
		Class<?> tipo = Class.forName(tarefa);//transforma a string em identificação de classe;
		Tarefa instancia = (Tarefa)tipo.newInstance(); // instancia a classe fazendo o cast de interface Tarefa ja que todas as classes passadas implementam esta Interface;
		String pagina = instancia.executa(req,resp); //o método executa que é implementado pela interface retorna uma string da uri da página
		RequestDispatcher dispatcher = req.getRequestDispatcher(pagina); //faz o dispatcher
		dispatcher.forward(req, resp);//envia a página
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
	}
}
