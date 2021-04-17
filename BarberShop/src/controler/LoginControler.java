/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import controler.Helpers.LoginHelper;
import model.Usuario;
import view.Login;

/**
 *
 * @author mateu
 */
public class LoginControler {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginControler(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view); 
    }

    public LoginControler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void entrarNoSistema(){
        
        Usuario usuario = helper.ObterModelo();
       
        // pesquisar usuario no banco
        // se dados do banco retornarem igual redirecionar ao menu
        // se não mostrar mensagem us/senha invalido
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }

    public void exibeMensagem(String executei_o_fiz_tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
