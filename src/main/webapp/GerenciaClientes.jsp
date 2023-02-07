<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="model.Sessao"%>
<%@ page import="model.Filme"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Cliente> clts = (ArrayList<Cliente>) request.getAttribute("clientes");


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
						<th class="th">Nome</th>
						<th class="th">Idade</th>
						<th class="th">Sexo</th>
						<th class="th">E-mail</th>
						<th class="th">Telefone</th>
						<th class="th">Cpf</th>
					</tr>
				</thead>
				<tbody>
					<%for (int i=0; i <clts.size(); i++){ %>
						<tr>
							<td class="td"><%=clts.get(i).getNome()%></td>
							<td class="td"><%=clts.get(i).getIdade() %></td>
							<td class="td"><%=clts.get(i).getSexo() %></td>
							<td class="td"><%=clts.get(i).getEmail() %></td>
							<td class="td"><%=clts.get(i).getTelefone() %></td>
							<td class="td"><%=clts.get(i).getCpf() %></td>
							
							<td><button id="button-lista">
								<a id="button-lista2" href="deleteCliente?cpf=<%=clts.get(i).getCpf() %>" >Excluir</a>
							</button></td>
						</tr>
					<%} %>
				</tbody>	
			</table>
			
		</div>
		<div class="container-button">
			
		</div>
	</div>
	
	<script src="scripts/confirmador.js"></script>
</body>
</html>