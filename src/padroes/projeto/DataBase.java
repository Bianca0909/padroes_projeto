package padroes.projeto;

public class DataBase {
	private static DataBase dataBase;

	public DataBase() {
	}

	public static synchronized DataBase getInstance() {
		if (dataBase == null) {
			dataBase = new DataBase();
		}
		return dataBase;
	}
}