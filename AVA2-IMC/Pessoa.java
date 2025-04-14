public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodo para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Metodo para classificar o IMC
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String getNome() {
        return nome;
    }
}
