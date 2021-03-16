package domein;

import exceptions.TeGroteBestellingException;

public class Bestelling {
	private int printers, laptops, scanners;

	public Bestelling(int printers, int laptops, int scanners) throws TeGroteBestellingException {
		if (printers + laptops + scanners > 8) {
			throw new TeGroteBestellingException();
		}
		setPrinters(printers);
		setLaptops(laptops);
		setScanners(scanners);
	}

	@Override
	public String toString() {
		return String.format("Bestelling van %d printers, %d laptops en %d scanners", printers, laptops, scanners);
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

}
