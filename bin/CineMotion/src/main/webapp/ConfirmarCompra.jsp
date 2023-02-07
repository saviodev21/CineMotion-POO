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
	<h1>
		<%out.print(request.getAttribute("preco"));%>
		<%out.print(request.getAttribute("assento"));%>
		<%out.print(request.getAttribute("tipoIngresso"));%>
	
	</h1>
</body>
</html>