package wang.manager.base.service;

import java.io.Serializable;

/**
 * 
 * 
 * 基本Server接口其他Server接口可继承该接口
 * 
 * */
public interface IBaseServer<T extends Serializable, PK extends Serializable> {
	/**
	 * 
	 * Server基本接口保存单个目标
	 * 
	 * */
	public boolean saveSingle(T bean);
	
	public T getSingle(T bean);
}
