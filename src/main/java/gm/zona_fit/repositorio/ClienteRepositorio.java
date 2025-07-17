/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gm.zona_fit.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import gm.zona_fit.modelo.Cliente;
/**
 *
 * @author jesus
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
    
}
