package com.zidongxiangxi.mqplatform.api.transaction;

/**
 * 事务mq的sql提供者
 *
 * @author chenxudong
 * @date 2019/08/30
 */
public interface IProducerSqlProvider {
    /**
     * 获取插入语句
     *
     * @return sql语句
     */
    String getInsertMqSql();

    /**
     * 获取查询语句
     *
     * @return sql语句
     */
    String getSelectMqSql();

    /**
     * 获取发送中语句
     *
     * @return sql语句
     */
    String getBlockMqSql();

    /**
     * 获取发送失败语句
     *
     * @return sql语句
     */
    String getFailMqSql();

    /**
     * 获取删除语句
     *
     * @return sql语句
     */
    String getDeleteMqSql();

    /**
     * 获取发送中列表语句
     *
     * @return sql语句
     */
    String getListBlockMqSql();

    /**
     * 获取发送失败列表语句
     *
     * @return sql语句
     */
    String getListFailMqSql();
}
