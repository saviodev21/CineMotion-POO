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
			<h2 class="logo">Cine <span>Motion</span></h2>
			<ul>
				<li> <a href="#">Home</a></li>
				<li> <a href="#">About</a></li>
				<li> <a href="#">Service</a></li>
				<li> <a href="#">Contact us</a></li>
			</ul>
			<button type="button">
				<a href="Adm.jsp">Voltar</a>
			</button>
		</nav>
		<div class="container-gerencia">
			
			<table id="table">
				<thead class="thead">
					<tr class="tr">
						<th class="th">Titulo</th>
						<th class="th">Gênero</th>
						<th class="th">Diretor</th>
						<th class="th">Duração</th>
						<th class="th">Data de lançamento</th>
					</tr>
				</thead>
				<tbody>
					<%for (int i=0; i <listas.size(); i++){ %>
						<tr>
							<td class="td"><%=listas.get(i).getTitulo()%></td>
							<td class="td"><%=listas.get(i).getGenero() %></td>
							<td class="td"><%=listas.get(i).getDiretor() %></td>
							<td class="td"><%=listas.get(i).getDuracao() %></td>
							<td class="td"><%=listas.get(i).getDt_lancamento() %></td>
							<td><button id="button-lista">
								<a id="button-lista2" href="javascript:confirmar(<%=listas.get(i).getId_filme() %>)" >Excluir</a>
							</button></td>
						</tr>
					<%} %>
				</tbody>	
			</table>
			
		</div>
		<div class="container-button">
			<button type="button" id="novo-button">
				<a href="Filme.jsp">Novo Filme</a>
			</button>
		</div>
	</div>
	
	<script src="scripts/confirmador.js"></script>
</body>
</html>