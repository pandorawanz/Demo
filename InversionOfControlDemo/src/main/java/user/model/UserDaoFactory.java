package user.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component    //Component同时只能标一个，不然会报错
public class UserDaoFactory implements FactoryBean<UserDao> {
    // 返回一个UserMockDao对象
    @Override
    public UserDao getObject() {
        System.out.println("使用工厂模式创建一个UserDao的组件");
        return new UserMockDao();
    }

    // 返回一个UserMockDao类型
    @Override
    public Class<?> getObjectType() {
        return UserMockDao.class;
    }

    // 多个Controller用到UserMockDao时，只需要创建一个，共享
    @Override
    public boolean isSingleton() {
        return true;
    }
}
