/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loganshitlavane
 */
package tax.calculator.io;

import java.text.NumberFormat;
import java.util.Locale;
import java.awt.Desktop;
import java.net.URI;

public class TaxController {
  
    public static void main(String args[])throws Exception{
        
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://localhost:8080/tax"));
   
    }
   
    
    private static NumberFormat  CurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    
    private int tax_year;
    private int age;
    private double monthlyIncomeTax = 0;
    private double rate = 0;
    private boolean medicalAid;

    public int getTax_year() {
        return tax_year;
    }

    public void setTax_year(int tax_year) {
        this.tax_year = tax_year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMonthlyIncomeTax() {
        return monthlyIncomeTax;
    }

    public void setIncomeTax(double inc){
         
        
        
    }
    
    public void setMonthlyIncomeTax(String s) {
        
        
        
        
        
       
        if(s == null){
            
           monthlyIncomeTax = 0;
           
        }else{
            try{
                
              if ((s.charAt(0) =='$')&& (s.length() > 1)){
                
                s = s.substring(1);
            }  
               s = s.trim();
               monthlyIncomeTax = Double.parseDouble(s);
            }catch(Exception e){
                
                monthlyIncomeTax = 0;
            }
        } 
        
       
    }

    public double getRate(){
        
        return rate;
    }
    
    
    public String formatIncome() {
      return CurrencyFormatter.format(monthlyIncomeTax);
   }
 
   public String formatTax() {
      return CurrencyFormatter.format(rate);
   }
    
    
    
    public boolean isMedicalAid() {
        return medicalAid;
    }

    public void setMedicalAid(boolean medicalAid) {
        this.medicalAid = medicalAid;
    }
    
    
   
    
}


    

