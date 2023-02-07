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

		<form name="formCadastro" action="insertFilmes" class="formulario">
			<div class="form-header">
				<div class="title">
					<h1>Cadastre o Filme</h1>
				</div>
			</div>

			<div class="input-group">
				<div class="input-box">
					<label for="titulo">Titulo</label> 
					<input class="caixinhas" type="text" name="titulo" placeholder="Digite o titulo" required="required">
				</div>
				
				<div class="input-box">
					<label for="dt_lancamento">Data de Lançamento</label> 
					<input class="caixinhas" type="date" name="dt_lancamento" placeholder="dd/MM/yyyy">
				</div>
				
				<div class="input-box">
					<label for="genero">Gênero</label> 
					<input class="caixinhas" type="text" name="genero" placeholder="Digite o gênero do filme" required="required">
				</div>
				
				<div class="input-box">
					<label for="nome">Ator Principal</label> 
					<input class="caixinhas" type="text" name="nome" placeholder="Digite o nome do ator" required="required">
				</div>

				<div class="input-box">
					<label for="diretor">Diretor</label> 
					<input class="caixinhas" type="text" name="diretor" placeholder="Digite o nome do diretor" required="required">
				</div>

				<div class="input-box">
					<label for="papel">Papel do ator</label>
					<input class="caixinhas" type="text" name="papel" placeholder="Papel do ator" required="required">
				</div>

				<div class="input-box">
					<label for="nome_img">Nome da Imagem</label> 
					<input class="caixinhas" type="text" name="nome_img" placeholder="Digite o nome da imagem" required="required">
				</div>

				<div class="input-box">
					<label for="nacionalidade">Nacionalidade Ator</label> 
					<input class="caixinhas" type="text" name="nacionalidade" placeholder="Nacionalidade do ator" required="required">
				</div>
				
				<div class="input-box">
					<label for="duracao">Duração</label> 
					<input class="caixinhas" type="text" name="duracao" placeholder="Ex: 1h 30min" required="required">
				</div>
				
				<div class="input-box">
					<label for="premiacoes">Premiações</label> 
					<input class="caixinhas" type="text" name="premiacoes" placeholder="Premiações?" required="required">
				</div>
				
				<div class="input-box">
					<label for="descricao">Descrição</label> 
					<input class="caixinhas" type="text" name="descricao" placeholder="Digite a descrição do filme" required="required">
				</div>
				

				<div class="continue-button">
					<button>Cadastrar</button>
				</div>
			</div>
				<div class="container-voltar-filme">
					<button onclick="window.location.href='admFilme'" id="voltar">Voltar</button>
				</div>
		</form>
	</div>
</body>
</html>