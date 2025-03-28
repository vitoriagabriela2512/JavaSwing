package classeusuario;

public class ClasseUsuario {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("meuLogin", "minhaSenha");
        System.out.println(usuario1.autenticar("meuLogin", "minhaSenha"));

       //se ele for meuLogin e minhaSenha vai dar true se nao sempre vai dar false o q indica que o login
       //ou senha esta errado 

    }

}
