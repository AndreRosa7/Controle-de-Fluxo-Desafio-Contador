package br.com.desafio_controle_fluxo;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
