/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ropandi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class ModelWord {

    /**
     * @param args the command line arguments
     */
    private String kataDasar;
    private String soal;
    private String hint;
    private String jawaban;

    /**
     * @return the kataDasar
     */
    


    public ModelWord(String kataDasar, String hint) {
        this.kataDasar = kataDasar;
        this.hint = hint;
    }

    ModelWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String createSoal() {
        String kata = kataDasar.toUpperCase();
        char [] kataVokal = {'A','I','E','O','U'};
        for ( int i = 0; i < kataVokal.length; i++) {
            kata = kata.replace(kataVokal[i], ' ');
        }
        String [] arrayOfKata = kata.split("");
        Arrays.sort(arrayOfKata);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arrayOfKata.length; i++) {
            sb.append(arrayOfKata [i]);
        }
        String soal = sb.toString().trim();
        return soal;
    }
    public String acakHuruf() {
           String kata = kataDasar.toUpperCase();
           String [] arrayOfKata = kata.split("");
           List <String> hurufHuruf = Arrays.asList(arrayOfKata);
           Collections.shuffle(hurufHuruf);
           StringBuilder sb = new StringBuilder();
           for (String huruf : hurufHuruf) {
               if(!(huruf.equals(" ")))
                   
               sb.append(huruf);
        }
           
           String soal = sb.toString();
          return soal;
            
    }
    private boolean isJawaban() {
        boolean jawabanBener = false;
        if (kataDasar.equalsIgnoreCase(getJawaban())) {
            jawabanBener = true;
        }
        return jawabanBener;
    }
    public String cekJawaban() {
        String jawaban = "Coba Lagi";
        if (isJawaban() == true) {
            jawaban = "Jenius";
        }
        return jawaban;
    }
            
    public String getKataDasar() {
        return kataDasar;
    }

    /**
     * @param kataDasar the kataDasar to set
     */
    public void setKataDasar(String kataDasar) {
        this.kataDasar = kataDasar;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
    
}
