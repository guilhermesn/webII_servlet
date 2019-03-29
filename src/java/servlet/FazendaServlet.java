/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import modelo.Usuario;

/**
 *
 * @author guilherme
 */
@WebServlet("/usuario")
public class FazendaServlet extends HttpServlet {

    UsuarioDAO dao = new UsuarioDAO();

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        
        response.setContentType("application/json");
        List<Usuario> lista;
        lista = dao.listar();
        //Converter para Gson
        Gson g = new Gson();
        String a;
        a = "{\"usuario\":";
        a += g.toJson(lista);
        a += ",\"status\":\"success\"}";
        //g = "{" + g.toJson(lista).toString() + "}";
        //JSONObject usuarioJSON = new JSONObject(g.toJson(lista).toString());
        try (PrintWriter out = response.getWriter()) {
            out.print(a);
        }
//        
//
//        
//        
    }
    public void  liberaCors( HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String email = request.getParameter("login");
        String perfil = request.getParameter("senha");
        Usuario usuario = new Usuario(login, senha, email, perfil);
        try (PrintWriter out = response.getWriter()) {
            if (usuario.getLogin() == "" || usuario.getSenha() == "") {
                out.print(Response.status(Response.Status.BAD_REQUEST).entity("Login e senha do usuario é obrigatorio").build());
            } else {
                if (dao.inserir(usuario)) {
                    out.print(Response.status(Response.Status.CREATED).entity("success").build());
                }
                out.print(Response.status(Response.Status.BAD_REQUEST).entity("Cadastro não realizado!").build());
            }
        }

    }

}
