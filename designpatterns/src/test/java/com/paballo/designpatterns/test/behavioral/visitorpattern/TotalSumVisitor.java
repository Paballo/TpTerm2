/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.behavioral.visitorpattern;

import java.util.List;

/**
 *
 * @author ngcamango
 */
public class TotalSumVisitor implements NumberVisitor {

	int totalSum = 0;

	@Override
	public void visit(TwoElement twoElement) {
		int sum = twoElement.a + twoElement.b;
		System.out.println("Adding " + twoElement.a + "+" + twoElement.b + "=" + sum + " to total");
		totalSum += sum;
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int sum = threeElement.a + threeElement.b + threeElement.c;
		System.out.println("Adding " + threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum + " to total");
		totalSum += sum;
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) {
			ne.accept(this);
		}
	}

	public int getTotalSum() {
		return totalSum;
	}

}
