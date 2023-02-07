<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Cliente"%>
<%@ page import="model.Sessao"%>
<%@ page import="model.Filme"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<Sessao> lista = (ArrayList<Sessao>) request.getAttribute("sessao");
ArrayList<Filme> listas = (ArrayList<Filme>) request.getAttribute("filmes");
%>
<%
Filme filme = new Filme();
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

		<div class="container2">

			<div class="container-descricao">

				<div class="image">
					<img class="images" alt=""
						src="imagens/<%out.print(request.getAttribute("nome_img"));%>">

					<div class="texto2">
						<h2 class="text-main2">
							<%
							out.print(request.getAttribute("titulo"));
							%>
						</h2>
						<p class="desc2">
							<br>
							<span>Ator Principal:</span>
							<%
							out.print(request.getAttribute("nome"));
							%>
						</p>
						<p class="desc2">
							<br>
							<span>Protagonista:</span>
							<%
							out.print(request.getAttribute("papel"));
							%>
						</p>
						<p class="desc2">
							<br>
							<span>Diretor:</span>
							<%
							out.print(request.getAttribute("diretor"));
							%>
						</p>
						<p class="desc2">
							<br>
							<span>Gênero:</span>
							<%
							out.print(request.getAttribute("genero"));
							%>
						</p>
						<p class="desc2">
							<br>
							<span>Sinopse:</span> <br><br>
							<%
							out.print(request.getAttribute("descricao"));
							%>
						</p>
					</div>
					<div class="button3">
						<button type="button" class="btn3">
							<a href="primary">Voltar</a>
						</button>
					</div>
				</div>

			</div>
		</div>

	</div>
</body>
</html>