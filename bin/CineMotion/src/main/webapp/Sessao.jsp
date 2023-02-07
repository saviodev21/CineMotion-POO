<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CineMotion</title>
<link rel="icon" href="imagens/icon-Navbar.png">
<link rel="stylesheet" href="style.css">

</head>
<body class="forms">
	<div class="container">
		<div class="form-image">
			<img alt="" src="imagens/contaAcesso.svg">
		</div>
			<form name="formCadastro" action="insertSessao" class="formulario">
				<div class="form-header">
					<div class="title">
						<h1>Cadastre a Sessão</h1>
					</div>
				</div>
				<div class="input-group">
					<div class="input-box">
						<label for="horario">Horário</label>
						<input id="horario" type="text" name="horario" placeholder="Digite o horario" required="required" >
					</div>
				
					<div class="input-box">
						<label for="quantIngMax">Quantidade de ingressos</label>
						<input id="quantIngMax" type="text" name="quantIngMax" placeholder="Ingressos Disponivel" required="required" >
					</div>
	
				
					<div class="input-box">
						<label for="sala">Sala</label>
						<input id="sala" type="text" name="sala" placeholder="Numero da sala" required="required" >
					</div>
					
					<div class="input-box">
						<label for="data_sessao">Data sessão</label>
						<input id="data_sessao" type="text" name="data_sessao" placeholder="Data da sessão" required="required" >
					</div>
					
					<div class="input-box">
						<label for="num_sessao">Numero da Sessão</label>
						<input id="num_sessao" type="text" name="num_sessao" placeholder="Numero da sessão" required="required" >
					</div>
					
					<div class="input-box">
						<label for="preco">Valor Ingresso</label>
						<input id="preco" type="text" name="preco" placeholder="Digite o preco do ingresso" required="required" >
					</div>
					
					<div class="input-box">
						<label for="titulo">Filme</label>
						<input id="titulo" type="text" name="titulo" placeholder="Digite o filme" required="required" >
					</div>
					<div class="continue-button">
						<button>Continuar</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	
</body>
</html>