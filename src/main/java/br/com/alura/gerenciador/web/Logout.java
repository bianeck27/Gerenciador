package br.com.alura.gerenciador.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout implements Tarefa{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		req.getSession().removeAttribute("usuario.logado");//remove o cookie
		return "/WEB-INF/paginas/logout.html";
	}
}
