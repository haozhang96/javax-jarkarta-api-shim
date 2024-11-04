package javax.annotation.sql;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.sql.DataSourceDefinition} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DataSourceDefinitions.class)
@Deprecated(since = "jakarta.annotation.sql.DataSourceDefinition")
public @interface DataSourceDefinition {
    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#name()
     */
    String name();

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#className()
     */
    String className();

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#description()
     */
    String description() default "";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#url()
     */
    String url() default "";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#user()
     */
    String user() default "";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#password()
     */
    String password() default "";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#databaseName()
     */
    String databaseName() default "";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#portNumber()
     */
    int portNumber() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#serverName()
     */
    String serverName() default "localhost";

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#isolationLevel()
     */
    int isolationLevel() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#transactional()
     */
    boolean transactional() default true;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#initialPoolSize()
     */
    int initialPoolSize() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#maxPoolSize()
     */
    int maxPoolSize() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#minPoolSize()
     */
    int minPoolSize() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#maxIdleTime()
     */
    int maxIdleTime() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#maxStatements()
     */
    int maxStatements() default -1;

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#properties()
     */
    String[] properties() default {};

    /**
     * @see jakarta.annotation.sql.DataSourceDefinition#loginTimeout()
     */
    int loginTimeout() default 0;
}
