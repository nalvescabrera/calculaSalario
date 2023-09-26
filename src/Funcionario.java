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

    public void setCargo(Cargo cargo) {
        if(cargo == null){
            try{
            } catch (Exception e){
                System.out.println("Cargo está como nulo");
            }
        }else{
            this.cargo = cargo;
        }
    }

    public double getSalario() {
        double porcentagemBonus = 0;
        double salarioNovo = 0;
        if(cargo == Cargo.Dev){
            if(salarioBase > 3000){
                porcentagemBonus = 10;
                salarioNovo = (salarioBase * porcentagemBonus) / 100;

            }else {
                porcentagemBonus = 20;
                salarioNovo = (salarioBase * porcentagemBonus) / 100;

            }
        }else{
            if(salarioBase > 3000){
                porcentagemBonus = 15;
                salarioNovo = (salarioBase * porcentagemBonus) / 100;

            }else{
                porcentagemBonus = 20;
                salarioNovo = (salarioBase * porcentagemBonus) / 100;

            }
        }
        return salarioNovo + salarioBase;
    }

    public void setSalario(double salarioBase) {
            if(salarioBase <= 0){
                try{
                }catch (Exception e){
                    System.out.println("Salario está nulo");
                }
            }else {
                this.salarioBase = salarioBase;
            }

    }

    public void print(){
        System.out.println("Cargo: " + this.cargo + " , salario base " + this.salarioBase+ ", salario total " + getSalario());
    }
}
