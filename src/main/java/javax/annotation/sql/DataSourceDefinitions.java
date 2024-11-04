package javax.annotation.sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.annotation.sql.DataSourceDefinitions} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.annotation.sql.DataSourceDefinitions")
public @interface DataSourceDefinitions {
    /**
     * @see jakarta.annotation.sql.DataSourceDefinitions#value()
     */
    DataSourceDefinition[] value();
}
