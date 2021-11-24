/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FormaPago;
import Modelo.Prestamo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author PC
 */
public class Ctrl_BD {

    Session ss;
    
    public Ctrl_BD() {
        ss = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<FormaPago> cargarFormasPago(){
        String hql = "FROM FormasPago AS FP";
        Query query = ss.createQuery(hql);
        List results = query.list();
        
        return results;
    }
    
    public List<Prestamo> cargarPrestamos(){
        Criteria cr = ss.createCriteria(Prestamo.class);
        cr.addOrder(Order.desc("NPrestamo"));
        List results = cr.list();
        
        return results;
    }
    
}