import java.util.Scanner;

public class estudos1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String[] nomesdalunos = {  "", "", "", "" };
        int[] notasprimeiraprova = {  0, 0, 0, 0 };
        int[] notassegundaprova = {  0, 0, 0, 0 };
        int[] notasterceiraprova = {  0, 0, 0, 0 };
        int[] mediadasnotas = {  0, 0, 0, 0 };
        System.out.print("CALCULANDO MÉDIA DE NOTA DE PROVAS DOS ALUNOS\n\n-----------------------------------------------------------------------\n\n");
        for(int i = 0;i < 4;i++){
            System.out.print("Digite o nome do aluno:\n");
            nomesdalunos[i] = ler.next();
            System.out.print("Digite a nota da primeira prova de " + nomesdalunos[i] + "\n");
            notasprimeiraprova[i] = ler.nextInt();
            System.out.print("Digite a nota da segunda prova de " + nomesdalunos[i] + "\n");
            notassegundaprova[i] = ler.nextInt();
            System.out.print("Digite a nota da terceira prova de " + nomesdalunos[i] + "\n");
            notasterceiraprova[i] = ler.nextInt();
            mediadasnotas[i] = (notasprimeiraprova[i] + notassegundaprova[i] + notasterceiraprova[i])/3;
            System.out.print("--------------------------------------------------------------------------------------\n");
        }
        ler.close();
        System.out.print("RESULTADO DAS PROVAS\n\n\n");
        for(int i = 0;i < 4;i++){
            System.out.print("Aluno: " + nomesdalunos[i] + "\n\n");
            System.out.print("Nota da primeira prova: " + notasprimeiraprova[i] + "\n");
            System.out.print("Nota da segunda prova: " + notassegundaprova[i] + "\n");
            System.out.print("Nota da terceira prova: " + notasterceiraprova[i] + "\n\n");
            System.out.print("Média final:" + mediadasnotas[i] + " / 10\n");

            if(mediadasnotas[i] >= 6){
                System.out.print("O aluno " + nomesdalunos[i] + " está aprovado.\n");
            }else if(mediadasnotas[i] < 6 && mediadasnotas[i] >= 3){
                System.out.print("O aluno " + nomesdalunos[i] + " está em recuperação.\n");
            }else{
                System.out.print("O aluno " + nomesdalunos[i] + " está reprovado.\n");
            }

            System.out.print("--------------------------------------------------------------------------------------\\n");

        }
    }
}
