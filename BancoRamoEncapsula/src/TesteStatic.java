public class TesteStatic {
    public static void main(String[] args) {
         Cliente Luan = new Cliente("Luan", "12345678912");

         Conta conta1 = new Conta(1234, 121212, Luan);
        Conta conta2 = new Conta(1234, 121212, Luan);
        Conta conta3 = new Conta(1234, 121212, Luan);

        System.out.println("O total de contas é: " + Conta.getTotal());



    }
}
