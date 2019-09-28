package Logic;

public class Entropy {

	private double n;

	private double p;

	private double total;

	private double entropy;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getEntropy() {
		countEntropy();
		return entropy;
	}

	public void setEntropy(double entropy) {
		this.entropy = entropy;
	}

	private double getLog(double x, double o) {
		return Math.log10(x) / Math.log10(o);
	}

	private void countEntropy() {
		setEntropy((-getP() / (getP() + getN())) * getLog((getP() / (getP() + getN())), 2)
				- (getN() / (getP() + getN())) * getLog(getN() / (getP() + getN()), 2));
	}

}
