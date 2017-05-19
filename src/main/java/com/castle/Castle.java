package com.castle;

public class Castle {
	
	private final int stretch;
	private final PlaceType place;
	
	public Castle(int stretch, PlaceType place) {
		this.stretch = stretch;
		this.place = place;
	}

	public int getStretch() {
		return stretch;
	}

	public PlaceType getPlace() {
		return place;
	}

}
