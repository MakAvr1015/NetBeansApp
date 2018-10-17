/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mak.documents;

import java.sql.Date;
import java.util.List;
import mak.nsi.LstPartner;
import mak.prototypes.DocPrototype;

/**
 * Документ прихода (закупка)
 * @author mak2
 */
public class DocInput implements DocPrototype {

    public class DocInputPos{
        private DocPosition f_pos;
        private Float f_price;
    }
    
    private List<DocInputPos> f_lst_pos;
    private int f_id;
    private String f_number;
    private Date f_date;
    private int f_state;
    private LstPartner.Partner f_partner;
    
    @Override
    public int GetDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ShowDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
