/* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Rectangle rect = new Rectangle(); // Criar uma instância da classe Rectangle (mais correto)
        // Outra maneira seria colocar o entities.Rectangle rect = new entities.Rectangle(); , ai nao precisaria de import entities.Rectangle
        
        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();// Definir a largura do retângulo
        rect.height = sc.nextDouble(); // Definir a altura do retângulo
        
        //essa parte de baixo foi para classe Rectangle
        
        /*double area = widht * height; 
        double perimeter = 2 * widht + 2 * height; 
        double diagonal2 = Math.pow(widht, 2) +  Math.pow(height, 2);
        double diagonal = Math.sqrt(diagonal2);*/   // linha 25,26 formaram o public double diagonal
        System.out.println("ÁREA = " + rect.area());
        System.out.println("PERIMETER = "+ rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());     
    }
}
