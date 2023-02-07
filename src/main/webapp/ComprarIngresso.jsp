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
			<h2 class="logo">
				<a href="index.html">Cine <span>Motion</span></a>
			</h2>
			<ul>
				
			</ul>
			
		</nav>
		<div id="container">
			<form id="compraIngresso-form" action="report">
				<div id="form_header">
					<h1>Comprar Ingresso</h1>
				</div>

				<div class="input-group">

					<div class="input-box">
						<label for="Assento">Escolha o assento</label> <input id="Assento"
							type="text" name="assento" placeholder="Assento entre 1 e 40"
							required="required">
					</div>
					<div class="input-box">
						<label for="horario">Horário</label> <input id="nome" type="text"
							name="horario" readonly
							value="<%out.print(request.getAttribute("horario"));%>">
					</div>
					<div class="input-box">
						<label for="tipoIngresso">Tipo de Ingresso</label> <input
							id="tipoIngresso" type="text" name="tipoIngresso"
							placeholder="Inteira ou meia?" required="required">
					</div>

					<div class="input-box">
						<label for="num_sessao">Número Sessão</label> <input
							id="num_sessao" type="text" name="num_sessao" readonly
							value="<%out.print(request.getAttribute("num_sessao"));%>">
					</div>


					<div class="input-box">
						<label for="sala">Sala</label> <input id="sala" type="text"
							name="sala" readonly
							value="<%out.print(request.getAttribute("sala"));%>">
					</div>

					<div class="input-box">
						<label for="data_sessao">Data Sessão</label> <input
							id="data_sessao" type="text" name="data_sessao" readonly
							value="<%out.print(request.getAttribute("data_sessao"));%>">
					</div>

					<div class="input-box">
						<label for="preco">Valor Ingresso</label> <input id="preco"
							type="text" name="preco" readonly
							value="<%out.print(request.getAttribute("preco"));%>">
					</div>

					<div class="input-box">
						<label for="titulo">Filme em Sessão</label> <input id="titulo"
							type="text" name="titulo" readonly
							value="<%out.print(request.getAttribute("titulo"));%>">
					</div>

					<div class="input-box">
						<label for="nome">Nome Comprador</label> <input id="nome"
							type="text" name="nome" readonly
							value="<%out.print(request.getAttribute("nome"));%>">
					</div>

					<div class="input-box">
						<label for="cpf">Cpf Comprador</label> <input id="cpf" type="text"
							name="cpf" readonly
							value="<%out.print(request.getAttribute("cpf"));%>">
					</div>

				</div>
				<div class="container-principal-voltar">
						<button class="botao-principal-voltar">Baixar Comprovante</button>
						<button type="button" onclick="window.location.href='primary'"id="">Voltar</button>
				</div>
			</form>
			

	</div>


	</div>


</body>
</html>