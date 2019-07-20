package br.com.andrepreis.util;

public enum ConfigParameters {

	MODEL_PATH("/home/andre-reis/git/poc-dl4j-nlp/resources/"),
	MODEL_NAME("CELL_BRANDS.ZIP"),
	MODEL_LABELS_NUMBER("5"),
	TRAIN_DATA_PATH("/home/andre-reis/git/poc-dl4j-nlp/resources/celulares");
	
	private final String valor;
	
	ConfigParameters(String valorOpcao){
        valor = valorOpcao;
    }
    public String getValor(){
        return valor;
    }
}
