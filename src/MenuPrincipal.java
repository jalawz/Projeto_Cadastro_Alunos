
import java.io.IOException;
import javax.swing.JOptionPane;


public class MenuPrincipal {
    public static void main(String[] args) throws IOException {
        Aluno[] aluno = new Aluno[3];
        MetodosAluno met = new MetodosAluno();
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu Alunos \n 1-Cadastra Aluno \n 2-Ler Registro \n 9-Fim."));
            switch (op){
                case 1:
                    aluno = met.gravarAluno(aluno);
                break;
                case 2:
                    met.lerAluno(aluno);
                break;
            }             
        }while(op!=9);
    }
      
}
