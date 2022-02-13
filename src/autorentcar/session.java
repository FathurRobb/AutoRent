/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorentcar;

/**
 *
 * @author Hp
 */
public class session {
    private static String username;
    private static String nik_kar;
    
    public static void set_username(String username) {
        session.username = username;
    }
    
    public static String get_username(){
        return username;
    }
    
    public static void set_nik_kar(String nik_kar) {
        session.nik_kar = nik_kar;
    }
    
    public static String get_nik_kar(){
        return nik_kar;
    }
    
}
