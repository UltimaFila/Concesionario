public class Coche {

	String Marca;
	String Modelo;
	String Bastidor;
	int Kilometraje;

	public Coche() {
	}

	public Coche(String Marca, String Modelo, String Bastidor, int Kilometraje)

	{

		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Bastidor = Bastidor;
		this.Kilometraje = Kilometraje;

	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public void setBastidor(String Bastidor) {
		this.Bastidor = Bastidor;
	}

	public void setKilometraje(int Kilometraje) {
		this.Kilometraje = Kilometraje;
	}

	public String getMarca() {
		return this.Marca;
	}

	public String getModelo() {
		return this.Modelo;
	}

	public String getBastidor() {
		return this.Bastidor;
	}

	public int getKilometraje() {
		return this.Kilometraje;
	}

	public String toString() {
		return (this.Marca + this.Modelo + this.Bastidor + this.Kilometraje);

	}
}
