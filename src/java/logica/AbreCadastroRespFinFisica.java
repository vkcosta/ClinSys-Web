/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vitor.costa
 */
public class AbreCadastroRespFinFisica implements Logica{

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) {
    return "CadastroRespFinFisica.jsp";
    }
    
}
