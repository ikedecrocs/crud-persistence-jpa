package view;

import javax.swing.JFrame;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("123.456.789-01");
         cliente.setId(1);
         cliente.setNome("UPOUVCXFOPICAAKJHGALJH K,JB");
         cliente.setRg("12.345.678-9");
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("Break in to Break out");
    }
}
