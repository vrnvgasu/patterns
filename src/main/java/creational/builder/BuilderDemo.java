package creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		SqlBuilder sqlBuilder = new SqlBuilder();
		sqlBuilder
				.setSelect("code")
				.setFrom("countries");
		System.out.println(sqlBuilder.buid());

		sqlBuilder
				.setSelect("*")
				.setFrom("users")
				.setWhere("id=1");
		System.out.println(sqlBuilder.buid());
	}

}
