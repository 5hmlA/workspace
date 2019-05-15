package ${PACKAGE_NAME};

import android.content.Context;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author jiangzuyun.
 * @see [相关类/方法]
 * @deprecated
 */
public class ${NAME}
{
    private volatile static ${NAME} single;//静态生命周期和进程一致
    private Context mContext;

    private ${NAME}(Context context){
//        mContext = context.getApplicationContext();//最安全，无论是否是acitivity对象最终引用的是application对象，生命周期和进程一直
        mContext = context;//直接引用可能导致内存泄漏，比如为activity对象时
    }
    public static ${NAME} getInstance(Context context){
        if(null == single){
            synchronized(${NAME}.class){
                if(null == single){
                    single = new ${NAME}(context);
                }
            }
        }
        return single;
    }
}
