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
			<h2 class="logo"><a href="index.html">Cine <span>Motion</span></a></h2>
			<ul>
				<li> <a href="index.html">Home</a></li>
				<li> <a href="#">About</a></li>
				<li> <a href="#">Service</a></li>
				<li> <a href="#">Contact us</a></li>
			</ul>
			<button id="voltar" onclick="window.location.href='index.html'">Voltar</button>
		</nav>
		<div class="container">
			<% for(int i=0; i<lista.size(); i++){%>
				
					<div class="card">
						<div class="imagem">
							<img class="imag" alt="imagem do filme" src="imagens/<%= lista.get(i).getFilme().getNome_img() %>">
						
						<div class="texto">
							<h2 class="text-main"><%= lista.get(i).getFilme().getTitulo() %></h2>
						</div>
						
						</div>
						
						
						<div class="button">
							<a href="compra?testeEmail=<%= session.getAttribute("email")%>&id_sessao=<%=lista.get(i).getId_sessao()%>"><button type="button" class="btn2" >Comprar Ingresso</button> </a>
							
						</div>
						<div class="button2">
						<a href="select?id_filme=<%= listas.get(i).getId_filme()%>"><button type="button" class="btn2" >Descrição</button> </a>
							
						</div>
							
					</div>
				
			<% }%>
		</div>	
	</div>
			
</body>
</html>