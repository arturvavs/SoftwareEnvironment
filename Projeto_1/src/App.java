public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio da Atividade");
        Medico m1 = new Medico();
        m1.nome_medico = "Artur Vinicius Araujo Vieira de Sousa";
        m1.num_crm = 9533;
        m1.nome_UF_crm = "CE";
        m1.num_cpf = "026054163035";
        m1.num_rg = "2009009132966";  
        m1.endereco_email = "arturavs1996@gmail.com";
        m1.num_contato = "85-997376830";
        m1.exibe_dados();
    }
}
