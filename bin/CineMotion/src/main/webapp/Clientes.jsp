<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
			<form name="formCadastro" action="insert" class="formulario">
				<div class="form-header">
					<div class="title">
						<h1>Cadastre-se</h1>
					</div>
				</div>
				
				<div class="input-group">
					<div class="input-box">
						<label for="nome">Nome</label>
						<input id="nome" type="text" name="nome" placeholder="Digite seu nome" required="required" >
					</div>
				
					<div class="input-box">
						<label for="idade">Idade</label>
						<input id="idade" type="text" name="idade" placeholder="Digite sua idade" required="required" >
					</div>
	
				
					<div class="input-box">
						<label for="sexo">Sexo</label>
						<input id="sexo" type="text" name="sexo" placeholder="Digite seu sexo" required="required" >
					</div>
					
					<div class="input-box">
						<label for="email">E-mail</label>
						<input id="email" type="email" name="email" placeholder="Digite seu email" required="required" >
					</div>
					
					<div class="input-box">
						<label for="telefone">Telefone</label>
						<input id="cel" type="tel" name="telefone" placeholder="(xx) xxxx-xxxx" required="required" >
					</div>
					
					<div class="input-box">
						<label for="cpf">CPF</label>
						<input id="cpf" type="text" name="cpf" placeholder="Digite seu CPF" required="required" >
					</div>
					
					<div class="input-box">
						<label for="senha">Senha</label>
						<input id="senha" type="password" name="senha" placeholder="digite sua senha" required="required" >
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