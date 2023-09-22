public class Funcionario {
        private Cargo cargo;
        private double salarioBase;


    public Funcionario(Cargo cargo, double salarioBase) {
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Object setCargo(Cargo cargo) {
        if(cargo == null){
            return null;
        }
        return cargo;
    }

    public double getSalario() {
        double porcentagemBonus = 0;
        double salarioNovo = 0;
        if(salarioBase <= 3000){
            if(cargo.equals(Cargo.Dev)){
                porcentagemBonus = 20;
                salarioNovo = (porcentagemBonus * salarioBase) / 100;
            } else {
                porcentagemBonus = 10;
                salarioNovo = (porcentagemBonus * salarioBase) / 100;
            }
            if (cargo.equals(Cargo.DBA) && cargo.equals(Cargo.Tester)){
                if(salarioBase >= 3000){
                    porcentagemBonus = 10;
                    salarioNovo = (porcentagemBonus * salarioBase) / 100;
                }else {
                    porcentagemBonus = 15;
                    salarioNovo = (porcentagemBonus * salarioBase) / 100;
                }

            }
        }
        return salarioNovo;
    }
    public void setSalario(double salarioBase) {
        if(salarioBase <= 0){
            return;
        }
        this.salarioBase = salarioBase;
    }

    public void print(){
        System.out.println(this.cargo + " , salario base " + this.salarioBase+ ", salario total " + this.salarioBase);
        System.out.println(this.cargo + " , salario base " + this.salarioBase+ ", salario total " + this.salarioBase);
    }
}
