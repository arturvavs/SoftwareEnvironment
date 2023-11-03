public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Inicio da Atividade");
        Medico m1 = new Medico();
        m1.set_Nome("Artur Vinicius Araujo");
        m1.set_Crm(9533);
        m1.set_Contato("85997376830");
        m1.set_Cpf("02605416305");
        m1.set_RG("2009009132966");
        m1.set_Email("arturavs1996@gmail.com");
        m1.set_Especialidade("Clínica Médica");
        m1.set_UF("CE");
        
        m1.exibe_dados();

    }
}
