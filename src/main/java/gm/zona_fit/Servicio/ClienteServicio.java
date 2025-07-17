/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.zona_fit.Servicio;
import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 *
 * @author jesus
 */

@Service
public class ClienteServicio implements IClienteServicio{
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    
    @Override
    public List<Cliente> ListarClientes(){
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }
    
    
    
    @Override
    public Cliente buscarClientePorId(Integer idCliente){
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null);
        return cliente;
    }
    
    
    
    @Override
    public void guadarCliente( Cliente cliente ){
        clienteRepositorio.save(cliente);
        
    }
    
    
    
    @Override
    public void eliminarCliente( Cliente cliente ){
        clienteRepositorio.delete(cliente);
    }
}
