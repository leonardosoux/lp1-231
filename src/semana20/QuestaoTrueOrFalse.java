package semana20;


public class QuestaoTrueOrFalse extends Questao{
    
    private boolean respostaCorreta; 

    public QuestaoTrueOrFalse(int numero, String enunciado, boolean respostaCorreta) 

    { 
        super(numero, enunciado); this.respostaCorreta = respostaCorreta; 
    } 

    @Override 
    public boolean validarResposta(String resposta) 

    { 
        return resposta.equalsIgnoreCase("V") == respostaCorreta; 
    } 

    @Override 
    public int getPontuacao() 
    { 
        return respostaCorreta ? 1 : 0; 
    }
}

    
