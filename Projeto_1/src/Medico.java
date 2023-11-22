public class Medico {
    public String nomeMedico;
    public int numCrm;
    public String nomeUfCrm;
    private String numCpf;
    private String numRg;
    public String enderecoEmail;
    public String numContato;
    public String nomeEspecialidade;

    public String getNome() {
        return this.nomeMedico;
    }

    public int getCrm() {
        return this.numCrm;
    }

    public String getUf() {
        return this.nomeUfCrm;
    }

    public String getCpf() {
        return this.numCpf;
    }

    public String getRg() {
        return this.numRg;
    }

    public String getEmail() {
        return this.enderecoEmail;
    }

    public String getContato() {
        return this.numContato;
    }

    public String getEspecialidade() {
        return this.nomeEspecialidade;
    }

    public void setNome(String nome) {
        this.nomeMedico = nome;
    }

    public void setCrm(int crm) {
        this.numCrm = crm;
    }

    public void setUf(String uf) {
        this.nomeUfCrm = uf;
    }

    public void setCpf(String cpf) {
        this.numCpf = cpf;
    }

    public void setRg(String rg) {
        this.numRg = rg;
    }

    public void setEmail(String email) {
        this.enderecoEmail = email;
    }

    public void setContato(String contato) {
        this.numContato = contato;
    }

    public void setEspecialidade(String especialidade) {
        this.nomeEspecialidade = especialidade;
    }

    public Medico(String nome, int crm, String uf, String cpf, String rg, String email, String contato) {
        this.nomeMedico = nome;
        this.numCrm = crm;
        this.nomeUfCrm = uf;
        this.numCpf = cpf;
        this.numRg = rg;
        this.enderecoEmail = email;
        this.numContato = contato;

    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nomeMedico);
        System.out.println("CRM: " + this.numCrm);
        System.out.println("UF: " + this.nomeUfCrm);
        System.out.println("CPF: " + this.numCpf);
        System.out.println("RG: " + this.numRg);
        System.out.println("E-mail: " + this.enderecoEmail);
        System.out.println("Contato: " + this.numContato);
    }


    public boolean validaCpf(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
