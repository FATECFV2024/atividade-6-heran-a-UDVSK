public class Horista extends Empregado {
    private double horas;

    
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
        calcularSalario(); // Recalcula o salário quando as horas forem alteradas
    }

    // Método para calcular o salário baseado nas horas trabalhadas
    public void calcularSalario() {
        double salario = horas * 50;
        setSalario(salario);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Horas trabalhadas: " + horas);
    }

    public Horista(String nome, String endereco, double salario, double horas) {
        super(nome, endereco, salario);
        this.horas = horas;
        calcularSalario(); // Calcula o salário de acordo com as horas
    }
}
