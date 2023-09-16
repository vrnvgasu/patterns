package creational.builder;

public class SqlBuilder {

	private String select;

	private String from;

	private String where;

	public SqlBuilder() {
		reset();
	}

	public SqlBuilder setSelect(String select) {
		this.select = this.select + select + " ";
		return this;
	}

	public SqlBuilder setFrom(String from) {
		this.from = this.from + from + " ";
		return this;
	}

	public SqlBuilder setWhere(String where) {
		if (this.where.isEmpty()) {
			this.where = "WHERE ";
		}
		this.where = this.where + where + " ";
		return this;
	}

	public SqlBuilder setAndWhere(String where) {
		if (!this.where.isEmpty()) {
			this.where += "AND ";
		}

		return setWhere(where);
	}

	public SqlBuilder setOrWhere(String where) {
		if (!this.where.isEmpty()) {
			this.where += "OR ";
		}

		return setWhere(where);
	}

	public String buid() {
		String result = select + from + where + ";";
		reset();
		return result;
	}

	public void reset() {
		select = "SELECT ";

		from = "FROM ";

		where = "";
	}

}
