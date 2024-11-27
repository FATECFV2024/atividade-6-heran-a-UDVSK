public class App {
    public static void main(String[] args) {
        // Criando um Mensalista
        Mensalista mensalista = new Mensalista("Carlos Silva", "Rua A, 123", 0, "Pleno");
        mensalista.imprimir();
        
        System.out.println(); // Espaçamento entre as informações

        // Criando um Horista
        Horista horista = new Horista("Ana Pereira", "Rua B, 456", 0, 160);
        horista.imprimir();
    }
}
