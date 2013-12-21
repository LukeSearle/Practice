/*
 * Copyright (c) 2013. MIDN Luke Searle, RAN
 *
 * University of New South Wales @ the Australian Defence Force Academy
 */

/**
 * Created with IntelliJ IDEA.
 * User: SEARLE
 * Date: 3/12/13
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */

public class AlreadyLocked extends Exception {
	public AlreadyLocked() {
		super("Door is already locked");
	}


	public static void main(String[] args) {

	}
}
