/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Equipo;

/**
 *
 * @author DALVAREZ
 */
public class EquipoDAO {
    private static final Map<String, Equipo> empMap = new HashMap<String, Equipo>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Equipo emp1 = new Equipo("E01", "FC Barcelona");
        Equipo emp2 = new Equipo("E02", "España");
        Equipo emp3 = new Equipo("E03", "Manchester United");
 
        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
    }
 
    public static Equipo getEquipo(String empNo) {
        return empMap.get(empNo);
    }
 
    public static Equipo addEquipo(Equipo emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }
 
    public static Equipo updateEquipo(Equipo emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }
 
    public static void deleteEquipo(String empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Equipo> getAllEquipos() {
        Collection<Equipo> c = empMap.values();
        List<Equipo> list = new ArrayList<Equipo>();
        list.addAll(c);
        return list;
    }
     
    List<Equipo> list;
}
