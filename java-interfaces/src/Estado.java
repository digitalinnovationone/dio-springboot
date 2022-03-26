public enum Estado {
    SP("sp","SAO PAULO",Regiao.SUDESTE),
    RJ("rj","RIO DE JANEIRO", Regiao.SUDESTE),
    MA("ma","MARANHÃO",Regiao.NORDESTE)
    ;
    private String nome;
    private String sigla;
    private Regiao regiao;

    private Estado(String sigla,String nome, Regiao regiao){
        this.sigla=sigla;
        this.nome = nome;
        this.regiao = regiao;
    }
    public String getNome() {
        return nome;
    }


    public String getSigla() {
        return sigla;
    }

    public Regiao getRegiao() {
        return regiao;
    }
}
