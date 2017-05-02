package demo.annotation.db;

/**
 * Created by owen on 2017/4/23.
 */
@DBTable(name = "product")
public class Product {

    @SQLInteger(name = "id")
    @Constraints(primaryKey = true,allowNull = false)
    private int id;

    @SQLString(name = "name",value = 255)
    @Constraints(allowNull = false,unique = false)
    private String name;

}
