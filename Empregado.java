public calssa Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    //Fazer gets e sets para cada um

    public double calculaSalario(){
        double salarioLiquido=0;
        salarioLiquido=this.salarioBase-this.imposto;
        return salarioLiquido;
    }
}