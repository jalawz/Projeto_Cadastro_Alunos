// classe abstrata
public class Aluno 
{
    String pnome;
    String unome;
    int pontos;
    
    // construtor
    
    Aluno()
    {
        this ("", "", 0 ); // referência branco, branco e inteiro
        
    }
    
    Aluno(String pnomealuno, String unomealuno, int pontosaluno)
    {
        pnome = pnomealuno;
        unome = unomealuno;
        pontos = pontosaluno;
        
    }
            
    
}
