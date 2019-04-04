/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.dao.EquipoDAO;
import org.o7planning.restfulcrud.model.Equipo;

/**
 *
 * @author DALVAREZ
 */
@Path("/equipo")
public class EquipoService {
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public List<Equipo> getEquipos_JSON() {
        List<Equipo> equipos = EquipoDAO.getAllEquipos();
        return equipos;
    }
    
    @GET
    @Path("/{eqId}")
    @Produces({ MediaType.APPLICATION_JSON})
    public Equipo getEquipo_JSON(@PathParam("eqId") String eqId) {
        return EquipoDAO.getEquipo(eqId);
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
//    @GET
//    @Produces({ MediaType.APPLICATION_JSON})
//    public List<Equipo> getEquipo() {
//        List<Equipo> equipos = new ArrayList<Equipo>();
//        
//        Equipo eq1 = new Equipo();
//        eq1.setId("1");
//        eq1.setNombre("FC Barcelona");
//        Equipo eq2 = new Equipo();
//        eq2.setId("2");
//        eq2.setNombre("España");
//        Equipo eq3 = new Equipo();
//        eq3.setId("3");
//        eq3.setNombre("Manchester United");
//        
//        equipos.add(eq1);
//        equipos.add(eq2);
//        equipos.add(eq3);
//        
//        return equipos;
//    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo addEquipo(Equipo emp) {
        return EquipoDAO.addEquipo(emp);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo updateEquipo(Equipo emp) {
        return EquipoDAO.updateEquipo(emp);
    }
 
    @DELETE
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEquipo(@PathParam("empNo") String empNo) {
        EquipoDAO.deleteEquipo(empNo);
    }
}
