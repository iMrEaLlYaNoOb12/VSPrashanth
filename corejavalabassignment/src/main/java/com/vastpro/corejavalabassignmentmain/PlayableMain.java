package com.vastpro.corejavalabassignmentmain;
import com.vastpro.corejavalabassignmentservice.GuitarImpl;
import com.vastpro.corejavalabassignmentservice.PianoImpl;
import com.vastpro.corejavalabassignmentservice.Playable;

public class PlayableMain {

	public static void main(String[] args) {
		Playable guitar = new GuitarImpl();
		Playable piano = new PianoImpl();

		guitar.play();
		piano.play();

	}

}
