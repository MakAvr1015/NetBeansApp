/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mak.nsi;

/**
 * Справочник товаров
 *
 * @author mak2
 */
public class LstGoods {

    public class Good {

        public int f_id;
        public String f_article;
        public String f_name;

        Good(int p_id) {
            f_id = p_id;
        }
    }
}
