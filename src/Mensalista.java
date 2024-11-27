public class Mensalista extends Empregado {


    private String cargo;

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        calcularSalario();
    }

    public void calcularSalario() {
        double salario = 0;
        switch (cargo.toLowerCase()) {
            case "junior":
                salario = 2500;
                break;
            case "pleno":
                salario = 3500;
                break;
            default:
                salario = 5500;
                break;
        }
        setSalario(salario);
    }

    public Mensalista(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario);
        this.cargo = cargo;
        calcularSalario(); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cargo: " + cargo);
    }
}
