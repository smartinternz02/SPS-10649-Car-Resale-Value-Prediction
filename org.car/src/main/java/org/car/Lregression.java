
package org.car;


import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Lregression {
	public static void main(String[] args) throws Exception {
		DataSource src=new DataSource("C:\\Users\\Sreeya\\eclipse-workspace\\org.car\\src\\main\\java\\org\\car\\train_data.arff");
		//DataSource src1=new DataSource("C:\\java eclipse work\\org.ml\\src\\main\\java\\org\\ml\\test_data.arff");

		Instances ds=src.getDataSet();
		ds.setClassIndex(ds.numAttributes()-1);
		LinearRegression lr=new LinearRegression();
		lr.buildClassifier(ds);
		/*Instances ds1=src1.getDataSet();
		ds1.setClassIndex(ds1.numAttributes()-1);
		LinearRegression lr1=new LinearRegression();
		lr.buildClassifier(ds1);*/
		Evaluation lr_eval=new Evaluation(ds);
		lr_eval.evaluateModel(lr, ds);
		System.out.println(lr_eval.toSummaryString());
		
		/*Instance car = ds1.lastInstance();
		double price = lr.classifyInstance(car);
		System.out.println("-------------------------");	
		System.out.println("PRECTING THE PRICE : "+price);*/
		
		/*Classifier classifier = new weka.classifiers.functions.LinearRegression();
		
		classifier.buildClassifier(ds);
		double confusion[][] = lr_eval.confusionMatrix();
		System.out.println("Confusion matrix:");
		for (double[] row : confusion)
			System.out.println(	 Arrays.toString(row));
		System.out.println("-------------------");

		System.out.println("Area under the curve");
		System.out.println( lr_eval.areaUnderROC(0));
		System.out.println("-------------------");
		
		System.out.println(lr_eval.getAllEvaluationMetricNames());
		
		System.out.print("Recall :");
		System.out.println(Math.round(lr_eval.recall(1)*100.0)/100.0);
		
		System.out.print("Precision:");
		System.out.println(Math.round(lr_eval.precision(1)*100.0)/100.0);
		System.out.print("F1 score:");
		System.out.println(Math.round(lr_eval.fMeasure(1)*100.0)/100.0);
		
		System.out.print("Accuracy:");
		double acc = lr_eval.correct()/(lr_eval.correct()+ lr_eval.incorrect());
		System.out.println(Math.round(acc*100.0)/100.0);
		
		
		System.out.println("-------------------");
		Instance predicationDataSet = ds1.get(2);
		double value = classifier.classifyInstance(predicationDataSet);
		
		System.out.println("Predicted label:");
		System.out.print(value);*/
		
	}

}