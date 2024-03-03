public class Motorcycle {

	private String VIN;
	private int engineSize;
	private double invoicePrice;
	
	
	public Motorcycle() {
		
	}

	// Getter and Setter
	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public double getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	
	// The engine size rounded up or down to the nearest 10’s of cc’s
	// The invoice price to 2 decimal places
	public String toString() {
		long roundedEngineSize;
		String roundedInvoicePrice;
		
		roundedEngineSize = Math.round(engineSize/10.0)*10;
		roundedInvoicePrice = String.format("%.2f", invoicePrice);
		return VIN + "," + roundedEngineSize + " cc"+ "," + "$" + roundedInvoicePrice;
//		return VIN + "," + engineSize + " cc"+ "," + "$" + invoicePrice;
	}

}

