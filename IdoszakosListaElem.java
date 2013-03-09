/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.jszfk;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Róbert
 */
public class IdoszakosListaElem {
    
    private Date idoszakKezdete;
    private Date idoszakVege;
    private Object taroltObjektum;

    public Date getIdoszakKezdete() {
        return idoszakKezdete;
    }

    public Date getIdoszakVege() {
        return idoszakVege;
    }

    public Object getTaroltObjektum() {
        return taroltObjektum;
    }

    public IdoszakosListaElem(Date idoszakKezdete, Date idoszakVege, Object taroltObjektum) {
        this.idoszakKezdete = idoszakKezdete;
        this.idoszakVege = idoszakVege;
        this.taroltObjektum = taroltObjektum;
    }
}
