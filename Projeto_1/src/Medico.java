public class Medico {
    public String nome_medico;
    public int num_crm;
    public String nome_UF_crm;
    private String num_cpf;
    private String num_rg;
    public String endereco_email;
    public String num_contato;
    public String nome_especialidade;

    public String get_Nome(){
        return this.nome_medico;
    };

    public int get_Crm(){
        return this.num_crm;
    };

    public String get_UF(){
        return this.nome_UF_crm;
    };

    public String get_Cpf(){
        return this.num_cpf;
    };

    public String get_Rg(){
        return this.num_rg;
    };

    public String get_Email(){
        return this.endereco_email;
    };

    public String get_Contato(){
        return this.num_contato;
    };

    public String get_Especialidade(){
        return this.nome_especialidade;
    };
      
    
    public void set_Nome(String nome){
        this.nome_medico = nome;
    };

    public void set_Crm(int crm){
        this.num_crm = crm;
    };

    public void set_UF(String uf){
        this.nome_UF_crm = uf;
    };

    public void set_Cpf(String cpf){
        this.num_cpf = cpf;
    };

    public void set_RG(String rg){
        this.num_rg = rg;
    };

    public void set_Email(String email){
        this.endereco_email = email;
    };

    public void set_Contato(String contato){
        this.num_contato = contato;
    }

    public void set_Especialidade(String especialidade){
        this.nome_especialidade = especialidade;
    }

    

    public void cadastro_medico(String nome, int crm, String UF, String cpf, String rg, String email, String contato){



    }

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
