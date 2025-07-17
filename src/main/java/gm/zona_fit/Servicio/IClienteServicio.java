/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gm.zona_fit.Servicio;
import java.util.List;
import gm.zona_fit.modelo.Cliente;

/**
 *
 * @author jesus
 */
public interface IClienteServicio {
    public List<Cliente> ListarClientes();
    
    public Cliente buscarClientePorId(Integer idCliente);
    
    public void guadarCliente( Cliente cliente );
    
    public void eliminarCliente( Cliente cliente );
    
}
