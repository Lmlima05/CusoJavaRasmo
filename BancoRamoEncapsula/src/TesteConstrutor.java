public class TesteConstrutor {
    public static void main(String[] args) {
        Cliente Pedro = new Cliente("Pedro", "12345678919");
        Conta conta = new Conta(10, 2192, Pedro);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());

    }
}
