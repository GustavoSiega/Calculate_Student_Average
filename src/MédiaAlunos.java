import java.util.Arrays;
import java.util.Scanner;

public class MédiaAlunos {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String aluno1, aluno2, aluno3, aluno4;
        Double media;
        Double[] notasAlunos = new Double [4];

        System.out.println("Para começarmos informe o nome do(a) 1° aluno(a):");
        aluno1 = scan.nextLine();

        System.out.println("");

        System.out.println("Para começarmos informe o nome do(a) 2° aluno(a):");
        aluno2 = scan.nextLine();

        System.out.println("");

        System.out.println("Para começarmos informe o nome do(a) 3° aluno(a):");
        aluno3 = scan.nextLine();

        System.out.println("");

        System.out.println("Para começarmos informe o nome do(a) 4° aluno(a):");
        aluno4 = scan.nextLine();

        System.out.println("");

        //ALUNO 1
        System.out.println("Informe as notas do "+aluno1+":");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Informe a "+(i+ 1)+"° Nota:");
            notasAlunos[i] = scan.nextDouble();
            System.out.println("");
        }
        Arrays.sort(notasAlunos);
        Double media1 = (notasAlunos[2] + notasAlunos[3]) / 2;

        System.out.println("A média do(a) aluno(a) " +aluno1+" é:" +media1);

        //quebrar linha
        System.out.println("");

        //ALUNO 2
        System.out.println("Informe as notas do "+aluno2+":");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Informe a "+(i+ 1)+"° Nota:");
            notasAlunos[i] = scan.nextDouble();
            System.out.println("");
        }
        Arrays.sort(notasAlunos);
        Double media2 = (notasAlunos[2] + notasAlunos[3]) / 2;

        System.out.println("A média do(a) aluno(a) " +aluno2+" é:" +media2);

        //quebrar linha
        System.out.println("");

        //ALUNO 3
        System.out.println("Informe as notas do "+aluno3+":");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Informe a "+(i+ 1)+"° Nota:");
            notasAlunos[i] = scan.nextDouble();
            System.out.println("");
        }
        Arrays.sort(notasAlunos);
        Double media3 = (notasAlunos[2] + notasAlunos[3]) / 2;

        System.out.println("A média do(a) aluno(a) " +aluno3+" é :" +media3);

        //quebrar linha
        System.out.println("");

        //ALUNO 4
        System.out.println("Informe as notas do "+aluno4+":");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Informe a "+(i+ 1)+"° Nota:");
            notasAlunos[i] = scan.nextDouble();
            System.out.println("");
        }
        Arrays.sort(notasAlunos);
        Double media4 = (notasAlunos[2] + notasAlunos[3]) / 2;

        System.out.println("A média do(a) aluno(a) " +aluno4+" é :" +media4); 
        //quebrar linha
        System.out.println("");

        //TABELA GERAL DE MÉDIAS
        System.out.println("Tabela de médias: \n"
        +aluno1+" Média: "+media1+"\n"
        +aluno2+" Média: "+media2+"\n"
        +aluno3+" Média: "+media3+"\n"
        +aluno4+" Média: "+media4);
    }
}
 