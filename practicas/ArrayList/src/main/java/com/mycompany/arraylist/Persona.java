/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author gottig
 */
public class Persona {
//Atributos
private int id;
private String nombre;
private int edad;
//Constructor por defecto
        public Persona(){
                
        }
  //Constructor con parametos
 public Persona(int valorID,String valorNombre, int valorEdad ){
   id =valorID;
   nombre=valorNombre;
   edad= valorEdad;                
 }
// Atributos de la clase
   public void setID (int valorid) {
        id = valorid;
    } 
    public int getID() { 
      return id; 
    } 
     public void setNombre (String valorNombre) {
        nombre = valorNombre;

    } 
    public String getNombre () { 
      return nombre; 
    } 
     public void setEdad (int valorEdad) {
        edad = valorEdad;
    } 
    public int getEdad() { 
      return edad; 
    } 
}