/**
 * confirmação de uma exclusao de um contato
 */

 
 function confirmar(id_filme){
	 let resposta = confirm("Confirmar a exclusao desse filme?")
	 if(resposta===true){
		 //alert(id_filme)
		 window.location.href = "delete?id_filme=" + id_filme
	 }
	 
 }
 
 function confirmar2(id_sessao){
	 let resposta = confirm("Confirmar a exclusao dessa Sessão?")
	 if(resposta===true){
		 //alert(id_sessao)
		 window.location.href = "deleteSessao?id_sessao=" + id_sessao
	 }
	 
 }
 
  function confirmar3(cpf){
	 let resposta = confirm("Confirmar a exclusao dessa Conta?")
	 if(resposta===true){
		 alert(cpf)
		 window.location.href = "deleteCliente?cpf=" + cpf
	 }
	 
 }