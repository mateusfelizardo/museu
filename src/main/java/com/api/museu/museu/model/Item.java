package com.api.museu.museu.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean documentoSigiloso;
    private String etec;
    private String termo;
    private String codigo;
    private String cota;
    private String nomeTecnico;
    private String nomeVulgar;
    private String areaDeEstudo;
    private int seculo;
    private String imagemUrl;
    private String creditoImagem;
    private String localizacao;
    private String material;
    private String altura;
    private String largura;
    private String cumprimento;
    private String estadoDeConservacao;
    private String nomeFabricante;
    private String anoDeFabricacao;
    private String importador;
    private String descricao;
    private String historia;
    private String nomeResponsavel;
    private LocalDate ultimaAtualizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDocumentoSigiloso() {
        return documentoSigiloso;
    }

    public void setDocumentoSigiloso(Boolean documentoSigiloso) {
        this.documentoSigiloso = documentoSigiloso;
    }

    public String getEtec() {
        return etec;
    }

    public void setEtec(String etec) {
        this.etec = etec;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getNomeVulgar() {
        return nomeVulgar;
    }

    public void setNomeVulgar(String nomeVulgar) {
        this.nomeVulgar = nomeVulgar;
    }

    public String getAreaDeEstudo() {
        return areaDeEstudo;
    }

    public void setAreaDeEstudo(String areaDeEstudo) {
        this.areaDeEstudo = areaDeEstudo;
    }

    public int getSeculo() {
        return seculo;
    }

    public void setSeculo(int seculo) {
        this.seculo = seculo;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getCreditoImagem() {
        return creditoImagem;
    }

    public void setCreditoImagem(String creditoImagem) {
        this.creditoImagem = creditoImagem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getCumprimento() {
        return cumprimento;
    }

    public void setCumprimento(String cumprimento) {
        this.cumprimento = cumprimento;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }

    public void setEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getImportador() {
        return importador;
    }

    public void setImportador(String importador) {
        this.importador = importador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}
