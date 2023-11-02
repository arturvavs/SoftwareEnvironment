public class Medico {
    String nome_medico;
    int num_crm;
    String nome_UF_crm;
    String num_cpf;
    String num_rg;
    String endereco_email;
    String num_contato;

    public void exibe_dados(){
        System.out.println("Nome: "+ this.nome_medico);
        System.out.println("CRM: "+ this.num_crm);
        System.out.println("UF: "+ this.nome_UF_crm);
        System.out.println("CPF: "+ this.num_cpf);
        System.out.println("RG: "+ this.num_rg);
        System.out.println("RG: "+ this.endereco_email);
        System.out.println("RG: "+ this.num_contato);

    }
}
