/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author guilherme
 */
public class Usuario {
    
    private String login;
    private String senha;
    private String email;
    private String perfil;

    public Usuario(){}
    
    public Usuario(String plogin, String psenha, String pemail, String pperfil){
        this.login = plogin;
        this.senha = psenha;
        this.email = pemail;
        this.perfil = pperfil;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
}
