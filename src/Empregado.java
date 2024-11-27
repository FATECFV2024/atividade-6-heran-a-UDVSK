public class Empregado {


    private String nome;
    private String endereco;
    private double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double calcularIRPF() {
        double irpf;
        if (salario <= 1903.98) {
            irpf = 0;
        } else if (salario <= 2826.65) {
            irpf = salario * 0.075;
        } else if (salario <= 3751.05) {
            irpf = salario * 0.15;
        } else if (salario <= 4664.68) {
            irpf = salario * 0.225;
        } else {
            irpf = salario * 0.275;
        }
        return irpf;
    }

    public double calcularINSS() {
        double inss;
        if (salario <= 1212.00) {
            inss = salario * 0.075;
        } else if (salario <= 2427.35) {
            inss = salario * 0.09;
        } else if (salario <= 3641.03) {
            inss = salario * 0.12;
        } else if (salario <= 7087.22) {
            inss = salario * 0.14;
        } else {
            inss = salario * 0.14;
        }
        return inss;
    }

    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: R$ " + salario);
        System.out.println("IRPF: R$ " + calcularIRPF());
        System.out.println("INSS: R$ " + calcularINSS());
    }

    public Empregado(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }


}
