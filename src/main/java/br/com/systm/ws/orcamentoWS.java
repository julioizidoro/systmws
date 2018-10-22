/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systm.ws;


import br.com.systm.dao.PaisProdutoDao;
import br.com.systm.model.Paisproduto;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Wolverine
 */
@Path("")
public class orcamentoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public orcamentoWS() {
    }

    /**
     * Retrieves representation of an instance of
     * br.com.travelamte.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getPais() {
        PaisProdutoDao paisProdutosDao = new PaisProdutoDao();
        List<Paisproduto> lista = paisProdutosDao.listar();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }

    @GET
    @Produces("application/text")
    public String getLeads() {
    
        return "OK";
    }

   

}
