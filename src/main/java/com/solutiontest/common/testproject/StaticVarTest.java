package com.solutiontest.common.testproject;

public class StaticVarTest {

	public static void main(String[] args) {

		CollectionClass colC = new CollectionClass();
		
		System.out.println("Collectio nclas static var  : "+CollectionClass.getLimit());
		CollectionClass.setLimit(22);
		CollectionClass colC2 = new CollectionClass();
		CollectionClass.setLimit(33);
		System.out.println("Collectio nclas static var  : "+colC2.getLimit());
		
	}

}
