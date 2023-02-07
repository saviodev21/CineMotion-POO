
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

		<div class="form-container">
			<form name="formCadastro" action="insert" class="formulario2">
			
				<div class="form-header">
					<div class="title">
						<h1>Cadastre-se</h1>
					</div>
				</div>
	
				<div class="input-group">
					<div class="input-box">
						<label for="nome">Nome</label> 
						<input class="caixinhas" type="text" name="nome" placeholder="Digite seu nome" required="required">
					</div>
	
					<div class="input-box">
						<label for="idade">Idade</label> 
						<input class="caixinhas" type="text" name="idade" placeholder="Digite sua idade" required="required">
					</div>
	
	
					<div class="input-box">
						<label for="sexo">Sexo</label> 
						<input id="sexo" type="text" name="sexo" placeholder="M/F" required="required">
					</div>
	
					<div class="input-box">
						<label for="email">E-mail</label> 
						<input class="caixinhas" type="email" name="email" placeholder="Digite seu email" required="required">
					</div>
	
					<div class="input-box">
						<label for="telefone">Telefone</label> 
						<input class="caixinhas" type="tel" name="telefone" required placeholder="(xx) xxxxx-xxxx">
					</div>
	
					<div class="input-box">
						<label for="cpf">CPF</label> 
						<input pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"  class="caixinhas" type="text" name="cpf" placeholder="EX: xxx.xxx.xxx-xx" required="required">
					</div>
	
					<div class="input-box">
						<label for="senha">Senha</label> 
						<input class="caixinhas" type="password" name="senha" placeholder="digite sua senha" required="required">
					</div>
	
					<div class="continue-button">
						<button>Cadastrar</button>
					</div>
				</div>
				<aside class="container-voltar">
					<button onclick="window.location.href='index.html'" id="voltar">Voltar</button>
					<button onclick="window.location.href='login.jsp'" id="voltar-login" href="login.jsp">Já possuo uma conta</button>
				</aside>
			</form>
		</div>
		
	</div>

</body>
</html>