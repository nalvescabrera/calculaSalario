public class Main {
    public static void main(String[] args) {
        System.out.println("---Teste Calcula Salario---");

        Funcionario dev1 = new Funcionario(Cargo.Dev, 1000.00);
        dev1.print();
        dev1.getSalario();
        dev1.print();

        Funcionario dev2 = new Funcionario(Cargo.Dev, 5000.00);
        dev2.print();
        dev2.getSalario();
        dev2.print();

        Funcionario dba = new Funcionario(Cargo.DBA, 2000.00);
        dba.print();
        dba.getSalario();
        dba.print();

        Funcionario dba2 = new Funcionario(Cargo.DBA, 4000.00);
        dba2.print();
        dba2.getSalario();
        dba2.print();

        Funcionario tester1 = new Funcionario(Cargo.Tester, 1000.00);
        tester1.print();
        tester1.getSalario();
        tester1.print();

        Funcionario tester2 = new Funcionario(Cargo.Tester, 6000.00);
        tester2.print();
        tester2.getSalario();
        tester2.print();

    }
}