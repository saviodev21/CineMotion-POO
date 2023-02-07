<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="model.Sessao"%>
<%@ page import="model.Filme"%>
<%@ page import="model.Ingresso"%>
<%@ page import="DAO.IngressoDAO"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Sessao> lista = (ArrayList<Sessao>) request.getAttribute("sessao");
	ArrayList<Cliente> clt = (ArrayList<Cliente>) request.getAttribute("clientes");

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
		<div id="container">
				<form id="login_form" action="formIngresso">
					
					<div id="form_header">
						<h1>Comprar Ingresso</h1>
					</div>
						
					<div id="inputs">
					
						<div class="input-box">
							<label for="Assento">Escolha o assento</label>
							<input id="Assento" type="text" name="assento" placeholder="Assento entre 1 e 40" required="required" >
						</div>
						
						<div class="input-box">
							<label for="tipoIngresso">Tipo de Ingresso</label>
							<input id="tipoIngresso" type="text" name="tipoIngresso" placeholder="Inteira ou meia?" required="required" >
						</div>
						
					</div>
						<button id="login-button">Continuar Compra</button>
				</form>	
		</div>
	</div>
	
	
</body>
</html>