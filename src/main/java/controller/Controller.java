package controller;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import DAO.AtorDAO;
import DAO.AtuaDAO;
import DAO.ClienteDAO;
import DAO.FilmeDAO;
import DAO.IngressoDAO;
import DAO.SessaoDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ator;
import model.Atua;
import model.Cliente;
import model.Filme;
import model.Ingresso;
import model.Sessao;

@WebServlet(urlPatterns = { "/controller", "/main", "/insert", "/login", "/insertFilmes", "/insertSessao", "/primary",
		"/select", "/valid", "/compra", "/formIngresso", "/admFilme", "/delete", "/admSessao", "/UpdateSessao", "/edit",
		"/deleteSessao", "/report", "/pdf", "/admCliente", "/deleteCliente"})

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClienteDAO clienteDao = new ClienteDAO();
	FilmeDAO filmeDao = new FilmeDAO();
	AtorDAO atorDao = new AtorDAO();
	AtuaDAO atuaDao = new AtuaDAO();
	SessaoDAO sessaoDao = new SessaoDAO();
	IngressoDAO ingressoDao = new IngressoDAO();
	Cliente cliente = new Cliente();
	Filme filme = new Filme();
	Ator ator = new Ator();
	Atua atua = new Atua();
	Sessao sessao = new Sessao();
	Ingresso ingresso = new Ingresso();
	ArrayList<Cliente> clientes = new ArrayList<>();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			index(request, response);
		} else if (action.equals("/insert")) {
			cadastrarCliente(request, response);
		} else if (action.equals("/login")) {

		} else if (action.equals("/insertFilmes")) {
			cadastrarFilme(request, response);
		} else if (action.equals("/insertSessao")) {
			cadastrarSessao(request, response);
		} else if (action.equals("/primary")) {
			sessao(request, response);
		} else if (action.equals("/select")) {
			listarFilme(request, response);
		} else if (action.equals("/compra")) {
			comprarIngresso(request, response);
		} else if (action.equals("/admFilme")) {
			GerenciaFilme(request, response);
		} else if (action.equals("/delete")) {
			deletarFilme(request, response);
		} else if (action.equals("/admSessao")) {
			GerenciaSessao(request, response);
		} else if (action.equals("/UpdateSessao")) {
			editarSessao(request, response);
		} else if (action.equals("/edit")) {
			listarSessao(request, response);
		} else if (action.equals("/deleteSessao")) {
			deletarSessao(request, response);
		}else if (action.equals("/report")) {
			Ingresso(request, response);
		}else if (action.equals("/pdf")) {
			gerarComprovante(request, response);
		}
		else if (action.equals("/admCliente")) {
			GerenciaContas(request, response);
		}else if (action.equals("/deleteCliente")) {
			deletarCliente(request, response);
		}
		
	}

	protected void index(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("Clientes.jsp");
	}

	protected void sessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<Filme> listas = filmeDao.listarFilme();
		ArrayList<Sessao> lista = sessaoDao.listarSessao();

		request.setAttribute("filmes", listas);
		request.setAttribute("sessao", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Sessoes.jsp");
		rd.forward(request, response);
	}

	protected void cadastrarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("nome"));
		// setar as variaveis
		cliente.setNome(request.getParameter("nome"));
		cliente.setIdade(request.getParameter("idade"));
		cliente.setSexo(request.getParameter("sexo"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setSenha(request.getParameter("senha"));

		// invocando o metodo para o objeto
		clienteDao.cadastrarCliente(cliente);
		response.sendRedirect("login.jsp");
	}

	protected void cadastrarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar as variaveis
		filme.setTitulo(request.getParameter("titulo"));
		filme.setDt_lancamento(request.getParameter("dt_lancamento"));
		filme.setGenero(request.getParameter("genero"));
		filme.setDuracao(request.getParameter("duracao"));
		filme.setDiretor(request.getParameter("diretor"));
		filme.setDescricao(request.getParameter("descricao"));
		filme.setNome_img(request.getParameter("nome_img"));
		filmeDao.cadastrarFilme(filme);
		ator.setNome(request.getParameter("nome"));
		ator.setNacionalidade(request.getParameter("nacionalidade"));
		atorDao.cadastrarAtor(ator);
		atua.setPapel(request.getParameter("papel"));
		atua.setPremiacoes(request.getParameter("premiacoes"));
		atuaDao.cadastrarAtuacao(atua);

		response.sendRedirect("Adm.jsp");
	}

	protected void cadastrarSessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar as variaveis
		sessao.setHorario(request.getParameter("horario"));
		sessao.setQuantIngMax(Integer.parseInt(request.getParameter("quantIngMax")));
		sessao.setSala(Integer.parseInt(request.getParameter("sala")));
		sessao.setData_sessao(request.getParameter("data_sessao"));
		sessao.setNum_sessao(Integer.parseInt(request.getParameter("num_sessao")));
		sessaoDao.cadastrarSessao(sessao);
		ingresso.setPreco(Double.valueOf(request.getParameter("preco")).doubleValue());
		ingressoDao.cadastrarIngresso(ingresso);

		response.sendRedirect("Adm.jsp");

	}

	// selecionar id_filme
	protected void listarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id
		int id_filme = Integer.parseInt(request.getParameter("id_filme"));
		// setar a variavel
		filme.setId_filme(id_filme);
		// executar o metodo selecionar
		filmeDao.selecionarFilme(filme, ator, atua);
		// teste de recebimento
		request.setAttribute("id_filme", filme.getId_filme());
		request.setAttribute("titulo", filme.getTitulo());
		request.setAttribute("dt_lancamento", filme.getDt_lancamento());
		request.setAttribute("genero", filme.getGenero());
		request.setAttribute("diretor", filme.getDiretor());
		request.setAttribute("descricao", filme.getDescricao());
		request.setAttribute("nome_img", filme.getNome_img());
		request.setAttribute("duracao", filme.getDuracao());
		request.setAttribute("nome", ator.getNome());
		request.setAttribute("nacionalidade", ator.getNacionalidade());
		request.setAttribute("id_ator", ator.getId_ator());
		request.setAttribute("id_atua", atua.getId_atua());
		request.setAttribute("papel", atua.getPapel());
		request.setAttribute("premiacoes", atua.getPremiacoes());

		RequestDispatcher rd = request.getRequestDispatcher("Descricao.jsp");
		rd.forward(request, response);

	}

	protected void listarSessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id
		int id_sessao = Integer.parseInt(request.getParameter("id_sessao"));
		// setar a variavel
		sessao.setId_sessao(id_sessao);
		
		// executar o metodo selecionar
		sessaoDao.selecionarSessao(sessao);
		// teste de recebimento
		request.setAttribute("sala", sessao.getSala());
		request.setAttribute("num_sessao", sessao.getNum_sessao());
		request.setAttribute("data_sessao", sessao.getData_sessao());
		request.setAttribute("quantIngMax", sessao.getQuantIngMax());
		request.setAttribute("horario", sessao.getHorario());
		request.setAttribute("id_sessao", sessao.getId_sessao());
		System.out.println(request.getAttribute("id_sessao"));
		RequestDispatcher rd = request.getRequestDispatcher("EditarSessoes.jsp");
		rd.forward(request, response);

	}

	protected void comprarIngresso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("testeEmail");
		cliente.setEmail(email);
		System.out.println(cliente.getEmail());
		clienteDao.selecionarCliente(cliente);

		request.setAttribute("nome", cliente.getNome());
		request.setAttribute("idade", cliente.getIdade());
		request.setAttribute("sexo", cliente.getSexo());
		request.setAttribute("email", cliente.getEmail());
		request.setAttribute("telefone", cliente.getTelefone());
		request.setAttribute("cpf", cliente.getCpf());
		request.setAttribute("senha", cliente.getSenha());

		int id_Ingresso = Integer.parseInt(request.getParameter("id_sessao"));
		ingresso.setId_Ingresso(id_Ingresso);
		ingressoDao.selecionarPreco(ingresso);
		
		request.setAttribute("preco", ingresso.getPreco());
		
		
		int id_sessao = Integer.parseInt(request.getParameter("id_sessao"));
		sessao.setId_sessao(id_sessao);
		sessaoDao.selecionarSessao(sessao);
		
		request.setAttribute("sala", sessao.getSala());
		request.setAttribute("num_sessao", sessao.getNum_sessao());
		request.setAttribute("data_sessao", sessao.getData_sessao());
		request.setAttribute("horario", sessao.getHorario());
		request.setAttribute("quantIngMax", sessao.getQuantIngMax());
		request.setAttribute("id_sesssao", sessao.getId_sessao());
		
		int id_filme = Integer.parseInt(request.getParameter("id_sessao"));
		filme.setId_filme(id_filme);
		filmeDao.selecionarFilme(filme, ator, atua);
		
		request.setAttribute("titulo", filme.getTitulo());
		

		System.out.println(ingresso.getPreco());
		if (cliente.getIdade() == null) {
			response.sendRedirect("Clientes.jsp");
		} else if (cliente.getSexo() != null) {
			RequestDispatcher rd = request.getRequestDispatcher("ComprarIngresso.jsp");
			rd.forward(request, response);
		}

	}

	protected void Ingresso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		

		ingresso.setAssento(Integer.parseInt(request.getParameter("assento")));
		ingresso.setTipo(request.getParameter("tipoIngresso"));
		System.out.println(ingresso.getTipo());
		sessao.setHorario(request.getParameter("horario"));
		sessao.setNum_sessao(Integer.parseInt(request.getParameter("num_sessao")));;
		sessao.setSala(Integer.parseInt(request.getParameter("sala")));
		sessao.setData_sessao(request.getParameter("data_sessao"));;
		ingresso.setPreco(Double.valueOf(request.getParameter("preco")).doubleValue());
		filme.setTitulo(request.getParameter("titulo"));
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));

		if (ingresso.getTipo().equalsIgnoreCase("meia")) {
			System.out.println(ingresso.getTipo());
			ingresso.setPreco(Double.valueOf(ingresso.getPreco()).doubleValue() / 2);
			request.setAttribute("preco", ingresso.getPreco());
			request.setAttribute("assento", ingresso.getAssento());
			request.setAttribute("tipoIngresso", ingresso.getTipo());
			System.out.println(ingresso.getPreco());
			System.out.println( request.getParameter("preco"));
			
		} else if (ingresso.getTipo().equalsIgnoreCase("inteira")) {
			System.out.println(ingresso.getTipo());
			request.setAttribute("preco", ingresso.getPreco());
			request.setAttribute("assento", ingresso.getAssento());
			request.setAttribute("tipoIngresso", ingresso.getTipo());
			System.out.println(ingresso.getAssento());
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("pdf");
		rd.forward(request, response);

	}

	protected void GerenciaFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Filme> listas = filmeDao.listarFilme();

		request.setAttribute("filmes", listas);
		RequestDispatcher rd = request.getRequestDispatcher("GerenciaFilmes.jsp");
		rd.forward(request, response);
	}

	protected void deletarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id_filme
		int id = Integer.parseInt(request.getParameter("id_filme"));
		// setar a variavel
		filme.setId_filme(id);
		// executar o metodo contato
		filmeDao.deletar(filme);
		// redirecionar o documento (atualizando os dados)
		response.sendRedirect("admFilme");
	}

	protected void GerenciaSessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Sessao> lista = sessaoDao.listarSessao();

		request.setAttribute("sessao", lista);
		RequestDispatcher rd = request.getRequestDispatcher("GerenciaSessoes.jsp");
		rd.forward(request, response);
	}

	protected void editarSessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		sessao.setId_sessao(Integer.parseInt(request.getParameter("id_sessao")));
		sessao.setSala(Integer.parseInt(request.getParameter("sala")));
		sessao.setHorario(request.getParameter("horario"));
		sessao.setNum_sessao(Integer.parseInt(request.getParameter("num_sessao")));
		sessao.setData_sessao(request.getParameter("data_sessao"));
		sessao.setQuantIngMax(Integer.parseInt(request.getParameter("quantIngMax")));
		// executar o metodo alterar contato
		sessaoDao.alterarSessao(sessao);
		// redirecionar o documento para agenda.jsp
		response.sendRedirect("Adm.jsp");
	}

	protected void deletarSessao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id_sessao
		int id_sessao = Integer.parseInt(request.getParameter("id_sessao"));
		// setar a variavel
		sessao.setId_sessao(id_sessao);
		// executar o metodo contato
		sessaoDao.deletar(sessao);
		// redirecionar o documento (atualizando os dados)
		response.sendRedirect("Adm.jsp");
	}
	
	
	
	protected void gerarComprovante(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Document documento = new Document();
		
		try {
			//tipo de conteudo
			response.setContentType("aplication/pdf");
			//nome do documento
			response.addHeader("content-Disposition", "inline; filename=" + "comprovante.pdf");
			//criar documento
			PdfWriter.getInstance(documento, response.getOutputStream());
			//abrir documetento para gerar conteudo
			documento.open();
			documento.add(new Paragraph("                                                      CineMotion - Comprovante De Compra"));
			documento.add(new Paragraph("  "));
			
			//criar uma tabela
			PdfPTable tabela = new PdfPTable(3);
			//cabeçalho
			
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome Comprador"));
			PdfPCell col2 = new PdfPCell(new Paragraph("CPF Comprador"));
			PdfPCell col3 = new PdfPCell(new Paragraph(" "));
			
			
			PdfPTable tabela2 = new PdfPTable(3);
			PdfPCell col4 = new PdfPCell(new Paragraph("Filme em Sessao"));
			PdfPCell col5 = new PdfPCell(new Paragraph("Horario Sessao"));
			PdfPCell col6 = new PdfPCell(new Paragraph(" "));
			
			PdfPTable tabela3 = new PdfPTable(4);
			PdfPCell col7 = new PdfPCell(new Paragraph("Numero Sessão"));
			PdfPCell col8 = new PdfPCell(new Paragraph("Sala"));
			PdfPCell col9 = new PdfPCell(new Paragraph("Data Sessao"));
			PdfPCell col10 = new PdfPCell(new Paragraph("Assento"));
			
			PdfPTable tabela4 = new PdfPTable(3);
			PdfPCell col11 = new PdfPCell(new Paragraph("Valor Ingresso"));
			PdfPCell col12 = new PdfPCell(new Paragraph("Tipo Ingresso"));
			PdfPCell col13 = new PdfPCell(new Paragraph(" "));
			
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			
			tabela2.addCell(col4);
			tabela2.addCell(col5);
			tabela2.addCell(col6);
			
			tabela3.addCell(col7);
			tabela3.addCell(col8);
			tabela3.addCell(col9);
			tabela3.addCell(col10);
			
			tabela4.addCell(col11);
			tabela4.addCell(col12);
			tabela4.addCell(col13);
			
			tabela.addCell(request.getParameter("nome"));
			tabela.addCell(request.getParameter("cpf"));
			tabela.addCell(request.getParameter(" "));
			documento.add(tabela);
			
			tabela2.addCell(request.getParameter("titulo"));
			tabela2.addCell(request.getParameter("horario"));
			tabela2.addCell(request.getParameter(" "));
			documento.add(tabela2);
		
			tabela3.addCell(request.getParameter("num_sessao"));
			tabela3.addCell(request.getParameter("sala"));
			tabela3.addCell(request.getParameter("data_sessao"));
			tabela3.addCell(request.getParameter("assento"));
			documento.add(tabela3);
	
			String preco = String.valueOf(request.getAttribute("preco"));
			
			tabela4.addCell(preco);
			tabela4.addCell(request.getParameter("tipoIngresso"));
			tabela4.addCell(request.getParameter(" "));
			documento.add(tabela4);
			
			documento.close();
		} catch (Exception e) {
			System.out.println(e);
			documento.close();
		}
		
	}
	
	protected void GerenciaContas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Cliente> clts = clienteDao.listarCliente();

		request.setAttribute("clientes", clts);
		RequestDispatcher rd = request.getRequestDispatcher("GerenciaClientes.jsp");
		rd.forward(request, response);
	}
	
	
	protected void deletarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id
		System.out.println(request.getParameter("cpf"));
		String id = request.getParameter("cpf");
		
		// setar a variavel
		cliente.setCpf(id);
		// executar o metodo contato
		clienteDao.deletar(id);
		// redirecionar o documento (atualizando os dados)
		response.sendRedirect("Adm.jsp");
	}

}