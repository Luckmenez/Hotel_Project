package com.mycompany.hotel_reservation;

public class Register implements RegisterMethods{
    private String name;
    private String adress;
    private String telephone;
    private String neighborhood;
    private String city;
    private String state;
    private String birthDate;
    private String rg;
    //Em linhas separadas para manter a facilidade de leitura
    
    public Register (String n, String a, String t, String ne, String c, String s, String b, String r){
        this.name         = n;
        this.adress       = a;
        this.telephone    = t;
        this.neighborhood = ne;
        this.city         = c;
        this.state        = s;
        this.birthDate    = b;
        this.rg           = r;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getNeighborhood() {
        return neighborhood;
    }
    
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void registerVerification(){
        System.out.println("Verificação de registro:\n====================================");
        System.out.println("Nome: "        + this.getName() + 
                           "\nEndereço: "  + this.getAdress() + 
                           "\nTelefone: "  + this.getTelephone() +
                           "\nBairro: "    + this.getNeighborhood() +
                           "\nCidade: "    + this.getCity() + 
                           "\nEstado: "    + this.getState() +
                           "\nNascimento " + this.getBirthDate() +
                           "\nRG "         + this.getRg());
    }
    
}
