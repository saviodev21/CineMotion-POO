<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.Cliente"%>
    <%@ page import="DAO.ClienteDAO"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CineMotion</title>
<link rel="icon" href="imagens/icon-Navbar.png">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>
<body>
	<div id="container">
				<form id="login_form" action="" class="formularioLogin">
					
					<div id="form_header">
						<h1>Login</h1>
					</div>
						
					<div id="inputs">
					
						<div class="input-box">
							<label for="email">E-mail</label>
							<input id="email" type="email" name="email" placeholder="Digite seu email" required="required" >
						</div>
						
						<div class="input-box">
							<label for="senha">Senha</label>
							<input id="senha" type="password" name="senha" placeholder="digite sua senha" required="required" >
						</div>
						
					</div>
						<button type="submit" id="login-button">Login</button>
				</form>
				
	</div>
			<%
				String email = request.getParameter("email");
				String senha = request.getParameter("senha");
				Cliente cliente = new Cliente(email, senha);
				ClienteDAO userDao = new ClienteDAO();
				userDao.login(cliente);
				if(cliente.getCpf() != null){
					if(cliente.getEmail().equals("admin@gmail.com") && cliente.getSenha().equals("123")){
						response.sendRedirect("Filme.jsp");
					}
					else{
						session.setAttribute("email", cliente.getEmail());
						session.setAttribute("senha", cliente.getSenha());
						response.sendRedirect("primary");
					}
					
				}
			%>
</body>
</html>