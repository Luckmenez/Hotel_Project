package com.mycompany.hotel_reservation;

public class Reservation implements RegisterMethods{
    private String acomodationType;
    private String checkIn;
    private String checkout;
    private Register registratedClient;
    
    public String getAcomodationType() {
        return acomodationType;
    }
    
    public void setAcomodationType(String acomodationType) {
        this.acomodationType = acomodationType;
    }
    
    public String getCheckIn() {
        return checkIn;
    }
    
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
    public String getCheckout() {
        return checkout;
    }
    
    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    
    @Override
    public void registerVerification(){
        System.out.println("Verificação de registro:\n====================================");
        System.out.println("Nome: "        + registratedClient.getName() + 
                           "\nEndereço: "  + registratedClient.getAdress() + 
                           "\nTelefone: "  + registratedClient.getTelephone() +
                           "\nBairro: "    + registratedClient.getNeighborhood() +
                           "\nCidade: "    + registratedClient.getCity() + 
                           "\nEstado: "    + registratedClient.getState() +
                           "\nNascimento " + registratedClient.getBirthDate() +
                           "\nRG "         + registratedClient.getRg());
    }    
    
    
}
