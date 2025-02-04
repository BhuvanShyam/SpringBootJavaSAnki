package BuilderDesignPattern.QueryBuilder;

public class Main {
    public static void main(String[] args) {
        QueryBuilder query = new QueryBuilder.Builder()
                .select("*")
                .from("employees")
                .where("age > 25")
                .orderBy("name", "ASC")
                .limit(10)
                .build();
        System.out.println(query.getQuery());
    }
}
