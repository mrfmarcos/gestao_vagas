package br.com.marcosf.gestao_vagas.exceptions;

public class CompanyNotFoundException extends RuntimeException{
 
    public CompanyNotFoundException(){
        super("User not found");
    }
    
}
