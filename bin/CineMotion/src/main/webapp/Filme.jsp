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
<body>
	<div class="container">
		<div class="form-image">
			<img alt="" src="imagens/contaAcesso.svg">
		</div>
			<form name="formCadastro" action="insertFilmes" class="formulario">
				<div class="form-header">
					<div class="title">
						<h1>Cadastre o Filme</h1>
					</div>
				</div>
				
				<div class="input-group">
					<div class="input-box">
						<label for="titulo">Titulo</label>
						<input id="titulo" type="text" name="titulo" placeholder="Digite o titulo" required="required" >
					</div>
				
					<div class="input-box">
						<label for="dt_lancamento">Data de Lançamento</label>
						<input id="dt_lancamento" type="text" name="dt_lancamento" placeholder="Digite a data de lancamento" required="required" >
					</div>
	
				
					<div class="input-box">
						<label for="genero">Gênero</label>
						<input id="genero" type="text" name="genero" placeholder="Digite o genero" required="required" >
					</div>
					
					<div class="input-box">
						<label for="duracao">Duração</label>
						<input id="duracao" type="text" name="duracao" placeholder="Digite a duracao" required="required" >
					</div>
					
					<div class="input-box">
						<label for="diretor">Diretor</label>
						<input id="diretor" type="text" name="diretor" placeholder="Digite o diretor" required="required" >
					</div>
					
					<div class="input-box">
						<label for="descricao">Descrição</label>
						<input id="descricao" type="text" name="descricao" placeholder="Digite a descricao" required="required" >
					</div>
					
					<div class="input-box">
						<label for="nome_img">Nome da Imagem</label>
						<input id="nome_img" type="text" name="nome_img" placeholder="Digite o nome da imagem" required="required" >
					</div>
					
					<div class="input-box">
						<label for="nome">Ator Principal</label>
						<input id="nome" type="text" name="nome" placeholder="Digite o nome do ator" required="required" >
					</div>
					<div class="input-box">
						<label for="nacionalidade">Nacionalidade Ator</label>
						<input id="nacionalidade" type="text" name="nacionalidade" placeholder="Nacionalidade do ator" required="required" >
					</div>
					<div class="input-box">
						<label for="papel">Papel do ator</label>
						<input id="papel" type="text" name="papel" placeholder="Papel do ator" required="required" >
					</div>
					<div class="input-box">
						<label for="premiacoes">Premiações</label>
						<input id="premiacoes" type="text" name="premiacoes" placeholder="Premiações?" required="required" >
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