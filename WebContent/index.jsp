<html>
	<body>
		Bem vindo ao nosso gerenciador de empresas!<br/>
		<form action="executa?tarefa=novaEmpresa" method="POST">
			Nome: <input type="text" name="nome">
			<input type="submit" value="Enviar">
		</form>
		
		<form action="login" method="post">
			E-mail: <input type="email" name="email">
			Senha: <input type="password" name="senha">
			<input type="submit" value="Enviar">
		</form>
		
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="Logout">
			<input type="submit" value="Deslogar">
		</form>
	</body>
</html>