package classeusuario;
//crie uma classe Usuario com os atributos private login e senha. Adicione um método public boolean 
//autenticar(String login, String senha) que verifica se os valores fornecidos correspondem aos armazenados.

public class Usuario {
private String login;
private String senha;

public Usuario(String login){
    this.login = login;
} 
public Usuario(){
    
} 
public Usuario(String login, String senha){
    this.login = login;
    this.senha = senha;
} 
//Sor pesquisei e sei q a gnt ainda n usou mas testei de tudo e só esse deu
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
   }


public String getlogin (){
return this.login;
        
}
public String getsenha (){
return this.senha;
}
        
public void setLogin (String login){
 this.login = login;
}
        
public void setsenha (String senha){
this.senha = senha;
        
}

}

