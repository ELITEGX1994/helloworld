package readinglist;


import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: WangMiao
 * Date: 2019/7/18
 * Time: 19:47
 * Created with IntelliJ IDEA
 * Description: user_info表操作接口
 */
@Repository
@Qualifier("UserInfoRepository")
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer> {

    UserInfoEntity findByUserId(Integer userId);

}