package padroes.projeto;

public class DataBase {
	private static DataBase dataBase;

	public DataBase() {
	}

	public static synchronized DataBase getInstance() {
		if (dataBase == null) {
			getConnection();
			dataBase = new DataBase();
		}
		return dataBase;
	}

	public static void getConnection() {
		System.out.println("Conectado!");
	}
}