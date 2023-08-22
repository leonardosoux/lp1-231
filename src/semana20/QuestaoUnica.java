package semana20;

public class QuestaoUnica extends Questao {
    
    private String respostaCorreta; 
        
    public QuestaoUnica(int numero, String enunciado, String respostaCorreta) 
    { 
        super(numero, enunciado); 
        this.respostaCorreta = respostaCorreta; 
    } 

        @Override 
        public boolean validarResposta(String resposta) 
    { 
        return resposta.equalsIgnoreCase(respostaCorreta); 
    }

        @Override
        public int getPontuacao() {
            return 1;
        }
}
        
