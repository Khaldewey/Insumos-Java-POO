public class Caneta {
    private String modelo;
    public String cor;
    private int carga;
    protected float ponta;
    protected boolean tampada;

    // Método construtor
    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    // #########################################

    // Métodos da classe
    public void status() {
        System.out.println("Modelo :" + this.modelo);
        System.out.println("Cor :" + this.cor);
        System.out.println("Carga :" + this.carga);
        System.out.println("Ponta :" + this.ponta);
        System.out.println("Tampada? :" + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void escrever() {
        if (this.tampada == true) {
            System.out.println("Não posso escrever pois estou tampado");
        } else {
            System.out.println("Escrevendo ...");
        }
    }
    // #############################################

    // Métodos Acessores

    public int getCarga() {
        return carga;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    // ##########################################

    // Métodos Modificadores

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

}
