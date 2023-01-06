public class CarroTestar {

    public static void main(String[] args) {

        // Instanciando o objeto:
        Carro c1 = new Carro();

        // Declarando valores aos atributos:
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.placa = "0000-AAA";
        c1.ano = 2015;
        c1.vel = 60;
        c1.radar = "";

        // Chamando os metodos
        c1.acelerar(60);
        c1.frear(50);
        c1.radar();
        System.out.println("Model: " + c1.nome + "\nMarca: " + c1.marca + "\nPlaca: " + c1.placa + "\nAno: " + c1.ano);
    }
}