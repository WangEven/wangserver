package wang.manager.dao;

import java.io.Serializable;

public interface IBaseDao<T extends Serializable, PK extends Serializable> {
	public boolean insert(T model);
}
