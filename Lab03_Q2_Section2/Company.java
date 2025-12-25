public class Company {
	String name;
	int code;
	double scale;
	Integer codestring = new Integer(code);
	
	public Company(String name, int code, double scale) {
		this.name = name;
		this.code = code;
		this.scale = scale;
	}
}
