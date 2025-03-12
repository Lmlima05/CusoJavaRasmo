public class TesteEncapsulamento {
    public static void main(String[] args) {
 //      Cliente cliente = new Cliente();
//        cliente.setNome("Luan");
//        cliente.setCpf("123456789");
//        cliente.setProfissao("Desenvolvedor");
//        cliente.setSalario(10000);

        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(1500);
        conta.setAgencia(10);

        conta.setTitular(new Cliente());
        conta.getTitular().setNome("Gustavo");
        conta.getTitular().setCpf("123456789");
        conta.getTitular().setProfissao("Desenvolvedor");
        conta.getTitular().setSalario(10000);

        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(conta.getTitular().getSalario());
        System.out.println(conta.getSaldo());

    }
}
