package br.fatecrl.mvcdemo.models;

public class Aparelho {
    private String idaparelho;
    private String nome;
    private String tipo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdaparelho() {
        return idaparelho;
    }

    public void setIdaparelho(String idaparelho) {
        this.idaparelho = idaparelho;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aparelho(String idaparelho, String nome, String tipo) {
        this.idaparelho = idaparelho;
        this.nome = nome;
        this.tipo = tipo;
    }

}
