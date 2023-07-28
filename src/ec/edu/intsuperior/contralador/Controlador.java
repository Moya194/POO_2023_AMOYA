/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.contralador;


import ec.edu.intsuperior.vista.*;


public class Controlador {
    FmrLoggin fmrLoggin = new FmrLoggin(this);
    FmrAdministrador fmrAdministrador =new FmrAdministrador(this);
    public void MostrarAdministrador(){
        fmrAdministrador.setVisible(true);
    }
    public void OcultarAdministrador(){
        fmrAdministrador.setVisible(false);
    }
  
    public void MostrarLoggin() {
        fmrLoggin.setVisible(true);
    }
    public void OcultarLoggin() {
        fmrLoggin.setVisible(false);
    }

}
