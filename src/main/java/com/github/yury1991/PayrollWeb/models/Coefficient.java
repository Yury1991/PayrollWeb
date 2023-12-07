package com.github.yury1991.PayrollWeb.models;

public abstract class Coefficient {
	private float minCoefficient;
	private float maxCoefficient;
	
	public abstract float calculateCoefficient();
	
	public Coefficient(float minCoefficient, float maxCoefficient){
		this.minCoefficient = minCoefficient;
		this.maxCoefficient = maxCoefficient;
	}
	
	public float getMinCoefficient() {
		return minCoefficient;
	}

	public void setMinCoefficient(float minCoefficient) {
		this.minCoefficient = minCoefficient;
	}

	public float getMaxCoefficient() {
		return maxCoefficient;
	}

	public void setMaxCoefficient(float maxCoefficient) {
		this.maxCoefficient = maxCoefficient;
	}	
}
