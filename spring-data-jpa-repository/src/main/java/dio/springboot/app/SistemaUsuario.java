package dio.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springboot.app.model.Usuario;

@Component
public class SistemaUsuario implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		Usuario gleyson = criarUsuarioGleyson();
		Usuario admin = criarUsuarioAdmin();
		
		Iterable<Usuario> usuarios = null;
		usuarios.forEach(u->System.out.println(u.getNomeCompleto() + " - " + u.getLogin()));
		
	}
	private Usuario criarUsuarioGleyson() {
		Usuario usuario = new Usuario();
		usuario.setEmail("gleyson@dio.com.br");
		usuario.setLogin("gleyson");
		usuario.setNomeCompleto("GLEYSON SAMPAIO");
		usuario.setSenha("diospringjpa");
		return usuario;
	}
	private Usuario criarUsuarioAdmin() {
		Usuario usuario = new Usuario();
		usuario.setEmail("admin@dio.com.br");
		usuario.setLogin("admin");
		usuario.setNomeCompleto("ADMINISTRADOR");
		usuario.setSenha("masterpass");
		return usuario;
	}
	
}
