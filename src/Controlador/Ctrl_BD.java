/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FormaPago;
import Modelo.Prestamo;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author PC
 */
public class Ctrl_BD {

    Session ss;
    Transaction tx;
    
    public Ctrl_BD() {}
    
    public List<FormaPago> cargarFormasPago(){
        iniciaOperacion();
        String hql = "FROM FormaPago AS FP";
        Query query = ss.createQuery(hql);
        List results = query.list();
        ss.close();
        return results;
    }
    
    public List<Prestamo> cargarPrestamos(){
        iniciaOperacion();
        Criteria cr = ss.createCriteria(Prestamo.class);
        cr.addOrder(Order.asc("NPrestamo"));
        List results = cr.list();
        ss.close();
        return results;
    }
    
    public boolean anadirPrestamo(Prestamo p){
        try{
            iniciaOperacion();
            ss.save(p);
        }catch(HibernateException he){
            System.out.println("Error = "+he.getMessage());
            return false;
        }finally{
            cerrarOperacion();
        }
        return true;
    }
    
    public boolean borrarPrestamo(Prestamo p){
        try{
            iniciaOperacion();
            ss.delete(p);
        }catch(HibernateException he){
            System.out.println("Error = "+he.getMessage());
            return false;
        }finally{
            cerrarOperacion();
        }
        return true;
    }
    
    public boolean modificarPrestamo(Prestamo p){
        try{
            iniciaOperacion();
            ss.update(p);
        }catch(HibernateException he){
            System.out.println("Error = "+he.getMessage());
            return false;
        }finally{
            cerrarOperacion();
        }
        return true;
    }
    
    public Double getMaxId(List<Prestamo> lista){
        Double aux = 0.0;
        for(Prestamo p : lista){
            if(Double.parseDouble(p.getNPrestamo().toString())>aux){
                aux = Double.parseDouble(p.getNPrestamo().toString());
            }
        }
        return aux+1;
    }
    
    private void iniciaOperacion() throws HibernateException {
        ss = NewHibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
    }

    private void cerrarOperacion() throws HibernateException {
        tx.commit();
        ss.close();
    }
}