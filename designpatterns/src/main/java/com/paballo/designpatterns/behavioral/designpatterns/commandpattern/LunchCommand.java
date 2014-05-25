/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.designpatterns.commandpattern;

/**
 *
 * @author ngcamango
 */
public class LunchCommand implements Command {

	Lunch lunch;

	public LunchCommand(Lunch lunch) {
		this.lunch = lunch;
	}

	@Override
	public String execute() {
		String l = lunch.makeLunch();
                return l;
	}

}
