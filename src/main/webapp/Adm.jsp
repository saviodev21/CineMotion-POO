<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="DAO.ClienteDAO"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CineMotion</title>
<link rel="icon" href="imagens/icon-Navbar.png">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>
<body>
	<div class="hero">
		<nav>
			<h2 class="logo">
				<a href="index.html">Cine <span>Motion</span></a>
			</h2>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Service</a></li>
				<li><a href="#">Contact us</a></li>
			</ul>

			<button type="button">
				<a href="login.jsp">Voltar</a>
			</button>
		</nav>

		<section>
			<h2 id="cineMotion">
				Cine <span>Motion</span>
			</h2>

			<div class="botao">
				<button type="button">
					<a href="admFilme">Gerenciar Filmes</a>
				</button>
				<button type="button">
					<a href="admSessao">Gerenciar Sessões</a>
				</button>
				<button type="button">
					<a href="admCliente">Gerenciar Contas</a>
				</button>
			</div>

		</section>

	</div>
</body>
</html>