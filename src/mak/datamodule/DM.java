/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mak.datamodule;

import java.sql.Connection;

/**
 *
 * @author mak2
 */
public class DM {

    private static DM dm;
    Connection connection;

    public static synchronized DM GetInstance() {
        if (dm == null) {
            dm = new DM();
        }
        return dm;
    }
    public void setConnection(Connection cn){
        connection=cn;
    }
    DM(){
        
    }
}
