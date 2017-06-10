
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class MetodosAluno {
    public Aluno[] gravarAluno(Aluno[] aluno) throws IOException{
           
        int i;
        String fileName =  "ArquivoAluno.txt"; // quando for gravar os dados, ficarão no arquivoaluno.txt
        // reserva e carrega o conjunto de dados na memória para otimizar a gravação
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        
        for(i=0; i<3; i++){
            aluno[i] = new Aluno();
        }
        for(i=0; i<3; i++){
            aluno[i].pnome = JOptionPane.showInputDialog("Entre com o nome do aluno");// primeiro dado
           gravar.write(aluno[i].pnome);// grava dado
            gravar.newLine();// dixa uma linha
            aluno[i].unome = JOptionPane.showInputDialog("Entre o  sobrenome do aluno");
            gravar.write(aluno[i].unome);
           gravar.newLine();
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog(" Pontos de graduação:"));
           gravar.write(Integer.toString(aluno[i].pontos));// converte inteiro para string pra gravação física
           gravar.newLine();           
        }
         for(i=0; i<3; i++){
                System.out.println(aluno[i].pnome + " "+ aluno[i].unome+ " "+ aluno[i].pontos);
            }
           gravar.close();// comando para terminar/ fechar a gravação dos arquivos
        return aluno;
    }// fim do  método gravar
    
    public void lerAluno(Aluno[] aluno) throws  IOException{
        int i;      
        String fileName = "ArquivoAluno.txt";
        BufferedReader ler = new BufferedReader( new FileReader( fileName));
         
        for(i=0; i<3; i++){
            aluno[i] = new Aluno();
        }
        for(i=0; i<3; i++){
            aluno[i].pnome = ler.readLine();
            aluno[i].unome = ler.readLine();
            aluno[i].pontos =Integer.parseInt(ler.readLine());
        }
        for(i=0; i<3; i++){
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " " + aluno[i].pontos);
        }
        ler.close();
    
    }
    
}
