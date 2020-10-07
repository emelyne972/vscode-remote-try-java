/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package io.github.emelyne972;


public class Etudiant 
{
    public String nom;
    public String prenom;
    public String date_naissance;
    public String telephone;

    public String toString ( ){
      return "Etudiant :"+ nom + prenom + " " + date_naissance + " " + telephone;  
    }
    public static void main(String[] args  )
    {


      System.out.println( "Hello Remote World!" );
    
    }
    
    
}
