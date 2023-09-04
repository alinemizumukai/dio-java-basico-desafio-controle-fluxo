package edu.desafio;

public class ParametrosInvalidosException extends Exception {

    public String mensagemErro;
    public ParametrosInvalidosException (String mensagemErro){
        this.mensagemErro = mensagemErro ;
    }
}
