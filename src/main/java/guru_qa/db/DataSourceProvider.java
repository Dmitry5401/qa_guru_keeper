package guru_qa.db;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    PGSimpleDataSource ds;

    public DataSource getDataSource() {
        if (ds == null) {
            ds = new PGSimpleDataSource();
            ds.setServerNames(new String[] {"localhost"});
            ds.setPortNumbers(new int[] {5432});
            ds.setDatabaseName("qa_guru_keeper");
            ds.setUser("postgres");
            ds.setPassword("mysecretpassword");
        }
        return ds;
    }


}
