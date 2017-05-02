package demo.annotation.db;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by owen on 2017/4/23.
 */
public class SQLCreator {

    public static void main(String[] args) throws ClassNotFoundException {
        //把要解析的类名当作参数传进来
        if(args.length<1){
            System.out.println("please specify the table name");
            System.exit(0);
        }
        //表名
        String tableName=null;

        //为传入的每个类创建SQL语句
        for(String className:args){
            //获得表名
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if(dbTable!=null){
                tableName = dbTable.name();
            }
            //获得表中每一列的定义
            List<String> columnDef = new ArrayList<>();
            for (Field field:cl.getDeclaredFields()) {
                //列名
                String columnName;
                //列约束
                String cols;
                Annotation []anns = field.getDeclaredAnnotations();
                if(anns[0]instanceof SQLString){
                    SQLString sqlS = (SQLString)anns[0];
                    //获得列名
                    columnName = sqlS.name().toUpperCase();
                    //获得列约束
                    cols = getConstrants((Constraints)anns[1]);
                    columnDef.add(columnName+" VARCHAR("+sqlS.value()+")"+cols);
                }else if(anns[0] instanceof SQLInteger){
                    SQLInteger sqlI = (SQLInteger)anns[0];
                    columnName = sqlI.name().toUpperCase();
                    cols = getConstrants((Constraints)anns[1]);
                    columnDef.add(columnName+" INT "+cols);
                }


            }
            StringBuilder createSQL = new StringBuilder("CREATE TABLE "+tableName+" (\n");
            for(String s:columnDef){
                createSQL.append(s);
            }
            String comd = createSQL.substring(0,createSQL.length()-1) +");";
            System.out.println(comd);
        }

    }
    //返回“约束”的定义
    private static String getConstrants(Constraints constraints){
        String s = "";
        if(!constraints.allowNull())
            s += " NOT NULL ";
        if(constraints.primaryKey())
            s += " PRIMARYKEY ";
        if(constraints.unique())
            s += " UNIQUE ";
        return s+"\n";
    }
}
