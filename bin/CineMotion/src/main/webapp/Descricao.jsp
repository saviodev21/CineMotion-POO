<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="model.Sessao"%>
<%@ page import="model.Filme"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Sessao> lista = (ArrayList<Sessao>) request.getAttribute("sessao");
	ArrayList<Filme> listas = (ArrayList<Filme>) request.getAttribute("filmes");
%>
<% 
	Filme filme = new Filme();
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CineMotion</title>
<link rel="icon" href="imagens/icon-Navbar.png">
<link rel="stylesheet" href="style.css">

</head>
<body>
<div class="hero">
		<nav>
			<h2 class="logo">Cine <span>Motion</span></h2>
			<ul>
				<li> <a href="#">Home</a></li>
				<li> <a href="#">About</a></li>
				<li> <a href="#">Service</a></li>
				<li> <a href="#">Portifolio</a></li>
				<li> <a href="#">Contact us</a></li>
			</ul>
			<button type="button">Subscribe</button>
		</nav>
		<div class="img">
			<img class="imagemDesc" alt="" src="imagens/<%out.print(request.getAttribute("nome_img"));%>">
		</div>
	</div>
</body>
</html>