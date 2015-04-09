import java.util.Random;

public class Coche {

	String Marca;
	String Modelo;
	String Bastidor;
	int Kilometraje;

	public Coche() {
	}

	public Coche(String Marca, String Modelo, int Kilometraje)

	{

		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Kilometraje = Kilometraje;
		randomito(Marca.charAt(0));

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
		return (this.Marca + " " + this.Modelo + " " + this.Bastidor + " " + this.Kilometraje);

	}
	
	

		public void randomito(char letra) {

			String cadena1 = CadenaAlfanum(1);
			String cadena2 = CadenaAlfanum(11);
			
			int randomito = (int) (Math.random()*(1000000-100000)+100000);
			
			
			setBastidor(cadena1+letra+cadena2+randomito);
			
		}

		static String CadenaAlfanum(int longitud) {
			
			
			String cadenaAleatoria = "";
			Random rm=new Random();
			long m = rm.nextInt(1000000000);
			Random r = new Random(m);
			int i = 0;
			while (i < longitud) {
				char c = (char) r.nextInt(255);
				if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
					cadenaAleatoria += c;
					i++;
				}
			}
			return cadenaAleatoria;
		}
	}


