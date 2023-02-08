package com.cactus.springboot.multi.thread.service;

import com.cactus.springboot.multi.thread.entity.QmItems;

import java.sql.SQLException;
import java.util.List;

/**
 * 评分项表(QmItems)表服务接口
 *
 * @author yejx
 * @since 2023-02-03 14:33:35
 */
public interface RollbackService {

    /**
     * 事务失败
     * @param id 更新ID
     * @param list 数据集
     */
    void transactionalFail(Long id, List<QmItems> list);

    /**
     * 事务成功
     * @param id 更新ID
     * @param itemsList 数据集
     */
    void transactionalSuccess(Long id, List<QmItems> itemsList) throws SQLException;

}
