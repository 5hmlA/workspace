package ${PACKAGE_NAME};

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created on 2016/1/10.  by Jonas{https://github.com/mychoices}
 */
public class ${NAME} {

    private final static String PACK_NAME = "${PACKAGE_NAME}.greendao";
//    private final static String DAO_PATH = "G:\\ITworld\\as\\0RxJava\\GreenDaoPractice\\app\\src\\main\\java-gen";
//    private final static String DAO_PATH = "G:/ITworld/as/0RxJava/GreenDaoPractice/app/src/main/java-gen";
    private final static String DAO_PATH = "..\\GreenDaoPractice\\app\\src\\main\\java-gen";
//    private final static String DAO_PATH = "../GreenDaoPractice/app/src/main/java-gen";

    public static void main(String[] args) throws Exception{

        //1,创建 用于添加实体类/表 的 模式对象(Schema)
        Schema schema = new Schema(1, PACK_NAME);

        //2,添加实体类/表
        addTables(schema);

        //3,通过DAOGenerator对象的generateAll 按照模式对象自动生成ben,dao等文件写入java-gen
        new DaoGenerator().generateAll(schema,DAO_PATH);

    }

    /**
     * 添加表
     * @param schema
     */
    private static void addTables(Schema schema){
        //--------添加表1----------
        //根据表名 通过addEntity直接添加空表
        Entity pic = schema.addEntity("Pic");
        //table.setTableName("自定义表名");

        //---给表 添加属性----
        pic.addIdProperty();//表id
        pic.addStringProperty("content").notNull();//描述
        pic.addStringProperty("desc").notNull();//描述
        pic.addDateProperty("time");//时间

        //--------添加表2----------
        Entity note = schema.addEntity("Note");
        //table.setTableName("自定义表名");

        //---给表 添加属性----
        note.addIdProperty();//表id
        note.addStringProperty("desc").notNull();//描述
        note.addDateProperty("time");//时间

        //--------添加表3----------        
        Entity klass = schema.addEntity("Klass");
        klass.addStringProperty("id");
        Property klassInStar = klass.addStringProperty("star_id").notNull().getProperty();//klass关联的star-id
        klass.addToOne(star, klassInStar);
        star.addToMany(klass, klassInStar);//表里面存储list数据
    }
}
