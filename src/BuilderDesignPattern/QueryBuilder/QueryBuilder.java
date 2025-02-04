package BuilderDesignPattern.QueryBuilder;

public class QueryBuilder {
    private final String select;
    private final String from;
    private final String where;
    private final String orderBy;
    private final String limit;

    //Private constructor to enforce usage of Builder
    private QueryBuilder(Builder builder){
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.orderBy = builder.orderBy;
        this.limit = builder.limit;

    }

    //Returns the final Sql Query
    public String getQuery(){
        StringBuilder query = new StringBuilder();
        query.append("SELECT ").append(select).append(" ");
        query.append("FROM ").append(from).append(" ");
        if(where!= null) query.append("WHERE ").append(where).append(" ");
        if(orderBy != null) query.append("ORDER BY ").append(orderBy).append(" ");
        if(limit !=null) query.append("LIMIT ").append(limit).append(" ");
        return query.toString().trim() + ";";

    }
    public static class Builder{
        private  String select;
        private  String from;
        private  String where;
        private  String orderBy;
        private  String limit;

        public Builder select(String columns){
            this.select = columns;
            return this;
        }

        public Builder from(String table){
            this.from = table;
            return this;
        }

        public Builder where(String condition){
            this.where = condition;
            return this;

        }
        public Builder orderBy(String column,String order){
            this.orderBy = column + " " + order;
            return this;
        }

        public  Builder limit(int limit){
            this.limit  = String.valueOf(limit);
            return this;
        }

        public QueryBuilder build(){
            if(select == null || from == null){
                throw new IllegalStateException("SELECT and FROM clauses are Mandatory ");
            }
            return new QueryBuilder(this);
        }

    }
}
