package domein;

import exceptions.TeGroteBestellingException;

public class Bestelling {
	private int laptops, scanners, printers;

	public Bestelling(int laptops, int scanners, int printers) throws TeGroteBestellingException {
		super();

		if (laptops + scanners + printers > 8) {
			throw new TeGroteBestellingException();
		}
		setLaptops(laptops);
		setPrinters(printers);
		setScanners(scanners);
	}

	@Override
	public String toString() {
		return String.format("Bestelling van %d printers, %d laptops en %d scanners", getPrinters(), getLaptops(),
				getScanners());
	}

	public int getLaptops() {
		return laptops;
	}

	public void setLaptops(int laptops) {
		if (laptops > 2) {
			throw new IllegalArgumentException("Aantal laptops maximaal 2!");
		}
		this.laptops = laptops;
	}

	public int getScanners() {
		return scanners;
	}

	public void setScanners(int scanners) {
		if (scanners > 3) {
			throw new IllegalArgumentException("Aantal scanners maximaal 3!");
		}
		this.scanners = scanners;
	}

	public int getPrinters() {
		return printers;
	}

	public void setPrinters(int printers) {
		if (printers > 4) {
			throw new IllegalArgumentException("Aantal printers maximaal 4!");
		}
		this.printers = printers;
	}

}
