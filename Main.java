public class Main {
    public static void main(String[] args) {
        //Caneta c1 = new Caneta("BIC", 0.7f, "Azul");
        
        Pessoa p1 = new Pessoa("Raimundo","Masculino","19/05/1996");
        Funcionario f1 = new Funcionario(p1, "Tecnologia da Informação", "Técnico de Informática", 1670.85f);
        //p1.now();
       // p1.dataNascimento();
        //p1.idade(); 
        
        f1.funcionario();
        //p1.dataNascimento();
        // c1.carga = 90;
        //c1.cor = "Azul";
        // c1.modelo = "Bic";
        //c1.ponta = 0.5f;

        //c1.destampar();
        //c1.tampar();
        //c1.escrever();
        //c1.status();

        //ControleRemoto c = new ControleRemoto();
        //c.ligar();

        //c.maisVolume();
        //c.abrirMenu();

    }
}
