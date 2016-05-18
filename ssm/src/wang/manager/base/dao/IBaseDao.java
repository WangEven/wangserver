package wang.manager.base.dao;

import java.io.Serializable;

/**
 * 
 * 基本Dao接口其他Dao接口可继承该接口
 * 
 * */
public interface IBaseDao<T extends Serializable, PK extends Serializable> {
	/**
	 * 
	 * 单个插入
	 * 
	 * */
	public boolean insertSingle(T bean);

	/**
	 * 
	 * 依据相应条件查询单个数据
	 * 
	 * */
	public T queryBy(T bean);

	/**
	 * 
	 * 删除单个目标
	 * 
	 * */
	public boolean deleteById(PK pk);
}
