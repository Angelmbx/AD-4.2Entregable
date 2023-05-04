package modelo.servicio.departamento;

import java.util.List;

import modelo.Departamento;
import modelo.dao.departamento.DepartamentoNeoDatisDao;
import modelo.dao.departamento.IDepartamentoDao;
import modelo.exceptions.DuplicateInstanceException;

public class ServicioDepartamento implements IServicioDepartamento {

	
private IDepartamentoDao departamentoDao;
	
	public ServicioDepartamento() {
		departamentoDao= new DepartamentoNeoDatisDao();
	}
	
	
	@Override
	public long create(Departamento dept) throws DuplicateInstanceException {
		return departamentoDao.create(dept);
	}

	@Override
	public boolean delete(Departamento dept) {
		// TODO Auto-generated method stub
		return departamentoDao.delete(dept);
	}

	@Override
	public boolean update(Departamento dept) {
		// TODO Auto-generated method stub
		return departamentoDao.update(dept);
	}

	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return departamentoDao.findAll();
	}

	@Override
	public boolean exists(Integer deptno) {
		// TODO Auto-generated method stub
		return departamentoDao.exists(deptno);
	}

}
