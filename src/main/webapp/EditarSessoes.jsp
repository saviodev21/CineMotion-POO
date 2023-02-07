<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CineMotion</title>
<link rel="icon" href="imagens/icon-Navbar.png">
<link rel="stylesheet" href="style.css">
</head>

<body class="forms">
	<div class="container">
			<form name="formCadastro" action="UpdateSessao" class="formulario2">
				<div class="form-header">
					<div class="title">
						<h1>Edite a Sessão</h1>
					</div>
				</div>

				<div class="input-group">
					<div class="input-box">
						<label for="horario" >Horario</label>
						<input class="caixinhas2" type="text" name="horario" value="<%out.print(request.getAttribute("horario")); %>" required="required" >
					</div>
				
					<div class="input-box">
						<label for="quantIngMax">Quantidade de ingressos</label>
						<input class="caixinhas2" type="text" name="quantIngMax" value="<%out.print(request.getAttribute("quantIngMax")); %>"required="required" >
					</div>
	
				
					<div class="input-box">
						<label for="sala">Sala</label>
						<input class="caixinhas2" type="text" name="sala" value="<%out.print(request.getAttribute("sala")); %>" required="required" >
					</div>
					
					<div class="input-box">
						<label for="data_sessao">Data sessão</label>
						<input class="caixinhas2" type="text" name="data_sessao" value="<%out.print(request.getAttribute("data_sessao")); %>" required="required" >
					</div>
					
					<div class="input-box">
						<label for="num_sessao">Numero da Sessão</label>
						<input id="numSessao" type="text" name="num_sessao" value="<%out.print(request.getAttribute("num_sessao")); %>" required="required" >
					</div>
					
					<div style="display: none" class="input-box">
						<label for="id_sessao">id</label>
						<input id="sexo" type="text" name="id_sessao" value="<%out.print(request.getAttribute("id_sessao")); %>" required="required" >
					</div>
					
					<div class="continue-button">
						<button>Editar</button>
					</div>
						<button  href="GerenciaSessoes.jsp" id="voltar-sessao">Voltar</button>
				</div>
			</form>
		</div>
	</div>
	
</body>
</html>