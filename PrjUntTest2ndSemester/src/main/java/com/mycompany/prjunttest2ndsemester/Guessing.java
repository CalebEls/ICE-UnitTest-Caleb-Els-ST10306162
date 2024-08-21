/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjunttest2ndsemester;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Guessing extends Words
{
  public boolean TestWord(String strGuess)
    {
       String strInput = strGuess.toLowerCase();
       int count = this.getWords().length;
       for(int x = 0; x < count; x++)
       {
           if(strInput.equals(this.getWords()[x]))
           {
               return true;
           }
       }
       return false;
    }
    public void GetData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        
        String strGuess = scan.nextLine();
        
        if(this.TestWord(strGuess))
        {
            System.out.println("Well done, you got it right.");
        }
        else
        {
            System.err.println("Goodluck next time");
        }
    }
}