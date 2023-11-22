public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Inicio da Atividade");
        String nome = "Artur";
        int crm = 175;
        String uf = "CE";
        String cpf = "02605416305";
        String rg = "2009009132966";
        String email = "arturavs@edu.unifor.br";
        String contato = "85-997376830";

        Medico m1 = new Medico(nome,crm,uf,cpf,rg,email,contato);
        m1.exibeDados();

        m1.validaCpf(cpf);
        
        if(m1.validaCpf(cpf)){
            System.out.println("CPF Válido!");
        }
        else{
            System.out.println("CPF inválido!");
        }


    }
}
