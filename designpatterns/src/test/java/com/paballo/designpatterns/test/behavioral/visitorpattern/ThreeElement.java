/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.behavioral.visitorpattern;

/**
 *
 * @author ngcamango
 */
public class ThreeElement implements NumberElement {

	int a;
	int b;
	int c;

	public ThreeElement(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void accept(NumberVisitor visitor) {
		visitor.visit(this);
	}

}
