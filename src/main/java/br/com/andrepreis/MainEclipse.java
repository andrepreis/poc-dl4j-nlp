package br.com.andrepreis;

import br.com.andrepreis.model.DeepModelUtils;

public class MainEclipse {

	public static void main(String[] args) {
		DeepModelUtils deepModel = null;
		
		String modelPath="C:\\Workspace\\Outros\\poc-dl4j-nlp\\resources\\";
		String modelName= "Modelo_NLP.zip";
		String trainingFiles="C:\\Workspace\\Outros\\poc-dl4j-nlp\\resources\\celulares";
		String nbrEpochs="100";
		
		try {
			deepModel = new DeepModelUtils(modelPath,modelName,trainingFiles,nbrEpochs);
			deepModel.trainModel();
			System.out.println("Modelo Gerado com sucesso !");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
