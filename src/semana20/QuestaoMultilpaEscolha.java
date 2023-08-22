package semana20;


import java.util.List;

public class QuestaoMultilpaEscolha  extends Questao {
        private List respostasCorretas; 

        public QuestaoMultilpaEscolha(int numero, String enunciado, List respostasCorretas) 
        { 
            super(numero, enunciado); 
            this.respostasCorretas = respostasCorretas; 
        } 

        @Override 
        
        public boolean validarResposta(String resposta) 
        { 
            return respostasCorretas.contains(resposta); 
        } 

        @Override 
        public int getPontuacao() 
        { 
            return respostasCorretas.size(); 
        }
    }

    
