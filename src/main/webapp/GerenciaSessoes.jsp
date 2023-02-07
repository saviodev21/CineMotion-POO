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
				<li> <a href="#">Portifolio</a></li>
				<li> <a href="#">Contact us</a></li>
			</ul>
			<button type="button">
				<a href="Adm.jsp">Voltar </a>
			</button>
		</nav>
		<div class="container-gerencia">

			<div class="container-table">

				<table id="table">
					<thead>
						<tr class="tr">
							<th class="th">Horario</th>
							<th class="th">Data da sessao</th>
							<th class="th">Numero da sessao</th>
							<th class="th">Ingressos Disponiveis</th>
							<th class="th">Sala</th>
							<th class="th">Filme em sessao</th>
						
						</tr>
					</thead>
					<tbody>
						<%for (int i=0; i < lista.size(); i++){ %>
							<tr>
								<td class="td"><%=lista.get(i).getHorario()%></td>
								<td class="td"><%=lista.get(i).getData_sessao() %></td>
								<td class="td"><%=lista.get(i).getNum_sessao() %></td>
								<td class="td"><%=lista.get(i).getQuantIngMax() %></td>
								<td class="td"><%=lista.get(i).getSala() %></td>
								<td class="td"><%=lista.get(i).getFilme().getTitulo() %></td>

								<td> <button id="button-lista"><a href="edit?id_sessao=<%= lista.get(i).getId_sessao()%>">Editar</a></button></td>
								<td><button id="button-lista"><a href="javascript:confirmar2(<%=lista.get(i).getId_sessao() %>)">Excluir</a></button> </td>
							</tr>
						<%} %>
					</tbody>	
				</table>
			</div>
			
		</div>
		<div class="container-button">
			<button type="button" id="novo-button">
				<a href="Sessao.jsp">Nova Sessao</a>
			</button>

		</div>

	</div>
	<script src="scripts/confirmador.js"></script>
</body>
</html>