/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systm.dao;


import br.com.systm.conexao.ConexaoSingleton;
import br.com.systm.model.Paisproduto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Wolverine
 */

public class PaisProdutoDao {
 
    public List<Paisproduto> listar() {
    	EntityManager manager;
        manager = ConexaoSingleton.getConnection();
        Query q = manager.createQuery("select p from Paisproduto p where p.produtos.idprodutos=1 order by p.pais.nome");
        List<Paisproduto> listaPaisProduto = q.getResultList();
        manager.close();
        return listaPaisProduto;
    }
}
